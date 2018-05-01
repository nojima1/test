package x;

 interface A { public void print();}
 class SuperClass implements A {
	 public void print() {
		 System.out.println(("super"));
	 }
 }
 class SubClass extends SuperClass{
	 public void method(A a) {
		 a.print();
	 }
 }