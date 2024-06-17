buildscript {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

val javaVersion = JavaVersion.VERSION_17

plugins {
  id("de.europace.docker-publish") version "2.0.6" apply false
}

allprojects {
  group = "de.huehnerlady"
}


repositories {
  mavenCentral()
}

