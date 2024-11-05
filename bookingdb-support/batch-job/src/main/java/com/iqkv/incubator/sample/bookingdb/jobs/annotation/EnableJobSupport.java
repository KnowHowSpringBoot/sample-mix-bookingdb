package com.iqkv.incubator.sample.bookingdb.jobs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.iqkv.incubator.sample.bookingdb.jobs.JobsConfiguration;
import com.iqkv.incubator.sample.bookingdb.jobs.amqp.CommonAmqpConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import({JobsConfiguration.class, CommonAmqpConfig.class})
@Configuration
@ComponentScan("com.iqkv.incubator.sample.bookingdb.jobs")
public @interface EnableJobSupport {
}