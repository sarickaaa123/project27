package project27;

public class Zadaca1 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int m,n;
	double rezultat;
	System.out.print("Prviot broj:");
	m=input.nextInt();
	System.out.print("Vtoriot broj:");
	n=input.nextInt();
  while(n==m) {
		System.out.print("Broeviteda bidat razlicni:");
  n=input.nextInt();
}
  if((m:2=0)&&(n:2==0)) {
  if(m>n && n!=0) {
	  rezultat=m/n;
	  System.out.print("Kolicnik parni broevi e:"+rezultat+"/n");
  }
  else if(b>a && a!=0) {
  rezultat=b/a;
  System.out.print("Ne moze da se deli so 0:"+"/n");
  }
  else {
 rezultat=b-a;
 System.out.print("Rezultat na neparni broevi e"+rezultat+"/n");
  }
  }
	else {
	  rezultat=m+n;
	  System.out.print("Zbir paren i neparen broj e:");
  }
	}
}