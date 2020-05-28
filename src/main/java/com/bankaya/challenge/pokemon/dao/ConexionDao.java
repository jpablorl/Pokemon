package com.bankaya.challenge.pokemon.dao;

import java.io.FileNotFoundException;
import java.util.List;

import com.bankaya.challenge.pokemon.entity.model.ConexionModel;

public interface ConexionDao {
    
    long save(ConexionModel con);

    int update(ConexionModel con);

    int delete(long id);

    List<ConexionModel> loadAll() throws FileNotFoundException;
}