package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Porto porto = new Porto(5);
        NavioPetroleiro petro1 = new NavioPetroleiro("1234"); petro1.setCarga(200);
        PortaContentores pConta1 = new PortaContentores("5678"); pConta1.setNoContentores(50);
        PortaContentores pConta2 = new PortaContentores("9012"); pConta2.setNoContentores(20);
        Navio n = new Navio("0123");
        NavioPetroleiro petro2 = new NavioPetroleiro("1234"); petro2.setCarga(200);
        porto.novoNavio(petro1);
        porto.novoNavio(petro2);
        porto.novoNavio(pConta1);
        porto.novoNavio(pConta2);
        porto.novoNavio(n);
        System.out.println("Capacidade total = " + porto.getCapacidadeTotal() + " toneladas.");
    }
}
