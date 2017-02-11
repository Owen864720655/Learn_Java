package perceptron;

import java.util.Arrays;
import java.util.ArrayList;

/*
 * ���Կɷֵĸ�֪��
 * ��������ݶ��½�������ⳬƽ��
 */
public class Perceptron {
	private double[] w; //Ȩ��
	private double b; //ƫ����
	private ArrayList<Point> arrayList; //ѵ�����ݼ���
	private double eta; //����ݶ��½�������ѧϰ��
	private int maxIter; //����������
	/**
	 * ���캯��
	 * @param arrayLists ������
	 * @param eta ѧϰ�ʲ���
	 */
	Perceptron(ArrayList<Point> arrayList, double eta, int maxIter) {
		this.arrayList = arrayList;
		this.eta = eta;
		this.maxIter = maxIter;
		this.w = new double[arrayList.get(0).getX().length];
		this.b = 0;
	}
	
	/**
	 * ���캯��-��ѧϰ�ʲ�����Ĭ�ϸ�ֵΪ1
	 * @param arrayLists
	 */
	Perceptron(ArrayList<Point> arrayList) {
		this.arrayList = arrayList;
		this.eta = 1;
		this.maxIter = 1000;
		this.w = new double[arrayList.get(0).getX().length];
		this.b = 0;
	}
	
	/**
	 * ��ӡ����
	 * @param array
	 */
	public void printArray(double[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * �жϷ����Ƿ�ɹ�
	 * 
	 * @return boolean flag:
	 * true: ����ɹ�
	 * false: ����ʧ��
	 */
	private boolean classify() {
		boolean flag = false;
		int iter = 0;
		while (!flag && iter <= maxIter) {
			for (int i = 0; i < arrayList.size(); i++) {
				if (learnAnswer(arrayList.get(i)) <= 0) {
					updateParams(arrayList.get(i));
					break;
				}
				if (i == (arrayList.size() - 1)) {
					flag = true;
				}
			}
			iter++;		
		}
		return flag;
	}
	
	/**
	 * ����y*(w*x + b)
	 * @param point ������
	 * @return 
	 */
	private double learnAnswer(Point point) {
		return point.getY() * (dotProduct(w, point.getX()) + b);
	}
	
	/**
	 * ���
	 * @param x1
	 * @param x2
	 * @return
	 */
	private double dotProduct(double[] x1, double[] x2) {
		int len = x1.length;
		double sum = 0;
		for (int i = 0; i < len; i++) {
			sum += x1[i] * x2[i];
		}
		return sum;
	}
	
	/**
	 * ����Ȩ�ز���
	 * @return
	 */
	public double[] getW() {
		return this.w;
	}
	
	/**
	 * ����ƫ��
	 */
	public double getB() {
		return this.b;
	}
	/**
	 * ���²���
	 * @param point
	 */
	private void updateParams(Point point) {
		for (int i = 0; i < w.length; i++) {
			w[i] += eta * point.getY() * point.getX()[i];
		}
		b += eta * point.getY();
		return;
	}
	
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(new double[] { 3, 3 }, 1);
		Point p2 = new Point(new double[] { 4, 3 }, 1);
		Point p3 = new Point(new double[] { 1, 1 }, -1);
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Perceptron perception = new Perceptron(list, 0.8, 15);
		boolean flag = perception.classify();
		System.out.println("�����Ƿ�ɹ�: " + flag);
		System.out.println("������: ");
		System.out.println("w: " + Arrays.toString(perception.getW()));
		System.out.println("b: " + perception.getB());
	}

}

