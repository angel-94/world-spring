package com.meltsan.app.dao;

import javax.sql.DataSource;

public interface CityDAO {
	public void setDataSource(DataSource dataSource);
	public int countOfCityByFirstName(String name);
}
