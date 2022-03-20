package com.company;

public class PortaContentores extends Navio {
    private int noContentores;
    public PortaContentores(String matricula) {
        super(matricula);
    }
    public int getNoContentores() {
        return noContentores;
    }
    public void setNoContentores(int noContentores) {
        this.noContentores = noContentores;
    }
}
