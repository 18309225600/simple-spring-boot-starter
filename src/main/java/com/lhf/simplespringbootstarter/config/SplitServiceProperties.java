package com.lhf.simplespringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Pirate
 * @desc 配置文件读取
 * @since v1.0.0
 **/
@ConfigurationProperties("simple.config")
public class SplitServiceProperties {
    private  String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
