public class HelloWorld {
    String greeting = "Hello Java World";

              public native void display();

              public static void main(String[] args) {

                            HelloWorld hw = new HelloWorld();
              System.out.println(hw.greeting);
                            hw.display();
                            System.out.println(hw.greeting);

              }

              static {
                            System.load("D:\\Project\\Java\\hello.dll");
              }
}
