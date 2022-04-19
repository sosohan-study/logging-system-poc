package com.poc.logv2.sample.global.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<Void> handleBusinessException(BusinessException exception) {
        final ErrorStatus errorStatus = exception.getErrorStatus();
        log.info("BusinessException. exception message = {}, exception status = {}", errorStatus.getMessage(), errorStatus.getHttpStatus());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
