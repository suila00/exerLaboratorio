package com.company;

public class Navio {
        private String matricula;
        private String nome;
        private float comprimento;
        public Navio(String matricula) {
            this.matricula = matricula;
        }
        public String getMatricula() {
            return matricula;
        }
        public String getNome() {
            return nome;
        }
        public float getComprimento() {
            return comprimento;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setComprimento(float comprimento) {
            this.comprimento = comprimento;
        }
    }

