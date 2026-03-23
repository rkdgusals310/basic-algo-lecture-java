import java.util.*;

public class heap_test_ans {

    static int[] heap = new int[100005];
    static int sz = 0; // heap에 들어있는 원소의 수

    static void push(int x) { // 값을 넣는 함수
			heap[sz+1]=x;
			sz++;
			int idx=sz;
			
			while(idx!=1){
				int par=idx/2;
				if(heap[par]<=heap[idx])break;
				
				int temp=heap[par];
				heap[par]=heap[idx];
				heap[idx]=temp;
				
				idx=par;
			}
			
			
    }

    static int top() { // 최솟값을 반환하는 함수
        return heap[1];
    }

    static void pop() { // 최솟값을 제거하는 함수
		heap[1]=heap[sz];
		sz--;
		
		int idx=1;
		while(2*idx<=(sz)){
			int n1=idx*2;
			int n2=2*idx+1;
			int min_c=n1;
			if(n2<=sz&&heap[n2]<heap[n1]){
				min_c=n2;
			}
			if(heap[idx]<=heap[min_c]){
				break;
			}
			
			int temp=heap[min_c];
			heap[min_c]=heap[idx];
			heap[idx]=temp;
			idx=min_c;
		}
		
		
		
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