package Algorithm.Insert;

public class DirectInsert {
    public static void main(String[] args) {

    }
    public static void directInsert(int [] array){
        int i,j,temp;
        for (i=1;i<array.length;i++){
            temp=array[i];
            for (j=i-1;j>-1;j--){
                if(temp<array[j]){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=temp;
        }
    }
}
