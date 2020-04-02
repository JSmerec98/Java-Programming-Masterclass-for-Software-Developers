package JAN;

public class Main {

    public static void main(String[] args)
    {
        // TESTS
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(-10));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(SharedDigit.hasSharedDigit(12,23));
        System.out.println(LastDigitChecker.hasSameLastDigit(111,19,99));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(13,30));
        AllFactors.printFactors(6);
        System.out.println(PerfectNumber.isPerfectNumber(6));
    }
}
