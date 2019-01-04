package com.forteach.external.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-3 14:32
 * @Version: 1.0
 * @Description:
 */
@Configuration
@EnableJpaRepositories(
        basePackages = {
                "com.forteach.external.mysql.repository"
        },
        entityManagerFactoryRef = "entityManagerFactoryMysql",
        transactionManagerRef = "transactionManagerMysql"
)
@EnableTransactionManagement
public class MysqlConfig {

    @Resource
    @Qualifier(value = "mysqlDataSource")
    private DataSource mysqlDataSource;

    @Primary
    @Bean(name = "entityManagerFactoryMysql")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryMysql() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.forteach.external.mysql.domain");
        factory.setDataSource(mysqlDataSource);
        return factory;
    }

    @Primary
    @Bean(name = "transactionManagerMysql")
    public PlatformTransactionManager transactionManagerMysql(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }

}
