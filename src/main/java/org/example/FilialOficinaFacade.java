package org.example;


public class FilialOficinaFacade {
    public FilialOficinaFacade() {
    }
    public static boolean verificarPendenciasPagamento(FilialOficina filialOficina) {
        if (ordemServico.getInstancia().verificarFilialOficinaComPendencia(filialOficina)) {
            return false;
        } else if (Oficina.getInstancia().verificarFilialOficinaComPendencia(filialOficina)) {
            return false;
        } else {
            return !Pagamento.getInstancia().verificarFilialOficinaComPendencia(filialOficina);
        }
    }
}