package com.example;

import java.util.List;
import java.util.ArrayList;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        for(int numero = 1; numero <= 13; numero++) {
            for(Naipe naipe : Naipe.values()) {
                cartas.add(new Carta(numero, naipe));
            }
        }
    }

    public void embaralhar () {
        Collections.shuffle(cartas);
    }

    public Carta virar () {
        cartas.remove(0);
        return cartas.get(0);
    }
}