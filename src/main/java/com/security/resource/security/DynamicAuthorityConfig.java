package com.security.resource.security;

import com.ht.dynamic.authority.SecurityMetadataSourceSupport;
import com.ht.dynamic.authority.UrlRedisSecurityMetadataSource;
import com.security.resource.service.SsoResourceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamicAuthorityConfig {

	@Bean
	public SecurityMetadataSourceSupport securityMetadataSourceSupport(SsoResourceService ssoResourceService){
		return new JdbcSecurityMetadataSourceSupport(ssoResourceService);
	}

	@Bean(name = "metadataSource")
	public UrlRedisSecurityMetadataSource metadataSource(UrlRedisSecurityMetadataSource urlRedisSecurityMetadataSource, SsoResourceService ssoResourceService){
		urlRedisSecurityMetadataSource.setSecurityMetadataSourceSupports(securityMetadataSourceSupport(ssoResourceService));
		return urlRedisSecurityMetadataSource;
	}
}
