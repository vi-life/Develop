package p07_InnerClass;


/**从多层嵌套类中访问外部


一个内部类被嵌套多少层并不重要，它能透明地访问所有它所嵌入的外围类的所有成员，如下所示：
**/

class MNA {
	private void f() {}
	class A {
		private void g() {}
		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}
public class InnerClass匿名内部类5 {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
}

/**可以看到在MNA.A.B中，调用方法g()和f()不需要任何条件（即使它们被定义为private）。
这个例子同时展示了如何从不同的类里面创建多层嵌套的内部类对象的基本语法。
“.new”语法能产生正确的作用域，所以你不必在调用构造器时限定类名。**/