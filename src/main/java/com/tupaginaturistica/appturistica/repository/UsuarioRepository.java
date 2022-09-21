package com.tupaginaturistica.appturistica.repository;

import com.tupaginaturistica.appturistica.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {
}
