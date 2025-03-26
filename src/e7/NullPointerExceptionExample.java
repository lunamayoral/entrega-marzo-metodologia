package e7;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.triggerNullPointerException();
    }

    public void triggerNullPointerException() {
        String[] strs = new String[3];

        try {
            System.out.println("La longitud del primer elemento es: " + strs[0].length());
        } catch (NullPointerException e) {
            System.out.println("Error: Se intentó acceder a un método de un objeto que es null.");
            e.printStackTrace();
        }
    }
}