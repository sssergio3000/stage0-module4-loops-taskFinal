package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 0; i < 11; i++) {
            System.out.println(numberTableToPrint+"*"+i+"="+i*numberTableToPrint);

        }
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.printTable(3);
    }
}
