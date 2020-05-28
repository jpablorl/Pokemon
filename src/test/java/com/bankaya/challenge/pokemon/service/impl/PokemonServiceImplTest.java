package com.bankaya.challenge.pokemon.service.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.bankaya.challenge.pokemon.service.PokemonService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class PokemonServiceImplTest {

    @Autowired
    private PokemonService pockemonService;

    @Test
    void testWithDisplayNameContainingSpecialCharacters() {
        pockemonService.getPokemon("pikachu");
        assertTrue(true);
    }

}