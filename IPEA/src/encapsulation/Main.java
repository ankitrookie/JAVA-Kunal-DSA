package encapsulation;

public class Main {
    public static void main(String[] args){
       Car myCar = new Car("Mahindra", "Thar", 4005, 4566);

       System.out.println(myCar.getMake());

       myCar.setYear(2022);
       System.out.println(myCar.getYear());
    }
}

/*** Encapsulation is like a magic box for a car. It keeps the car's secrets (make, model, year, speed)
   safe inside. Only special keys (methods) can open the box to access or change these secrets. This
   ensures that the car stays safe and works smoothly, like magic! ***/

// Encapsulation hides both the code and data within a single entity, making it difficult to manipulate from outside.