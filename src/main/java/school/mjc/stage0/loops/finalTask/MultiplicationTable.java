package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 1; i < 11; i++) {
            System.out.println(numberTableToPrint+"x"+i+"="+i*numberTableToPrint);

        }
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.printTable(3);
    }
}
