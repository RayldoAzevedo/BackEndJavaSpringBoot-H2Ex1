package br.com.azevedo.rayldo.usuariobdh2.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class MeuBackEndException extends ResponseStatusException {

    public MeuBackEndException(String mensagem) {
        super(HttpStatus.INTERNAL_SERVER_ERROR,mensagem);
    }
}
