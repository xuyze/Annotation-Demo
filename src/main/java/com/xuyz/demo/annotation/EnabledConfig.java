package com.xuyz.demo.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ConfigBeanDefinitionRegistrar.class)
public @interface EnabledConfig {
}



