package com.example;

/**
 * Os atributos monte, jogador e computador são protegidos (protected) para permitir
 * que classes derivadas (subclasses) possam acessá-los diretamente, mantendo ao mesmo
 * tempo o encapsulamento para outras classes que não são subclasses.
 */

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public String resultado(){
        if jogadorEstourou() && computadorEstourou() || jogador.getPontos() == computador.getPontos() {
            return "Empate!";
        }

        if (computadorEstourou() && !jogadorEstourou() || jogador.getPontos > computador.getPontos())
            return "Você ganhou!";
    
        return "Você perdeu!";
    }
    
    public boolean acabou() {
        // Estourou, acabou && Parou
        if (jogadorEstourou() || computadorEstourou() || osDoisPararam()) {
            return true;
        }
        return false;
    }

    private boolean jogadorEstourou() {
        return jogador.getPontos() > 21;
    }

    private boolean computadorEstourou() {
        return computador.getPontos() > 21;
    }

    private boolean osDoisPararam() {
        return jogador.getParou() && computador.getParou();
    }
}