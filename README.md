# NASA_Pictures_app

Nasa Picture app where the data is loaded from the Json file with MVVM pattern.


This project uses predefined Json file located in the [assests](https://github.com/Zaraki596/NASA_Pictures_app/tree/master/app/src/main/assets) folder of the project.
This app fetches the images and title of the images from the parsed Json using Moshi library. Further Image clicked shows the full size image which was loaded using Glide
and all the metadata related to it. You can see the below preview of the above Implementation.


## Preview
![giflink](https://media.giphy.com/media/MaI4fCuvxnzI3cA3iE/giphy.gif)

#### App build.gradle Dependency is maintained by using Kotlin and buildSrc for AutoComplete Feature.

This App uses following TechStack : 

- [x] [Kotlin](https://kotlinlang.org/docs/reference/)
- [x] [MVVM architecture Pattern](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel)
- [x] [Moshi](https://github.com/square/moshi)
- [x] [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)
- [x] [Glide](https://github.com/bumptech/glide) (For Image Loading)
- [x] [ViewPager 2](https://developer.android.com/reference/androidx/viewpager2/widget/ViewPager2)
- [x] [Mockk](https://github.com/mockk/mockk) (For Testing Purposes)
