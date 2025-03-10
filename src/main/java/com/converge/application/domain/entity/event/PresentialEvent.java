package com.converge.application.domain.entity.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PresentialEvent<ID> extends Event<ID> {
    private Integer maxCapacity;
    private String address;
}
