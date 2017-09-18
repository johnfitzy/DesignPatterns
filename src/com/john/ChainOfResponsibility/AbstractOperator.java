package com.john.ChainOfResponsibility;

abstract class AbstractOperator {

    AbstractOperator next;

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


