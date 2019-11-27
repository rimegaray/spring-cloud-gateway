package com.everis.springboot.app;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/api/person/**")
						.uri("lb://servicio-persona/")
						.id("servicio-persona"))
				.route(r -> r.path("/api/student/**")
						.uri("lb://servicio-estudiante/")
						.id("servicio-estudiante"))
				.build();
	}
}
