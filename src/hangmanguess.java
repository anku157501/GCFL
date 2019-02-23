import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class hangmanguess {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String a;
            String hr[]={"ankita","haimangi","chestaa","divyaa"};
            Random r =new Random();
            String h=hr[r.nextInt(4)];

            char[] c=h.toCharArray();
            int l=c.length;
            char[] k = new char[l];
            for (int i = 0; i < l; i++) {
                   k[i] = '-';}
            for (int i = 0; i <l; i++) {
                System.out.println("guess the letter");
                a = sc.next();

                for (int j = 0; j < l; j++) {
                    if (c[j] == a.charAt(0)) {
                        k[j] = a.charAt(0);
                    }
                }
            }
            System.out.println(Arrays.toString(c)+" "+Arrays.toString(k));
                if(Arrays.toString(c).equals(Arrays.toString(k))){
                    System.out.println("won");
                }
                else
                {
                    System.out.println("lost");
                }
            }
            }





