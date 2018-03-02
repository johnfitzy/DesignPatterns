package StrategyPattern;

/**
 * represent the current context and the given strategy to apply in this context
 */
public class Context {

    private Strategy strategy;
    private String context;

    public Context(final Strategy strategy, final String context) {
        this.strategy = strategy;
    }

    public void doOperation() {
        strategy.doOperation();
    }

    public String getContext() {
        return context;
    }
}
