package patterns.interpreter;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String expStr1 = "a+b-c";
        HashMap<String, Integer> var1 = new HashMap<String, Integer>();
        var1.put("a", 10);
        var1.put("b", 2);
        var1.put("c", 5);
        Calculator calculator1 = new Calculator(expStr1);
        int res1 = calculator1.run(var1);
        System.out.println(expStr1 + "=" + res1);

        String expStr2 = "a+b-c-d";
        HashMap<String, Integer> var2 = new HashMap<String, Integer>();
        var2.put("a", 100);
        var2.put("b", 34);
        var2.put("c", 12);
        var2.put("d", 8);
        Calculator calculator2 = new Calculator(expStr1);
        int res2 = calculator2.run(var2);
        System.out.println(expStr2 + "=" + res2);
    }
}
