package org.example;

public class Oficina extends Setor {
    private static Oficina Oficina = new Oficina();

    private Oficina() {
    }

    public static Oficina getInstancia() {
        return Oficina;
    }
}
