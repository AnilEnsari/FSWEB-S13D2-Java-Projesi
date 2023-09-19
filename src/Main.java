public class Main {

    public static void main(String[] args) {
        System.out.println("isPalindrome1: "+isPalindrome(-1221));
        System.out.println("isPalindrome2: "+isPalindrome(707));
        System.out.println("isPalindrome3: "+isPalindrome(11212));
        System.out.println("*************************");
        System.out.println("isPerfectNumber1: "+ isPerfectNumber(6));
        System.out.println("isPerfectNumber2: "+isPerfectNumber(28));
        System.out.println("isPerfectNumber3: "+isPerfectNumber(5));
        System.out.println("isPerfectNumber4: "+isPerfectNumber(-1));
        System.out.println("*************************");
        System.out.println("numberToWords1: "+numberToWords(123));
        System.out.println("numberToWords2: "+numberToWords(1010));
        System.out.println("numberToWords3: "+numberToWords(-12));

    }
   /*

   numberToWords(123); => "One Two Three" dönmeli.

numberToWords(1010); => "One Zero One Zero" dönmeli.

numberToWords(-12);



   isPerfectNumber(6); => true dönmeli (1+2+3=6)

    isPerfectNumber(28); => true dönmeli (1+2+4+7+14=28)

    isPerfectNumber(5); => false dönmeli (kendisi dışındaki tek böleni 1)

    isPerfectNumber(-1);*/
    public static boolean isPalindrome(int number) {
        String numString = String.valueOf(Math.abs(number)) ;
        for ( int i = 0 ; i<numString.length();i++){

            if(numString.charAt(i) != numString.charAt(numString.length()-i-1))
                return false ;
        } return true ;
    }


    public static  boolean  isPerfectNumber (int number) {
        if (number <0) {return false ; }

int numCounter = 0 ;
        for (int i = 1; i <= number / 2; i++) {
            if(number % i ==0){

              numCounter += i  ;

            }


        } return numCounter == number ;
    }

    public static String numberToWords(int number){
       if(number<0){return "Invalid Value";}
       String numberString = String.valueOf(number);
      return  numberString.replaceAll("1","one ").replaceAll("2","two ").replaceAll("0","zero ").replaceAll("3","three ");


    }
}