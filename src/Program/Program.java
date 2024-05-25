package Program;

import Program.aparelho_telefonico.Aparelho_telefonico;
import Program.aparelho_telefonico.Telefone_Portatil;
import Program.classe_iphone.Iphone;
import Program.navegador_na_internet.Safari;
import Program.navegador_na_internet.Navegador_Na_Internet;
import Program.reprodutor_musical.Ipod;
import Program.reprodutor_musical.Reprodutor_Musical;

public class Program {

	public static void main(String[] args) {
		//No Java não tem multipla herança , então as interfaces se fazem necesarias.
		Iphone iphone = new Iphone();
		
		//Graças a inteface a Classe iphone pode ter o comportamentos das outras classes
		System.out.println("Iphone desempenha a função das outras 3 classes:");
		Reprodutor_Musical reprodutor =  iphone;
		Aparelho_telefonico telefone = iphone;
		Navegador_Na_Internet navegador = iphone;
		
		
		//O reprodutor02 pode ser instanciado pelo Ipod porque a classe Ipod faz parte de Reprodutor_Musical
		Reprodutor_Musical reprodutor02 =  new Ipod();
		
		
		reprodutor.tocar();
		telefone.atender();
		navegador.adicionarNovaAba();
		
		System.out.println("\nIpod:");
		Ipod ipod = new Ipod();
		ipod.tocar();
		
		System.out.println("\nSafari:");
		Safari safari = new Safari();
		safari.adicionarNovaAba();
		
		
		
	
	}

}
