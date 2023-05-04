/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaqutkhallaf;

/**
 *
 * @author student
 */
public class CoffeeMachine {

    private WasteTry wast = new WasteTry(100, 200);
    private WaterTank water;
    private BeanContainer beans;
    private Ginder gider = new Ginder(200);

    private static int singleAmericanoGrams = 7;
    private static int singleAmericanoWater = 170;

    private static int doubleAmericanoGrams = 14;
    private static int doubleAmericanoWater = 220;

    private static int singleEspressoGrams = 7;
    private static int singleEspressoWater = 30;

    private static int doubleEspressoGrams = 14;
    private static int doubleEspressoWater = 60;

    private static int count = 0;

    public CoffeeMachine(WaterTank waterTank, BeanContainer beanContainer) {
        this.beans = beanContainer;
        this.water = waterTank;
    }

    private boolean NeedCleaning = false;

    public WasteTry getWast() {
        return wast;
    }

    public WaterTank getWater() {
        return water;
    }

    public BeanContainer getBeans() {
        return beans;
    }

    public Ginder getGider() {
        return gider;
    }

    public void setWast(WasteTry wast) {
        this.wast = wast;
    }

    public void setWater(WaterTank water) {
        this.water = water;
    }

    public void setBeans(BeanContainer beans) {
        this.beans = beans;
    }

    public void setGider(Ginder gider) {
        this.gider = gider;
    }

    public void start() {
        checkMachineStatus();
        System.out.println("Welcome to the CoffeeMachine");
    }

    public void makeCoffee(int coffeeType, int size) throws NotEnoughBeansException, NotEnoughWaterException {
        if (count == 3) {
            System.out.println("Coffee Machine needs cleaning !!");
            return;
        }
        // 1 indicates Americano
        if (coffeeType == 1) {
            if (size == 1) {
                System.out.println("Single Americano");
                this.water.drain(singleAmericanoWater);
                this.beans.drain(singleAmericanoGrams);
            } else if (size == 2) {
                this.water.drain(doubleAmericanoWater);
                this.beans.drain(doubleAmericanoGrams);
                System.out.println("Double Americano");
            }
            //inicates Espresson
        } else if (coffeeType == 2) {
            if (size == 1) {
                this.water.drain(singleEspressoWater);
                this.beans.drain(singleEspressoGrams);
                System.out.println("Single Espresson");
            } else if (size == 2) {
                this.water.drain(doubleEspressoWater);
                this.beans.drain(doubleEspressoGrams);
                System.out.println("Double Espresso");
            }
        }
        count++;
        System.out.println("Water Level: " + this.water.getLevel());
        System.out.println("Beans Container Level:" + this.beans.getLevel());
    }

    private void checkMachineStatus() {
        if (this.water.getLevel() <= 30 || this.beans.getLevel() <= 7) {
            System.out.println("Sorry, there is no enough water or beans in the machine,"
                    + "\nPlease fill it!");
            System.exit(0);
        }
    }

    public void clean(int cup) {
        count = 0;
        wast.clean();
    }

    public void clean() {
        NeedCleaning = false;
    }

    public boolean NeedCleaning() {
        return NeedCleaning;
    }
}
