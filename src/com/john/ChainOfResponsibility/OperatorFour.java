package com.john.ChainOfResponsibility;

public class OperatorFour extends AbstractOperator {
    @Override
    void answerCall() {
        System.out.println("AbstractOperator Four");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_4;
    }
}
