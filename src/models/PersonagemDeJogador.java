package models;

public abstract class PersonagemDeJogador {

    protected String nome;
    protected String genero;
    protected int nivel;
    protected int vida;

    public PersonagemDeJogador(String nome, String genero, int nivel, int vida) {
        this.nome = nome;
        this.genero = genero;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void mostrarInfo();
}
