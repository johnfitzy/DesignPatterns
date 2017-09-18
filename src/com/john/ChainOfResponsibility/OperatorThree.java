package com.john.ChainOfResponsibility;


public class OperatorThree extends Operator {
    @Override
    void answerCall() {
        System.out.println("Operator three");
    }

    @Override
    OperatorID getOperatorId() {
        return OperatorID.OPT_3;
    }
}
