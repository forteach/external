package com.forteach.external.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-3 10:54
 * @Version: 1.0
 * @Description: 多数据源源配置
 */
@Configuration
public class DataSourceConfig{

    @Primary
    @Bean("dataSourcePropertiesMysql")
    @Qualifier(value = "dataSourcePropertiesMysql")
    @ConfigurationProperties(prefix = "spring.datasource.datasource-mysql")
    public DataSourceProperties dataSourcePropertiesMysql(){
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "mysqlDataSource")
    @Qualifier(value = "mysqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.datasource-mysql")
    public DataSource mysqlDataSource() {
        return dataSourcePropertiesMysql().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean("dataSourcePropertiesOracle")
    @Qualifier(value = "dataSourcePropertiesOracle")
    @ConfigurationProperties(prefix = "spring.datasource.datasource-oracle")
    public DataSourceProperties dataSourcePropertiesOracle(){
        return new DataSourceProperties();
    }

    @Bean(name = "oracleDataSource")
    @Qualifier(value = "oracleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.datasource-oracle")
    public DataSource secondaryDataSource() {
        return dataSourcePropertiesOracle().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}
