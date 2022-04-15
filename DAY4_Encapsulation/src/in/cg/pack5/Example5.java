package in.cg.pack5;

	public class Example5 {
		private int sum=12;
		private int add(int a,int b) 
		{
			return a+b;
		}

		public static void main(String[] args) {
			Example5 ex1 = new Example5();
			System.out.println(ex1.sum);
			System.out.println(ex1.add(12, 13));


		}
	}
