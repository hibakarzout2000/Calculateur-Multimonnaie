package com.example.calculateur;

import java.util.HashMap;
import java.util.Map;

public class Calculateur {
    private Map<Monnaie, Double> tauxDeChange;

    public Calculateur() {
        tauxDeChange = new HashMap<>();
    }

    public void setTauxDeChange(Monnaie monnaie, double taux) {
        tauxDeChange.put(monnaie, taux);
    }

    public double convertir(double montant, Monnaie source, Monnaie cible) {
        double tauxSource = tauxDeChange.get(source);
        double tauxCible = tauxDeChange.get(cible);
        return montant * (tauxCible / tauxSource);
    }
}
