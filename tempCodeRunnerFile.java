 public static swap(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int[] temp = new int[n];
                temp[i] = arr[i];
                arr[i] = arr[j];
                arr[j] = temp[i];
            }
        }
    }