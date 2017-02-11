package learn_java;

public class SortMethod {

	
	/**
	 * �������򡪡�ֱ�Ӳ�������Straight Insertion Sort
	 * ��һ����¼�����Ѿ�����ŵ�������У��Ӷ��õ�һ���µı�
	 * �����Ƚ����еĵ�һ����¼������һ������������У�Ȼ��ӵ�2����¼���������룬ֱ��������������Ϊֹ��
	 * 
	 * Ҫ�㣺�����ڱ�����Ϊ��ʱ�洢���ж�����߽�֮��
	 * 
	 * @param array �����������
	 * @return arraySorted ����������
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
	 * ѡ������
	 * ����˼�룺��Ҫ����������У�ѡ����С��һ���������һ����ְ�����ֽ�����
	 * Ȼ����ʣ�µ�����������С��һ����ڶ���λ�õ����������Դ�����
	 */
	public void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int indMin = i;			
			for (int j = i+1; j < array.length; j ++) {
				if (array[j] < array[indMin]) 
					indMin = j;
			}
			
			// �����±�Ϊi��indMin��ֵ
			int temp = array[i];
			array[i] = array[indMin];
			array[indMin] = temp;	
		}
	}
	
	
	/**
	 * ��Ԫѡ������
	 * ����˼�룺һ��ѭ�����ҳ���Сֵ�����ֵ���������е�ͷ����β��������������ʹ��ѭ����������һ��
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
	 * ð������
	 * 
	 * ˼�룺
	 * �Ƚ����ڵ�Ԫ�أ������һ���ȵڶ����󣬾ͽ������ǡ�
	 * 
	 * 
	 */
	
	/**
	 * �����ӡ
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
	 * ������
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
