import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " hits " + enemy.getName() + " with a TunderPunch!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " throws a ElectroBall on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " hits " + enemy.getName() + " with Thunder");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " gaines 10 hp");
                System.out.println(name.getName() + " gaines 10 hp");
                enemy.setHp(enemy.getHp() + 10);
                name.setHp(name.getHp() + 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " uses a VoltTackle on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
