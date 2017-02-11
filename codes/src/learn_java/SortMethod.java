package learn_java;

public class SortMethod {

	
	/**
	 * 插入排序——直接插入排序Straight Insertion Sort
	 * 将一个记录插入已经排序号的有序表中，从而得到一个新的表。
	 * 即：先将序列的第一个记录看成是一个有序的子序列，然后从第2个记录逐个进入插入，直到整个序列有序为止。
	 * 
	 * 要点：设置哨兵，作为临时存储和判断数组边界之用
	 * 
	 * @param array 待排序的数组
	 * @return arraySorted 排序后的素质
	 * @author Owen
	 */
	
	public void insertSort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			int j = i-1;
			int num = array[i];
			
			while (j >= 0 && array[j] > array[i]) {
				array[j+1] = array[j];	
				j--;
				}
			array[j+1] = num;
		}
	}
	
	/**
	 * 选择排序
	 * 基本思想：在要排序的数组中，选择最小的一个数字与第一个文职的数字交换，
	 * 然后在剩下的数中再找最小的一个与第二个位置的数交换，以此类推
	 */
	public void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int indMin = i;			
			for (int j = i+1; j < array.length; j ++) {
				if (array[j] < array[indMin]) 
					indMin = j;
			}
			
			// 交换下标为i和indMin的值
			int temp = array[i];
			array[i] = array[indMin];
			array[indMin] = temp;	
		}
	}
	
	
	/**
	 * 二元选择排序
	 * 基本思想：一趟循环中找出最小值和最大值，放在序列的头部和尾部，这样，可以使得循环次数减少一半
	 * @param array
	 */
	public void selectSort2(int[] array) {
		
		int n = array.length;
		
		for (int i = 0; i < n/2; i ++) {
			int max = i;
			int min = i;
			for (int j = i+1; j < n - i; j++) {
				if (array[max] < array[j])
					max = j;
				if (array[min] > array[j])
					min = j;
				}
			int temp = array[n-1-i];
			array[n-1-i] = array[max];
			array[max] = temp;
			
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			
//			printArray(array);
		}
	}
	
	
	/**
	 * 冒泡排序
	 * 
	 * 思想：
	 * 比较相邻的元素，如果第一个比第二个大，就交换它们。
	 * 
	 * 
	 */
	
	/**
	 * 数组打印
	 * 
	 * @param array
	 * @author Owen
	 */
	public void printArray(int[] array) {
		System.out.print("The array: ");
		System.out.print("[");
		
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println(array[array.length-1] + "]");
	}
	
	
	/**
	 * 主函数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortMethod sortMeth = new SortMethod();
		int[] array = {3, 1, 2, 5, 29, 7};
		sortMeth.printArray(array);
//		sortMeth.insertSort(array);
		sortMeth.selectSort2(array);
		sortMeth.printArray(array);
		
	}

}
