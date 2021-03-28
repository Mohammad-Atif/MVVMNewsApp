package com.androiddevs.mvvmnewsapp.Repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import com.androiddevs.mvvmnewsapp.models.Article
import retrofit2.Response


/*
This is the repository which can get data from the remote server and the Room (or Local Database)

Its instance is created in the viewmodel class which then uses its function like getBreakingNews for getting the data

It is in MVVM structure

 */

class NewsRepository(
    val db:ArticleDatabase
) {
    suspend fun getBreakingNews(countrycode:String,pagenumber:Int)
    = RetrofitInstance.api.getBreakingNews(countrycode,pagenumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}