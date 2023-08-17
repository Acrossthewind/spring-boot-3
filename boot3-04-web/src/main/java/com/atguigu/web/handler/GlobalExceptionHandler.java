package com.atguigu.web.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/12 9:46
 */

//@ControllerAdvice //这个类是集中处理所有@Controller 发生的错误
public class GlobalExceptionHandler {

    /**
     * @ExceptionHandler 标识一个方法处理错误，只能处理这个类里面发生的方法
     * @param e
     * @return
     */

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        return "OhOh 这是统一处理" +e.getMessage();
    }
}
