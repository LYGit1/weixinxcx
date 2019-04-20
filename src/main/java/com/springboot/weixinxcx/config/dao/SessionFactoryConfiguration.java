package com.springboot.weixinxcx.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class SessionFactoryConfiguration {
    @Value("${mybatis.config-location}")
    private String mybatisConfig;
    @Value("${mybatis.mapper-locations}")
    private String mappingPath;
    @Value("${mybatis.type-aliases-package}")
    private String entityPath;

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setConfigLocation(new ClassPathResource(mybatisConfig));//mybatis全局配置地址
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mappingPath;
        bean.setMapperLocations(resolver.getResources(packageSearchPath));//mybatis的mapping地址
        bean.setDataSource(dataSource);//线程池ComboPooledDataSource
        bean.setTypeAliasesPackage(entityPath);//entity类包地址
        return bean;
    }
}
