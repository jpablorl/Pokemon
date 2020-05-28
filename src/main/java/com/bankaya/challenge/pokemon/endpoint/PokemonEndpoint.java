package com.bankaya.challenge.pokemon.endpoint;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.bankaya.challenge.pokemon.dao.ConexionDao;
import com.bankaya.challenge.pokemon.entity.model.ConexionModel;
import com.bankaya.challenge.pokemon.service.PokemonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	Logger logger = LoggerFactory.getLogger(PokemonEndpoint.class);
	
    private static final String NAMESPACE_URI = "https://pokeapi.co/";

    @Autowired
	private PokemonService pokemonService;

	@Autowired
	private ConexionDao conexionDao;

	private HttpServletRequest httpServletRequest;

	@Autowired
    public void setRequest(HttpServletRequest request) {
        this.httpServletRequest = request;
    }

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAbilitiesRequest")
	@ResponsePayload
	public GetAbilitiesResponse getAbilities(@RequestPayload final GetAbilitiesRequest request) {
		logger.info("getAbilities");
		String ip = this.httpServletRequest.getRemoteAddr();
		ConexionModel con = new ConexionModel();
		con.setIp(ip);
		con.setFecha(new Date());
		con.setMetodo("getAbilities");
		conexionDao.save(con);
		return pokemonService.getAbilities(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBaseExperienceRequest")
	@ResponsePayload
	public GetBaseExperienceResponse getBaseExperience(@RequestPayload final GetBaseExperienceRequest request) {
		logger.info("getBaseExperience");
		String ip = this.httpServletRequest.getRemoteAddr();
		ConexionModel con = new ConexionModel();
		con.setIp(ip);
		con.setFecha(new Date());
		con.setMetodo("getBaseExperience");
		conexionDao.save(con);
		return pokemonService.getBaseExperience(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHeldItemsRequest")
	@ResponsePayload
	public GetHeldItemsResponse getHeldItems(@RequestPayload final GetHeldItemsRequest request) {
		logger.info("getHeldItems");
		String ip = this.httpServletRequest.getRemoteAddr();
		ConexionModel con = new ConexionModel();
		con.setIp(ip);
		con.setFecha(new Date());
		con.setMetodo("getHeldItems");
		conexionDao.save(con);
		return pokemonService.getHetdItems(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getIdRequest")
	@ResponsePayload
	public GetIdResponse getId(@RequestPayload final GetIdRequest request) {
		logger.info("getId");
		String ip = this.httpServletRequest.getRemoteAddr();
		ConexionModel con = new ConexionModel();
		con.setIp(ip);
		con.setFecha(new Date());
		con.setMetodo("getId");
		conexionDao.save(con);
		return pokemonService.getId(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNameRequest")
	@ResponsePayload
	public GetNameResponse getName(@RequestPayload final GetNameRequest request) {
		logger.info("getName");
		String ip = this.httpServletRequest.getRemoteAddr();
		ConexionModel con = new ConexionModel();
		con.setIp(ip);
		con.setFecha(new Date());
		con.setMetodo("getName");
		conexionDao.save(con);
		return pokemonService.getName(request.getPokemon());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationAreaEncountersRequest")
	@ResponsePayload
	public GetLocationAreaEncountersResponse getLocationAreaEncounters(@RequestPayload final GetLocationAreaEncountersRequest request) {
		logger.info("getLocationAreaEncounters");
		String ip = this.httpServletRequest.getRemoteAddr();
		ConexionModel con = new ConexionModel();
		con.setIp(ip);
		con.setFecha(new Date());
		con.setMetodo("getLocationAreaEncounters");
		conexionDao.save(con);
		return pokemonService.getLocationAreaEncounters(request.getPokemon());
	}
}