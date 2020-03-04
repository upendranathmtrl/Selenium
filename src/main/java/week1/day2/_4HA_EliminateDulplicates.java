package week1.day2;



public class _4HA_EliminateDulplicates {
	public static int removeDuplicateElement(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        temp[j++] = arr[n-1];   
         
        // Changing original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    }
     
    public static void main (String[] args) 
    {
        int arr[] = {1,2,1,22,23,34,44,33,34,22,1,34};
        int length = arr.length, temp=0;
        for (int i = 0; i < length; i++) 
        {
            for (int j = i + 1; j < length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
         
        length = removeDuplicateElement(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
           System.out.print(arr[i]+" ");
    }
}



/*static int input[] = {1,2,1,22,23,34,44,33,34,22,1,34};
public static void main(String[] args) {
	
	int length = input.length;
	int output[] =input;
	for (int i = 0; i < input.length; i++) {
		int start = output[i];
		for (int j = i+1; j < input.length; j++) {
			if(start==input[j]) {
				swap(j,length,output);
			}
		}
	}
	for (int a : output)
		System.out.println(a);
	
}
public static int[] swap(int j, int length, int output[]) {
	//int a,b=0;
	int outputmodified[] = null;
	for (int i = j; i < length-1; i++) {
		if(output[i]!='\0')
			output[i] =output[i+1];
		else
			outputmodified = Arrays.copyOf(output, output.length + 1);	
		//output[length-1]=null;
	}
	return outputmodified;
}*/