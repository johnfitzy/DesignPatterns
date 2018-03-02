package StrategyPattern;

/**
 *
 */
public class StayAndFight implements Strategy {

    @Override
    public void doOperation() {
        System.out.println("Animal is a small animal -> FIGHT!!");
    }
}
