package com.bindstone.weblog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.DefaultHttpLogFormatter;
import org.zalando.logbook.DefaultHttpLogWriter;
import org.zalando.logbook.DefaultSink;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.json.JsonHttpLogFormatter;

@Configuration
public class LogbookConfig {

    @Bean
    public Logbook logbook() {
        Logbook logbook = Logbook.builder()
                .sink(new DefaultSink(
                        new JsonHttpLogFormatter(),
                        new DefaultHttpLogWriter()
                ))
                .build();
        return logbook;
    }

}