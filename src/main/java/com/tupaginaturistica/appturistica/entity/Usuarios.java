package com.tupaginaturistica.appturistica.entity;

import com.tupaginaturistica.appturistica.entity.enums.TipoUsuario;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    @Column(name = "nombresCompletos")
    String nombres;


    @Getter
    @Setter
    @Column(name = "apellidosCompletos")
    private String apellidos;

    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tipo_usuarios", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "tipousr_id"))
    private Set<TipoUsuario> tipoUsuarios = new HashSet<>();

    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "doc_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "doc_id") )
    private List<TipoDocumento> tipodocumento;

    @Getter
    @Setter
    @Column(name = "numeroNit", unique = true)
    private String numeroIdentificacion;

    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;

    @Getter
    @Setter
    @Column(name = "correo", unique = true)
    private String email;


    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "profile_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Set<Profiles> profiles = new HashSet<>();

    @Getter
    @Setter
    @Column(name = "observaciones")
    private String observaciones;

    //constructor


    public Usuarios() {
    }

    public Usuarios(int id, String nombres, String apellidos, Set<TipoUsuario> tipoUsuarios, List<TipoDocumento> tipodocumento, String numeroIdentificacion, String telefono, String email, String observaciones) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoUsuarios = tipoUsuarios;
        this.tipodocumento = tipodocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.email = email;
        this.observaciones = observaciones;
    }
}
