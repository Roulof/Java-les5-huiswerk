import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private final String name;
    private List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.pokemons = pokemons;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}