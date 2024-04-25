package BasicMaths;

public class ReversNumber {
    public int reverseNumber(int n){
        int reverseCount = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                n = n / 10;
                reverseCount = (reverseCount * 10)  + lastDigit;
            }
        return  reverseCount;
    }
}
