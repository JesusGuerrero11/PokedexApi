package com.rest.api.pokedex.core;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@MapperScan(basePackages = "com.rest.api.pokedex.core.repository.mapper", sqlSessionFactoryRef = JpaConfig.SQL_SESSION_FACTORY_NAME)
public class JpaConfig {
	/**
	 * 
	 */ 
	public static final String SQL_SESSION_FACTORY_NAME = "sessionFactoryMysql";
	
	/**
	 * 
	 */
	public static final String TX_MANAGER = "txManagerMysql";
	
	@Bean(name = TX_MANAGER)
    public PlatformTransactionManager txManagerKm(@Qualifier(JpaDataSource.DATA_SOURCE_MYSQL) DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    
    @Bean(name = JpaConfig.SQL_SESSION_FACTORY_NAME)
    public SqlSessionFactory sqlSessionFactoryBean(@Qualifier(JpaDataSource.DATA_SOURCE_MYSQL) DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }

}
