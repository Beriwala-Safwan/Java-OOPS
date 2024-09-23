package com.CoreJava;

import java.util.Arrays;

//arrays of 5 float and sum it
public class ArrayJava {
    public static void main(String[]args){
   /* float []marks={41.5f,67.8f,23.4f,12.8f,88.9f};

   float sum=0;

  for(int i=0;i< marks.length;i++){
       sum=sum+marks[i];
   }
        System.out.println("the total is "+sum);

    */


       /* float []marks={41.5f,67.8f,23.4f,12.8f,88.9f};
        float num=67.8f;
        boolean isinarray=false;
        for(float element:marks){
            if(num==element){
             isinarray=true;
             break;
            }
        }
if(isinarray){
    System.out.println("the value is in aaray");
}
else {
    System.out.println("no in array");
}*/

        System.out.print("++++++++reverse the array programee+++++++");
      /*  int[]marks={1,2,3,4,5,6};

        int temp;
        int j= marks.length-1;
        int i=0;
        while(i<j){
            temp=marks[i];
            marks[i]=marks[j];
            marks[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(marks));*/
        System.out.print("++++++++min-max array programee+++++++");

        int[]marks={10,50,60,40,55,87};
        int min=87;
        int max=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }
        System.out.println("minimum  "+min);

        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("maximum "+max);

        System.out.print("++++++++sort the array programee+++++++");
        int[]num={33,56,78,90,2,1};
        for(int i=0;i< num.length;i++){
            for(int j=i+1;j< num.length;j++){
                if(num[j]<num[i]){
                    int temp=num[i];
                    System.out.print("temp values "+temp);
                    num[i]=num[j];
                  //  System.out.print(num[i]);
                    num[j]=temp;
                    //System.out.print(num[j]);

                }
            }
        }
        System.out.println("sorted arrya");
        for(int i=0;i< num.length;i++){
            System.out.print(num[i]+"    ");
        }
    }
}
