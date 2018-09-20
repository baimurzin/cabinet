package org.itlabel.cabinet.model;

import lombok.Getter;
import lombok.Setter;
import org.itlabel.cabinet.model.enums.UserRole;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "user_model")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserRole userRole = UserRole.STUDENT;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_model_id")
    private GroupModel group_model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_model_id")
    private ProgramModel program;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Progress> progress;

}
