package operationsCollection;

public abstract class Operation {
    
    private int operator1;
    private int operator2;
    
    public Operation(int operator1, int operator2) {
        super();
        this.operator1 = operator1;
        this.operator2 = operator2;
    }
    
    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public abstract int operate();
}
