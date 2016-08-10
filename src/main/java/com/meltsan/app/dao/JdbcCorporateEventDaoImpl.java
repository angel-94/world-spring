package com.meltsan.app.dao;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan
public class JdbcCorporateEventDaoImpl implements CorporateEventDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
    public void setDataSource(DataSource dataSource) {
		Logger logger = LoggerFactory.getLogger(JdbcCorporateEventDaoImpl.class);
		logger.info("hola");
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
