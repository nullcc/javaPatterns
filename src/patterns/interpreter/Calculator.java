package patterns.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    private Expression expression;
    private Stack<Expression> stack = new Stack<Expression>();

    public Calculator(String expStr) {
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = this.stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    this.stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = this.stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    this.stack.push(new SubExpression(left, right));
                    break;
                default:
                    this.stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = this.stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
