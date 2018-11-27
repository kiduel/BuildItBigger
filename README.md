# Gradle for Android and Java Final Project
Building it bigger with Gradle. 

Taking the starter code from Udacity and implemented a Java library for supplying jokes, an Android library with an Activity that displays jokes and a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an async task. Project contains connected tests to verify that the async task is indeed loading jokes. The project contains two flavors, a free flavor with ads and a paid flavor without ads. 

***
In this project, I created an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. The app consists 
of four modules. A Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves those jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.

* As Android projects grow in complexity, it becomes necessary to customize the
behavior of the Gradle build tool, allowing automation of repetitive tasks.
Particularly, factoring functionality into libraries and creating product
flavors allow for much bigger projects with minimal added complexity.

## Features

* Free and paid flavors to an app, and set up your build to share code between them
* Factor reusable functionality into a Java library
* Factor reusable Android functionality into an Android library
* Multi project build to compile your libraries and app
* Uses the Gradle App Engine plugin to deploy a backend
* Configure an integration test suite that runs against the local App Engine development server

## Steps
# 1: Created a Java library
# 2: Created an Android Library
# 3: Step 3: Setup GCE
# 4: Added Functional Tests
# 5: Added a Paid Flavor
# 6: Added Interstitial Ad

### Configure Test Task
To tie it all together, create a Gradle task that:

1. Launches the GCE local development server
2. Runs all tests
3. Shuts the server down again

* Made the free app variant display interstitial ads between the main activity and the joke-displaying activity.
* Have the app display a loading indicator while the joke is being fetched from the server.
* Write a Gradle task that starts the GCE dev server, runs all the Android tests, and shuts down the dev server.

<img src= "https://i.imgur.com/4heqU5b.png" width = "250"> <img src= "https://i.imgur.com/GoaSvmR.png" width = "250"> 

