package conditionalstatements;

public class ifelse {
    public static void main(String[] args) {


//nested if else
/*        int a = 14;
        int b = 1;
        int c = 4;

        if (a > b) {
            System.out.println("a is bigger than b");
            if (a > c) {
                System.out.println("a is bigger than c");
                System.out.println("a is largest " + a);
            } else {
                System.out.println("c is bigger than a");
                System.out.println("c is largest" + c);
            }
        } else {
            System.out.println("b is bigger than a");
            if (b > c) {
                System.out.println("b is bigger than c");
                System.out.println("b is largest" + b);
            } else {
                System.out.println("c is bigger than b");
                System.out.println("c is largest" + c);

            }
        }


    }
}*/

      /*  int age =4;
        if(age>=18){
            System.out.println("you can vote");
            System.out.println("good morning");}
            else {
                System.out.println("you cannot vote");
            }
        }
    }*/
    /*int day =2;
    if(day ==1) {
        System.out.println("go to the village");
    }
    else if(day==2) {
        System.out.println("go to home");
    }
    else{
        System.out.println("go to office");
    }
        System.out.println("went somewhere today");*/
        /**/

        //ternary operator
    /*    int a =23;
        int b =12;
        int max=0;
//normal if else
        *//*if(a>b) {
            max = a;
        }else{
            max=b;
        }*//*
        //ternary
      *//*  max = a>b ? a:b;*//*

      int c=33;
      max = a>b ? a>c?a:c:b>c?b:c; //nested ternary
      System.out.println(max);*/

        int time =11;
/*
        if (time > 10) {

            if (time < 20) {
                System.out.println("office open");

            } else {
                System.out.println("office is closed");

            }
        } else {
            System.out.println("office is closed");
        } //instead of this use logical operations
        */
        //logical operations
        if(time >=10 && time<+20) {
            System.out.println("office open");
        }else{
            System.out.println("office is closed");
        }


        if(time ==12 || time==18) {
            System.out.println("Time for snacks");
        }else{
            System.out.println("Time to work");
        }


    }
}