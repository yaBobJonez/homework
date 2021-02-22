package Lesson95;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //static
        Cat gatto = new Cat();
        Cat.hasTail = false;
        Cat.Body gattosBody = new Cat.Body();
        gattosBody.addTail();
        //inner/nested
        Cat.Head head = new Cat().new Head(); //Костыль за 300 i.e. @Deprecated
        head.getWeight();
        //local
        Book theBestBookEverToExistYouKnowIGonnaGetOutToTheStringLimitUsingThisThingsOverHereSoNowYoureReadingAUselessMessageAndAlreadyWasted10SecondsOfYourExpensiveLifeArentYouStillBoredOsuzhdayu = new Book("Into the Wild", "Erin Hunter", 2003, "Harper Collins");
        System.out.println(theBestBookEverToExistYouKnowIGonnaGetOutToTheStringLimitUsingThisThingsOverHereSoNowYoureReadingAUselessMessageAndAlreadyWasted10SecondsOfYourExpensiveLifeArentYouStillBoredOsuzhdayu.publisher.title);
        //anonymous
        Car[] cars = new Car[]{
                new Car(45, 4000, "bluequeue", "LaRarry Egoism"),
                new Car(125, 12000, "wait, it's white?", "Dog Challenge"),
                new Car(178, 65999, "Neon black(What?(How?))", "TankEnginez ThomasSawyer")
        };
        Arrays.sort(cars, (Car o1, Car o2) -> {
            return o1.color.compareTo(o2.color);
        });
        for(Car veh : cars) System.out.println(veh);
        Arrays.sort(cars, (Car o1, Car o2) -> {
            return o1.price - o2.price;
        });
        for(Car veh : cars) System.out.println(veh);
    }
}

class Cat{
    int weight = 2;
    static boolean hasTail = true;
    static class Body{
        void addTail(){ Cat.hasTail = true; }
    }
    class Head{
        int size;
        void getWeight(){
            System.out.println(new Cat().weight);
        }
    }
}

class Book{
    String name, author;
    int releaseYear;
    Publisher publisher;
    public Book(String name, String author, int releaseYear, String publisher) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
        this.publisher = new Publisher(publisher);
    }
    class Publisher{
        String title;
        Book book;
        public Publisher(String title) {
            this.title = title;
            this.book = Book.this;
        }
    }
}

class Car{
    int speed, price;
    String color, model;
    public Car(int speed, int price, String color, String model) {
        this.speed = speed;
        this.price = price;
        this.color = color;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car{" + "speed=" + speed + ", price=" + price + ", color=" + color + ", model=" + model + '}';
    }
}