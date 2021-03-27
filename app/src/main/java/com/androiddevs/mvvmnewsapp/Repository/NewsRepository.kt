package com.androiddevs.mvvmnewsapp.Repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import retrofit2.Response

class NewsRepository(
    db: ArticleDatabase
) {
    suspend fun getBreakingNews(countrycode:String,pagenumber:Int)
    = RetrofitInstance.api.getBreakingNews(countrycode,pagenumber)
}