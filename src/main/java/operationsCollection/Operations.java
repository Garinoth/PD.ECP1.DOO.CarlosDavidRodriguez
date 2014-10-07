package operationsCollection;

public class Operations {

    private final int SIZE = 10;
    private Operation[] operations;

    public Operations() {
        this.operations = new Operation[this.SIZE];
    }
    
    public void add(Operation operation) {
        int i = 0;
        while (i < this.operations.length && this.operations[i] != null) {
            i++;
        }
        if (i < this.operations.length) {
            this.operations[i] = operation;
        }
    }
    
    public void reset() {
        this.operations = new Operation[this.SIZE];
    }
    
    public int total() {
        int res = 0;
        for (Operation operation : operations) {
            res += operation.operate();
        }
        return res;
    }
}
