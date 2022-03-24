package controller;

import model.Production;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class ProductionControllerTest {
    @BeforeAll
    static void beforeAll() {
        ProductionController controller = ProductionController.getInstance();
        controller.addProduction('A', "Aa");
        controller.addProduction('A', "aA");
        controller.addProduction('A', "a");
        controller.addProduction('A', "AbAcdBeA");
        controller.addProduction('B', "c");
        controller.addProduction('C', "BD");
        controller.addProduction('D', "f");
    }

    @Test
    void shouldExtractNonTerminalSymbols() {
        List<Character> expected = new LinkedList<>();
        expected.add('A');
        expected.add('B');
        expected.add('C');
        expected.add('D');

        assertArrayEquals(expected.toArray(), ProductionController.getInstance().getValidNonterminalSymbols().toArray());
    }

    @Test
    void shouldExtractTerminalSymbols() {
        List<Character> expected = new LinkedList<>();
        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');
        expected.add('f');

        assertArrayEquals(expected.toArray(), ProductionController.getInstance().getValidTerminalSymbols().toArray());
    }

    @Test
    void shouldCheckWordWithProductionsReplace() {
        String word = "aaaaa";

    }
    // Searches for all the productions that have this character
    @Test
    void shouldCheckWordWithProductions() {
        String word = "aaaaaa";
        Queue<Character> wordQueue = new LinkedList<>();
        Queue<Production> possibleProductionsQueue = new LinkedList<>();

        for (Character character : word.toCharArray()) {
            wordQueue.add(character);
        }

        Character currentCharacter = wordQueue.poll();

        for (Production production : ProductionController.getInstance().getProductions()) {
            if (production.getProduction().contains(currentCharacter)) {
                possibleProductionsQueue.add(production);
            }
        }

        if (possibleProductionsQueue.isEmpty()) {
            return;
        }

        while(!possibleProductionsQueue.isEmpty()) {
            Production currentProduction = possibleProductionsQueue.poll();
            Queue<Character> currentSymbols = new LinkedList<>(currentProduction.getProduction());

            while(!currentSymbols.isEmpty()) {
                Character currentSymbol = currentSymbols.poll();
                if (currentCharacter == null) {
                    System.out.println("Found production!");
                    System.out.println(currentProduction.getProduction());
                    System.out.println(currentProduction.getTerminalSymbol());
                    break;
                }

                if (ProductionController.getInstance().getValidNonterminalSymbols().contains(currentSymbol)) {
                    for (Production production : ProductionController.getInstance().getProductions()) {
                        if (production.getTerminalSymbol().equals(currentSymbol) && production.getProduction().get(0).equals(currentCharacter)) {
                            currentCharacter = wordQueue.poll();
                            break;
                        }
                    }
                } else {
                    if (currentSymbol.equals(currentCharacter)) {
                        currentCharacter = wordQueue.poll();
                        continue;
                    }
                }
            }
        }
    }
}
