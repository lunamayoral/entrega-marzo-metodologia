package e8;

public class ClassCastException extends Throwable {
    public static void main(String[] args) {
        ClassCastException example = new ClassCastException();
        example.triggerClassCastException();
    }

    public void triggerClassCastException() {
        Object o = new Object();
        try {
            Integer i = (Integer) o;
        } catch (java.lang.ClassCastException e) {
            System.out.println("Error: No se puede convertir el objeto a Integer.");
            e.printStackTrace();
        }
    }



}
