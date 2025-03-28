package e8;
class XxxException extends Exception {
    public XxxException(String message) {
        super(message);
    }
}

class YyyException extends Exception {
    public YyyException(String message) {
        super(message);
    }
}

public class OperancionesConExcepciones {
    public static void main(String[] args) {
        methodC(1);
        methodC(-1);
        // non catch in methodC
        try {
            methodC(1, 0);
        } catch (XxxException ex) {
            System.out.println("Exception caught in main: " + ex.getMessage());
        } catch (YyyException ex) {
            System.out.println("Exception caught in main: " + ex.getMessage());
        }
        try {
            methodC(-1, 0);
        } catch (XxxException ex) {
            System.out.println("Exception caught in main: " + ex.getMessage());
        } catch (YyyException ex) {
            System.out.println("Exception caught in main: " + ex.getMessage());
        }
    }


    public static void methodD(int i) throws XxxException, YyyException {
// XxxException occurs
        if (i > 0) {
            throw new XxxException("An Xxx error occurred in methodD"); // construct an XxxException object and throw to JVM
        }
// YyyException occurs
        if (i < 0) {
            throw new YyyException("An Yyy error occurred in methodD");// construct an YyyException object and throw to JVM
        }
    }

    public static void methodC(int i) { // no exception declared
        try {
            methodD(i);
        } catch (XxxException ex) {// Exception handler for XxxException
            System.out.println("Exception caught en MethodC: " + ex.getMessage());
        } catch (YyyException ex) {// Exception handler for YyyException
            System.out.println("Exception caught en MethodC: " + ex.getMessage());
        }
    }

    public static void methodC(int i, int j) throws XxxException, YyyException {   // for next higher-level method to handle
        methodD(i);// no need for try-catch
    }
}
