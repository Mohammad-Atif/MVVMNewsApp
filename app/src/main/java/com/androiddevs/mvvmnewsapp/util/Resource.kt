package com.androiddevs.mvvmnewsapp.util


/*
 It is a class recomended by google that can we later use that whether our request is succeull or loading or failed
 It is sealed class means only the specified classes(like Success,Error Loading )  can Extemnd this Resource Class
 And this class is also a generic in nature
 */
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}