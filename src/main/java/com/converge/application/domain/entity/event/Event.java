package com.converge.application.domain.entity.event;

import com.converge.application.domain.entity.DomainEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class Event<ID> extends DomainEntity<ID> {
    private String eventName;
    private String description;
    private LocalDateTime eventDate;

}
