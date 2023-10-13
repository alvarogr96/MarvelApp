package com.alvarogomez.marvelapp.data

import com.alvarogomez.marvelapp.domain.models.CharactersResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/v1/public/characters")
    suspend fun getCharacters(
        @Path("apiKey") apiKey: String
    ) : Response<CharactersResponse>

}