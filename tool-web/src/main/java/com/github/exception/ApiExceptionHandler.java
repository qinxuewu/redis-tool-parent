package com.github.exception;
import com.github.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 * @author qinxuewu
 * @version 1.00
 * @time 14/11/2018上午 9:47
 */
@RestControllerAdvice
public class ApiExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 处理自定义异常
     */
    @ExceptionHandler(MyException.class)
    public R handleRRException(MyException e) {
        R r = new R();
        r.put("code", e.getCode());
        r.put("msg", e.getMessage());

        return r;
    }

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        logger.error("全局Exception异常：{}", e);
        return R.error();
    }
}
