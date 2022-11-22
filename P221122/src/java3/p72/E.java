package java3.p72;

public class E {
	void method() {
		class F{
			F(){}
			int field1;	//인스턴스 필드
			//static int field2; // 정적 필드(X)
			void method1() {
				System.out.println("class E - method() - class F - method1()");
			}
			//static void method2(){}	//정적 메소드(X0
		}
		
		F f = new F();
		f.field1 = 7;
		System.out.println("f.field1 : " + f.field1);
		f.method1();
	}
}
