package br.com.azevedo.rayldo.usuariobdh2.service;
import br.com.azevedo.rayldo.usuariobdh2.models.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario incluir(Usuario usuario);
    public List<Usuario> listar();
    public Usuario consultar(Integer id);
    public void alterar(Usuario usuario);
    public void excluir(Integer id);
}
