import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//import com.sun.tools.javac.util.List;

public class APIsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//quais são as APIs do JAVA que representam Listas Dinâmicas, Filas e Pilhas?
		//Listas: List
		//Filas: Queue
		//Pilhas: Stack
		
		//////////////////////// * Lista
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		//Adicionar
		listaDeProdutos.add(new Produto("Camisa", 13.2));
		listaDeProdutos.add(new Produto("Bermuda", 15.8));
		listaDeProdutos.add(new Produto("Blusa", 16));
		System.out.println(listaDeProdutos.toString());
		
		//Remover por index
		listaDeProdutos.remove(1);
		System.out.println(listaDeProdutos.toString());
		
		//Tamanho da lista
		System.out.println("Qtd de elementos na Lista: "+listaDeProdutos.size());
		
		//////////////////////// * Fila Queue
		Queue<Produto> filaDeProdutos = new LinkedList<Produto>();
		
		//Adicionar
		filaDeProdutos.add(new Produto("Arroz", 5.50));
		filaDeProdutos.add(new Produto("Feijao", 10.70));
		filaDeProdutos.add(new Produto("Carne", 10.70));
		System.out.println(filaDeProdutos.toString());
		
		//Remove primeiro elemento da fila
		filaDeProdutos.poll();
		System.out.println(filaDeProdutos.toString());
		
		//Tamanho da Fila
		System.out.println("Qtd de elementos na Fila: "+filaDeProdutos.size());
		filaDeProdutos.size();
		
		////////////////////////* Pilha Stack
		Stack<Produto> pilhaDeProdutos = new Stack<Produto>();
		
		//Adicionar
		pilhaDeProdutos.push(new Produto("Tenis", 2.10));
		pilhaDeProdutos.push(new Produto("Sapato", 10.30));
		pilhaDeProdutos.push(new Produto("Bota", 6.20));
		System.out.println(pilhaDeProdutos.toString());
		
		//Remover elemento da pilha
		pilhaDeProdutos.pop();
		System.out.println(pilhaDeProdutos.toString());
		
		// ver tamanho da pilha
		System.out.println("Qtd de elementos na Pilha: "+pilhaDeProdutos.toString());
		
		//Ver ultimo da pilha
		System.out.println(pilhaDeProdutos.peek());
		pilhaDeProdutos.peek();

	}

}
