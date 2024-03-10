package exceptionhandling;

public class EvenOddProcess {
    EvenOddException evenOddException=new EvenOddException();
    public String evenNumber(){
        try {
            evenOddException.even(10);
        }catch (CustomRunTimeException runtime){
           // runtime.printStackTrace();
            System.out.println(runtime.getCode()+"  "+runtime.getMessage());
        }
        return "Even RuntimeException";
    }


    public String oddNumber(){
        try {
            evenOddException.getodd(10);
        } catch (CustomException e) {
            System.out.println(e.getCode()+" "+e.getMessage());


        }
        return "Odd CheckedException";
    }
}
