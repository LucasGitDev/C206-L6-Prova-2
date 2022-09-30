package models;

import models.interfaces.AtacanteFisico;

public class Ladino extends PersonagemDeJogador implements AtacanteFisico{
    private int alcanceArco;
    private int numFlechas; // Não faz sentido possuir setNumFlechas

    public Ladino(int alcanceArco, int numFlechas, String nome, String genero, int nivel, int vida) {
        super(nome, genero, nivel, vida);
        this.alcanceArco = alcanceArco;
        this.numFlechas = numFlechas;
    }

    public int getAlcanceArco() {
        return alcanceArco;
    }

    public void setAlcanceArco(int alcanceArco) {
        this.alcanceArco = alcanceArco;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    public void addMunicao(int qtd) {
        this.numFlechas += qtd;
    }

    @Override
    public void ataqueFisico() {
        if (this.numFlechas > 0) {
            System.out.println("Ataque Físico do " + this.getClass().getSimpleName());
            this.numFlechas--;
            System.out.println("Flechas restantes: " + this.numFlechas);
        } else {
            System.out.println("Não há flechas suficientes");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Personagem");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Alcance do Arco: " + alcanceArco);
        System.out.println("Flechas: " + numFlechas);
    }
}
