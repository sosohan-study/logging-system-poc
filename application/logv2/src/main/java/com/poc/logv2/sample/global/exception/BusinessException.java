package com.poc.logv2.sample.global.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class BusinessException extends RuntimeException {

    private final ErrorStatus errorStatus;

    public static BusinessException from(ErrorStatus status) {
        return new BusinessException(status);
    }
}
