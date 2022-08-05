package MainFunctionality;

import PrintMessage.Messages;

public class SimpleCalculator implements Calculator {
    private int number1, number2;
    private char operator;
    private float result;

    public SimpleCalculator(int number1, char operator, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;

    }

    @Override
    public float calculate() throws ArithmeticException {

        switch (operator) {
            case '+':
                result = (float) number1 + number2;
                break;
            case '-':
                result = (float) number1 - number2;
                break;
            case '*':
                result = (float) number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Don't divide by zero");
                }else {
                    result = (float) number1 / number2;
                }
                break;
            default:
                Messages.incorrectOperatorMessage();
        }
        return result;

    }

}
