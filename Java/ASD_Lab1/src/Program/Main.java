package Program;

import DataStructures.Queue;
import DataStructures.Stack;

import java.util.Random;
import java.util.Scanner;

// Основний клас програми
public class Main {
    // Для частого використання доречно винести сканер потоку введення як статичну змінну класу
    private static Scanner sc = new Scanner(System.in);

    // Точка входу — головна процедура програми
    public static void main(String[] args) {
        // 1. Створити екземпляри першої та другої структур даних
        Queue queue = new Queue(promptSize());
        Stack stack = new Stack();
        // 2. Вставити елементи до першої структури даних і вивести її зміст
        fillQueue(queue);
        System.out.println("Черга: " + queue);
        /*
         * 3. Сформувати другу структуру даних згідно із завданням:
         * перемістити перемістити до стеку додатні заокруглені елементи черги, перетворені
         * у двійкову систему числення, а відʼємні елементи — видалити.
         */
        while(!queue.isEmpty()){
            double el = queue.dequeue();
            if (el > 0.0) stack.push( Long.toBinaryString(Math.round(el)) );
        }
        // 4. Вивести вміст обох структур даних
        System.out.println("Черга: " + queue);
        System.out.println("Стек: " + stack);
    }

    /*
     * Функція, яка або повертає 10, якщо обрано значення за замовчуванням,
     * або запитуватиме розмір доти, доки не буде введено додатне ціле число.
     */
    private static int promptSize(){
        System.out.println("Введіть розмір черги (\"def\" — значення за замовчуванням):");
        int res = -1;
        do {
            if(sc.hasNextInt()) res = sc.nextInt();
            else if(sc.nextLine().equals("def")) return 10;
        } while(res <= 0);
        return res;
    }
    /*
     * Винесена з міркувань читабельності коду логічна частина програми — процедура заповнення черги.
     * Доки черга не заповнена, запитуються дійсні числа і додаються через enqueue(double item) : boolean
     * у чергу. Якщо користувач введе rand, у решту незаповнених "комірок" черги будуть дописуватися
     * випадкові значення з діапазону від -100.00 до 100.00, доки черга не буде повністю заповнена.
     */
    private static void fillQueue(Queue queue){
        System.out.println("Вводьте значення дійсного типу по одному на рядок (\"rand\" — дозаповнити довільними):");
        while (!queue.isFull()) {
            if(sc.hasNextDouble()) queue.enqueue(sc.nextDouble());
            else if(sc.nextLine().equals("rand")) break;
        }
        Random rnd = new Random();
        while(!queue.isFull())
            queue.enqueue( (rnd.nextInt(20000)-10000) / 100.0 );
    }
}
