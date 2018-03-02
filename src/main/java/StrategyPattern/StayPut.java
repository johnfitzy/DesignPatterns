package StrategyPattern;

/**
 *
 */
public class StayPut implements Strategy {
    @Override
    public void doOperation() {
        System.out.println("There is no animal -> STAY!!");
    }
}
