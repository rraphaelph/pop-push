import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha(3);
		try {
			pilha.pop();
	
		}catch(ArrayIndexOutOfBoundsException e) {
			//tratar
		}catch(Exception e) {
			//tratar
		}

		
	}
	

	

}
