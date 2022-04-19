package com.poc.logv1.sample.domain.service;

import com.poc.logv1.global.annotation.FacadeService;
import com.poc.logv1.global.exception.BusinessException;
import com.poc.logv1.global.exception.ErrorStatus;
import com.poc.logv1.global.utils.UUIDGenerator;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

import static com.poc.logv1.global.utils.AssertUtils.isTrueThrowBy;

@Slf4j
@FacadeService
public record SampleFacadeService() {

    public void process() {
        final String identity = UUIDGenerator.generateUUID().toString();
        log.info("Start Transaction. id = {}", identity);
        log.info("===== Process =====");
        log.info("=>   Init    Event. Transaction id = {}, time = {}", identity, LocalDateTime.now());
        log.info("==>  Access  Event. Transaction id = {}, time = {}", identity, LocalDateTime.now());
        log.info("===> Cleanup Event. Transaction id = {}, time = {}", identity, LocalDateTime.now());
        log.info("===== End     =====");
    }

    public void throwException() {
        final String identity = UUIDGenerator.generateUUID().toString();
        log.info("Start Transaction. id = {}", identity);
        log.info("===== Process =====");
        log.info("=>   Init   Event. Transaction id = {}, time = {}", identity, LocalDateTime.now());
        isTrueThrowBy(true, () -> BusinessException.from(ErrorStatus.S01_PROCESS_FAILED));
    }
}
