package per.practise;

public class MySort {

	// 【冒泡排序】
	public int[] bubble(int[] arr) {
		int size = arr.length;
		if (size > 1) {
			for (int i = 0; i < size; i++) {
				for (int j = 1; j < size - i; j++) {
					if (arr[j - 1] > arr[j]) {
						int tmp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = tmp;
					}
				}
			}
		}
		return arr;
	}

	// 【选择排序】
	public int[] choose(int[] arr) {
		int size = arr.length;

		if (size > 1) {
			for (int i = 0; i < size; i++) {
				int minindex = i;
				for (int j = i; j < size; j++) {
					minindex = arr[j] < arr[minindex] ? j : minindex;
				}
				int tmp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = tmp;
			}
		}
		return arr;

	}

	// 【插入排序】
	public int[] insert(int[] arr) {
		int size = arr.length;
		if (size > 1) {
			for (int i = 1; i < size; i++) {
				for (int j = i; j >= 0; j--) {
					if (arr[j] < arr[j - 1]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					} else {
						break;
					}
				}
			}
		}
		return arr;
	}

	// 【归并排序】
	public void mergesort(int arr[], int left, int right) {
		if (right > left) {
			int mid = (right + left) / 2;
			mergesort(arr, left, mid);
			mergesort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	public void merge(int[] arr, int left, int mid, int right) {
		int size = right - left + 1;
		int[] comb = new int[size];
		int index = 0;
		int lindex = left;
		int rindex = mid + 1;
		if (size > 1) {
			while (lindex <= mid && rindex <= right) {
				if (arr[lindex] < arr[rindex]) {
					comb[index++] = arr[lindex++];
				} else {
					comb[index++] = arr[rindex++];
				}
			}
			while (lindex <= mid) {
				comb[index++] = arr[lindex++];
			}
			while (rindex <= right) {
				comb[index++] = arr[rindex++];
			}
			for (int k = 0; k < size; k++) {
				arr[left + k] = comb[k];
			}
		}
	}

	// 【快速排序】
	// 易错点：基准数如果是极端数的处理方法
	// 只有left在中间时，才会分出左右两个子数组，否则只有一个数组需要排序
	// 子数组如果个数小于2，就不需要排序，小于3，则排一次之后不需要再分割数组
	public void devide(int[] arr, int left, int right) {
		int index = left;
		int size = right - left + 1;
		if (size > 1) {
			for (int i = left + 1; i < right + 1; i++) {
				if (arr[i] < arr[index]) {
					int tmp = arr[i];
					for (int k = i; k > index; k--) {
						arr[k] = arr[k - 1];
					}
					arr[index] = tmp;
					index++;
				}
				for (int j : arr) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			if (size > 2) {
				if (index > left) {
					devide(arr, left, index - 1);
				}
				if (index < right) {
					devide(arr, index + 1, right);
				}
			}
		}
	}
	
	// 二分查找——递归
	// 二分查找的前提是有序数组
	// 易错点递归的值会有多个，比较返回值的大小
	public int halfsearch(int[] arr,int target,int left,int right) {
		int index = -1;
		int size = right - left+1 ;
		if(size > 0) {
			int mid = (left+right)/2;
			if(target < arr[left] || target > arr[right]) {
				return -1;
			}
			if(target == arr[mid]||left==right) {
				return mid;
			}
			if(target < arr[mid]) {
				index = Math.max(halfsearch(arr,target,left,mid), index);
			}
			if(target > arr[mid]) {
				index = Math.max(halfsearch(arr,target,mid+1,right), index);
			}
		}
		return index;
	}
	
	// 二分查找
	public int halffind(int[] arr,int target) {
		int index =  -1;
		int left = 0;
		int right = arr.length - 1;
		int mid = (left+right)/2;
		while(left < right) {
			if(target == arr[mid]) {
				index = mid;
				return index;
			}else if(target > arr[mid]) {
				left = mid + 1;
			}else {
				right = mid;
			}
			mid = (left+right)/2;
		}
		index = left == right?arr[left]:index;
		return index;
	}

	public void showresult(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MySort sort = new MySort();
//		int[] arr = {9,6,4,8,5,7,1,2,3};
		int[] arr = {1,2,3,4,5,6,7,8,9};
//		int[] arr = { 1, 2 };
//		sort.showresult(sort.bubble(arr));
//		sort.showresult(sort.choose(arr));
//		sort.showresult(sort.insert(arr));
//		sort.mergesort(arr,0,arr.length-1);
//		sort.devide(arr, 0, arr.length - 1);
//		sort.showresult(arr);
//		int index = sort.halfsearch(arr, 9, 0, arr.length - 1);
		int index = sort.halffind(arr, 9);
		System.out.println(index);
	}
}
