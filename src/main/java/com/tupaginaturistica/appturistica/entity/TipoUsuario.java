package com.tupaginaturistica.appturistica.entity;

import com.tupaginaturistica.appturistica.entity.enums.TipoUsuarios;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class TipoUsuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name = "idUsuario")
    private int id;

    @Getter @Setter
    @Column(name = "tipo_usuarios")
    @Enumerated(EnumType.STRING)
    private TipoUsuarios tipoUsuarios;

    //constructor
    public TipoUsuario() {
    }

    public TipoUsuario(int id, String tipoUsuarios) {
        this.id = id;
        this.tipoUsuarios = TipoUsuarios.valueOf(tipoUsuarios);
    }
}
