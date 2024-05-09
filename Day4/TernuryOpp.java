package Day4;

import java.util.Scanner;

public class TernuryOpp {

    public static void main(String[] args) {
//        int a=10,b=15,c=16;
//
//       int result= (a>b)?(a>c?a:c):(b>c?b:c);
//        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();

        int Ebill = (bill < 100) ? (bill * 2) : ((bill > 100 && bill < 150) ? bill * 3 : (bill > 150 && bill < 200) ? bill * 4 : (bill > 200 && bill < 251) ? bill * 5 : (bill > 250 && bill < 301) ? bill * 6 : (bill > 300 && bill < 501) ? bill * 7 : bill * 8);
        System.out.println(Ebill);
    }
}
