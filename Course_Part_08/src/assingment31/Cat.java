package assingment31;

public class Cat implements Animal {

    @Override
    public void animalSound() {
        System.out.println ("A cat says miauw miauw ...");
    }

    @Override
    public void run() {
        System.out.println ("A cat is a super fast runner ...");

    }

    @Override
    public void sleep() {
        System.out.println ("A cat is sleeping ... Zzzzzzzz ...");
    }
}
