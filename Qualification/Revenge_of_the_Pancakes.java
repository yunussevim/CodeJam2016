package Qualification;


import java.util.Scanner;

public class Revenge_of_the_Pancakes {
    public static void main(String[] args){
        int T=0;
        Scanner scan=new Scanner(System.in);
        T=scan.nextInt();
        String S="";
        String inputs[]= new String[100];
        for(int i=0;i<T;i++){
            S=scan.next();
            inputs[i]=S;
        }
        for(int i=0;i<T;i++) {
            String Snext = inputs[i];
            int count =0;
            while (!isDone(Snext)) {
                String sequence = "";
                int endIndex=0;
                for (int j = 0; j < Snext.length(); j++) {
                    if (Snext.charAt(0) != Snext.charAt(j)) {
                        sequence = Snext.substring(0,j);
                        endIndex=j;
                        break;
                    }
                    if (Snext.length() - 1 == j && Snext.charAt(Snext.length() - 1) == '-') {
                            sequence = Snext;
                            endIndex=Snext.length();
                        }
                }
                String Sreplace = "";
                for (int k = 0; k < sequence.length(); k++) {
                    if (sequence.charAt(k) == '+') {
                        Sreplace = Sreplace.concat("-");
                    }
                    if (sequence.charAt(k) == '-') {
                        Sreplace = Sreplace.concat("+");

                    }
                }

                count++;
                Snext = Sreplace+Snext.subSequence(endIndex,Snext.length());



            }
            System.out.println("Case:"+(i+1)+" -> "+count);
        }
    }
    public static boolean isDone(String s){
        boolean f = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                f=false;
                break;
            }
        }
        return f;
    }
}
