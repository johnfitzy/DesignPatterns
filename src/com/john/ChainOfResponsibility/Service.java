package com.john.ChainOfResponsibility;

/**
 * Created by John on 18/09/17.
 */
public class Service {

    private Operator first;
    private Operator last;


    public void addEmployee(Operator operator) {

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
