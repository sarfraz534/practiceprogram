package day1;


  class A
{
	  String name="john";
	  
	int method(int i, int j) {
		return i+j;
	}
}
  class B extends A
{
	  int id=100;
	int method(int i, int j) {
		return i*j;
	}
}
  class C extends B
{
	int method(int i, int j) {
		
		
		return i-j;
	}
	int method2(int i)
	{
		return(i*10);
	}
}
 class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		
		int c=b.method(4, 2);
		System.out.println(c);
		B b1=new C();
		int c1=b1.method(4, 2);
		System.out.println(c1);
	}

}
