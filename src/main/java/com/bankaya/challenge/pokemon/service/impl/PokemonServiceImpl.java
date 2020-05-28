package com.bankaya.challenge.pokemon.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bankaya.challenge.pokemon.entity.dto.AbilityInDto;
import com.bankaya.challenge.pokemon.entity.dto.HeldItemInDto;
import com.bankaya.challenge.pokemon.entity.dto.PokemonInDto;
import com.bankaya.challenge.pokemon.service.PokemonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import https.pokeapi.Ability;
import https.pokeapi.GetAbilitiesResponse;
import https.pokeapi.GetBaseExperienceResponse;
import https.pokeapi.GetHeldItemsResponse;
import https.pokeapi.GetIdResponse;
import https.pokeapi.GetLocationAreaEncountersResponse;
import https.pokeapi.GetNameResponse;
import https.pokeapi.HeldItem;
import https.pokeapi.NameUrl;

@Service
public class PokemonServiceImpl implements PokemonService {

    Logger logger = LoggerFactory.getLogger(PokemonServiceImpl.class);

    @Override
    public PokemonInDto getPokemon(String pokemon) {
        logger.info("getPokemon");
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        String uri = String.format("https://pokeapi.co/api/v2/pokemon/%s/", pokemon);
        ResponseEntity<PokemonInDto> response = restTemplate.exchange(uri, HttpMethod.GET,entity,PokemonInDto.class);
        return response.getBody();
    }

    @Override
    public GetAbilitiesResponse getAbilities(String pokemon) {
        logger.info("getAbilities");
        GetAbilitiesResponse response = new GetAbilitiesResponse();
        List<Ability> list = new ArrayList<Ability>();
        PokemonInDto pokemonDto = getPokemon(pokemon);
        for(AbilityInDto ability_:pokemonDto.getAbilities()){
            Ability item = new Ability();
            NameUrl ability = new NameUrl();
            ability.setName(ability_.getAbility().getName());
            ability.setUrl(ability_.getAbility().getUrl());
            item.setAbility(ability);
            item.setIsHidden(ability_.getIs_hidden());
            item.setSlot(ability_.getSlot());
            list.add(item);
        }
        response.setAbilities(list);
        return response;
    }

    @Override
    public GetBaseExperienceResponse getBaseExperience(String pokemon) {
        logger.info("getBaseExperience");
        GetBaseExperienceResponse response = new GetBaseExperienceResponse();
        PokemonInDto pokemonDto = getPokemon(pokemon);
        response.setBaseExperience(pokemonDto.getBase_experience());
        return response;
    }

    @Override
    public GetHeldItemsResponse getHetdItems(String pokemon) {
        logger.info("getHetdItems");
        GetHeldItemsResponse response = new GetHeldItemsResponse();
        PokemonInDto pokemonDto = getPokemon(pokemon);
        List<HeldItem> list = new ArrayList<HeldItem>();
        for(HeldItemInDto hi:pokemonDto.getHeld_items()){
            HeldItem item_ = new HeldItem();
            NameUrl item = new NameUrl();
            item.setName(hi.getItem().getName());
            item.setUrl(hi.getItem().getUrl());
            item_.setItem(item);
            list.add(item_);
        }
        response.setHeldItems(list);
        return response;
    }

    @Override
    public GetIdResponse getId(String pokemon) {
        logger.info("getId");
        GetIdResponse response = new GetIdResponse();
        PokemonInDto pokemonDto = getPokemon(pokemon);
        response.setId(pokemonDto.getId());
        return response;
    }

    @Override
    public GetNameResponse getName(String pokemon) {
        logger.info("getName");
        GetNameResponse response = new GetNameResponse();
        PokemonInDto pokemonDto = getPokemon(pokemon);
        response.setName(pokemonDto.getName());
        return response;
    }

    @Override
    public GetLocationAreaEncountersResponse getLocationAreaEncounters(String pokemon) {
        logger.info("getLocationAreaEncounters");
        GetLocationAreaEncountersResponse response = new GetLocationAreaEncountersResponse();
        PokemonInDto pokemonDto = getPokemon(pokemon);
        response.setLocationAreaEncounters(pokemonDto.getLocation_area_encounters());
        return response;
    }
}