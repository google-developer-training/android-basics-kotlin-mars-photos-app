MarsPhotos - Solution Code
==================================

Solution code for Android Basics in Kotlin.

Introduction
------------

MarsPhotos is a demo app that shows actual images of Mar's surface. These images are
real-life photos from Mars captured by NASA's Mars rovers. The data is stored on a Web server
as a REST web service.  This app demonstrated the use of [Retrofit](https://square.github
.io/retrofit/) to make REST requests to the web service, [Moshi](https://github.com/square/moshi) to
handle the deserialization of the returned JSON to Kotlin data objects, and [Coil](https://coil-kt
.github.io/coil/) to load images by URL.

The app also leverages [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[LiveData](https://developer.android.com/topic/libraries/architecture/livedata), and
[Data Binding](https://developer.android.com/topic/libraries/data-binding/) with binding 
adapters.

Pre-requisites
--------------

You need to know:
- How to create and use fragments.
- How to use architecture components including ViewModel, and LiveData.
- How to use coroutines for long-running tasks.


Getting Started
---------------

1. Download and run the app.