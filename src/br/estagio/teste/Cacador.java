package br.estagio.teste;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Cacador {

	private int nivel;
	private int baseAtaque = 192;
	private int basePontosVida = 1324;
	private double baseVelocidadeAtaque = 1.5;
	private double bonus;
	
	DecimalFormat decimal = new DecimalFormat( "0.00" );

	public Cacador(String nome, int nivel) {
		this.nivel = nivel;
	}

	public void levelUp() {
		if (nivel >= 0 && nivel < 20) {
			nivel += 1;
			JOptionPane.showMessageDialog(null, "Você subiu de nível!\n" + "Nível atual: " + nivel);
		} else {
			JOptionPane.showMessageDialog(null, "Você está no nível máximo 20");
		}
	}

	public void getAtack(Item item) {
		double atack = baseAtaque + (21 * nivel) + item.getAttackIncrease();
		JOptionPane.showMessageDialog(null, "O ataque total do personagem é: " + decimal.format(atack));
	}

	public void getHP(Item item) {
		double hp = basePontosVida + (74 * nivel) + item.getHealthIncrease();
		JOptionPane.showMessageDialog(null, "Os pontos de vida totais do personagem é: " + decimal.format(hp));
	}

	public void getAttackSpeed(Item item) {
		bonus = 0;
		for (int i = 1; i <= this.nivel; i++) {
			bonus += 0.05 * baseVelocidadeAtaque;
		}
		double attackSpeed = bonus + item.getAttackSpeedIncrease();
		JOptionPane.showMessageDialog(null, "Os pontos de velocidade de ataque total do personagem é: " + decimal.format(attackSpeed));
	}

	public void addItem(Item item) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(
					"Adicionar Item\n" + 
					"Digite o número da habilidade desejada: \n" + 
					"1 - Attack Increase\n" + 
					"2 - Health Increase\n" + 
					"3 - Attack Speed Increase\n"
					));
		if (item.itens.size() <= 6) {
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
				JOptionPane.showMessageDialog(null, "item inexistente");
				addItem(item);
			}

		} else {
			JOptionPane.showMessageDialog(null, "A lista não pode conter mais de 6 itens");
		}

	}

}
