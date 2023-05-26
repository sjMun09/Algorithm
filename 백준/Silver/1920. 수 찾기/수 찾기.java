import java.util.*;
import java.io.*;

// binarySearch 함수 안쓰고 구현한 코드
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n1 = Integer.parseInt(br.readLine());
        int [] arr1 = new int[n1];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i< arr1.length;i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        
        
        int n2 = Integer.parseInt(br.readLine());
        int [] arr2 = new int[n2];
        st = new StringTokenizer(br.readLine()," ");
        for(int j=0; j<arr2.length;j++){
            arr2[j]= Integer.parseInt(st.nextToken());
        }
        
        for (int k = 0; k < arr2.length; k++) {
            if (binarySearch(arr1, arr2[k])) {
                System.out.print("1\n");
            } else {
                System.out.print("0\n");
            }
        }
        /*
         이진 탐색 알고리즘을 사용하여 제공된 배열 (여기서는 arr1)에서
         주어진 목표 값 (arr2[k])을 찾습니다.
         binarySearch() 함수는 배열과 목표 값을 인수로 받습니다. 
         배열에서 목표 값을 찾으면 true를 반환하고, 목표 값이 없으면 false를 반환
        */
    }
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}

