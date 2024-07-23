package com.example.stereostypes;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
//@Target({ElementType.FIELD,ElementType.TYPE})

@Target(ElementType.TYPE)
public @interface Table {

	String name();
}
