package com.example.gallery.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.gallery.common.Either
import com.example.gallery.common.Resource
import com.example.gallery.common.UIState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

/**
 * Base class for all [ViewModel]s
 *
 * @author London
 */
abstract class BaseViewModel : ViewModel() {

    protected fun <T ,S> Flow<Either<String, T>>.collectRequest(
        state:MutableStateFlow<UIState<S>>,
        mappedData:(T) ->S
    ){
        viewModelScope.launch(Dispatchers.IO){
            state.value = UIState.Loading()
            this@collectRequest.collect{
                when (it){
                    is Either.Left -> state.value = UIState.Error(it.value)
                    is Either.Right -> state.value = UIState.Success(mappedData(it.value))
                }
            }
        }
    }

    protected fun <T> mutableUiStateFlow() = MutableStateFlow<UIState<T>>(UIState.Idle())
    protected fun <T>Flow<Resource<T>>.collectData(
        _state:MutableStateFlow<UIState<T>>
    ){
        viewModelScope.launch {
            collect{
                when(it){
                    is Resource.Error -> {
                        _state.value= UIState.Error(it.message!!)
                    }
                    is Resource.Loading -> {
                        _state.value= UIState.Loading()
                    }
                    is Resource.Success -> {
                        if (it.data!=null){
                            _state.value= UIState.Success(it.data!!)
                        }
                    }
                }
            }
        }

    }

    /**
     * Creates a [MutableStateFlow] with [UIState] and the given initial value [UIState.Idle]
     */
    @Suppress("FunctionName")
    protected fun <T> MutableUIStateFlow() = MutableStateFlow<UIState<T>>(UIState.Idle())

    /**
     * Reset [MutableUIStateFlow] to [UIState.Idle]
     */
    protected fun <T> MutableStateFlow<UIState<T>>.reset() {
        value = UIState.Idle()
    }

    /**
     * Collect network request result without mapping for primitive types
     *
     * @receiver [collectUIState]
     */
//    protected fun <T> Flow<Either<NetworkError, T>>.collectNetworkRequest(
//        state: MutableStateFlow<UIState<T>>
//    ) = collectUIState(state) {
//        UIState.Success(it)
//    }

    /**
     * Collect network request result with mapping
     *
     * @receiver [collectUIState]
     */
//    protected fun <T, S> Flow<Either<NetworkError, T>>.collectNetworkRequest(
//        state: MutableStateFlow<UIState<S>>,
//        mapToUI: (T) -> S
//    ) = collectUIState(state) {
//        UIState.Success(mapToUI(it))
//    }

    /**
     * Collect network request result and mapping [Either] to [UIState]
     *
     * @receiver [NetworkError] or [data][T] in [Flow] with [Either]
     *
     * @param T domain layer model
     * @param S presentation layer model
     * @param state [MutableStateFlow] with [UIState]
     *
     * @see viewModelScope
     * @see launch
     * @see [Flow.collect]
     */
//    private fun <T, S> Flow<Either<NetworkError, T>>.collectUIState(
//        state: MutableStateFlow<UIState<S>>,
//        successful: (T) -> UIState.Success<S>
//    ) {
//        viewModelScope.launch(Dispatchers.IO) {
//            state.value = UIState.Loading()
//            this@collectUIState.collect {
//                when (it) {
//                    is Either.Left -> state.value = UIState.Error(it.value.toString())
//                    is Either.Right -> state.value = successful(it.value)
//                }
//            }
//        }
//    }

    /**
     * Collect local request to database with mapping
     *
     * @receiver [T] with [Flow]
     *
     * @param T domain layer model
     * @param S presentation layer model
     * @param mapToUI high-order function for setup mapper functions
     */
    protected fun <T, S> Flow<T>.collectLocalRequest(
        mapToUI: (T) -> S
    ): Flow<S> = map { value: T ->
        mapToUI(value)
    }

    /**
     * Collect local request to database with mapping with [List]
     *
     * @receiver [T] in [List] with [Flow]
     *
     * @param T domain layer model
     * @param S presentation layer model
     * @param mapToUI high-order function for setup mapper functions
     */
    protected fun <T, S> Flow<List<T>>.collectLocalRequestForList(
        mapToUI: (T) -> S
    ): Flow<List<S>> = map { value: List<T> ->
        value.map { data: T ->
            mapToUI(data)
        }
    }

    /**
     * Collect paging request with mapping
     *
     * @receiver [PagingData] with [T] in [Flow]
     *
     * @param T domain layer model
     * @param S presentation layer model
     * @param mapToUI high-order function for setup mapper function
     *
     * @see cachedIn
     * @see viewModelScope
     */

    protected fun <T> Flow<Either<String, T>>.gatherRequest(
        state: MutableStateFlow<UIState<T>>,
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            state.value = UIState.Loading()
            this@gatherRequest.collect {
                when (it) {
                    is Either.Left -> state.value = UIState.Error(it.value)
                    is Either.Right -> state.value =
                        UIState.Success(it.value)
                }
            }

        }
    }

    protected fun <T : Any, S : Any> Flow<PagingData<T>>.collectPagingRequest(
        mappedData: (T) -> S
    ) = map { it.map { data -> mappedData(data) } }.cachedIn(viewModelScope)
}