import java.util.ArrayList;
public class MultiplicationTable {
    private int number;
    private int limit;

    public MultiplicationTable(int number, int limit) {
        this.number = number;
        this.limit = limit;
    }

    public ArrayList<String> multiply () {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            int result = number * i;
            String row = number + " x " + i + " = " + result;
            list.add(row);
        }
        return list;
    }
}
