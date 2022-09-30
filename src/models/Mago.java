package models;

import models.interfaces.AtacanteMagico;

public class Mago extends PersonagemDeJogador implements AtacanteMagico {

    private String especialidadeElemental;
    private int mana; // não faz sentido possuir setMana

    public Mago(String especialidadeElemental, int mana, String nome, String genero, int nivel, int vida) {
        super(nome, genero, nivel, vida);
        this.especialidadeElemental = especialidadeElemental;
        this.mana = mana;
    }

    public String getEspecialidadeElemental() {
        return especialidadeElemental;
    }

    public void setEspecialidadeElemental(String especialidadeElemental) {
        this.especialidadeElemental = especialidadeElemental;
    }

    public int getMana() {
        return mana;
    }

    public void recuperaMana(int qtd) {
        this.mana += qtd;
    }

    @Override
    public void ataqueMagico() {
        if (this.mana > 0) {
            System.out.println("Ataque Mágico do " + this.getClass().getSimpleName());
            this.mana-=5;
            System.out.println("Mana restante: " + this.mana);
        } else {
            System.out.println("Não há mana suficiente");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Personagem");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Especialidade Elemental: " + especialidadeElemental);
        System.out.println("Mana: " + mana);
    }
}
