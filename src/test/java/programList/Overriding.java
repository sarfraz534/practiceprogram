package programList;


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
		B bb=new B();
		
		int b1=bb.method(4, 2);
		System.out.println(b1);
		//overridden
		B b=new C();
		int c1=b.method(4, 2);
		System.out.println(c1);
		
		C cc=new C();
		System.out.println(cc.method(4,2));
		System.out.println(cc.method2(10));
	}

}
