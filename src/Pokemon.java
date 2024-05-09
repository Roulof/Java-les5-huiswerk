public abstract class Pokemon {
    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private final String type;

    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }
    // Getters
    public String getName() { return name; }
    public int getLevel() { return level; }
    public int getHp() { return hp; }
    public String getFood() { return food; }
    public String getSound() { return sound; }
    public String getType() { return type; }

    // Setter voor hp omdat deze kan veranderen tijdens gevechten
    public void setHp(int hp) { this.hp = hp; }

    // Abstracte methoden voor aanvallen die in subklassen geïmplementeerd moeten worden
    public abstract void attack(Pokemon other);

    // Toon basisinformatie over de Pokémon
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", type='" + type + '\'' +
                '}';
    }
}
