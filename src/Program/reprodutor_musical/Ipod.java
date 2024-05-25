package Program.reprodutor_musical;

public class Ipod implements Reprodutor_Musical{
	@Override
	public void tocar() {
		System.out.println("Tocando musica no Ipod");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica no Ipod");
	}

	@Override
	public void selecionar() {
		System.out.println("Selecionando musica no Ipod");
	}
}
