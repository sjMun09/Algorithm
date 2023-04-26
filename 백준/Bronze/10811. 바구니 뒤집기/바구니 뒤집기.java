import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()); // 수정 1, 토큰 초기화 와 생성 나눠줌

        //바구니 개수
        int N = Integer.parseInt(st.nextToken());
        //역순으로 바꿀 작업 횟수
        int M = Integer.parseInt(st.nextToken());

        //기본 1~N 까지의 바구니 셋팅
        int[] arr_origin = new int[N];

        //바구니에 1~N까지 숫자 셋팅
        for(int i=0; i<arr_origin.length; i++){
            arr_origin[i] = i+1;
        }
       /* //데이터 임시 저장용 바구니
        int[] arr_move = new int[N];
        //임시 바구니에는 깊은 복사(주소 복사가 아닌 값 복사_깊은 복사)
        arr_move = arr_origin.clone();*/  // 죽어있는 것을 발견하고 수정

        /*
        배열의 크기를 지정하고 초기화하면, 배열의 값이 초기화되기 때문에
        데이터 임시 저장용 바구니 부분에서,
        배열 크기 초기화하고, 값을 복사하는 것이 아니라
        arr_origin.clone()로 복사
         */

        // 수정 하거나, 바구니를 바로 생성하도록 해줌,
        //int[] arr_move = arr_origin.clone();
       // int[] arr_move;

//       여기서 문제인 것 같음.
//      arr_origin 의 일부를 역순으로 바꿔주는 작업,

        //M번 만큼의 역순으로 바꾸는 작업 반복
        for(int i=0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            //start번 부터
            int start = Integer.parseInt(st.nextToken());
            //end번 까지의 바구니를 역순으로 만든다.
            int end = Integer.parseInt(st.nextToken());

            // 바구니 크기 반복문 안에서 크기 지정해줌.
        //    arr_move = new int[end - start + 1];

//          정확하게 여기가 문제인 것 가은데,,
//            for(int j=start-1; j <=(end-1)/2+start -1; j++){
//                // j와 end-j+start-1번재 값 교환
//                // 배열의 값 교환 해줄거임.
//                int index = arr_origin[j];
//                arr_origin[j] = arr_origin[end-j+start-1];
//                arr_origin[end-j+start-1]= index;
//            }
////            arr_origin = arr_move.clone();
//
            // arr 배열의 일부분만 역순으로 , 소팅 다시 생각,.
            for (int j = start - 1, k = end - 1; j < k; j++, k--) {
                int temp = arr_origin[j];
                arr_origin[j] = arr_origin[k];
                arr_origin[k] = temp;
            }
        }

//      출력
        for(int i=0; i<arr_origin.length; i++){
            System.out.print(arr_origin[i] + " ");
        }
    }
}