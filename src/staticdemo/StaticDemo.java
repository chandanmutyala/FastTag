package staticdemo;

public class StaticDemo {
    public static int i=20;
    public int j=30;
    public static String helloWorld(){
        return "HelloWorld";

    }
    public String hi(){
        return "hi";
    }

    public static void main(String[] args) {
        String message=helloWorld();
        System.out.println(message);

        StaticDemo staticDemo=new StaticDemo();
      String hiMessage=  staticDemo.hi();
        System.out.println(hiMessage);
        System.out.println("Static"+i);
        System.out.println("Instance"+staticDemo.j);

        staticDemo.i=100;
        staticDemo.j=100;

        System.out.println("Static "+staticDemo.i);
        System.out.println("instance "+staticDemo.j);

        StaticDemo staticDemo1=new StaticDemo();
        System.out.println("Static "+staticDemo1.i);
        System.out.println("instance "+staticDemo1.j);
        staticDemo1.i=200;
        staticDemo1.j=200;

        System.out.println("Static "+staticDemo1.i);
        System.out.println("instance "+staticDemo1.j);

        StaticDemo staticDemo2=new StaticDemo();
        System.out.println("Static "+staticDemo2.i);
        System.out.println("instance "+staticDemo2.j);
        staticDemo2.i=300;
        staticDemo2.j=300;

        System.out.println("Static "+staticDemo2.i);
        System.out.println("instance "+staticDemo2.j);

    }
}
