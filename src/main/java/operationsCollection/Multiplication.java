package operationsCollection;

public class Multiplication extends Operation {

    public Multiplication(int operator1, int operator2) {
        super(operator1, operator2);
    }

    @Override
    public int operate() {
        return this.getOperator1() * this.getOperator2();
    }

}
