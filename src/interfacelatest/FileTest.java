package interfacelatest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {

            Date currentDate = new Date();
            System.out.println("Before while loop currentDate" +currentDate);
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MINUTE, 1);
            Date futureDate = cal.getTime();
        System.out.println("Before while loop futureDate" +futureDate);
            while (currentDate.before(futureDate)) {
                try {

                FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Whiletest\\siri.txt");
                System.out.println("File found");
                break;

            } catch(FileNotFoundException f) {
                    currentDate = new Date();
                    System.out.println("Exception occurred message" + f.getMessage());

                }finally {
                    System.out.println("finally file found ");
                }
            }
        }

    }
