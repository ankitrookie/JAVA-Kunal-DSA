package BasicMaths;

public class DigitNumber {
    public int extractDigit(int n) {
        int lastDigit = 0;
           while (n > 0){
               lastDigit = n % 10;
               n = n / 10;
           }
       return lastDigit;
    }
}
