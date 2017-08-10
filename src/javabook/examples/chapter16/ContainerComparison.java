package javabook.examples.chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Sphere " + id;}
}

public class ContainerComparison {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for (int i = 0; i < 5; i++) 
			spheres[i] = new BerylliumSphere();		
		System.out.println(Arrays.toString(spheres));	
		
		List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
		for (int i = 0; i < 5; i++)
			sphereList.add(new BerylliumSphere());
		System.out.println(sphereList);
	}

}
