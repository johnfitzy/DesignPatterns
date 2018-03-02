package StrategyPattern;

/**
 *
 */
public class RunAway implements Strategy {

    @Override
    public void doOperation() {
        System.out.println("Animal is a big animal -> RUN AWAY!!");
    }
}
