package models;

public class Guilda {

    private PersonagemDeJogador[] membros;
    private String nome;

    public Guilda(String nome) {
        membros = new PersonagemDeJogador[5];
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemDeJogador[] getMembros() {
        return membros;
    }

    public void addMembro(PersonagemDeJogador personagem) {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = personagem;
                break;
            }
            if (i == membros.length - 1) {
                System.out.println("Não há mais espaço na guilda");
            }
        }
    }

    public void listarMembros() {
        System.out.println("Membros da " + nome);
        for (PersonagemDeJogador membro : membros) {
            if (membro != null) {
                System.out.println(membro.getNome());
            }
        }

        System.out.println("===================================\n");
    }

    public void listagemDetalhada() {
        System.out.println("Membros da " + nome);
        for (PersonagemDeJogador membro : membros) {
            if (membro != null) {
                membro.mostrarInfo();
            }
        }
        System.out.println("===================================\n");
    }


}
