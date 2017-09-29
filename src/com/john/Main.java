package com.john;
import com.john.BuilderPattern.JointResponse;
import com.john.BuilderPattern.ManyParamsObject;
import com.john.BuilderPattern.SomeService;
import com.john.ChainOfResponsibility.*;
import com.john.ChainOfResponsibility.Service;


public class Main {

    public static void main(String[] args) {

        System.out.println("--- Builder -----");

        ManyParamsObject o1= new ManyParamsObject.ManyStringBuilder()
                .withStringOne("One")
                .withStringTwo("Two")
                .withStringThree("Three")
                .build();

        System.out.println(o1.toString());

        o1.getStringOne().ifPresent(System.out::println);
        o1.getStringTwo().ifPresent(System.out::println);
        o1.getStringThree().ifPresent(System.out::println);

        System.out.println("--- Chain of Responsibility");

        Service service = new Service();

        service.addEmployee(new OperatorOne());
        service.addEmployee(new OperatorTwo());
        service.addEmployee(new OperatorThree());
        service.addEmployee(new OperatorFour());

        service.getOperator(OperatorID.OPT_1);
        service.getOperator(OperatorID.OPT_2);
        service.getOperator(OperatorID.OPT_3);
        service.getOperator(OperatorID.OPT_4);

        System.out.println(" -----Some kind of builder pattern---- ");

        JointResponse someContext = new SomeService().getSomeContext();
        System.out.println(someContext.getContextListOne());
        System.out.println(someContext.getContextListTwo());

    }
}
