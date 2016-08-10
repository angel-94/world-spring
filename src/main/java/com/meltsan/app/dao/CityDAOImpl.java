package com.meltsan.app.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CityDAOImpl implements CityDAO{
	// some JDBC-backed DAO class...
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setDataSource(DataSource dataSource) {
	    this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public int countOfCityByFirstName(String name) {
	    String sql = "select count(*) from City where Name = :name";
	    SqlParameterSource namedParameters = new MapSqlParameterSource("name", name);
	    return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
	}
}
