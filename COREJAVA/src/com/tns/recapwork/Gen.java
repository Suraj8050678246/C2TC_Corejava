package com.tns.recapwork;

class Gen <T>
{
	T ob;
	Gen (T o)
		{
			ob = o;
		}
		public T getob ()
			{
			return ob;
			}
}
//an object of type T is declared<
//constructor
class Demo
{
	public static void main (String[] args)
	{
		Gen < Integer> iob = new Gen<> (100); //instanceof Integer type Gen Class

		int x = iob.getob ();
		System.out.println (x);

		Gen<String> sob = new Gen<> ("Hello"); //instanceof String type Gen Class
		String str = sob.getob ();
		System.out.println(str);
	}
}