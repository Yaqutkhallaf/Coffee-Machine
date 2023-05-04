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
public class BeanContainer {

    private int capacity;
    private int level;
    private String rcho;

    public BeanContainer(int capacity, int level) {
        this.capacity = capacity;
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLevel() {
        return level;
    }

    public String getRcho() {
        return rcho;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRcho(String rcho) {
        this.rcho = rcho;
    }

    @Override
    public String toString() {
        return "BeanContainer{" + "capacity=" + capacity + ", level=" + level + ", rcho=" + rcho + '}';
    }

    public void fill(int amount) {
        this.level += amount;
    }

    public void drain(int amount) throws NotEnoughBeansException {
        if (amount > this.level) {
            throw new NotEnoughBeansException();
        } else {
            this.level -= amount;
        }
    }
}
