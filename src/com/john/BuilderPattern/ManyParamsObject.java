package com.john.BuilderPattern;

import java.util.Optional;

public class ManyParamsObject {

    private String stringOne;
    private String stringTwo;
    private String stringThree;

    private ManyParamsObject(String stringOne, String stringTwo, String stringThree) {
        this.stringOne = stringOne;
        this.stringTwo = stringTwo;
        this.stringThree = stringThree;
    }

    public Optional<String> getStringOne() {
        return Optional.ofNullable(this.stringOne);
    }

    public Optional<String> getStringTwo() {
        return Optional.ofNullable(this.stringTwo);
    }

    public Optional<String> getStringThree() {
        return Optional.ofNullable(this.stringThree);
    }

    @Override
    public String toString() {
        return "ManyStringObject{" +
                "stringOne='" + stringOne + '\'' +
                ", stringTwo='" + stringTwo + '\'' +
                ", stringThree='" + stringThree + '\'' +
                '}';
    }

    public static class ManyStringBuilder {

        private String stringOne;
        private String stringTwo;
        private String stringThree;

        public ManyStringBuilder withStringOne(String string){
            this.stringOne = string;
            return this;
        }

        public ManyStringBuilder withStringTwo(String string){
            this.stringTwo = string;
            return this;
        }

        public ManyStringBuilder withStringThree(String string){
            this.stringThree = string;
            return this;
        }

        public ManyParamsObject build() {
            return new ManyParamsObject(this.stringOne, this.stringTwo, this.stringThree);
        }
    }
}
