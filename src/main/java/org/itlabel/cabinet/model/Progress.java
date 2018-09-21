package org.itlabel.cabinet.model;


import lombok.Getter;
import lombok.Setter;
import org.itlabel.cabinet.model.enums.TaskStatus;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double numberOfPoints;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserModel student;

    @Enumerated(value = EnumType.STRING)
    private TaskStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Task task;

}
