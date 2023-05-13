package com.example.calculateur;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateurTest {
    private Calculateur calculateur;

    @Before
    public void setUp() {
        calculateur = new Calculateur();
        calculateur.setTauxDeChange(Monnaie.EURO, 1.0);
        calculateur.setTauxDeChange(Monnaie.DOLLAR, 0.9);
        calculateur.setTauxDeChange(Monnaie.LIVRE_STERLING, 1.2);
    }

    @Test
    public void testConversionEuroVersDollar() {
        // Étape 1 : Écrire un test simple
        double montantConverti = calculateur.convertir(100, Monnaie.EURO, Monnaie.DOLLAR);

        // Étape 2 : Exécution du test (échec attendu)
        Assert.assertEquals(90.0, montantConverti, 0.001);
    }

    @Test
    public void testConversionDollarVersEuro() {
        // Étape 1 : Écrire un test simple
        double montantConverti = calculateur.convertir(100, Monnaie.DOLLAR, Monnaie.EURO);

        // Étape 2 : Exécution du test (échec attendu)
        Assert.assertEquals(111.111, montantConverti, 0.001);
    }

    @Test
    public void testConversionEuroVersLivreSterling() {
        // Étape 1 : Écrire un test simple
        double montantConverti = calculateur.convertir(100, Monnaie.EURO, Monnaie.LIVRE_STERLING);

        // Étape 2 : Exécution du test (échec attendu)
        Assert.assertEquals(120.0, montantConverti, 0.001);
          }

}
