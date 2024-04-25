package abstruction;

public abstract class Animal {
   int age;
   public Animal(int age) {
      this.age = age;
   }

   static void staticFn() {
      System.out.println("This is static method within abstract class Which is allowed.");
   }

   void normalFn(){
      System.out.println("This is normal method within abstract class. Which is allowed.");
   }

   abstract void makeSound(String sound);

   public int getAge() {
      return age;
   }
}
