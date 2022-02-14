public class JNI {
    
    static {
        System.loadLibrary("hello-jni");
    }
    
    private native int getNumber(); //native 키워드를 사용하여 C파일 내에 사용된 함수명과 동일한 이름으로 선언
    private native void printHelloWorld();
    
    public static void main(String[] args){
        JNI jni = new JNI();
        
        jni.printHelloWorld(); //JNI로 호출 한 HelloWorld!
        
        System.out.println(jni.getNumber()); //JNI로 호출 한 숫자 메서드
    }
}