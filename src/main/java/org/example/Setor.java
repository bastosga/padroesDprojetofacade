package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {
    private List<FilialOficina> FilialOficinaComPendencia = new ArrayList();

    public Setor() {
    }

    public void addFilialOficinaPendente(FilialOficina filialOficina) {
        this.FilialOficinaComPendencia.add(filialOficina);
    }

    public boolean verificarFilialOficinaComPendencia(FilialOficina filialOficina) {
        return this.FilialOficinaComPendencia.contains(filialOficina);
    }
}
