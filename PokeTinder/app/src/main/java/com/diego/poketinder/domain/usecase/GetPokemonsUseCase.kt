package com.diego.poketinder.domain.usecase

import com.diego.poketinder.data.PokemonRepository
import com.diego.poketinder.domain.model.Pokemon
import javax.inject.Inject

class GetPokemonsUseCase @Inject constructor(private val repository: PokemonRepository) {
    suspend operator fun invoke():List<Pokemon>{
        return repository.getAllPokemonFromApi()
    }
}