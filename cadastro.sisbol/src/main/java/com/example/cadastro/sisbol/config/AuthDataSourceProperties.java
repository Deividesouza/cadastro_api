package com.example.cadastro.sisbol.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "auth.datasource")
public class AuthDataSourceProperties extends DataSourceProperties {
}
