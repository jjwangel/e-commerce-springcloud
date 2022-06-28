package com.jjw.ecommerce.advice;

import com.jjw.ecommerce.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * <h1>全局异常捕获处理</h1>
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse<String> handlerCommerException(HttpServletRequest req, Exception ex) {

        CommonResponse<String> response = new CommonResponse<>(-1, "exception error");
        response.setData(ex.getMessage());
        log.error("commerce service has error：[{}]", ex.getMessage(), ex);
        return response;
    }
}
