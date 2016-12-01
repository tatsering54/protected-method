class Customer
{
	private String cname;
	private int damount;
	private int anumber;
	private String result;
	
	public Customer()
	
	{
		System.out.print("Enter the Name :");
		this.cname = System.console().readLine();

		System.out.print("Enter Account Number  : ");
		this.anumber = Integer.parseInt(System.console().readLine());
		
		System.out.print("Enter the Deposited Amount : ");
		this.damount = Integer.parseInt(System.console().readLine());
	}

	public void setCname(String cname){this.cname = cname;}
	public String getCname(){return this.cname;}
	public void setDamount(int damount){this.damount = damount;}
	public int getDamount(){return this.damount;}
	public void setResult(String result){this.result = result;}
	public String getResult(){return this.result;}

class Accountant
{
	public void calculateResult(Customer cust)
	{
		if(cust.getDamount() >= 250) cust.setResult("Amount is Deposited");
		else cust.setResult(" Over limit ");
	}

}

class Banker
{

	public static void main(String[] args)
	
	{
	
	   Customer cust = new Customer();
	
	System.out.println(" Customer "+cust.getCname()+"Account Number :" + cust.getAnumber());
	System.out.print("Enter the Amount to deposited");
	int damount = Integer.parseInt(System.console().readLine());
	cust.setDamount(damount);
	
	Accountant acc = new Accountant();
	acc.calculaterResult(cust);
	
	System.out.println( "Deposited status :" + cust.getResult());
	}
   
  }
}

