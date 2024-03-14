package retryexceptiondemo;

public class BookMyShowProcess {
    public void bookTicket(){
        try {
            BookMyShowService service=new BookMyShowService();
            service.bookTicket();
        }catch (Exception e){
            System.out.println("Error occured "+e);
        }finally {
            System.out.println("bookTicket finally executed");
        }


    }

}
