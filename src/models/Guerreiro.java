package models;

import models.interfaces.AtacanteFisico;

public class Guerreiro extends PersonagemDeJogador implements AtacanteFisico {

    public Guerreiro(String nome, String genero, int nivel, int vida) {
        super(nome, genero, nivel, vida);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Personagem");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }

    @Override
    public void ataqueFisico() {
        System.out.println("Ataque Físico do " + this.getClass().getSimpleName());
    }
}
