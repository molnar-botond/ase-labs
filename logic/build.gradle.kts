plugins {
    id("hu.bme.mit.ase.shingler.gradle.java")
}

repositories {
    mavenCentral()
}

val picoCliVersion = "4.7.6"
val slf4jVersion = "1.7.36"
val log4jVersion = "2.23.1"
val junitVersion = "5.10.0"

dependencies {
    implementation(project(":lib"))

    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("info.picocli:picocli:$picoCliVersion")

    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:$log4jVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}
