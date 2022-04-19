package com.poc.logv1.global.utils;

import com.poc.logv1.global.exception.BusinessException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.function.Supplier;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AssertUtils {
    public static void isTrueThrowBy(boolean condition, Supplier<BusinessException> supplier) {
        if (condition) {
            throw supplier.get();
        }
    }
}
