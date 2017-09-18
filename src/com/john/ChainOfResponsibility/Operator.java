package com.john.ChainOfResponsibility;

/**
 * Created by John on 18/09/17.
 *
 */
abstract class Operator {

    Operator next;

    abstract void answerCall();
    abstract OperatorID getOperatorId();

    void processCall(OperatorID operatorID) {
        if(this.getOperatorId().equals(operatorID)){
            this.answerCall();
        }else if (this.next != null){
            next.processCall(operatorID);
        }
    }
}
