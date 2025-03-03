/*

   Copyright 2018-2021 Charles Korn.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    id("com.github.ben-manes.versions") version "0.42.0"
}

repositories {
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    implementation(group = "com.diffplug.spotless", name = "spotless-plugin-gradle", version = "6.7.2")
    implementation(group = "io.github.gradle-nexus", name = "publish-plugin", version = "1.1.0")
    implementation(group = "org.ajoberstar.reckon", name = "reckon-gradle", version = "0.16.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}
