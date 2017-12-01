package com.john.ChainOfResponsibility;


public class OperatorTwo extends AbstractOperator {
    @Override
    void answerCall() {
        System.out.println("AbstractOperator two");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_2;
    }
}