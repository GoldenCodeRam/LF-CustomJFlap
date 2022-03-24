package controller;

import model.Production;

import java.util.LinkedList;
import java.util.List;

public class ProductionController {

    private static class Singleton {
        private final static ProductionController INSTANCE = new ProductionController();
    }

    public static ProductionController getInstance() {
        return Singleton.INSTANCE;
    }

    private List<Character> validTerminalSymbols = new LinkedList<>();
    private List<Character> validNonterminalSymbols = new LinkedList<>();
    private List<Production> productions = new LinkedList<>();

    public void addProduction(char nonTerminal, String production) {
        this.addNonterminalToValidNonTerminalSymbols(nonTerminal);
        this.addTerminalToValidTerminalSymbols(production);

        this.productions.add(new Production(nonTerminal, production));
    }
    
    public void addProduction(Production production) {
    	this.productions.add(production);
    }

    private void addTerminalToValidTerminalSymbols(String production) {
        for (char letter : production.toCharArray()) {
            if (!this.validNonterminalSymbols.contains(letter) && !this.validTerminalSymbols.contains(letter)) {
                this.validTerminalSymbols.add(letter);
            }
        }
    }

    private void addNonterminalToValidNonTerminalSymbols(char nonTerminal) {
        this.validTerminalSymbols.remove(Character.valueOf(nonTerminal));
        if (!this.validNonterminalSymbols.contains(nonTerminal)) {
            this.validNonterminalSymbols.add(nonTerminal);
        }
    }

    // Getters and setters

    public List<Character> getValidNonterminalSymbols() {
        return validNonterminalSymbols;
    }

    public List<Character> getValidTerminalSymbols() {
        return validTerminalSymbols;
    }
}
