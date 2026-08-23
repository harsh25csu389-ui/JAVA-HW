public class ArrayTransformations {
       static void reverseInPlace(int[] values){
            int A=0;
            int B=values.length-1;

        for(int i=0;i<=(values.length/2);i++){
            int temp=values[A];
            values[A]=values[B];
            values[B]=temp;
            A++;
            B--;        
        }
        
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]+",");
        }    
    }

        static int[] reversedCopy(int[] values){
            int []a=new int[values.length];
            for(int i=0;i<values.length;i++){
                a[i]=values[values.length-1-i];
        }
        return a;
    }

        static int removeValue(int[] values, int target){
            int i=0;
            for(int j=0;j<=values.length;j++){
                if(values[j]!=target){
                    values[i]=values[j];
                    i++;
                }
            }
            return i;
        }

        static int[] runningSum(int[] values){
            int tsum=0;
            for(int i=0;i<=values.length;i++){
                tsum+=values[i];
                values[i]=tsum;
            }
            return values;
        }

}
