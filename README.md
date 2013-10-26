# Sample storm-gen HelloWorld projects with Gradle
I created three HelloWorld style projects which use the [storm-gen Lightweight DAO generator for Android SQLite](https://code.google.com/p/storm-gen/).
The idea was to figure out how to get the gradle files working so that the annotation generation works. There are three android studio projects: 

1. StormTestProject - simple app which access storm-gen  
2. StormTestLibProject - android library which has storm-gen inside  
3. StormHelloWorldProject - simple app that uses StormTestLibProject generated aar  

StormTestLibProject will deploy the library to a local maven repo on your machine. You need to install maven  
`sudo apt-get install maven2`  
In the StormTestLibProject you type ./gradlew install and it will build the library, make the aar and put it in your local maven repo. 

In StormHelloWorldProject this library is simply access with a dependancy in the build.gradle.

These projects were tested with gradle 1.8 and android studio 0.3.1 on ubuntu 13.10 64bit using maven 2.2.1.

The generated sources are found in build/source/apt-generated. You need to have the storm-api and storm-apt jars in the libs folders.


Many lots of useful info from these links. http://www.alonsoruibal.com/my-gradle-tips-and-tricks/ and http://stackoverflow.com/questions/16683944/androidannotations-nothing-generated-empty-activity.
