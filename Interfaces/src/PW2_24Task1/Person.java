package PW2_24Task1;

public class Person extends Developer {
    void whatAreYouDoing(){
        System.out.println("I'm hard resting...");
    }
    Student newStudent(){
        return new Student(){
            @Override
            void whatAreYouDoing(){
                super.whatAreYouDoing();
                System.out.println("I'm hard resting...");
            }
        };
    }
}
