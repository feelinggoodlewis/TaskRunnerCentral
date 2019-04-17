package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.sree.trc", "com.sree"})
public class TRCRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(TRCRunner.class, args);

    }
}
