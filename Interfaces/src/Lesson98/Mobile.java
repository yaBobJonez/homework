package Lesson98;

public class Mobile extends Computer {
    @Override
    void process(){
        super.process();
        System.out.println("Processing on a mobile device...");
    }
    Phone newPhone(){
        return new Phone(){
            @Override
            void process(){
                super.process();
                System.out.println("Processing on a mobile device...");
            }
        };
    }
}
