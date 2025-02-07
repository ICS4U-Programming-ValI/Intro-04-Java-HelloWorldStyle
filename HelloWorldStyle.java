/**
 * The HelloWorldStyle program implements an application that
 * displays "Hello World! and one other message" to the standard output.
 *
 * <p>This class demonstrates proper JavaDoc formatting.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-02-06
 */
public final class HelloWorldStyle {

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("Hello Alex,");
        System.out.println("You are awesome!");
    }
}
