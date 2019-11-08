package com.example.demospring.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor
public class Event extends BaseEntity {

    @Column(name = "event_name", nullable = false, unique = true)
    private String eventName;
    @Column(name = "event_start_date_time")
    private LocalDateTime startDateTime;
    @Column(name = "event_end_date_time")
    private LocalDateTime endDateTime;
    @Column(name = "participants")
    private List<User> participants;
    @Column(name = "responsible_person")
    private User responsiblePerson;

}
