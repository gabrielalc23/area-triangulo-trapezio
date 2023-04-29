import java.util.Scanner;

// Pesquisar como se faz a conta
// Declarar variáveis (Base, altura e resultado)
// Colocar o valor do comprimento do trapézio
// armazenar o comprimento
// Colocar o valor da base
// armazenar o valor da base
// Dividir por dois
// Printar o resultado
class RenomearClasse {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
			
			double altura;
			double baseMaior;
			double baseMenor;
			double resultado;
    
		System.out.printf("Qual a base maior do triangulo? \n\n");
		 baseMaior = teclado.nextDouble();
		 
		System.out.printf("Qual a base menor do Triangulo? \n\n");
		 baseMenor = teclado.nextDouble();
		 
		 System.out.printf("Qual a altura do Triangulo? \n\n");
		  altura = teclado.nextDouble();
		 
		resultado = ((baseMaior + baseMenor)*2) * altura; 
		System.out.printf("a area do trapezio e:"+ resultado);
    		System.exit(0);
		
	}

}
