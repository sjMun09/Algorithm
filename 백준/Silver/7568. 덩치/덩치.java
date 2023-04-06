import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            // 각 줄마다 토큰 나눠야하니까,
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            people[i] = new Person(weight, height);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && people[i].weight < people[j].weight && people[i].height < people[j].height){
                    people[i].rank++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(people[i].rank+ " ");
        }
    }

    // 사람의 키와 몸무게 저장
    static class Person{
        int weight, height, rank;

        Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
            this.rank = 1;
        }
    }
}