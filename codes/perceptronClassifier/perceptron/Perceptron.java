package perceptron;

import java.util.Arrays;
import java.util.ArrayList;

/*
 * 线性可分的感知机
 * 利用随机梯度下降方法求解超平面
 */
public class Perceptron {
	private double[] w; //权重
	private double b; //偏置量
	private ArrayList<Point> arrayList; //训练数据集合
	private double eta; //随机梯度下降方法的学习率
	private int maxIter; //最大迭代次数
	/**
	 * 构造函数
	 * @param arrayLists 点数组
	 * @param eta 学习率参数
	 */
	Perceptron(ArrayList<Point> arrayList, double eta, int maxIter) {
		this.arrayList = arrayList;
		this.eta = eta;
		this.maxIter = maxIter;
		this.w = new double[arrayList.get(0).getX().length];
		this.b = 0;
	}
	
	/**
	 * 构造函数-无学习率参数，默认赋值为1
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
	 * 打印数组
	 * @param array
	 */
	public void printArray(double[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * 判断分类是否成功
	 * 
	 * @return boolean flag:
	 * true: 分类成功
	 * false: 分类失败
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
	 * 计算y*(w*x + b)
	 * @param point 点坐标
	 * @return 
	 */
	private double learnAnswer(Point point) {
		return point.getY() * (dotProduct(w, point.getX()) + b);
	}
	
	/**
	 * 点积
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
	 * 返回权重参数
	 * @return
	 */
	public double[] getW() {
		return this.w;
	}
	
	/**
	 * 返回偏置
	 */
	public double getB() {
		return this.b;
	}
	/**
	 * 更新参数
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
	 * 主函数
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
		System.out.println("分类是否成功: " + flag);
		System.out.println("分类结果: ");
		System.out.println("w: " + Arrays.toString(perception.getW()));
		System.out.println("b: " + perception.getB());
	}

}

