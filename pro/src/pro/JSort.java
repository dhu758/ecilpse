package pro;

import java.util.Arrays;

public class JSort {
	
	public static void BubbleSort(int []n) {
		int temp;
		for(int i=0; i<n.length-1; i++) {
			for(int j=0; j<n.length-i-1; j++) {
				if(n[j]>n[j+1]) {
					temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
	}

	public static int QuickSort(int[] arr) {
		// TODO Auto-generated method stub
		int l=0,r=0,start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		int midd=arr[(start+end)/2];
		int left=start, right=end;
		if(arr.length==1) {
		}
		else if(arr.length==2) {
			if(arr[0]>arr[1]) {
				int tempp=arr[0];
				arr[0]=arr[1];
				arr[1]=tempp;
			}
		}
		else if(arr.length>2) {
			while(arr.length>2) {
				for(int i=left; i<=end; i++) {
					if(arr[i]>=midd) {
						
						break;
					}
					left++;
				}
				for(int j=right; j>=start; j--) {
					if(arr[j]<=midd) {
						
						break;
					}
					right--;
				}
				if(left>right&&arr[left]>arr[right]) {
					break;
				}
				if(arr[left]>=arr[right]) {
					int temp=arr[left];
					arr[left]=arr[right];
					arr[right]=temp;
					l=left;
					r=right;
					if(arr[left]==midd) {
						left++;
					}
					else if(arr[right]==midd) {
						right--;
					}
				}
			}
			if(left>=right) {
				int[] a=new int[arr.length];
				int[] b=new int[arr.length];
				System.arraycopy(arr, 0, a, 0, arr.length);
				Arrays.sort(a);
				if(Arrays.equals(a,arr)) {
					return 0;
				}
				int[] arr1=new int[right+1];
				int[] arr2=new int[end-left+1];
				for(int i=0; i<=right; i++) {
					arr1[i]=arr[i];
				}
				int index=0;
				for(int j=left; j<=end; j++) {
					arr2[index]=arr[j];
					index++;
				}
				QuickSort(arr1);
				QuickSort(arr2);

				System.arraycopy(arr1, 0, arr, 0, arr1.length);
				System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
			}
		}
		return 0;
	}
	
	public static void print(int []n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}
