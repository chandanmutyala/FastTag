package exceptionhandling;

public class EvenOddException {

//for(int i=1;i<=a;i++){
//    if(i%2==0) {
//        System.out.println("evan num");
//        throw new RuntimeException();
//
//    }else{
//        System.out.println("odd num");
//        throw new Exception();
//    }
//
//}
public int even(int a) {
        if(a%2==0) {
            System.out.println("Even Number");
            throw new CustomRunTimeException(EnumErrorCode.NEOTERIC_EVEN_1000.getCode(),
                    EnumErrorCode.NEOTERIC_EVEN_1000.getMessage());
        }

        return a;
    }
    public int getodd(int b) throws CustomException {
        if (b % 2 == 0) {
            System.out.println("Odd Number");
            throw new CustomException(EnumErrorCode.NEOTERIC_ODD_1001.getCode(),
                    EnumErrorCode.NEOTERIC_ODD_1001.getMessage());
        }

        return b;
    }
}