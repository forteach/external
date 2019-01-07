package com.forteach.external.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Indexed;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-3 15:08
 * @Version: 1.0
 * @Description:　数字化校园 ORACLE 配置
 */
@Indexed
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {
                "com.forteach.external.oracle.repository"
        },
        entityManagerFactoryRef = "entityManagerFactoryOracle",
        transactionManagerRef = "transactionManagerOracle"
)
public class OracleConfig {

    @Resource
    @Qualifier(value = "oracleDataSource")
    private DataSource oracleDataSource;

    @Bean(name = "entityManagerFactoryOracle")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryOracle() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.forteach.external.oracle.entity");
        factory.setDataSource(oracleDataSource);
        return factory;
    }

    @Bean(name = "transactionManagerOracle")
    public PlatformTransactionManager transactionManagerOracle(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }
}
