package controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class ProductionControllerTest {
    @Test
    void shouldExtractNonTerminalSymbols() {
        ProductionController controller = ProductionController.getInstance();
        controller.addProduction('A', "aA");
        controller.addProduction('B', "c");
        controller.addProduction('C', "BD");
        controller.addProduction('D', "f");

        List<Character> expected = new LinkedList<>();
        expected.add('A');
        expected.add('B');
        expected.add('C');
        expected.add('D');

        assertArrayEquals(expected.toArray(), controller.getValidNonterminalSymbols().toArray());
    }

    @Test
    void shouldExtractTerminalSymbols() {
        ProductionController controller = ProductionController.getInstance();
        controller.addProduction('A', "aA");
        controller.addProduction('B', "c");
        controller.addProduction('C', "BD");
        controller.addProduction('D', "f");

        List<Character> expected = new LinkedList<>();
        expected.add('a');
        expected.add('c');
        expected.add('f');

        assertArrayEquals(expected.toArray(), controller.getValidTerminalSymbols().toArray());
    }
}
