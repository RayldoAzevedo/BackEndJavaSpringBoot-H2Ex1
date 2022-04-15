package br.com.azevedo.rayldo.usuariobdh2.dao;

import br.com.azevedo.rayldo.usuariobdh2.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
