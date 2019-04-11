package com.sree.trc.framework.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class TRCConfiguration {

    @Value("#{'${taskTypes}'.split(',')}")
    private List<String> taskTypes;

    public List<String> getTaskTypes() {
        return taskTypes;
    }
}
