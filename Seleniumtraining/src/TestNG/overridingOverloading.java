package TestNG;

public class overridingOverloading {

		public void process(int i, int j) {
			System.out.printf("Processing two integers:%d, %d", i, j);
		}

		public void process(String a) {
			System.out.println("This is Overloading"+a);
		}

		public void process(String[] b) {
			System.out.println("This is Overloading"+b);
		}
	}

	class MathProcessor extends overridingOverloading {

		@Override
		public void process(int i, int j) {
			System.out.println("This is Overriding" + (i + j));
		}

		@Override
		public void process(String[] str) {
			
			System.out.println("This is Overriding" + str);
		}

	}
