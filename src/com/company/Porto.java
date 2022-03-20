package com.company;

public class Porto {
    private int ctNavios;
    private int noMaxNavios;
    private Navio[] navios;

    public Porto(int noMaxNavios) {
        this.noMaxNavios = noMaxNavios;
        navios = new Navio[noMaxNavios];
        ctNavios = 0;
    }

    public Navio[] getNavios() {
        return navios;
    }

    public int getNoMaxNavios() {
        return noMaxNavios;
    }

    public void novoNavio(Navio n) {
        if (ctNavios == noMaxNavios) {
            System.out.println("No máximo de navios (" + noMaxNavios + ") atingido!");
            return;
        }
        boolean enc = false;
        for (int i = 0; i < ctNavios; i++) {
            if (n.getMatricula().equals(navios[i].getMatricula())) {
                enc = true;
                System.out.println("Matricula existente: " + n.getMatricula());
            }
        }
        if (!enc) {
            navios[ctNavios] = n;
            ctNavios++;
        }
    }

    public float getCapacidadeTotal() {
        float total = 0;
        for (int i = 0; i < ctNavios; i++) {
            if (navios[i] instanceof NavioPetroleiro)
                total += ((NavioPetroleiro) navios[i]).getCarga();
            if (navios[i] instanceof PortaContentores)
                total += ((PortaContentores) navios[i]).getNoContentores() * 10;
        }
        return total;
    }
}

