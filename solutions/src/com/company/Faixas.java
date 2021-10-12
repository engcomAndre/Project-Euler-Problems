package com.company;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

public class Faixas {
    private List<Faixa> faixas;

    public Faixas() {
        faixas = Arrays.asList(
                new Faixa(0.0, 1100.0, 0.075),
                new Faixa(1100.01, 2203.48, 0.09),
                new Faixa(2203.49, 3305.22, 0.12),
                new Faixa(3305.22, 6433.57, 0.14)
        );
    }

    public List<Faixa> getFaixas() {
        return faixas;
    }
}
