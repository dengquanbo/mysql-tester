package com.wuda.tester.mysql.config;

import com.wuda.tester.mysql.cli.CliArgs;
import org.apache.tomcat.jdbc.pool.PoolConfiguration;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 数据库相关配置.
 *
 * @author wuda
 */
@Configuration
public class DatabaseConfiguration {

    @Bean
    public DataSource getDataSource() {
        PoolConfiguration poolProperties = new PoolProperties();
        poolProperties.setDriverClassName("com.mysql.cj.jdbc.Driver");
        poolProperties.setUrl("jdbc:mysql://localhost:3306/?serverTimezone=UTC ");
        poolProperties.setUsername("wuda0112");
        poolProperties.setPassword("123456");
        return new org.apache.tomcat.jdbc.pool.DataSource(poolProperties);
    }

    /**
     * 数据库连接的url,username,password等可以从命令行传入,
     * 使用命令行传入的数据库连接参数.
     *
     * @param cliArgs 命令行参数
     */
    public static void applyArgs(DataSource dataSource, CliArgs cliArgs) {
        org.apache.tomcat.jdbc.pool.DataSource tomcatDataSource = (org.apache.tomcat.jdbc.pool.DataSource) dataSource;
        tomcatDataSource.setUrl(cliArgs.getMysqlUrl());
        tomcatDataSource.setMaxActive(cliArgs.getMysqlMaxConnection());
    }
}