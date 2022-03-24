package model;

public class Production {
    private char terminalSymbol;
    private String production;

    public Production(char terminalSymbol, String production) {
        this.setTerminalSymbol(terminalSymbol);
        this.setProduction(production);
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public char getTerminalSymbol() {
        return terminalSymbol;
    }

    public void setTerminalSymbol(char terminalSymbol) {
        this.terminalSymbol = terminalSymbol;
    }
}
