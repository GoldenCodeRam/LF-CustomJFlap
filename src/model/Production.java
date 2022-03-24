package model;

public class Production {
    private Character terminalSymbol;
    private String production;

    public Production(Character terminalSymbol, String production) {
        this.terminalSymbol = terminalSymbol;
        this.production = production;
    }
}
