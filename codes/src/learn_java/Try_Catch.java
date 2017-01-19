package learn_java;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str = "lili";
			
			System.out.println(str + "µÄÄêÁäÊÇ");
			
			int age = Integer.parseInt("20L");
			
			System.out.println(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program Over");
	}

}
