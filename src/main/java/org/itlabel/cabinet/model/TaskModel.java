package org.itlabel.cabinet.model;


import lombok.Getter;
import lombok.Setter;
import org.itlabel.cabinet.model.enums.TaskStatus;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "task")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus = TaskStatus.NEW;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_model_id")
    private ProgramModel program;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "task")
    private List<Progress> progress;

    private Double point;

}
