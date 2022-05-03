package leetcode.easy.explorer;

public class IsThereAnyIndex {

    public boolean checkIfExist(int[] arr) {

        int len = arr.length;

        if(arr.length == 0 || arr ==null){
            return false;
        }

        for(int j = 0; j < len ; j++){
            for(int i = 0; i < len; i++){
                // if(arr[j] == 0){continue;}
                if(arr[j] * 2 == arr[i]){
                    if(j == i){continue;}
                    System.out.println("i = " + i + " j = " + j);
                    return true;
                }
            }
        }

    return false;
    }
}
