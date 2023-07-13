plugins {
    id(Plugins.AGP.application)
    kotlin(Plugins.Kotlin.android)
    //kotlin(Plugins.Kotlin.kapt)

    // Navigation Safe Args
    //id(Plugins.Navigation.safeArgs)

    // Hilt
    //id(Plugins.Hilt.android)
}

android {
    namespace = Namespaces.app

    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.gallery"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName(AndroidConfig.release) {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }

        getByName(AndroidConfig.debug) {
            applicationIdSuffix = ".${AndroidConfig.debug}"
            isDebuggable = true
        }
    }
    compileOptions {
        sourceCompatibility = Options.compileOptions
        targetCompatibility = Options.compileOptions
    }
    kotlinOptions {
        jvmTarget = Options.kotlinOptions
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
    }

    dependencies {

        // Kotlin
        implementation(Libraries.Coroutines.android)

        // UI Components
        implementation(Libraries.UIComponents.material)
        implementation(Libraries.UIComponents.constraintLayout)
        implementation(Libraries.UIComponents.vbpd)

        // Core
        implementation(Libraries.Core.core)
        implementation(Libraries.Core.splashscreen)

        // Activity
        implementation(Libraries.Activity.activity)

        // Fragment
        implementation(Libraries.Fragment.fragment)

        // Lifecycle
        implementation(Libraries.Lifecycle.viewModel)
        implementation(Libraries.Lifecycle.runtime)

//        // Navigation
//        implementation(Libraries.Navigation.fragment)
//        implementation(Libraries.Navigation.ui)
//
//        // Hilt
//        implementation(Libraries.Hilt.android)
//        kapt(Libraries.Hilt.compiler)
//
//        // Glide
//        implementation(Libraries.Glide.glide)
//
//        // Dublicate
//        implementation(Libraries.Dublicate.dublicate)
//
//        // DotsIndicator
//        implementation(Libraries.DotsIndicator.dotsIndicator)
//
//        // CircleIndicator
//        implementation(Libraries.CircleIndicator.circleIndicator)
//
//        // CircleImageView
//        implementation(Libraries.CircleImageView.circleImageView)
//
//        // Lottie Animation
//        implementation(Libraries.LottieAnimation.lottieanimation)
//
//        // ViewPager2
//        implementation(Libraries.ViewPager2.viewpager2)
//
//        // Google gms services
//        implementation(Libraries.GoogleServices.google)
//
//        // Legacy
//        implementation(Libraries.Legacy.legacy)
//
//        // SMS configuration
//        implementation(Libraries.SmsConfigutation.smsconfiguration)
//
//        // Retrofit
//        implementation(Libraries.Retrofit.retrofit)
//        implementation(Libraries.Retrofit.gsonConverter)
//
//        // OkHttp & Interceptor
//        implementation(Libraries.OkHttp.okHttp)
//        implementation(Libraries.OkHttp.loggingInterceptor)
//
//        // Paging
//        implementation(Libraries.Paging.runtime)
//        implementation(Libraries.Paging.common)
//
//        // Event bus
//        implementation(Libraries.EventBus.eventBus)
//
//        // LibPhoneNumber
//        implementation(Libraries.LibPhoneNumber.libphonenumber)
    }
}