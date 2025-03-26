package e3;
class XxxException extends Exception {
    public XxxException(String message) {
        super(message);
    }
}
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (XxxException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    public static void methodA() throws XxxException {
        try{
            methodB();
        }catch (XxxException e){
            System.out.println("Exception caught in methodA: " + e.getMessage());
            throw  e;
        }
    }

    public static void methodB() throws XxxException {
        methodC();
    }

    public static void methodC() throws XxxException {
        methodD();
    }

    public static void methodD() throws XxxException {
        // Simulate an exception
        throw new XxxException("An error occurred in methodD");
    }
}
