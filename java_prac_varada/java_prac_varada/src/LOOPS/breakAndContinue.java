package LOOPS;

public class breakAndContinue {
    public static void main(String[] args) {
       /* for (int i = 0; i < 20; i+=2) {
            System.out.println(i);
            if(i>=10)break;*///when becomes true condition breaks get out of the loop
//break used to come out of the loop
        /*}*/
        //int i = 0;
        /*while(i<5) {
            System.out.println(i);
            i++;
            if(i==3)break;
        }*/

        //continue statement used to skip current statement not all or you want to skip one statement
     /*   for (int i = 0; i < 20; i += 1) {
            if (i == 2 || i == 8) continue;
            System.out.println("give toffee to " + i);
            if (i >= 15) break;*/

            //nested loops
       for (int count = 0; count < 10; count++) {
            for (int i = 1; i < 6; i++) {
                System.out.print(i+" ");

            }
            System.out.println("printed "+count);

        }
/*        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* "); //make patterns with this logics


            }
            System.out.println();

        }
        outerloop: //label
        for (int i = 0; i < 10; i++) {
            int j=0;
            while(j<=5){
                if (j==3)break outerloop;//want to get out of inside as well as outer loop as well
                System.out.print(j+" ");
                j++;
            }
            System.out.println();

        }*/

        }

    }



