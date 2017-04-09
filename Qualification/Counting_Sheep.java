package Qualification;

import java.util.Scanner;

public class Counting_Sheep {
    public static void main(String[] args){
        int T=0;
        int N=0;
        Scanner  scan = new Scanner(System.in);
        T=scan.nextInt();
        int inputs[]=new int[100];
        int outputs[]=new int[100];
        if(T==0){
            System.out.println("No test will be processed");
            System.exit(1);
        }
        else if(0<T&&T<101){
            for(int i=1;i<=T;i++){
                N=scan.nextInt();
                inputs[i-1]=N;
            }
            scan.close();
            for(int i=1;i<=T;i++){

                char arrMain[] = new char[10];
                if(inputs[i-1]==0){
                    System.out.println("Insomnia :(");
                    continue;
                }
                int newN=0;
                int k=1;
                while(!isFull(arrMain)) {
                    newN=inputs[i-1]*k;
                    String number = Integer.toString(newN);
                    for (int j = 0; j < number.length(); j++) {
                        arrMain[Character.getNumericValue(number.charAt(j))] = number.charAt(j);
                    }
                    k++;
                }
                System.out.println("Case:"+i+" -> "+newN );
            }
        }
        else{
            System.out.println("Sorry, you can't enter more then 100 test");
            System.exit(1);
        }
    }
    public static boolean isFull(char[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                count++;
            }
        }
        if(count==10){
            return  true;
        }
        else{
            return false;
        }
    }
}
