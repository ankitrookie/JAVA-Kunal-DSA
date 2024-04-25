package BasicMaths;

public class CountNumOfDigit {
    public int numberOfDigit(int n){
        int count = 0;
        while (n > 0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
}
