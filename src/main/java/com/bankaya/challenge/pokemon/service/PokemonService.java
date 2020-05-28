package com.bankaya.challenge.pokemon.service;

import com.bankaya.challenge.pokemon.entity.dto.PokemonInDto;

import https.pokeapi.GetAbilitiesResponse;
import https.pokeapi.GetBaseExperienceResponse;
import https.pokeapi.GetHeldItemsResponse;
import https.pokeapi.GetIdResponse;
import https.pokeapi.GetLocationAreaEncountersResponse;
import https.pokeapi.GetNameResponse;

public interface PokemonService {
    
    public PokemonInDto getPokemon(String pokemon);

    public GetAbilitiesResponse getAbilities(String pokemon);

    public GetBaseExperienceResponse getBaseExperience(String pokemon);

    public GetHeldItemsResponse getHetdItems(String pokemon);

    public GetIdResponse getId(String pokemon);

    public GetNameResponse getName(String pokemon);

    public GetLocationAreaEncountersResponse getLocationAreaEncounters(String pokemon);
}