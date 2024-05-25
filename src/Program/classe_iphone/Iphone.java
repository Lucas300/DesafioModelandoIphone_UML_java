package Program.classe_iphone;

import Program.aparelho_telefonico.Aparelho_telefonico;
import Program.navegador_na_internet.Navegador_Na_Internet;
import Program.reprodutor_musical.Reprodutor_Musical;

public class Iphone implements Reprodutor_Musical,Aparelho_telefonico,Navegador_Na_Internet {

	//Navegador de Internet
	@Override
	public void exibirPagina() {	
		System.out.println("Asta Exibindo a pagina no Iphone");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionou nova aba no Iphone ");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Exibindo a pagina no Iphone");	
	}

	//Aparelho Telefonico
	@Override
	public void ligar() {
		System.out.println("Ligando no Iphone");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo no Iphone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de Voz no Iphone");
	}

	//Reprodutor de musica
	@Override
	public void tocar() {
		System.out.println("Tocando musica no Iphone");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica no Iphone");
	}

	@Override
	public void selecionar() {
		System.out.println("Selecionando musica no Iphone");
	}

}
