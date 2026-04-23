class Naive{
    static int[] twoSum(int[] arr, int target){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        int[] result = twoSum(arr, target);
        if(result.length > 0){
            System.out.println("Pair found at indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Pair not found");
        }
    }
}