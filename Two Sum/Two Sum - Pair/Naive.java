class Naive{
    static boolean twoSum(int[] arr, int target){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        if(twoSum(arr, target)){
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }
}