package StrategyPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
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
