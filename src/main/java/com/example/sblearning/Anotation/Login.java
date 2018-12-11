package com.example.sblearning.Anotation;

import java.lang.annotation.*;

/**
 * Created by chentiming on 2018/11/25.
 */

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Login {
}
