package perceptron;

public class Point {
	private double[] x; //�������
	private double y; //��������
	
	/**
	 * ���캯��
	 * @param x
	 * @param y
	 */
	Point(double[] x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * ���غ�����
	 * @return this.x
	 */
	public double[] getX() {
		return x;
	}
	
	/**
	 * ����������
	 * @return this.y
	 */
	public double getY() {
		return y;
	}
}

