package com.example;

// Herança
public class Computador extends Jogador {

    @Override
    public boolean parou() {
        return getPontos() > 16;
    }

}
 