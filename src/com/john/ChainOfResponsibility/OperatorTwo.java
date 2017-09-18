package com.john.ChainOfResponsibility;


public class OperatorTwo extends Operator {
    @Override
    void answerCall() {
        System.out.println("Operator two");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_2;
    }
}