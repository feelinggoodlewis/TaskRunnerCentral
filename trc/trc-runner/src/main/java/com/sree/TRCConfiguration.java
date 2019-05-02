package com.sree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class TRCConfiguration {

    @Value("#{'${taskTypes}'.split(',')}")
    private List<String> taskTypes;

    public List<String> getTaskTypes() {
        return taskTypes;
    }
}
