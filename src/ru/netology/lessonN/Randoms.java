package ru.netology.lessonN;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return next() != null;
            }

            @Override
            public Integer next() {
                return getRandomI();
            }
        };
        return it;
    }

    public Random getRandom() {
        return random;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getRandomI() {
        //random = new Random();
        //return random.nextInt(getMax() + 1 - getMin()) + getMin();
        int random = new Random().ints(1, getMin(), getMax() + 1).findFirst().getAsInt();
        return random;
    }
}