/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ConfigBeanDefinitionRegistrar
 * Author:   xuyz
 * Date:     2019/5/26 23:17
 * Description: 注册
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.demo.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 〈一句话功能简述〉<br>
 * 〈注册〉
 *
 * @author xuyz
 * @create 2019/5/26
 * @since 1.0.0
 */
public class ConfigBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, EnvironmentAware,
        BeanFactoryAware {

    private Environment environment;

    private BeanFactory beanFactory;

    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
//        AnnotationAttributes attributes = fromMap(metadata.getAnnotationAttributes(EnableNacosConfig.class.getName()));
//        // Register Global Nacos Properties Bean
//        registerGlobalNacosProperties(attributes, registry, environment, CONFIG_GLOBAL_NACOS_PROPERTIES_BEAN_NAME);
//        // Register Nacos Common Beans
//        registerNacosCommonBeans(registry);
//        // Register Nacos Config Beans
//        registerNacosConfigBeans(registry, environment);
//        // Invoke NacosPropertySourcePostProcessor immediately
//        // in order to enhance the precedence of @NacosPropertySource process
//        invokeNacosPropertySourcePostProcessor(beanFactory);
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
