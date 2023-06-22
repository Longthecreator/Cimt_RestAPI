package CimtAG.CaseStudy.api.model;

public class GreatestCommonDivisor {
    private Integer value1;
    private Integer value2;
    private Integer gcd;

    public GreatestCommonDivisor(){}

    public GreatestCommonDivisor(Integer value1, Integer value2){
        this.value1 = value1;
        this.value2 = value2;
    }


    public void calculateGcd(){
        Integer value1D = value1;
        Integer value2D = value2;
        while (value2D != 0) {
            int temp = value2D;
            value2D = value1D % value2D;
            value1D = temp;
        }
        this.gcd = value1;
    }


    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    public Integer getGcd() {
        return gcd;
    }

    public void setGcd(Integer gcd) {
        this.gcd = gcd;
    }
}
