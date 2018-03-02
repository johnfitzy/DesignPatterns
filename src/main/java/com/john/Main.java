package com.john;
import FactoryPattern.Vehicle;
import FactoryPattern.VehicleFactory;
import FactoryPattern.VehicleType;
import StrategyPattern.Game;
import com.john.dto.JointResponse;
import com.john.BuilderPattern.ManyParamsObject;
import com.john.BuilderPattern.SomeService;
import com.john.ChainOfResponsibility.*;
import com.john.ChainOfResponsibility.Service;


public class Main {

    public static void main(String[] args) {

//        doBuilderPattern();
//
//        doChainOfResponsibility();
//
//        doOtherBuilderPattern();


//        doFactoryPattern();

        doStrateyPattern();
    }


    private static void doStrateyPattern() {
        new Game().startGame();
    }


    private static void doFactoryPattern() {
        final Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
        final Vehicle motobike = VehicleFactory.getVehicle(VehicleType.MOTORBIKE);
        final Vehicle truck = VehicleFactory.getVehicle(VehicleType.TRUCK);

        System.out.println(car.getVehicleType());
        System.out.println(motobike.getVehicleType());
        System.out.println(truck.getVehicleType());
    }



    private static void doOtherBuilderPattern() {
        System.out.println(" -----Some kind of builder pattern ---- ");

        JointResponse someContext = new SomeService().getSomeContext();
        System.out.println(someContext.getContextListOne());
        System.out.println(someContext.getContextListTwo());
    }

    private static void doChainOfResponsibility() {
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
    }

    private static void doBuilderPattern() {
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
    }
}
