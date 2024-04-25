package BasicMaths;

public class Main {
    public static void main(String[] arg) {
       DigitNumber extractedDigit = new DigitNumber();
       CountNumOfDigit countNumberOfDigit = new CountNumOfDigit();
       ReversNumber  reverseNumber = new ReversNumber();
       Plandrome palandromNum = new Plandrome();
       ArmsStrong armStrong = new ArmsStrong();

//       System.out.print(extractedDigit.extractDigit(7789));
//       System.out.println(countNumberOfDigit.numberOfDigit(7789));
//       System.out.println(reverseNumber.reverseNumber(7789));
//       System.out.println(palandromNum.plandromeNumber(7789)); // 1331 -> it will return true
         System.out.println(armStrong.armsStrong(1634));
    }
}
