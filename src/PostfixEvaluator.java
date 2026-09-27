public class PostfixEvaluator {

    public static double evaluate(String expression) {

        String[] tokens = expression.split(" ");

        NumberStack stack = new NumberStack(tokens.length);

        System.out.println("\nEvaluating: " + expression);

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if (token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                double result = 0;

                if (token.equals("+")) {
                    result = operand1 + operand2;
                }
                else if (token.equals("-")) {
                    result = operand1 - operand2;
                }
                else if (token.equals("*")) {
                    result = operand1 * operand2;
                }
                else if (token.equals("/")) {
                    result = operand1 / operand2;
                }

                System.out.println(
                    "Operation: " + operand1 + " " +
                    token + " " + operand2 +
                    " = " + result
                );

                stack.push(result);

                stack.displayStack();

            } else {

                double number = Double.parseDouble(token);

                stack.push(number);

                System.out.println("Push: " + number);

                stack.displayStack();
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "5 3 + 2 *";
        System.out.println("Postfix Expression: " + expression);
        double result = evaluate(expression);
        System.out.println("Final Result: " + result);
    }
}