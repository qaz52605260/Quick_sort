import java.util.ArrayList;
import java.util.List;

public class Quick_Sort {
	
	public static void quicksort(int[] array) {
		List<Integer> list=new ArrayList<Integer>();
		for(int n:array) {								//Give the array data to list
			list.add(n);
		}
		list=quicksort(list);
		for(int i=0;i<array.length;++i) {
			array[i]=list.get(i);
			System.out.println(array[i]);
		}
	}
	
	
	public static List<Integer> quicksort(List<Integer> list) {
		if (list.size()<2)//if only one,just return
			return list;
		int pivot=list.get(list.size()/2);              //find the pivot
		list.remove(list.size()/2);                     //delete list's element
		List<Integer> less=new ArrayList<Integer>();    
		List<Integer> greater=new ArrayList<Integer>();
		List<Integer> result=new ArrayList<Integer>();
		for(int n:list) {								//foreach list to n			
			if(n>pivot) {								//Sort
				greater.add(n);
			}
			else 
				less.add(n);
		}
		result.addAll(quicksort(less));					//add and sort less
		result.add(pivot);								
		result.addAll(quicksort(greater));				//add and sort greater
		return result;
		
		
	}
	public static void main(String[] args) {
	
		int[] A= {15,77,62,49,9,2};
		
		quicksort(A);									

		
		/*List<Integer> N=new ArrayList<Integer>();
		N.add(15);
		
		System.out.println(quicksort(N));*/
		
	}
	
}
