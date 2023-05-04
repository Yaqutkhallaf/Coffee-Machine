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
public class WaterTank {

    private int capacity;
    private int level;

    public WaterTank(int capacity, int level) {
        this.capacity = capacity;
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLevel() {
        return level;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "WaterTank{" + "capacity=" + capacity + ", level=" + level + '}';
    }

    public void fill(int amount) {
        this.level += amount;
    }

    public void drain(int amount) throws NotEnoughWaterException {

        if (amount > this.level) {
            throw new NotEnoughWaterException();
        } else {
            this.level -= amount;
        }

    }

}
