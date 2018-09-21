package org.itlabel.cabinet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "task")
public class Task{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_model_id")
    private ProgramModel program;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "task")
    private List<Progress> progress;

    private Double point;

    @Override
    public String toString() {
        return "Task ID#"+id + " Name: " + name;
    }

}