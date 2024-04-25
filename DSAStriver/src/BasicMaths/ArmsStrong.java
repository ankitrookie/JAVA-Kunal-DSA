package BasicMaths;

public class ArmsStrong {
    public Boolean armsStrong(int n){
        int duplic = n;
        int sum = 0;

        while(n > 0){
          int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
          n = n / 10;
        }
        if(duplic == sum){
            return true;
        } else {
            return false;
        }
    }
}
