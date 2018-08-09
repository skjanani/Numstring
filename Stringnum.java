package janani;
import java.util.Scanner;
public class Stringnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
int i,l;
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.next();
char []a=str.toCharArray();
l=a.length;
for(i=0;i<l;i++){
	if(a[i]>='0' && a[i]<='9'){
		System.out.print(a[i]);
	}
}
	}

}
