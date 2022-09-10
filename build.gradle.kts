plugins {
    id("java")
}

group = "me.gabytm"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.9.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}