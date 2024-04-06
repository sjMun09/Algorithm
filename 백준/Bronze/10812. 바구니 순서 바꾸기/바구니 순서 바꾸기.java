 import java.io.*;
  import java.util.StringTokenizer;

  public class Main {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer token = new StringTokenizer(br.readLine());

          int N = Integer.parseInt(token.nextToken()); //바구니 개수
          int M = Integer.parseInt(token.nextToken()); //회전 횟수

          int [] basket = new int[N]; //담을 바구니 배열

          int [] rotationBasket = new int[N]; //회전을 시킨 바구니 배열

          for(int i = 0; i < basket.length; i++){
              basket[i] = i+1; //바구니에 값 1~N 순서대로 담는다.
          }

          for(int r = 0; r < M; r++){ //회전 시킬 횟수만큼 반복
              token = new StringTokenizer(br.readLine());
              /*배열인덱스가 0부터 시작하므로 -1*/
              int i =  Integer.parseInt(token.nextToken())-1; //시작
              int j =  Integer.parseInt(token.nextToken())-1; //끝
              int k =  Integer.parseInt(token.nextToken())-1; //기준

              int i1 = i; // i값을 기준으로 계속 증가해야하는데 i를 조건식에 사용해서 i값을 따로 저장해둔다.

             for(int b = 0; b < j-i+1; b++){ //여기까지가 바꾼 바구니 부분이고 바꾸지 i
                  // k부터 j까지의 값을 넣는 if문
                  if(k+b <= j){ //기준에서 + 반복 횟수한 값이 끝 바구니의 인덱스보다 작을 때까지만
                      rotationBasket[b+i] = basket[k+b];
                  }else{ //여기서부턴 i~k부분
                      rotationBasket[b+i] = basket[i1];
                      i1++; //i1값을 계속 증자시켜서 i~k부분을 j뒤에 넣어준다.
                  }
             }
             for(int b = 0; b < N; b++){
                 //rotationBasket[b]값이 0이라는 것은 회전하는 값에 포함되지 않았다는 것.
                 if(rotationBasket[b] != 0){ //그래서, 0을 제외한 부분을 덮어씌우기하면 된다.
                     basket[b] = rotationBasket[b];
                 }
             }

          }
          br.close();

          for(int i = 0; i < N; i++){ //rotationBasket.length = N
              bw.write(basket[i] + " ");
          }

          bw.flush();
          bw.close();

    }
}