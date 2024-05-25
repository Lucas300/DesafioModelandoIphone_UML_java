package Program.aparelho_telefonico;

public class Telefone_Portatil implements Aparelho_telefonico {

	@Override
	public void ligar() {
		System.out.println("Ligando via Telefone Portatil");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via Telefone Portatil");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de Voz via Telefone Portatil");
	}

}
