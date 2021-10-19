import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map<Integer, Integer> diccionario;
        diccionario = new HashMap<Integer, Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextByte();
        sc.nextLine();

        String[] items = sc.nextLine().split(" ");
        long [] items2 = new long[items.length];

        for(int i = 0;i <items.length;i++)
        {
           items2[i] = Long.parseLong(items[i]);
        }
        int numMax = n;
        for(int i = 0; i < n - 1; i++){
            if((items2[i] + items2[i + 1] ) > x){             
                numMax--;
            }
        }
        System.out.println(numMax);
    }
}
