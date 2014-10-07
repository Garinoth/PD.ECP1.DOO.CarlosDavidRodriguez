package operationsCollection;

public class Substraction extends Operation {

    public Substraction(int operator1, int operator2) {
        super(operator1, operator2);
    }

    @Override
    public int operate() {
        return this.getOperator1() - this.getOperator2();
    }

}
