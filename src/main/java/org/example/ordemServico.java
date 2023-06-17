package org.example;
public class ordemServico extends Setor {

    private static ordemServico ordemServico = new ordemServico();

    private ordemServico() {};
    public static ordemServico getInstancia() {
        return ordemServico;
    }

}