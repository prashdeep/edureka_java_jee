package com.edureka.java_jee_module_4.access_modifiers;

public class PublicAccessRun extends PublicAccessModifier {

	public static void main(String[] args) {
		PublicAccessModifier pb = new PublicAccessModifier();
		pb.setX(10);
		pb.setData("Data");
		System.out.println(pb.getData());
		pb.print();

	}
}
