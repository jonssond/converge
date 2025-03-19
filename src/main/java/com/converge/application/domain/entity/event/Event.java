package com.converge.application.domain.entity.event;

import com.converge.application.domain.entity.DomainEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class Event extends DomainEntity {
    private String name;
    private String description;
    private LocalDateTime dateAndTime;
    private Double price;

    public Event(Long id) {
        super(id);
    }
}
