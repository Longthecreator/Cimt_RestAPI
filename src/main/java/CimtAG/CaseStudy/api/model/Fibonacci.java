package CimtAG.CaseStudy.api.model;

public class Fibonacci {

    private int input;
    private int result;

    public Fibonacci(){}

    public Fibonacci(int input){
        this.input = input;
        if (input <= 0) {
            this.result = 0;
        } else if (input == 1) {
            this.result= 1;
        } else {
            int fibMinus2 = 0;
            int fibMinus1 = 1;
            int fibonacci = 0;

            for (int i = 2; i <= input; i++) {
                fibonacci = fibMinus2 + fibMinus1;
                fibMinus2 = fibMinus1;
                fibMinus1 = fibonacci;
            }

            this.result= fibonacci;
        }
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
