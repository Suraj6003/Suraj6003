import java.until.;

public class PrimeCheck {
public static void main(String[] args) {
int num, i, count = 0;
Scanner sc = new Scanner(system.in);

System.out.print("Enter a number.");
num = sc.nextlnt();

for (I=2; I<num; I++) {
if(num%I==0) {
count++;
break;
}
}
if(count==0)
System.out.println("\nlt is a prim number.");
else
System.out.println("nlt is a not prime number");
}
}
