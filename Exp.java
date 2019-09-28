package com;

import javax.sound.midi.Soundbank;

/**
 * @version 1.01 2019-09-28
 * @author DuanYunFei
 */
public class Exp{
    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("w","s");
        Pair<Number> numberPair = new Pair<>();
        numberPair = (Pair<Number>)stringPair;
        System.out.println(stringPair.getClass());
        System.out.println(numberPair.getClass());
        System.out.println(stringPair instanceof Pair);
        System.out.println(stringPair.getFirst().getClass());
        ArrayAlg arrayAlg = new ArrayAlg();
        System.out.println(arrayAlg instanceof Pair);

    }
    public static double max(double ...params){
        double max = Double.NEGATIVE_INFINITY;
        for (double i : params){
            if(i > max) max = i;
        }
        return max;
    }

}
class Pair<T>{
    private T first;
    private T second;

    public Pair() {
        first = second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}

class ArrayAlg extends Pair{
    }