package com.problem.bank.mjin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "oracleEntityManager", transactionManagerRef = "oracleTransactionManager", basePackages = "com.problem.bank.mjin.main.ora.repo")
public class SecondDBConfig {

    private final Environment env;

    public SecondDBConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public DataSource oracleDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.hikari.bootdb2.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.hikari.bootdb2.jdbc-url"));
        dataSource.setUsername(env.getProperty("spring.datasource.hikari.bootdb2.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.hikari.bootdb2.password"));

        return dataSource;
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean oracleEntityManager() {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        HashMap<String, Object> properties = new HashMap<>();

        localContainerEntityManagerFactoryBean.setDataSource(oracleDataSource());
        localContainerEntityManagerFactoryBean.setPackagesToScan("com.problem.bank.mjin.main.ora.model");
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);

        properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.sub.hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("spring.sub.hibernate.dialect"));

        localContainerEntityManagerFactoryBean.setJpaPropertyMap(properties);

        return localContainerEntityManagerFactoryBean;
    }

    @Bean
    public PlatformTransactionManager oracleTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(oracleEntityManager().getObject());
        return transactionManager;
    }

}
