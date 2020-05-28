package com.bankaya.challenge.pokemon.dao.impl;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.bankaya.challenge.pokemon.dao.ConexionDao;
import com.bankaya.challenge.pokemon.entity.model.ConexionModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class ConexionDaoImpl extends JdbcDaoSupport implements ConexionDao{
    
    Logger logger = LoggerFactory.getLogger(ConexionDaoImpl.class);
    
    @Autowired
    private DataSource dataSource;
    
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}
	
	@Override
	public long save(ConexionModel con) {
		logger.info("long save(ConexionModel con))");
		String sql = String.format("INSERT INTO api.conexion(ip, fecha, metodo) VALUES ('%s','%s','%s') RETURNING id;",
            con.getIp(),
            con.getFecha(),
            con.getMetodo());
		sql = sql.replaceAll("'null'", "NULL");
		logger.info(sql);
		return getJdbcTemplate().queryForObject(sql, Long.class);
	}
	@Override
	public int update(ConexionModel con) {
		logger.info("int update(long save(ConexionModel con)");
		String sql = String.format("");
		sql = sql.replaceAll("'null'", "NULL");
		logger.info(sql);
		return getJdbcTemplate().update(sql);
	}
	@Override
	public int delete(long id) {
		logger.info("int delete(long id)");
		String sql = String.format("",id);
		sql = sql.replaceAll("'null'", "NULL");
		logger.info(sql);
		return getJdbcTemplate().update(sql);
	}
	@Override
	public List<ConexionModel> loadAll() throws FileNotFoundException {
		logger.info("List<ConexionModel> loadAll()");
		String sql = String.format("");
		logger.info(sql);
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<ConexionModel> lista = new ArrayList<ConexionModel>();
		for (Map<String, Object> row : rows) {
			ConexionModel item = new ConexionModel();
			
			lista.add(item);
		}
		if(lista.size()==0) {
			throw new FileNotFoundException("No se encontraron registros");
		} else {
			return lista;
		}
	}
}