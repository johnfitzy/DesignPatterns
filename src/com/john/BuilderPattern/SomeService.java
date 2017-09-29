package com.john.BuilderPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class SomeService {
    //isolate the service from any state (SomeContext), this could be use in multithreading?
    public JointResponse getSomeContext(){
        return new SomeContext().getContextListOne().getContextListTwo().buildResponse();
    }

    private class SomeContext {

        private List<Integer> contextListOne;
        private List<Integer> contextListTwo;


        public SomeContext getContextListOne(){
            this.contextListOne = new ArrayList<>(Arrays.asList(1,2,3,4));
            return this;
        }

        public SomeContext getContextListTwo(){
            this.contextListTwo = new ArrayList<>(Arrays.asList(5,6,7,8));
            return this;
        }

        public JointResponse buildResponse() {
            // do some validation or what ever other stuff you need to do before returning the response
            return new JointResponse(this.contextListOne, this.contextListTwo);
        }
    }
}
