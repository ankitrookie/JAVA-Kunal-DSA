package abstruction;

public class Main {
    public static void main(String[] args) {
        Animal DogSounds = new Dog(23);
        Animal CatSound = new Cat(45);
        Animal Camel = new Camel(23);

        System.out.print(DogSounds.age);
        Animal.staticFn();
        DogSounds.normalFn();

//        DogSounds.makeSound("BowBow");
//        CatSound.makeSound("MeowMeow");
//        Camel.makeSound("Baow")
    }
}


/*** Abstraction in programming is like a magic bookshelf. Instead of reading every page,
 * you focus on the book's title and summary. Similarly, abstraction lets us focus on
 * essential details, like how to use a car, without worrying about how the engine works.
 * It simplifies complex systems by providing a high-level view, allowing us to work with
 * them more easily. ***/

// hiding unnecessary details & showing valuable details

// ex : when we start a car, when we put on key it gets started as a normal driver who it works internelly like
// how engine function is non of my business, the only thing that matter for me as a normal driver is, is my
// staring is working or break or my accleater is working, does my gare is changing.

// in React Js it like using useEffect method i don't care how it is written internally


// we can write abstraction in two ways
// 1. abstract class, where we can work our self 20% and give 80% to user/
// 2. interface where we give total hold or work to our user