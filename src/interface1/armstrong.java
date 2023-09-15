package interface1;
 public class armstrong{
public  static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int num = 370, number,temp,total=0;
	
     number = num;
     while (number != 0)
     {
    	 temp=number %10;
    	 total=total+temp*temp*temp;
    	 number /=10;
     }
     if (total==num)
    	 System.out.println(num+"is a Armstrong number");
     else
    	 System.out.println(num+"is not a Armstrong number");
}

}
