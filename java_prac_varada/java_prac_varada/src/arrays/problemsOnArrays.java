package arrays;

public class problemsOnArrays {
    public static void main(String[] args) {
        /*int numbers[]={23,12,6,7,15,3,2,56};
     *//*   int sum=0;
        for (int number:numbers) {
            sum += number; //sum=sum+number

        }
        System.out.println("sum is "+sum);*//*

        int min=Integer.MAX_VALUE; //initializin min as the max value so at every time smallest number is saved in min//max value which is already sored so as compared to that all the numbers in string are compared and smallest is saved in min and the process continues
        for(int number: numbers){
            if(number<min){
                min = number;
            }
        }
        System.out.println("min number is "+min);*/

        //multidimensional array
        //row=student roll number
        //colum=subject postion
   /*     int marks[][]= new int[4][3];

        marks[0][0] =12;
        marks[0][1] =98;
        marks[0][2] =34;

        marks[1][0] =12;
        marks[1][1] =67;
        marks[1][2] =87;

        marks[2][0] =12;
        marks[2][1] =2;
        marks[2][2] =1;


        marks[3][0] =2;
        marks[3][1] =22;
        marks[3][2] =11;*/

        int marks[][]={
                {12,98,34},
                {12,67,87},
                {12,98,23},
                {14,67,36}

        };
        System.out.println(marks[2][1]);


    }
}
