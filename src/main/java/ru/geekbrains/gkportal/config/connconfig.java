package ru.geekbrains.gkportal.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.log4j.Logger;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


@Configuration
public class ConnectorConfig {

    private static final Logger logger = Logger.getLogger(ConnectorConfig.class);

    private Environment env;

    @Autowired
    public void setEnv(Environment env) {
        this.env = env;
    }
