package ch09_2_anonymous;

interface Calculatable{
	public int sum();}

	class Anonymous3 {
		private int field;

		public void method(final int arg1, int arg2) { //묵시적으로 final처리가 되어있음 																																																																																			
			final int var1 = 0;
			int var2 = 0;

			field = 10;

			//		arg1 = 20;
			//		arg2 = 20;
			//		
			//		var1 = 30;
			//		var2 = 30;
			//		


			Calculatable c = new Calculatable() { //인터페이스니까 자동으로 오버라이딩이 생김  			
				@Override
				public int sum() {
					int result = field + arg1 + arg2 + var1 + var2;
					return result;
				}
			};

			System.out.println(c.sum());
		}
	}



	public class AnonymousExample3 {
		public static void main(String[] args) {
			Anonymous3 a = new Anonymous3();
			a.method(0, 0);
		}
	}