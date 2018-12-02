package com.rogerpeyer.orderpricing.configuration.properties;

import com.rogerpeyer.orderpricing.configuration.properties.factory.YamlPropertySourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:default.yml", factory = YamlPropertySourceFactory.class)
public class DefaultConfig {}
