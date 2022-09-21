package com.tupaginaturistica.appturistica.controllers;

import com.tupaginaturistica.appturistica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class Usuario {


    @Autowired
    UsuarioService usuarioService;


}
