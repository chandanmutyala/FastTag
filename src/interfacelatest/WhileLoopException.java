package interfacelatest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


public class WhileLoopException extends Exception{
    public static void main(String[] args)  {
        //LocalDateTime localDateTime =LocalDateTime.now();
        Date currentDate = new Date();
        System.out.println("Before while loop currentDate" +currentDate);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, 2);
        Date futureDate = cal.getTime();
        System.out.println("Before while loop futureDate" +futureDate);
        boolean continueWhile=true;

       while (continueWhile){
            try {
                FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Whiletest\\siris.jav.txt");
                //localDateTime = LocalDateTime.now();
                System.out.println("File Found");
                break;

            } catch (FileNotFoundException e) {
               // localDateTime = LocalDateTime.now();
                System.out.println(" File notFound"+e.getMessage());

            }
        }
    }
}
