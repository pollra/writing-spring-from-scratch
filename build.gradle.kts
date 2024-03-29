plugins {
    id("java")
}

group = "com.github.hyeyoom"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.reflections:reflections-parent:0.9.9-RC1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}