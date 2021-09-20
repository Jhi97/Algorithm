package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Person[] list = new Person[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Person p = new Person(age, name);
            list[i] = p;
        }
        Arrays.sort(list, (e1, e2)->{
            // 나이가 같으면 유지
            if (e1.getAge() == e2.getAge()) {
                return 0;
            }else{
                // 나이가 적은 순으로 오름차순 정렬
                return e1.getAge() - e2.getAge();
            }

        });
        StringBuilder sb = new StringBuilder();
        for (Person person : list) {
            sb.append(person.getAge()).append(" ").append(person.getName()).append('\n');
        }
        System.out.println(sb);
    }
}

class Person {
    private int age;
    private String name;

    Person (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
