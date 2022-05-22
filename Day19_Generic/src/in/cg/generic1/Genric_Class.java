package in.cg.generic1;

public class Genric_Class <T>{
	T val;
	void print() {
		System.out.println(val.getClass());
	}

	public static void main(String[] args) {
		Genric_Class <Integer>obj = new Genric_Class<>();//if we give intger here so it can only take intger value;
		obj.val=68;
		obj.print();
	}

}
