package hello;

import java.util.Random;
public class otpgen{
     static char[] OTP (int len)
     {
         System.out.println("Generating Your OTP");
         System.out.println("Your OTP: ");
         String num = "1234567890";
         Random rn =  new Random();
         char[] otp = new char[len];
         for(int i=0;i<len;i++){
             otp[i]=num.charAt(rn.nextInt(num.length()));
         }
         return otp;
     }

    public static void main(String[] args){
        int length = 6;
         System.out.println(OTP(length));
    }
}