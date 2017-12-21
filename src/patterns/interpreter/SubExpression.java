package patterns.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return this.left.interpreter(var) - this.right.interpreter(var);
    }
}
