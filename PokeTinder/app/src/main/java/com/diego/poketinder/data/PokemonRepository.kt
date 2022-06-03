package com.diego.poketinder.data

import com.diego.poketinder.data.model.PokemonListModel
import com.diego.poketinder.data.model.PokemonModel
import com.diego.poketinder.data.network.PokemonService
import com.diego.poketinder.domain.model.Pokemon
import com.diego.poketinder.domain.model.toDomain
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val pokemonService: PokemonService
){
    suspend fun getAllPokemonFromApi(): List<Pokemon>{
        val listResponse: PokemonListModel = pokemonService.getPokemons()
        val response: List<PokemonModel> = listResponse.result
        return response.map{it.toDomain()}
    }
}