import java.util.ArrayList;
import java.util.Scanner;
public class SubarraysInTheRange {
    static ArrayList<Integer> findSubArraysInTheRange(int[] A,int B,int C){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = B; i <= C; i++){
            arrayList.add(A[i]);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        System.out.print("Array Elements: ");
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        int B = scanner.nextInt(), C = scanner.nextInt();
        System.out.println(findSubArraysInTheRange(array, B, C));
    }
}
