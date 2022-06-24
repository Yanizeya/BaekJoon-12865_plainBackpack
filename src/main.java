import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        int K;
        int[][] WV;
        int maxV;
        int nowN;

        N = scan.nextInt();
        K = scan.nextInt();
        WV = new int[N][2];

        for(int i=0; i<N; i++){
            WV[i][0] = scan.nextInt();
            WV[i][1] = scan.nextInt();
        }

        Arrays.sort(WV, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else{
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i=0; i<N; i++){
            System.out.print(WV[i][0]+" ");
            System.out.println(WV[i][1]);
        }
    }


}
