package dio.com;

import com.dio.manual.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		Livros livros = new Livros();
		Gato gato = new Gato("Dean", "Gray", 10);
				
		System.out.println(livros);
		System.out.println(gato);
	}
}

class Livros {
}
