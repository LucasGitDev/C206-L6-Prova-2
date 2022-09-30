import models.*;

public class Main {

    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Guerreirinho", "Masculino", 1, 100);
        Ladino ladino = new Ladino(10, 5, "Ladinho", "Masculino", 1, 100);
        Mago mago = new Mago("Fogo", 30, "Maguinho", "Masculino", 1, 100);

        PersonagemDeJogador[] personagens = {guerreiro, ladino, mago};

        Guilda guilda = new Guilda("Guilda dos Heróis");

        for (PersonagemDeJogador personagem : personagens) {
            guilda.addMembro(personagem);
        }

        guilda.listarMembros();

        for (PersonagemDeJogador personagem : guilda.getMembros()) {
            if (personagem != null) {
                personagem.mostrarInfo();
                if (personagem instanceof Guerreiro) {
                    ((Guerreiro) personagem).ataqueFisico();
                } else if (personagem instanceof Ladino) {
                    int cont = 0;
                    do {
                        ((Ladino) personagem).ataqueFisico();
                        if (((Ladino) personagem).getNumFlechas() == 0) {
                            cont++;
                        }
                    } while (cont < 2); // rodar pelo menos 1 vez sem flechas

                } else if (personagem instanceof Mago) {
                    int cont = 0;
                    do {
                        ((Mago) personagem).ataqueMagico();
                        if (((Mago) personagem).getMana() == 0) {
                            cont++;
                        }
                    } while (cont < 2); // rodar pelo menos uma vez sem mana
                }
                System.out.println("===================================\n");
                System.out.println("Pós-ataque(s)");
                personagem.mostrarInfo();
                System.out.println("===================================\n\n\n");
            }
        }
    }
}
