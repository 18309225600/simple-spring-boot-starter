package com.lhf.simplespringbootstarter;

import com.lhf.simplespringbootstarter.config.SplitServiceProperties;
import com.lhf.simplespringbootstarter.service.SplitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pirate
 * @desc autoConfig
 * @since v1.0.0
 **/
@Configuration
@ConditionalOnClass(SplitService.class)
@EnableConfigurationProperties(SplitServiceProperties.class)
public class SplitAutoConfig {

    @Autowired
    private SplitServiceProperties splitServiceProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "simple.config",value = "enable",havingValue = "true")
    SplitService splitService(){
        return new SplitService(splitServiceProperties.getConfig());
    }
}
