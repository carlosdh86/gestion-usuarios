package com.cice.gestionusuarios.service;

import com.cice.gestionusuarios.controller.dto.UsuarioDTO;

public interface UsuarioService {

    /**
     * Metodo que buscará un usuario en base a los datos obtenidos del formulario de login
     *
     * @param usuarioDTO
     * @return
     */
    public Long buscarUsuarioByLogin (UsuarioDTO usuarioDTO);
}
