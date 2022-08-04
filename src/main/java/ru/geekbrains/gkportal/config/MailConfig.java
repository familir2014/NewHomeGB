package ru.geekbrains.gkportal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import ru.geekbrains.gkportal.entity.PropertyType;
import ru.geekbrains.gkportal.service.PropertyService;

import java.util.Properties;

@Configuration
public class MailConfig {

    private Environment env;
    private PropertyService propertyService;

    private final static String CHECKSERVERIDENTITY = "true";
    private final static String TRUST = "*";
    private final static String SOCKET_FACTORY = "javax.net.ssl.SSLSocketFactory";

    public static final String ADMIN_MAIL = "admin@chertenok.ru";

    @Autowired
    public void setPropertyService(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @Autowired
    public void setEnv(Environment env) {
        this.env = env;
    }