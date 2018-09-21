package org.itlabel.cabinet.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "program_model")
public class ProgramModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "program")
    private List<Task> tasks;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "program")
    private List<UserModel> students;

    @OneToOne
    private GroupModel group;

}
