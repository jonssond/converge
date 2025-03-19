package com.converge.application.domain.entity.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PresentialEvent extends Event {
    private Integer maxCapacity;
    private String address;
}
