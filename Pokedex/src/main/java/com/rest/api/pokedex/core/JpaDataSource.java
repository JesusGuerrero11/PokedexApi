package com.rest.api.pokedex.core;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class JpaDataSource {
	 
	public static final String DATA_SOURCE_MYSQL = "mysqlDataSource";
	
	@Bean(name= JpaDataSource.DATA_SOURCE_MYSQL)
	public DataSource mysqlSpringDataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/pokedex_bd");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("");
		return dataSourceBuilder.build();
	}
}
