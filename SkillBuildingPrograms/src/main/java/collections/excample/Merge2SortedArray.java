package collections.excample;

public class Merge2SortedArray {


	public static void main(String[] args) {
		for(int i: merge(new int[]{1,2,3,4,5}, new int[]{1,2,2,3,4,5,6,7,8,9}))
		{
			System.out.println(i);
		}
	}
	public static int[] merge(int[] a, int[] b) {

		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length)
		{
			if (a[i] < b[j])       
				answer[k++] = a[i++];

			else        
				answer[k++] = b[j++];               
		}

		while (i < a.length)  
			answer[k++] = a[i++];


		while (j < b.length)    
			answer[k++] = b[j++];

		return answer;
	}


}
