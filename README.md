# ToDoList App

The ToDoList app is a simple Android application for managing and organizing your tasks. 
It is my second venture into creating android applications, and I followed [this](https://www.youtube.com/watch?v=RfIR4oaSVfQ) tutorial to create it.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Dependencies](#dependencies)
- [License](#license)

## Overview

The ToDoList app is designed to help users keep track of their tasks and to-do items. It allows you to create, edit, and delete tasks, set due dates, and mark tasks as completed. This app is built using the Android platform and uses various libraries and tools to enhance its functionality.

## Features

The ToDoList app comes with the following features:

1. **Task Management**: Create and manage tasks with titles, descriptions, and due dates.

2. **Task Prioritization**: Organize tasks by setting their priority.

3. **Task Completion**: Mark tasks as completed when they are finished.

4. **Persistent Storage**: Tasks are stored in a local database using Room, making them available even after closing the app.

5. **User-Friendly UI**: The app is designed with a user-friendly and intuitive interface.

6. **Compatibility**: The app is compatible with Android devices running on API level 24 and above.

## Getting Started

To build and run the ToDoList app, follow these steps:

1. Clone the repository to your local machine.

2. Open the project in Android Studio.

3. Ensure you have the necessary Android SDK components and emulator/device set up.

4. Build and run the app on your emulator or Android device.

5. Start creating and managing your tasks.

## Dependencies

The ToDoList app uses various libraries and dependencies to enhance its functionality. Here are some of the key dependencies used:

- AndroidX Core: 1.12.0
- AndroidX AppCompat: 1.6.1
- Google Material Design: 1.10.0
- AndroidX ConstraintLayout: 2.1.4
- JUnit: 4.13.2 (for testing)
- Espresso: 3.5.1 (for UI testing)
- Room Database: 2.5.2 (for local data storage)
- AndroidX Lifecycle: 2.6.2 (for lifecycle management)
- AndroidX Activity and Fragment KTX: 1.8.0 and 1.6.1 (for AndroidX enhancements)
- Android Arch Persistence Room Compiler: 1.1.1 (for Room database)

Please refer to the [build.gradle](build.gradle) file for a complete list of dependencies and their versions.
