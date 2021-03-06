package com.github.annotation;

import java.lang.annotation.*;

/**
 * redis限流

 * @author qxw
 * @data 2018年6月7日下午5:01:55
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RedisRateLimit {
    /**
     * 限流唯一标示
     *
     * @return
     */
    String key() default "";

    /**
     * 限流时间
     *
     * @return
     */
    int time();

    /**
     * 限流次数
     *
     * @return
     */
    int count();

    /**
     * 自定义限流提示语
     * @return
     */
    String msg() default "已达到限流阀值";
}
