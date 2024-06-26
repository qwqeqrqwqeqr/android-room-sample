plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "qwqeqrqwqeqr.android.room"
    compileSdk = 34

    defaultConfig {
        applicationId = "qwqeqrqwqeqr.android.room"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        ksp {
            arg( "room.schemaLocation" , "$projectDir/schemas" )
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources.excludes.add("META-INF/*")
    }
}

dependencies {

    val composeBom = platform(libs.androidx.compose.bom)
    implementation(composeBom)
    ksp(libs.room.compiler)
    ksp(libs.hilt.compiler)
    annotationProcessor(libs.room.compiler)

    implementation(libs.bundles.android.core.bundle)
    implementation(libs.bundles.android.compose.bundle)
    implementation(libs.bundles.android.kotlin.bundle)
    implementation(libs.bundles.android.room.bundle)
    implementation(libs.bundles.android.hilt.bundle)
    implementation(libs.bundles.android.moshi.bundle)


}