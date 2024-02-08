package Abstract;

public class AbstractionTest {
	
	public static void main(String[] args) {
		
		Students Jennifer = new UnderGrad("Jennifer", 25, " Police Officer", 2000);
		Students Jon = new Grad("Jon", 35, "Computer Science", 3600);
		
		Jennifer.showCommonInfo();
		System.out.println(Jennifer.getDetailInfo());
		
		System.out.println(Jennifer.getPaymnetInfo() + " is amount remaining in your account");
		System.out.println(Jon.getPaymnetInfo() + " is amount remaining in your account");
	}
}
