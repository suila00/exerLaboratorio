package com.company;

public class NavioPetroleiro extends Navio{
        private float carga;
        public NavioPetroleiro(String matricula) {
            super(matricula);
        }
        public float getCarga() {
            return carga;
        }
        public void setCarga(float carga) {
            this.carga = carga;
        }

}
