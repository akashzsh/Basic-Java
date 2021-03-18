public class arraySort{
    public static void main(String[] args){
        int i,j,temp;
        int[] ar = {5,3,2,6,1,12};
        for(i=0;i<ar.length;++i){
            for(j=i+1;j<ar.length;++j){
                if(ar[i]>ar[j]){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for(i=0;i<ar.length;++i){
            System.out.print(ar[i] + " ");
        }   
    }
} 