package com.diego.poketinder.data.network

import com.diego.poketinder.data.model.PokemonListModel
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("?limit=20")
    suspend fun getPokemons(): Response<PokemonListModel>
}