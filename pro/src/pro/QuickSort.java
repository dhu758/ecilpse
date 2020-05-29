package pro;

public class QuickSort {
	public static void main(String[] args) {
//		int [] arr={67,700,735,287,830,360,753,332,899,616,990,890,933,975,275
//			    ,707,271,80,409,602,875,813,208,949,183,504,721,494,159,549,
//			    95,818,85,444,703,961,928,193,846,660,433,253,547,436,467,751,
//			    684,284,481,439,12,18,421,4,394,458,829,633,474,359,454,541,
//			    601,471,326,889,345,555,710,614,540,353,795,116,119,133,859,280,413,
//			    689,861,966,709,938,600,190,81,544,406,692,765,179,
//			    32,629,437,804,911,42,836,770};  // 100개인 배열을 선언하고 초기화한다.
		int [] arr= {5,6,21,3,7,10,4,8,2,9};
		qsort(arr,0,arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
		public static void qsort(int[] arr, int start, int end) {
			int l=start;
			int r=end;
			int mid=arr[(l+r)/2];
			if(start>=end) {
				return;
			}
			while(l<r) {
				if(arr[r]==mid) {
					r--;
				}
				if(arr[l]==mid) {
					l++;
				}
				while(arr[l]<mid) {
					l++;
				}
				while(arr[r]>mid) {
					r--;
				}
				if(l<=r) {
					int temp=arr[l];
					arr[l]=arr[r];
					arr[r]=temp;

				}
			}
			if(l>r) { 
				qsort(arr,start,l-1);
				qsort(arr,r+1,end);
				 
			}
		}
	
}
