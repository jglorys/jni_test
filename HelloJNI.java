package helloJNI;

public class HelloJNI {
    static {
        System.loadLibrary("hellojni"); //공유 라이브러리 이름
        // 공유 라이브러리 파일의 이름은 Windows에서 "hellojni.dll"이고, Linux에서 "libhellojni.so"
    }

    public native String printHello(String message);

    public static void main(String[] args){
        HelloJNI helloJNI = new HelloJNI();
        System.out.println("Hello, from " + helloJNI.printHello("Java") + ".");
    }
}