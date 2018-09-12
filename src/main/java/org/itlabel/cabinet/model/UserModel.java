package org.itlabel.cabinet.model;

import lombok.Getter;
import lombok.Setter;
import org.itlabel.cabinet.model.enums.Role;

import javax.persistence.*;

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
    private Role userRole;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private GroupModel group;
}
