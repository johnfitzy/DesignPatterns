package com.john.ChainOfResponsibility;

public class OperatorOne extends AbstractOperator {
    @Override
    void answerCall() {
        System.out.println("AbstractOperator one");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_1;
    }
}