import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {

    androidLibrary {
        namespace = "com.example"
        compileSdk = 36

        optimization {
            minify = true
            keepRules.files.add(project.file("proguard-rules.pro"))
        }

        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
    jvm()
    iosArm64()
    iosSimulatorArm64()
}
