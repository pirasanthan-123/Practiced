class practice{
    public static void main(String args[] ){
        int[] arr = {1,5,2,8,-1,0,5,9};

        int target = 12;
        System.out.print(linearSearch(arr,target));
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
