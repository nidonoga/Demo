package com.nido.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nido.demo.repository.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {
	
    private final UsuarioRepository usuarioRepository;

    public UsuarioDetailsService(final UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		var usuario = usuarioRepository.findByLogin(login);
		if(usuario == null)
			throw new UsernameNotFoundException("Usuario não encontrado");

		return usuario;
	}

}
