package com.bankaya.challenge.pokemon.endpoint;

import com.bankaya.challenge.pokemon.service.PokemonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.pokeapi.GetAbilitiesRequest;
import https.pokeapi.GetAbilitiesResponse;
import https.pokeapi.GetBaseExperienceRequest;
import https.pokeapi.GetBaseExperienceResponse;
import https.pokeapi.GetHeldItemsRequest;
import https.pokeapi.GetHeldItemsResponse;
import https.pokeapi.GetIdRequest;
import https.pokeapi.GetIdResponse;
import https.pokeapi.GetLocationAreaEncountersRequest;
import https.pokeapi.GetLocationAreaEncountersResponse;
import https.pokeapi.GetNameRequest;
import https.pokeapi.GetNameResponse;

@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "https://pokeapi.co/";

    @Autowired
	private PokemonService pokemonService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAbilitiesRequest")
	@ResponsePayload
	public GetAbilitiesResponse getAbilities(@RequestPayload final GetAbilitiesRequest request) {
		return pokemonService.getAbilities(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBaseExperienceRequest")
	@ResponsePayload
	public GetBaseExperienceResponse getBaseExperience(@RequestPayload final GetBaseExperienceRequest request) {
		return pokemonService.getBaseExperience(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHeldItemsRequest")
	@ResponsePayload
	public GetHeldItemsResponse getHeldItems(@RequestPayload final GetHeldItemsRequest request) {
		return pokemonService.getHetdItems(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getIdRequest")
	@ResponsePayload
	public GetIdResponse getId(@RequestPayload final GetIdRequest request) {
		return pokemonService.getId(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNameRequest")
	@ResponsePayload
	public GetNameResponse getName(@RequestPayload final GetNameRequest request) {
		return pokemonService.getName(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationAreaEncountersRequest")
	@ResponsePayload
	public GetLocationAreaEncountersResponse getLocationAreaEncounters(@RequestPayload final GetLocationAreaEncountersRequest request) {
		return pokemonService.getLocationAreaEncounters(request.getPokemon());
	}
}