package principal;

public class Contador {

	public static void main(String[] args) {
		int n1=17;
		int n2=5;
		int mayor, menor,cont=0;
		/*mayor=n1>n2?n1:n2;
		menor=n1<n2?n1:n2;
		*/
		if(n1>n2) {
			mayor=n1;
			menor=n2;
		}else {
			mayor=n2;
			menor=n1;
		}
		for(int i=menor;i<=mayor;i++) {
			if(i%2==0) {
				cont++;
			}
		}
		System.out.println(cont);
	}

}
