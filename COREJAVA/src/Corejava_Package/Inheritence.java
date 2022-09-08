package Corejava_Package;
class withdraw //base class
{
	int amt_withdraw=2000;//parent class data member
}

public class Inheritence extends withdraw {//child class
	int amt_left=5000;//child class member
	public static void main(String[] args) {
		Inheritence ob1= new Inheritence();//always create an object of child class
		System.out.println("amount withdraw ="+ ob1.amt_withdraw);
	}

}
