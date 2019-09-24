package com.lhf.simplespringbootstarter.service;

import org.springframework.util.StringUtils;

/**
 * @author Pirate
 * @desc 分割服务
 * @since v1.0.0
 **/
public class SplitService {

    private String config;

    public SplitService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar){
        return StringUtils.split(config,separatorChar);
    }
}
