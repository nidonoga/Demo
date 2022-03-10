package com.nido.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nido.demo.entity.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
	
	public UsuarioModel findByLogin(String login);

}
