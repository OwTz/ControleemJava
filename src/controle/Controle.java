package controle;

public class Controle {
	private int volume; private boolean ativo; private int canal;
	
	public Controle() {
		
		setAtivo(true);
		setVolume(0);
		setCanal(0);
		
	}


	private int getVolume() {
		
		return this.volume;
	}


	private void setVolume(int volume) {
		this.volume = volume;
	}


	private boolean isAtivo() {
		return ativo;
	}


	private void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	private int getCanal() {
		return canal;
	}


	private void setCanal(int canal) {
		this.canal = canal;
	}
	
	//* métodos do controle *//
	
	//* sobrecarga do controle ,**/
	public void mudarCanal() {
		if(this.isAtivo() && getCanal() >= 0 ) {
			if(this.getCanal() == 100) {
				this.setCanal(0);
			} else {
				this.setCanal(this.getCanal() +  1);
				System.out.print("o canal foi mudado para: "+this.getCanal());
			}
		}else {
			System.out.print("não foi possível mudar o canal");
		}
	}
	public void mudarCanal(int canal) {
		if(this.isAtivo() && getCanal() >= 0 ) {
			boolean resposta = this.validarCanal(canal);
			if (resposta == true) {
				this.setCanal(canal);
				} else {
				System.out.println("canal não encontrado! ");
				}
			} else {
				System.out.println("erro ");
			}
	}
	public void aumentarVolume() {
		if (this.isAtivo() ) {
			if(this.getVolume() == 0 || this.getVolume() < 100 ) {
				this.volume++;
				System.out.println("o volume foi aumentado para: "+this.getVolume());
			} else {
				System.out.print("o volume não pode ser aumentado");
			}
		} else {
			System.out.print("o volume não pode ser aumentado");
		}
		}
	public void diminuirVolume() {
		if (this.isAtivo() ) {
			
			if(this.getVolume() <= 0 ) {
				System.out.print(" o volume não pode ser diminuido");
			} else {
				this.volume--;
				System.out.print(" o volume foi diminuído para: "+this.getVolume());
			}
		} else {
			System.out.print(" o volume não pode ser diminuido");}
		}
			
			
			
	
	public void desligarControle() {
		this.setAtivo(false);
	}
	public void ligarControle() {
		this.setAtivo(true);
	}
	
	public void status() {
		System.out.println("======== Controle Smart ======== ");
		System.out.println("a tv está : ");
		System.out.println(this.ativo?"ligada":"desligada");
		System.out.println(" o volume está em :  "+this.volume);
		System.out.println("e está no canal: " +this.canal);
		System.out.println("======== Fim do Controle ======== ");
	}
	
	
	public boolean validarCanal(int canal) {
		if(canal >= 0 && canal <= 100) {
			return true;
		} else {
			return false;
		}
	}
}
