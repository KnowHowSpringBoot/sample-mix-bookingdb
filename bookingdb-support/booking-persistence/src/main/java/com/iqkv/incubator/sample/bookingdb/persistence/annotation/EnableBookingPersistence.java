package com.iqkv.incubator.sample.bookingdb.persistence.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.iqkv.incubator.sample.bookingdb.persistence.config.CacheConfig;
import com.iqkv.incubator.sample.bookingdb.persistence.config.PersistenceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Configuration
@Import({PersistenceConfig.class, CacheConfig.class})
public @interface EnableBookingPersistence {
}