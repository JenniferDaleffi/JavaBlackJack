package com.example;

import java.util.List;
import java.util.ArrayList;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        cartas.add (new Carta(1, Naipe.Hearts));
    }
}