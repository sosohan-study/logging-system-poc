package com.poc.logv1.global.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UUIDGenerator {
    public static UUID generateUUID() {
        return UUID.randomUUID();
    }

    public static UUID generateUUIDBy(String value) {
        return UUID.fromString(value);
    }
}
