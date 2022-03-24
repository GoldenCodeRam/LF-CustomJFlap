package model;

import java.util.LinkedList;
import java.util.List;

public class Production {
    private Character terminalSymbol;
    private String production;

    public Production(Character terminalSymbol, String production) {
        this.terminalSymbol = terminalSymbol;
        this.production = production;
    }

    // Getters and setters

    public List<Character> getProduction() {
        List<Character> characterList = new LinkedList<>();
        for (Character character : production.toCharArray()) {
            characterList.add(character);
        }
        return characterList;
    }

    public Character getTerminalSymbol() {
        return terminalSymbol;
    }
}
