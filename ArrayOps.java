public class ArrayOps {
    public static void main(String[] args){ 

        
    }
    
    public static int findMissingInt (int [] array) {
       int missingint = 0;
        int[] fullarray = new int[array.length+1];
        for (int i=0; i<fullarray.length;i++)
            fullarray[i]=i;
        for (int i=0; i<fullarray.length;i++)
        {
            if(contains(array, fullarray[i])== false)
            {
                missingint=fullarray[i];
            }
        }
        return missingint;
        
    }

    public static int secondMaxValue(int [] array) {
        int[] array2= new int[array.length-1];
        int maxval = -998;
        int secondmax=-999;
        for (int i=0; i<array.length;i++)
        {
            if(maxval<array[i])
            maxval=array[i];
        }
        int j=0;
        for (int i=0; i<array.length;i++)
        {
            if(array[i]!=maxval)
            {
                array2[j]=array[j];
                j++;
            }
        }
        for (int i=0; i<array2.length;i++)
        {
            if(secondmax<array2[i])
            secondmax=array2[i];
        }

        return secondmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int [] smallarray = array1.length < array1.length ? array1 : array2;
        int [] bigarry = array1.length < array2.length ? array2 : array1;
        for (int i=0;i<bigarry.length;i++)
        {
            if (contains(smallarray, bigarry[i])==false)
            {
                return false;
            }
        }

         return true;
    }

    public static boolean isSorted(int [] array) {
        boolean checkincrease = true;
        boolean checkdecrease = true;
        for(int i=0;i<array.length-1;i++)// checks increase
        {
            if (array[i+1]<array[i])
            checkincrease = false;
        }
        if (array[array.length-2]>array[array.length-1])
            checkincrease=false;
        //
        for(int i=0;i<array.length-1;i++)// checks decrease
        {
            if (array[i+1]>array[i])
            checkdecrease = false;
        }
        if (array[array.length-2]<array[array.length-1])
            checkdecrease=false;

        return (checkdecrease|| checkincrease);
    }
    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
        {
        if (arr[i] == value) 
            {
            return true;
            }
        }
        return false ;
        }

}
