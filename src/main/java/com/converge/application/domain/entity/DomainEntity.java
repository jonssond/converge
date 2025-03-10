package com.converge.application.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DomainEntity<ID> {
    private ID id;
    private ID createdBy;
    private ID updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
