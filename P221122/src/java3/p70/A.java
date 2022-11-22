package java3.p70;

public class A {
	class B {
		B() {
		} // 생성자

		int field1;

		static int field2; // 정적 필드(X)

		void method1() {
			System.out.println("class B - method1()");
		}

		static void method2() {
		} // 정적 메소드(X)
	}
}
