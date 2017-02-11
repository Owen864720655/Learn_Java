package perceptron;

public class Point {
	private double[] x; //点横坐标
	private double y; //点纵坐标
	
	/**
	 * 构造函数
	 * @param x
	 * @param y
	 */
	Point(double[] x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 返回横坐标
	 * @return this.x
	 */
	public double[] getX() {
		return x;
	}
	
	/**
	 * 返回纵坐标
	 * @return this.y
	 */
	public double getY() {
		return y;
	}
}

