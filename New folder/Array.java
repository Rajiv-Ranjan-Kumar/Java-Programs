class Array{
    public static void main(String args[]){
        String [][] a = {{"Ankit","Ram","Karan"},{"Rahul","Babu","praksh"},{"Vikash","Bantu","Santu"}};
        for(int i = 0; i < a.length ; i++){
            for(int j = 0; j < a[i].length ; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}