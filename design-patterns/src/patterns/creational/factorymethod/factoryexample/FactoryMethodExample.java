package patterns.creational.factorymethod.factoryexample;

import common.IExample;

public class FactoryMethodExample implements IExample {
	
	@Override
	public void explainPattern() {
		System.out.println("O livro do GoF descreve o padrão Factory Method da seguinte forma: \"O padrão Factory Method define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar\". Essas fábricas de criação minimizam o uso da palavra-chave \"new\", encapsulam o processo de inicialização e as diferentes implementações concretas. Além disso, essa centralização minimiza o efeito de adicionar e remover classes concretas no sistema e os efeitos das dependências de classes concretas.");
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
		System.out.println("Implementação do Factory usando uma MaquinaDeBebidas que distribui diferentes tipos de bebidas dependendo da implementação das suas subclasses. 1. Implementação da classe abstrata MaquinaDeBebidas; Implementação da classe concreta MaquinaDeCafe; Implementação da classe concreta SoftDrinksMachine; Implementação da classe Refrigerante implementando a interface Bebida; A implementação anterior mostra como as subclasses da classe abstrata MaquinaDeBebidas determina a bebida que será entregue. Isto permite que a classe MaquinaDeBebidas entregue qualquer objeto do tipo Bebida. Cada subclasse da classe abstrata MaquinaDeBebidas determina qual bebida será entregue. O mais interessante seria a possibilidade de receber uma determinada bebida e escolher o tipo de bebida a ser retornada de acordo com a bebida. O código abaixo mostra como o método entregaBebiba() recebe um nome de uma bebida e então constrói e retorna o objeto bebida requisitado.");
	}
}
