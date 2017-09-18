package com.john.ChainOfResponsibility;

public class Service {

    private AbstractOperator first;
    private AbstractOperator last;

    public void addEmployee(AbstractOperator operator) {
        if (first == null) {
            first = operator;
            last = operator;
        } else {
            last.next = operator;
            last = operator;
        }
    }

    public void getOperator(OperatorID operatorID) {
        if (first != null) {
            first.processCall(operatorID);
        }else{
            throw new RuntimeException("Shit happens");
        }
    }
}
