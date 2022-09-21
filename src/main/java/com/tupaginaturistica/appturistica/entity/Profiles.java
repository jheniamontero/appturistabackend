package com.tupaginaturistica.appturistica.entity;

import com.tupaginaturistica.appturistica.entity.enums.ProfilesName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Profiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPerfil")
    @Getter @Setter
    private int id;

    @Column(name = "nombre_perfil")
    @Enumerated(EnumType.STRING)
    @Setter @Getter
    private ProfilesName profilesName;


    //CONSTRUCTOR
    public Profiles() {
    }
}
