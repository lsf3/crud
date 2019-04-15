package com.sf.helloworld.config;

import static org.hamcrest.CoreMatchers.nullValue;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class MybatisConfigurataion {
	
	//启用下划线驼峰命名转换,解决数据库列名与JavaBean属性命名风格不一致问题!
	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
	   return new ConfigurationCustomizer() {
			
			@Override
			public void customize(Configuration arg0) {
				// TODO Auto-generated method stub
				arg0.setMapUnderscoreToCamelCase(true);
			}
		};
		
	}

}
