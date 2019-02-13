object Versions {
    const val androidx = "1.0.0"
    const val androidxAppCompat = "1.1.0-alpha02"
    const val androidxArch = "2.1.0-alpha02"
    const val constraintLayout = "1.1.3"
    const val espresso = "3.1.0"
    const val glide = "4.8.0"
    const val gradlePlugin = "3.3.1"
    const val gson = "2.8.5"
    const val jUnit = "4.12"
    const val kotlin = "1.3.21"
    const val kotlinxCoroutines = "1.1.1"
    const val markwon = "2.0.1"
    const val materialComponents = "1.1.0-alpha02"
    const val okHttp = "3.12.1"
    const val retrofit = "2.5.0"
    const val retrofitCoroutineAdapter = "0.9.2"
    const val room = "2.1.0-alpha04"
    const val testRunner = "1.1.0"
    const val timber = "4.7.1"
}

object Dep {
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxBrowser = "androidx.browser:browser:${Versions.androidx}"
    const val androidxCardView = "androidx.cardview:cardview:${Versions.androidx}"
    const val androidxExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidxArch}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideProcessor = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
    const val markwon = "ru.noties:markwon:${Versions.markwon}"
    const val markwonImageLoader = "ru.noties:markwon-image-loader:${Versions.markwon}"
    const val materialComponents = "com.google.android.material:material:${Versions.materialComponents}"
    const val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitCoroutineAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutineAdapter}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCoroutines = "androidx.room:room-coroutines:${Versions.room}"
    const val roomProcessor = "androidx.room:room-compiler:${Versions.room}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
}
