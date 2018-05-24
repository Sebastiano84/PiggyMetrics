package com.piggymetrics.notification;


import com.piggymetrics.notification.repository.converter.FrequencyReaderConverter;
import com.piggymetrics.notification.repository.converter.FrequencyWriterConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;

/*@EnableDiscoveryClient
@EnableResourceServer
@EnableOAuth2Client
@EnableFeignClients
@EnableGlobalMethodSecurity(prePostEnabled = true)*/
//@EnableConfigurationProperties
@EnableScheduling
@ApplicationPath("/")
@Configuration
@ComponentScan
public class NotificationServiceApplication extends Application {

/*
        @Bean
        @ConfigurationProperties(prefix = "security.oauth2.client")
        public ClientCredentialsResourceDetails clientCredentialsResourceDetails() {
            return new ClientCredentialsResourceDetails();
        }

        @Bean
        public RequestInterceptor oauth2FeignRequestInterceptor() {
            return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), clientCredentialsResourceDetails());
        }

       @Bean
        public OAuth2RestTemplate clientCredentialsRestTemplate() {
            return new OAuth2RestTemplate(clientCredentialsResourceDetails());
        }*/

    @Configuration
    static class CustomConversionsConfig {

        @Bean
        public CustomConversions customConversions() {
            return new CustomConversions(Arrays.asList(new FrequencyReaderConverter(),
                    new FrequencyWriterConverter()));
        }
    }
}
