/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaqutkhallaf;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Yaqutkhallaf {

    private static final int MAX_WATER_CAPACITY = 1000;
    private static final int MAX_BEAN_CAPACITY = 2000;
    private static final int WATER_LEVEL = 1000;
    private static final int BEANS_LEVEL = 1500;
    static CoffeeMachine coffeeMachine = new CoffeeMachine(
            new WaterTank(MAX_WATER_CAPACITY, WATER_LEVEL),
            new BeanContainer(MAX_BEAN_CAPACITY, BEANS_LEVEL)
    );

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        coffeeMachine.start();
        while (true) {
            System.out.println("\nWhat would like to do");
            System.out.println("(1)Add water/beans\n" + "(2)make Coffee\n" + "(3)Check machine\n" + "(4)Exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    Addwaterbeans(in);
                    break;
                case 2:
                    System.out.println("Select coffee type you want:\n1)Americano\n2)Espresso");
                    int coffeeType = in.nextInt();
                    System.out.println("Select offee size you want:\n1)Single\n2)Double");
                    int coffeeSize = in.nextInt();

                    try {
                        coffeeMachine.makeCoffee(coffeeType, coffeeSize);
                    } catch (NotEnoughBeansException | NotEnoughWaterException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    //
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalied choice");
                    break;

            }
        }
    }   // TODO code application logic here

    private static void Addwaterbeans(Scanner in) {
        System.out.println("What do you want to add" + "(1)Water" + "(2)beans");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter amount of water in ml");
                int water = in.nextInt();
                if (water <= 0) {
                    System.out.println("Invalied water amount");
                } else if (water + WATER_LEVEL > MAX_WATER_CAPACITY) {
                    System.out.println("the water tank is full");
                } else {
                    coffeeMachine.getWater().fill(water);
                    System.out.println("the water added successfuly");
                }
                break;

            case 2:
                System.out.println("Enter amount of beans in G");
                int beans = in.nextInt();
                if (beans <= 0) {
                    System.out.println("Invalied beans amount");
                } else if (beans + BEANS_LEVEL > MAX_BEAN_CAPACITY) {
                    System.out.println("the coffeeBeans is full");
                } else {
                    coffeeMachine.getBeans().fill(beans);
                    System.out.println("the coffeeBeans added successfuly");
                }
                break;
        }

    }

}
