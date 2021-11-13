package assingment31;

public class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println ("A dog says whoef whoef ...");
    }

    @Override
    public void run() {
        System.out.println ("A dog is a fast runner ...");
    }

    @Override
    public void sleep() {
        System.out.println ("A dog is sleeping ... Zzzzzzzz ...");

    }
}
