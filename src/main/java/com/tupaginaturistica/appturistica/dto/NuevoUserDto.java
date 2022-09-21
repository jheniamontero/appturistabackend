package com.tupaginaturistica.appturistica.dto;


import com.tupaginaturistica.appturistica.entity.Profiles;
import com.tupaginaturistica.appturistica.entity.TipoDocumento;
import com.tupaginaturistica.appturistica.entity.enums.TipoUsuario;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NuevoUserDto {

    private int id;

    private String nombres;

    private String apellidos;

    private Set<TipoUsuario> tipoUsuarios = new HashSet<>();

    private List<TipoDocumento> tipodocumento;

    private String numeroIdentificacion;

    private String telefono;

    private String email;

    private Set<Profiles> profiles = new HashSet<>();

    private String observaciones;

    //constructor


    public NuevoUserDto() {
    }

    public NuevoUserDto(int id, String nombres, String apellidos, Set<TipoUsuario> tipoUsuarios, List<TipoDocumento> tipodocumento, String numeroIdentificacion, String telefono, String email, Set<Profiles> profiles, String observaciones) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoUsuarios = tipoUsuarios;
        this.tipodocumento = tipodocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.email = email;
        this.profiles = profiles;
        this.observaciones = observaciones;
    }

    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Set<TipoUsuario> getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(Set<TipoUsuario> tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }

    public List<TipoDocumento> getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(List<TipoDocumento> tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Profiles> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profiles> profiles) {
        this.profiles = profiles;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
