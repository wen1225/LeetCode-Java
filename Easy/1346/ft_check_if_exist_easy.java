class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length < 2 || arr.length > 500)
            return false;
        else{
            for (int i = arr.length-1; i >= 0; i--){
                for (int j = 0; j < arr.length; j++){
                    if (2*arr[j] == arr[i] && i != j)
                        return true;
                }
            }
            return false;
        }
    }
}
