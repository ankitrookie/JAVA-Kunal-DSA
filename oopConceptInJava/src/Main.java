//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
      BankCheckBook checkBook = new BankCheckBook();
      BankCheckBook checkbook = new BankCheckBook("ankit", 4, 457777);

        System.out.println(checkbook.name);
        System.out.println(checkbook.date);
        System.out.println(checkbook.amount);
    }
}

class BankCheckBook {
    int date;
    String name;
    int amount;

//  this keyword in Java is like saying "myself" or "this particular object
    BankCheckBook() {
        // in this function we are declaring value with in function
        this.name = "Ankit";
        this.date = 23;
        this.amount = 45666;
    }

    BankCheckBook(String name, int date, int  amount){
        // in this function we have made it dynamic, we will print the value that comes e.g. parameter
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

}

/* classes are like a blueprint, like we have form to fill something, for more
   instance bank checkbook we have all required thing already printed there, we can fill it
   amd use it in different day and time by filling date and time and names and amount */

/* and instance of class means, the content or value that we provide on checkbook in different scenario. */

/* Dynamic memories allocation => means it will allocate memories when the program is running or in runtime */