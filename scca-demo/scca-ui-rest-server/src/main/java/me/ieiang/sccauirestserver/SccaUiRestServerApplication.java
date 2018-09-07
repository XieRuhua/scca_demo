package me.ieiang.sccauirestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SccaUiRestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SccaUiRestServerApplication.class, args);
    }
}
