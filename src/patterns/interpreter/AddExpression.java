package patterns.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return this.left.interpreter(var) + this.right.interpreter(var);
    }
}
