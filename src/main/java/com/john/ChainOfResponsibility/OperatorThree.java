package com.john.ChainOfResponsibility;


public class OperatorThree extends AbstractOperator {
    @Override
    void answerCall() {
        System.out.println("AbstractOperator three");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_3;
    }
}
