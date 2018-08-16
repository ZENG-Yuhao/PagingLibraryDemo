# PagingLibraryDemo

[Paging library](https://developer.android.com/topic/libraries/architecture/paging/) is a component included in [Android Architecture Components](https://developer.android.com/topic/libraries/architecture/), which helps load data "page" by "page" gradually and gracefully whether the data are from network or local storage, benifiting from **Paging Library**'s prefecth mechanism, data loading is nearly invisible to user. 

The [sample code](https://github.com/googlesamples/android-architecture-components/tree/master/PagingWithNetworkSample) given officially by Google shows a good way to load data from both RESTful api and [Room Data Base](https://developer.android.com/topic/libraries/architecture/room) with **Paging library**, [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) and [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel). However, it's a little bit too complicated for many developers to have a quick understand on how to use the **Paging library**, especially data flow is hard to track because of the "Repository" desgin. The purpose of this demo is to show a more intuitive and comprehensive example which covers only minimum usecases of **Paging library** to help people understand **Paging library** rapidly.
