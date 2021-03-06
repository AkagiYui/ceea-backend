package com.kenko.eeas.exception;

import cn.hutool.log.Log;
import com.kenko.eeas.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.kenko.eeas.common.HTTPCode.SYSTEM_ERROR;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Log log = Log.get();

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result handleException(ServiceException se) {
        log.error("ServiceException", se);
        return Result.error(se.getCode(), se.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        log.error("Exception", e);
        return Result.error(SYSTEM_ERROR, "System Error");
    }
}
