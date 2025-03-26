package e7;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.triggerClassCastException();
    }

    public void triggerClassCastException() {
        Object o = new Object();
        try {
            Integer i = (Integer) o;
            System.out.println("El número es: " + i);
        } catch (ClassCastException e) {
            System.out.println("Error: No se puede convertir el objeto a Integer.");
            e.printStackTrace();
        }
    }
}
