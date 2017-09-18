package com.john.ChainOfResponsibility;

public class OperatorOne extends Operator {
    @Override
    void answerCall() {
        System.out.println("Operator one");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_1;
    }
}