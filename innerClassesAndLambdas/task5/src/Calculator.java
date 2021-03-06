public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= (a,b) -> a+b;/* TODO Use a lambda expression to set "res" to the correct function.*/

            break;
            case "-": res= (a,b) -> a-b;/* TODO Use a lambda expression to set "res" to the correct function.*/

            break;
            case "*": res= (a,b) -> a*b;/* TODO Use a lambda expression to set "res" to the correct function.*/

            break;
            case "/": res= (a,b) -> {
                if (b == 0) return Double.POSITIVE_INFINITY;
                else return a/b;
            };
            /* TODO Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.*/

            break;
            default: res= (a,b) -> Double.MIN_VALUE;/* TODO In the default value, the res function should return the minimun possible value.*/

        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
        DoMath calc = toOperation(op);/* TODO set calc to the correct function calling the method above.*/

        return calc.compute(n1, n2);/* TODO return the result of calc.compute with the numbers given.*/

    }
}
