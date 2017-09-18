package com.john.ChainOfResponsibility;

public class OperatorFour extends Operator {
    @Override
    void answerCall() {
        System.out.println("Operator Four");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_4;
    }
}