package com.ijse.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service-route", r -> r.path("/api/v1/users/**")
                        .filters(f -> f.dedupeResponseHeader("Access-Control-Allow-Origin", "RETAIN_FIRST")
                                       .dedupeResponseHeader("Access-Control-Allow-Credentials", "RETAIN_FIRST"))
                        .uri("lb://USER-SERVICE"))
                .route("course-service-route", r -> r.path("/api/v1/courses/**")
                        .filters(f -> f.dedupeResponseHeader("Access-Control-Allow-Origin", "RETAIN_FIRST")
                                       .dedupeResponseHeader("Access-Control-Allow-Credentials", "RETAIN_FIRST"))
                        .uri("lb://COURSE-SERVICE"))
                .route("media-service-route", r -> r.path("/api/v1/media/**")
                        .filters(f -> f.dedupeResponseHeader("Access-Control-Allow-Origin", "RETAIN_FIRST")
                                       .dedupeResponseHeader("Access-Control-Allow-Credentials", "RETAIN_FIRST"))
                        .uri("lb://MEDIA-SERVICE"))
                .build();
    }
}
