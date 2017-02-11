package learn_java;

import java.util.Iterator;
import java.util.TreeSet;


public class UpdateStu implements Comparable<Object>{
	
	String name;
	long id;
	
	public UpdateStu (String name, long id) {
		this.name = name;
		this.id = id;
	}
	
	public int compareTo(Object o) {
		UpdateStu upstu = (UpdateStu) o;
		int result = id > upstu.id ? 1 :(id == upstu.id ? 0:-1);
		return result;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateStu stu1 = new UpdateStu("��ͬѧ", 101);
		UpdateStu stu2 = new UpdateStu("��ͬѧ", 102);
		UpdateStu stu3 = new UpdateStu("��ͬѧ", 103);
		UpdateStu stu4 = new UpdateStu("��ͬѧ", 100);
		
		TreeSet<UpdateStu> tree = new TreeSet<>();
		
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		
		Iterator<UpdateStu> it = tree.iterator();
		
		System.out.println("Set �����е�����Ԫ�أ�");
		
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		
		System.out.println("Set �����е�ǰ�沿�ֵ�Ԫ�أ�");
		it = tree.headSet(stu2).iterator();
		
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
	}

}
