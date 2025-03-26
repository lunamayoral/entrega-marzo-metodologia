package e5;
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
    public static void main(String[] args){
        methodC(1);
        methodC(-1);
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
            System.out.println("Exception Xxx caught en MethodC: " + ex.getMessage());
        } catch (YyyException ex) {// Exception handler for YyyException
            System.out.println("Exception Yyy caught en MethodC: " + ex.getMessage());
        } finally {// optional
// These codes always run, used for cleaning up
            System.out.println("Errores solucionados");
        }
    }
    public void methodC() throws XxxException, YyyException {   // for next higher-level method to handle
        // uses methodD() which declares "throws XxxException, YyyException"
        methodD(int i);

            // method body throw XxxException and YyyException

        // no need for try-catch

    }
}
