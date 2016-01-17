package package_test;

class scope
{
	private  int a_priv;
	public  int  b_pub;
	protected int c_prot;
	int d_pack;
}


public class test_access_specifier {


	public static void main(String[] args) 
	{
		 scope s1 = new scope();
		 s1.b_pub = 200;
		 s1.c_prot = 250;
		 s1.d_pack = 300;	
 
	}

}
