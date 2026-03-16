public class array_test_ans {
	static int len;
    static void insert(int idx, int num, int[] arr) {
		if(len-1>=idx){
			for(int i=len-1;i>=idx;i--){
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
		arr[idx]=num;
		len+=1;

    }

    static void erase(int idx, int[] arr) {
    	for(int i=idx+1;i<len;i++) {
    		int temp=arr[i-1];
    		arr[i-1]=arr[i];
    		arr[i]=temp;
    	}
    	len--;
    		
    }

    static void printArr(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    static void insertTest() {
        System.out.println("***** insert_test *****");
        int[] arr = {10, 20, 30, 0, 0, 0, 0, 0, 0, 0};
        len = 3;

        insert(3, 40, arr);
        printArr(arr, len);

        insert(1, 50, arr);
        printArr(arr, len);

        insert(0, 15, arr);
        printArr(arr, len);
    }

    static void eraseTest() {
        System.out.println("***** erase_test *****");
        int[] arr = {10, 50, 40, 30, 70, 20, 0, 0, 0, 0};
        len = 6;

        erase(4, arr);
        printArr(arr, len);

        erase(1, arr);
        printArr(arr, len);

        erase(3, arr);
        printArr(arr, len);
    }

    public static void main(String[] args) {
        insertTest();
        eraseTest();
    }
}