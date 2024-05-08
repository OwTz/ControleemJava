package controle;
import controle.Controle;
public class Iniciarcontrole {

	public static void main(String[] args) {
		Controle controle = new Controle();
		controle.ligarControle();
		controle.aumentarVolume();
		controle.mudarCanal(102);
		controle.status();

	}

}
