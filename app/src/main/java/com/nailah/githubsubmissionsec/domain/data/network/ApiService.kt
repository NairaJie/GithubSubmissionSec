package com.nailah.githubsubmissionsec.domain.data.network

import com.nailah.githubsubmissionsec.BuildConfig
import com.nailah.githubsubmissionsec.domain.data.model.DetailUserResponse
import com.nailah.githubsubmissionsec.domain.data.model.ItemsItem
import retrofit2.http.*

interface ApiService {
    @GET("search/users?q=followers%3A>%3D1000&ref=searchresults&s=followers&type=Users")
    @Headers("Authorization: token ${BuildConfig.KEY}")
    suspend fun getListUser():UserResponse

    @GET("search/users")
    @Headers("Authorization: token ${BuildConfig.KEY}")
    suspend fun getSearchUser(@Query("q") username : String) : UserResponse

    @GET("users/{username}")
    @Headers("Authorization: token ${BuildConfig.KEY}")
    suspend fun getDetailUser(@Path("username")username: String) : DetailUserResponse
    @GET("users/{username}/followers")
    @Headers("Authorization: token ${BuildConfig.KEY}")
    suspend fun getFollowers(@Path("username")username: String) : List<ItemsItem>

    @GET("users/{username}/following")
    @Headers("Authorization: token ${BuildConfig.KEY}")
    suspend fun getFollowing(@Path("username")username: String) : List<ItemsItem>


}

