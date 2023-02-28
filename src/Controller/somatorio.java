package Controller;

public class somatorio {
	public somatorio() {
		super();
	}
	
	public static int soma(int n){
	    if(n == 0)
	        return 0;
	    // 0 é a condição de parada.
	    else
	        return n + soma(n - 1);
	    
	   //A chamada é o N + a soma.
	}

}
