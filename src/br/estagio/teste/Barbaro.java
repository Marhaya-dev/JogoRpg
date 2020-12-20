package br.estagio.teste;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Barbaro {

	private int nivel;
	private int baseAtaque = 250;
	private int basePontosVida = 1480;
	private double baseVelocidadeAtaque = 1.1;
	private double bonus;
	
	DecimalFormat decimal = new DecimalFormat( "0.00" );

	public Barbaro(String nome, int nivel) {
		this.nivel = nivel;
	}

	public void levelUp() {
		if (nivel < 20) {
			nivel += 1;
			JOptionPane.showMessageDialog(null, "Você subiu de nível!\n" + "Nível atual: " + nivel);
		} else {
			JOptionPane.showMessageDialog(null, "O nível não pode ultrapassar 20");
		}
	}

	public void getAtack(Item item) {
		if (nivel >= 0 && nivel <= 5) {
			this.bonus = 0.05 * item.getAttackIncrease();
		} if (nivel >= 6 && nivel <= 14) {
			bonus = 0.1 * item.getAttackIncrease();
		} if (nivel > 14 && nivel <= 20) {
			bonus = 0.15 * item.getAttackIncrease();
		}

		double atack = (baseAtaque + (23 * nivel) + item.getAttackIncrease() + bonus);

		JOptionPane.showMessageDialog(null, "O ataque total do personagem é: " + decimal.format(atack));
	}

	public void getHP(Item item) {
		double hp = (basePontosVida + (87 * nivel) + item.getHealthIncrease());
		JOptionPane.showMessageDialog(null, "Os pontos de vida total do personagem é: " + decimal.format(hp));
	}

	public void getAttackSpeed(Item item) {
		double attackSpeed = (baseVelocidadeAtaque + (0.03 * nivel) + item.getAttackSpeedIncrease());
		JOptionPane.showMessageDialog(null, "Os pontos de velocidade de ataque total do personagem é: " + decimal.format(attackSpeed));
	}

	public void addItem(Item item) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(
					"Adicionar Habilidade\n" + 
					"Digite o número da habilidade desejada: \n" + 
					"1 - Attack Increase\n" + 
					"2 - Health Increase\n" + 
					"3 - Attack Speed Increase\n"
					));
		if (item.itens.size() < 6) {
			if (num == 1) {
				item.attackIncrease = Integer.parseInt(JOptionPane.showInputDialog("Pontos de incremento de ataque: "));
				item.itens.add(item.attackIncrease);
			} else if (num == 2) {
				item.healthIncrease = Integer.parseInt(JOptionPane.showInputDialog("Pontos de incremento de saúde: "));
				item.itens.add(item.healthIncrease);
			} else if (num == 3) {
				item.attackSpeedIncrease = Integer.parseInt(JOptionPane.showInputDialog("Pontos de incremento de velocidade de ataque: "));
				item.itens.add(item.attackSpeedIncrease);
			} else {
				JOptionPane.showMessageDialog(null, "Habilidade inexistente");
				addItem(item);
			} 

		} else {
			JOptionPane.showMessageDialog(null, "A lista não pode conter mais de 6 itens");
		}

	}

}
