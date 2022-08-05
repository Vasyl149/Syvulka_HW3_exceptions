import Console.ReadConsole;
import Exceptions.LargeNumberException;
import MainFunctionality.SimpleCalculator;
import PrintMessage.Messages;

public class Main {
    public static void main(String[] args) {

        ReadConsole readConsole = new ReadConsole();

        SimpleCalculator simpleCalculator = new SimpleCalculator(
                readConsole.getInt(),
                readConsole.getOperator(),
                readConsole.getInt()
        );

        try {
            Messages.printResult(simpleCalculator.calculate());
        } catch (ArithmeticException ex) {
            System.out.println("Exception occurred: " + ex);
        } catch (LargeNumberException e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("\nThank you for using our product!");
        }

    }
}
