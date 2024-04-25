package packages.a;

import static packages.b.IndianGreeting.message;

public class Greeting {
    public static void main(String[] args){
        System.out.println("Indian Greeting : " + "Namastee!");
        message();
    }
}


// packages is as same as components that we have in react, we can use other component in one another