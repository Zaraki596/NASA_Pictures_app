object Versions {
    //Support Version
    const val KOTLIN = "1.3.61"
    const val CONSTRAINT_LAYOUT = "2.0.0-beta4"
    const val APPCOMPAT = "1.1.0"
    const val CORE_KTX = "1.2.0"
    const val ANDROID_GRADLE_VERSION = "3.6.0"

    //Testing Version
    const val JUNIT = "4.12"
    const val JUNIT_KTX = "1.1.1"
    const val JUNIT_EXT = "1.1.1"
    const val ESPRESSO_CORE = "3.2.0"
    const val ARCH_CORE_TESTING = "2.1.0"
    const val ANDROIDX_CORE_TESTING = "1.2.0"
    const val HAMCREST = "1.3"
    const val ROBOELECTRIC = "4.3.1"
    const val MOCKK = "1.9.3"


    //UI Utils Version
    const val CARD_VIEW = "1.0.0"
    const val RECYCLER_VIEW = "1.1.0"
    const val MATERIAL_DESIGN = "1.2.0-alpha04"
    const val VIEW_PAGER_2 = "1.0.0"

    //Arch Components
    const val LIFECYCLE = "2.2.0"
    const val ROOM = "2.2.3"

    //Package Version
    const val MIN_SDK = 21
    const val TARGET_SDK = 29
    const val COMPILE_SDK = 29
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val BUILD_TOOLS_VERSION = "29.0.2"

    //Compile Options
    const val JAVA_COMPILE_VERSION = 1.8

    //COROUTINES
    const val COROUTINES = "1.3.3"

    //IMAGE LOADING
    const val GLIDE = "4.11.0"

    //MOSHI
    const val MOSHI = "1.9.2"

    //SWIPE_REFRESH_LAYOUT
    const val SWIPE_REFRESH_LAYOUT = "1.0.0"
}

object Deps {


    // Support Library
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val MATERIAL_DESIGN = "com.google.android.material:material:${Versions.MATERIAL_DESIGN}"


    // Testing
    //Local Unit Testing
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val JUNIT_KTX = "androidx.test.ext:junit-ktx:${Versions.JUNIT_KTX}"
    const val HAMCREST = "org.hamcrest:hamcrest-all:${Versions.HAMCREST}"
    const val ANDROIDX_TESTING = "androidx.test:core-ktx:${Versions.ANDROIDX_CORE_TESTING}"
    const val ROBOELECTRIC = "org.robolectric:robolectric:${Versions.ROBOELECTRIC}"
    const val ARCH_CORE_TESTING = "androidx.arch.core:core-testing:${Versions.ARCH_CORE_TESTING}"
    const val COROUTINES_TESTING =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"
    const val MOCKS = "io.mockk:mockk:${Versions.MOCKK}"

    // Instrumented testing
    const val JUNIT_EXT = "androidx.test.ext:junit:${Versions.JUNIT_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"


    //UI elements
    const val CARD_VIEW = "androidx.cardview:cardview:${Versions.CARD_VIEW}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"
    const val VIEW_PAGER_2 = "androidx.viewpager2:viewpager2:${Versions.VIEW_PAGER_2}"

    //SWIPE_REFRESH_LAYOUT
   const val SWIPE_REFRESH_LAYOUT = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SWIPE_REFRESH_LAYOUT}"


    //Arch Components
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
    const val VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val LIVEDATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"

    //MOSHI
    const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
    const val MOSHI_KOTLIN_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI}"


    //BuildPlugins
    const val ANDROID_GRADLE_PLUGIN =
        "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_VERSION}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"


    //Coroutines
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"


    //GLIDE
    const val GLIDE_IMAGE_LIB = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"


}