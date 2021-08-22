package patterns.creational.factorymethod.factoryexample;

import common.IExample;

public class FactoryMethodExample implements IExample {
	
	@Override
	public void explainPattern() {
		System.out.println("O livro do GoF descreve o padr�o Factory Method da seguinte forma: \"O padr�o Factory Method define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar\". Essas f�bricas de cria��o minimizam o uso da palavra-chave \"new\", encapsulam o processo de inicializa��o e as diferentes implementa��es concretas. Al�m disso, essa centraliza��o minimiza o efeito de adicionar e remover classes concretas no sistema e os efeitos das depend�ncias de classes concretas.");
	}
	
	@Override
	public void executeExample() {
		System.out.println("Instancing a Beverage Machine as a CoffeMachine");
		BeverageMachine machine = new CoffeeMachine();
		System.out.println("Now ordering a beverage from the BeverageMachine");
		machine.makeBeverage();
		System.out.println("It makes us a coffee");
		System.out.println("Now instancing a Beverage Machine as a SodaMachine and ordering it a beverage");
		machine = new SodaMachine();
		machine.makeBeverage();
		
		
	}

	@Override
	public void explainExample() {
		System.out.println("Implementa��o do Factory usando uma MaquinaDeBebidas que distribui diferentes tipos de bebidas dependendo da implementa��o das suas subclasses. 1. Implementa��o da classe abstrata MaquinaDeBebidas; Implementa��o da classe concreta MaquinaDeCafe; Implementa��o da classe concreta SoftDrinksMachine; Implementa��o da classe Refrigerante implementando a interface Bebida; A implementa��o anterior mostra como as subclasses da classe abstrata MaquinaDeBebidas determina a bebida que ser� entregue. Isto permite que a classe MaquinaDeBebidas entregue qualquer objeto do tipo Bebida. Cada subclasse da classe abstrata MaquinaDeBebidas determina qual bebida ser� entregue. O mais interessante seria a possibilidade de receber uma determinada bebida e escolher o tipo de bebida a ser retornada de acordo com a bebida. O c�digo abaixo mostra como o m�todo entregaBebiba() recebe um nome de uma bebida e ent�o constr�i e retorna o objeto bebida requisitado.");
	}
}
