package com.bgora.bgora.config;

//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//import com.csu.bootone.Interceptor.OneInterceptor;

import com.bgora.bgora.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LabInterceptorConfig implements WebMvcConfigurer {



//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 注册拦截器
//        LoginInterceptor loginInterceptor = new LoginInterceptor();
//        InterceptorRegistration loginRegistry = registry.addInterceptor(loginInterceptor);
//        // 拦截路径
//        loginRegistry.addPathPatterns("/**");
//        // 排除路径
//        loginRegistry.excludePathPatterns("/home");
//        loginRegistry.excludePathPatterns("/doLogin");
//        loginRegistry.excludePathPatterns("/login");
//        loginRegistry.excludePathPatterns("/static/**");
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //和页面有关的静态目录都放在项目的static目录下
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //其中image表示访问的前缀。"/Users/zhangqi/Downloads/"是文件真实的存储路径
//        registry.addResourceHandler("/image/**").addResourceLocations("/Users/zhangqi/Downloads/");
    }
}
