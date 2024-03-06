package interfacelatest;

public class ExceptionDemo {
    public static void main(String[] args) {
        String name = null;
        String company = "neoteric";
        System.out.println("name =" + name);
        System.out.println("company =" + company);
        try {
            System.out.println("name uppercase =" + name.toUpperCase());
        } catch (Exception e){
            System.out.println("Exception Occured "+e.getMessage());
    }finally {
            System.out.println("from finally block");
        }
        System.out.println("company uppercase="+company.toUpperCase());
    }
}
