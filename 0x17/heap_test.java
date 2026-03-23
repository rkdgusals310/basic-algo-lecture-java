import java.util.*;

public class heap_test {

    static int[] heap = new int[100005];
    static int sz = 0; // heap에 들어있는 원소의 수

    static void push(int x) { // 값을 넣는 함수

    }

    static int top() { // 최솟값을 반환하는 함수
        return 0;
    }

    static void pop() { // 최솟값을 제거하는 함수

    }

    static void test() {
        push(10); push(2); push(5); push(9); // {10, 2, 5, 9}
        System.out.println(top()); // 2
        pop(); // {10, 5, 9}
        pop(); // {10, 9}
        System.out.println(top()); // 9
        push(5); push(15); // {10, 9, 5, 15}
        System.out.println(top()); // 5
        pop(); // {10, 9, 15}
        System.out.println(top()); // 9
    }

    public static void main(String[] args) {
        test();
    }
}