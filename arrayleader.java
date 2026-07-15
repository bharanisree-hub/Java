class leader {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
        
        if(leader){
            a.add(arr[i]);
        }
        }
        return a;
    }
}
