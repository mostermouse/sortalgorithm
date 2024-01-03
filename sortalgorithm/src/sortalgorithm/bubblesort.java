package sortalgorithm;


public class bubblesort {
    public int[] bubblesort(boolean desc,int[] num){
        int tmp;
        if(desc){ //오름차순 정렬
            for(int i=0;i<num.length;i++){
                for(int j=0;j<num.length-i-1;j++){
                    if(num[j+1]<num[j]){
                        tmp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=tmp;
                    }
                }
            }
        }else{ //내림차순 정렬
            for(int i=0;i<num.length;i++){
                for(int j=0;j<num.length-i-1;j++){
                    if(num[j+1]>num[j]){
                        tmp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=tmp;
                    }
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {

        int[] num = {1, 6, 4, 2, 3, 5};
        bubblesort bubble = new bubblesort();

        for(int n:bubble.bubblesort(true,num)) System.out.print(" "+n);
        System.out.println();
        for(int n:bubble.bubblesort(false,num)) System.out.print(" "+n);
    }
}