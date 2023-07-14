package com.example.gallery.presentation.ui.fragments.splash

//@SuppressLint("CustomSplashScreen")
//@AndroidEntryPoint
//class SplashScreenFragment :
//    BaseFragment<FragmentSplashScreenBinding, SplashScreenViewModel>(R.layout.fragment_splash_screen) {
//
//    override val binding: FragmentSplashScreenBinding by viewBinding(FragmentSplashScreenBinding::bind)
//    override val viewModel by viewModels<SplashScreenViewModel>()
//
//    override fun initialize() {
//        Handler().postDelayed({
//
//            if (!OnBoardingPreferences(requireContext()).isShowOnBoarding()){
//                findNavController().navigate(R.id.onBoardingFragment)
//            }else if (!UserPreferences(requireContext()).isOtpCodeRight()){
//                findNavController().navigate(R.id.SignInAndSignUpFragment)
//            }
//            else{
//                findNavController().navigate(R.id.homeFragment)
//            }
//        }, 2000)
//
//    }
//}