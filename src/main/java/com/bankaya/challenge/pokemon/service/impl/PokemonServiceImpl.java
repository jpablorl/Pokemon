package com.bankaya.challenge.pokemon.service.impl;

import java.util.Arrays;

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

@Service
public class PokemonServiceImpl implements PokemonService {

    Logger logger = LoggerFactory.getLogger(PokemonServiceImpl.class);

    public void getPokemon(String pokemon) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<PokemonInDto> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/pikachu/", HttpMethod.GET,entity,PokemonInDto.class);

        logger.info(response.getBody().toString());

    }
}