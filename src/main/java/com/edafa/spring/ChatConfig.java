package com.edafa.spring;


import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

//@Configuration
//@PropertySource("classpath:application.properties")
//@ComponentScan("com.edafa.spring")
//@EnableJpaRepositories(entityManagerFactoryRef = "chatSchemaEntityManagerFactory", basePackages = {
//"com.edafa.spring.repository" })
public class ChatConfig {

	private Environment env;
	
	public DataSource dataSource() throws NamingException {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));

		return dataSource;
	}
	
//	@Bean(name = "chatSchemaEntityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean chatSchemaEntityManagerFactory(EntityManagerFactoryBuilder builder,
//			 DataSource dataSource) {
//		return builder.dataSource(dataSource).packages("com.edafa.spring.entity").persistenceUnit("chat")
//				.build();
//	}
//
//	@Bean(name = "chatSchemaTransactionManager")
//	public PlatformTransactionManager chatSchemaTransactionManager(
//			@Qualifier("chatSchemaEntityManagerFactory") EntityManagerFactory chatSchemaEntityManagerFactory) {
//		return new JpaTransactionManager(chatSchemaEntityManagerFactory);
//	}
//	
}
