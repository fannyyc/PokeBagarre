package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    public void pokemon1_devrait_gagner_si_meilleure_attaque() {
        // GIVEN
        var pokemon1 = new Pokemon("Pikachu", "", new Stats(12, 10));
        var pokemon2 = new Pokemon("Salamèche", "", new Stats(8, 15));

        // WHEN
        var resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertEquals(true, resultat);
    }

    @Test
    public void pokemon2_devrait_gagner_si_meilleure_attaque() {
        // GIVEN
        var pokemon1 = new Pokemon("Pikachu", "", new Stats(8, 10));
        var pokemon2 = new Pokemon("Salamèche", "", new Stats(12, 15));

        // WHEN
        var resultat = pokemon2.estVainqueurContre(pokemon1);

        // THEN
        assertEquals(true, resultat);
    }

    @Test
    public void pokemon1_devrait_gagner_si_meme_attaque_et_meilleure_defense() {
        // GIVEN
        var pokemon1 = new Pokemon("Pikachu", "", new Stats(12, 15));
        var pokemon2 = new Pokemon("Salamèche", "", new Stats(12, 10));

        // WHEN
        var resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertEquals(true, resultat);
    }

    @Test
    public void pokemon2_devrait_gagner_si_meme_attaque_et_meilleure_defense() {
        // GIVEN
        var pokemon1 = new Pokemon("Pikachu", "", new Stats(12, 10));
        var pokemon2 = new Pokemon("Salamèche", "", new Stats(12, 15));

        // WHEN
        var resultat = pokemon2.estVainqueurContre(pokemon1);

        // THEN
        assertEquals(true, resultat);
    }

    @Test
    public void premier_pokemon_renseigne_devrait_gagner_si_meme_attaque_et_meme_defense() {
        // GIVEN
        var pokemon1 = new Pokemon("Pikachu", "", new Stats(12, 10));
        var pokemon2 = new Pokemon("Salamèche", "", new Stats(12, 10));

        // WHEN
        var resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertEquals(true, resultat);
    }
}