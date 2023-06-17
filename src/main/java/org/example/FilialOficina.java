package org.example;

public class FilialOficina {
    public FilialOficina() {
    }

    public boolean pagar() {
        return FilialOficinaFacade.verificarPendenciasPagamento(this);
    }
}
