package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

            for (int i = 0; i < cathetusLength/2+1; i++) {
                for (int j = cathetusLength/2+1; j>i+1; j--) {
                    System.out.print(" ");




                }
                for (int k = i; k >=0; k--) {
                    System.out.print(k+1);

                }
                if (i>0){
                    for (int m = 0; m <i ; m++) {
                        System.out.print(m+2);
                    }
                }
                System.out.println();
            }

        }



    public static void main(String[] args) {

        new Pyramid().printPyramid(10);
    }
}
