
object Versions {

    const val AGP = "8.0.2"
    const val kotlin = "1.8.21"
    const val coroutines = "1.7.1"
    const val KSP = "1.8.21-1.0.11"
    const val material = "1.9.0"
    const val constraintLayout = "2.1.4"
    const val vbpd = "1.5.9"
    const val core = "1.10.1"
    const val splashscreen = "1.0.1"
    const val activity = "1.7.2"
    const val fragment = "1.5.7"
    const val lifecycle = "2.6.1"
    const val navigation = "2.5.3"
    const val retrofit = "2.9.0"
    const val moshi = "1.14.0"
    const val okHttp = "5.0.0-alpha.11"
    const val room = "2.5.1"
    const val paging = "3.1.1"
    const val dublicate = "1.8.0"
    const val dotsindicator = "4.3"
    const val circleindicator = "2.1.6"
    const val circleimageview = "3.1.0"
    const val viewpager2 = "1.0.0"
    const val glide = "4.13.2"
    const val lottieanimation = "5.2.0"
    const val google = "20.4.1"
    const val legacy = "1.0.0"
    const val smsconfiguration = "1.7.1"
    const val gson = "2.8.9"
    const val gsonconverter ="2.5.0"
    const val eventbus = "3.2.0"
    const val libphonenumber = "8.13.14"
    const val koin = "2.2.2"

}

object Libraries {
    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${
            Versions.coroutines
        }"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${
            Versions.coroutines
        }"
    }

    object UIComponents {
        const val material = "com.google.android.material:material:${
            Versions.material
        }"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${
            Versions.constraintLayout
        }"
        const val vbpd = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${
            Versions.vbpd
        }"
    }

    object Core {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val splashscreen = "androidx.core:core-splashscreen:${Versions.splashscreen}"
    }

    object Activity {
        const val activity = "androidx.activity:activity-ktx:${Versions.activity}"
    }

    object Fragment {
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object Navigation {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }

    object Koin {
        const val scope = "io.insert:koin-androidx-scope:${Versions.koin}"
        const val koin = "io.insert-koin:koin-android:${Versions.koin}"
        const val viewmodel = "io.insert-koin:koin-androidx-viewmodel${Versions.koin}"
    }

    object Moshi {
        const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
        const val kotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.gsonconverter}"
    }

    object OkHttp {
        const val bom = "com.squareup.okhttp3:okhttp-bom:${Versions.okHttp}"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
        const val ktx = "androidx.room:room-ktx:${Versions.room}"
    }

    object Paging {
        const val runtime = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
        const val common = "androidx.paging:paging-common:${Versions.paging}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    }

    object Dublicate {
        const val dublicate = "org.jetbrains.kotlin:kotlin-bom:${Versions.dublicate}"
    }

    object DotsIndicator {
        const val dotsIndicator = "com.tbuonomo:dotsindicator:${Versions.dotsindicator}"
    }

    object CircleIndicator {
        const val circleIndicator = "me.relex:circleindicator:${Versions.circleindicator}"
    }

    object CircleImageView {
        const val circleImageView = "de.hdodenhof:circleimageview:${Versions.circleimageview}"
    }

    object LottieAnimation {
        const val lottieanimation = "com.airbnb.android:lottie:${Versions.lottieanimation}"
    }

    object ViewPager2 {
        const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
    }

    object GoogleServices {
        const val google = "com.google.android.gms:play-services-auth:${Versions.google}"
    }

    object Legacy {
        const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacy}"
    }

    object SmsConfigutation {
        const val smsconfiguration =
            "com.github.fraggjkee:sms-confirmation-view:${Versions.smsconfiguration}"
    }

    object EventBus {
        const val eventBus = "org.greenrobot:eventbus:${Versions.eventbus}"
    }

    object Gson {
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    object LibPhoneNumber {
        const val libphonenumber =
            "com.googlecode.libphonenumber:libphonenumber:${Versions.libphonenumber}"
    }
}
object Plugins {

    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val android = "android"
        const val jvm = "jvm"
        const val kapt = "kapt"
    }

    object KSP {
        const val ksp = "com.google.devtools.ksp"
    }

    object Navigation {
        const val safeArgs = "androidx.navigation.safeargs.kotlin"
    }

    object Hilt {
        const val android = "com.google.dagger.hilt.android"
    }
}