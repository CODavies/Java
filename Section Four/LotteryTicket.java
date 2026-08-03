import java.util.Arrays;

public class LotteryTicket {

    public static void main(String[] args) {

        int[] ticket1 = { 34, 43, 45, 65, 21, 54 };
       
        System.out.print("number : " + " ");

        for(int i=0; i < ticket1.length; i++){
         System.out.print(ticket1[i]);

        if (i < ticket1.length - 1) {
        System.out.print(", ");
        }

       }
    }

}
