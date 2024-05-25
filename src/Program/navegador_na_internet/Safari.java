package Program.navegador_na_internet;

public class Safari implements Navegador_Na_Internet{
	@Override
	public void exibirPagina() {	
		System.out.println("Asta Exibindo a pagina Safari");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionou nova aba no Safari");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Exibindo a pagina no Safari");	
	}
}
