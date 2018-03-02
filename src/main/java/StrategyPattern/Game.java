package StrategyPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 * In Strategy pattern, we create objects which represent various strategies and a
 * context object whose behavior varies as per its strategy object.
 * The strategy object changes the executing algorithm of the context object.
 *
 * The Strategy pattern is to be used where you want to choose the algorithm to use at runtime.
 * A good use of the Strategy pattern would be saving files in different formats, running various
 * sorting algorithms, or file compression.
 *
 * The Strategy pattern provides a way to define a family of algorithms, encapsulate each one as
 * an object, and make them interchangeable.
 *  - https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */
public class Game {

    private static final String BIG = "big";
    private static final String SMALL = "small";
    private static final String NO = "no";
    private List<String> animals;
    private HashMap<String, Context> contexts;


    public Game() {

        animals = new ArrayList<>(Arrays.asList(BIG, SMALL, NO));
        contexts = new HashMap<>();

        contexts.put(BIG, new Context(new RunAway(), "big animal"));
        contexts.put(SMALL, new Context(new StayAndFight(), "small animal"));
        contexts.put(NO, new Context(new StayPut(), "no animal"));
    }


    public void startGame() {

        Random random = new Random();

        System.out.println("*** STARING GAME ***");

        for (int i = 0; i < 10; i++) {

            final String animal = animals.get(random.nextInt(3));

            switch (animal) {
                case BIG:
                    contexts.get(BIG).doOperation();
                case SMALL:
                    contexts.get(SMALL).doOperation();
                case NO:
                    contexts.get(NO).doOperation();
            }
        }
    }
}
