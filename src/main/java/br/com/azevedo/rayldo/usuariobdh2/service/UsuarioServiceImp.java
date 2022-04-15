package br.com.azevedo.rayldo.usuariobdh2.service;
import br.com.azevedo.rayldo.usuariobdh2.dao.UsuarioRepository;
import br.com.azevedo.rayldo.usuariobdh2.models.Usuario;
import br.com.azevedo.rayldo.usuariobdh2.util.MeuBackEndException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository repository;

    @Autowired
    public UsuarioServiceImp(UsuarioRepository repositorio) {
        this.repository = repositorio;
    }

    @Override
    public Usuario incluir(Usuario usuario) {
        try {
            repository.save(usuario);
            return usuario;
        } catch (Exception e) {
            throw new MeuBackEndException("Não foi possível incluir usuário");
        }
    }

    @Override
    public List<Usuario> listar() {
        try {
            return (List<Usuario>) this.repository.findAll();
        }
        catch (Exception e){
            throw new MeuBackEndException("Não foi possível listar os usuários!");
        }
    }

    @Override
    public Usuario consultar(Integer id) {
        try {
            return this.repository.findById(id).get();
        }
        catch (Exception e){
            throw new MeuBackEndException("Não foi possível consultar o usuário: "+id+"!");
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        try {
            repository.save(usuario);
        }
        catch (Exception e){
            throw new MeuBackEndException("Não foi possível alterar o usuario: "+usuario.getId()+"!");
        }
    }

    @Override
    public void excluir(Integer id) {
        try {
            repository.deleteById(id);
        }
        catch (Exception e){
            throw new MeuBackEndException("Não foi possível excluir o usuario: "+id+"!");
        }
    }
}
