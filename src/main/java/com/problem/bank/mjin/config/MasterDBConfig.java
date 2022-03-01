package com.problem.bank.mjin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
@EnableJpaRepositories(entityManagerFactoryRef = "mysqlEntityManager", transactionManagerRef = "mysqlTransactionManager", basePackages = "com.problem.bank.mjin.db.maria.repo")
public class MasterDBConfig {

    private final Environment env;

    private final static String BASE_PACKAGE_NAME = "com.problem.bank.mjin.db.maria";

    public MasterDBConfig(Environment env) {
        this.env = env;
    }

    @Primary
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.hikari.bootdb1.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.hikari.bootdb1.jdbc-url"));
        dataSource.setUsername(env.getProperty("spring.datasource.hikari.bootdb1.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.hikari.bootdb1.password"));
        return dataSource;
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean mysqlEntityManager() {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        HashMap<String, Object> properties = new HashMap<>();
        localContainerEntityManagerFactoryBean.setDataSource(mysqlDataSource());
        localContainerEntityManagerFactoryBean.setPackagesToScan(new String[] { BASE_PACKAGE_NAME+".model" });
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.common.hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("spring.common.hibernate.dialect"));
        localContainerEntityManagerFactoryBean.setJpaPropertyMap(properties);
        return localContainerEntityManagerFactoryBean;
    }

    @Primary
    @Bean
    public PlatformTransactionManager mysqlTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(mysqlEntityManager().getObject());
        return transactionManager;
    }
}