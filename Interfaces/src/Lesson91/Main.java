package Lesson91;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 3, -12, 9, 43};
        System.out.println(Arrays.binarySearch(array, 3)); //Nobody ever knows why this returns -4...
        Arrays.sort(array);
        printArray(array);
        System.out.println(Arrays.binarySearch(array, 3));
        ArrayList<String> list = new ArrayList<>();
        list.add("OK");
        list.add("Hehe");
        list.add("I'm bored");
        System.out.println(list);
        System.out.println(list.size() +" "+ list.contains("Nothing") +" "+ list.get(2));
        ListIterator iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        ArrayList<Gatto> catz = new ArrayList<>();
        catz.add(new Gatto("E", 2));
        catz.add(new Gatto("REE", 5));
        catz.add(new Gatto("SCREEE", 621));
        System.out.println(catz);
        catz.remove(1);
        System.out.println(catz);
        catz.sort((o1, o2) ->  {
                return o1.age - o2.age;
        }); catz.add(new Gatto("a.", -1));
    }
    private static void printArray(int[] arr){
        for(int el : arr) System.out.print(el + " ");
        System.out.println();
    }
    private static void printArray(String[] arr){
        for(String el : arr) System.out.print(el + " ");
        System.out.println();
    }
}
class Gatto implements Comparable<Gatto>{
    protected String name;
    protected int age;
    public Gatto(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Gatto o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Gatto[name = " + name + ", age = " + age + "]";
    }
}