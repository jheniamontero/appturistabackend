package com.tupaginaturistica.appturistica.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_Documento")
    private int id;

    @Getter
    @Setter
    private String documento;

    public TipoDocumento() {
    }

    //constructor
    public TipoDocumento(int id, String documento) {
        this.id = id;
        this.documento = documento;
    }



}
