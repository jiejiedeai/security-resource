//package com.security.resource.config;
//
//import com.hw.dynamic.authority.SecurityMetadataSourceSupport;
//import com.hw.dynamic.authority.UrlRedisSecurityMetadataSource;
//import com.security.resource.service.SsoResourceService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DynamicAuthorityConfig {
//
//	@Bean
//	public SecurityMetadataSourceSupport securityMetadataSourceSupport(SsoResourceService ssoResourceService){
//		return new JdbcSecurityMetadataSourceSupport(ssoResourceService);
//	}
//
//	@Bean(name = "metadataSource")
//	public UrlRedisSecurityMetadataSource metadataSource(UrlRedisSecurityMetadataSource urlRedisSecurityMetadataSource, SsoResourceService ssoResourceService){
//		urlRedisSecurityMetadataSource.setSecurityMetadataSourceSupports(securityMetadataSourceSupport(ssoResourceService));
//		return urlRedisSecurityMetadataSource;
//	}
//}
