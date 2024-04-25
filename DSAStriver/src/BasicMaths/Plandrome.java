package BasicMaths;

public class Plandrome {
    public Boolean plandromeNumber(int n){
        int reverseCount = 0;
        int duplicateOfN = n;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverseCount = (reverseCount * 10)  + lastDigit;
        }
        if (reverseCount == duplicateOfN){
            return true;
        } else {
            return false;
        }
    }
}

