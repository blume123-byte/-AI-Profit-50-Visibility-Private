plugins { id("com.android.application") }
android {
    namespace = "de.aiprofit50.app"
    compileSdk = 35
    defaultConfig { applicationId = "de.aiprofit50.app"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "0.3-demo" }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
