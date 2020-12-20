package br.estagio.teste;

import javax.swing.JOptionPane;

public class Personagem {

	public static void main(String[] args) {

		String nomeBarbaro = JOptionPane.showInputDialog("Digite o nome do Bárbaro: ");
		int nivelBarbaro = Integer.parseInt(JOptionPane.showInputDialog("Digite o nível do Bárbaro ente 1 e 20: "));
		
		if (nivelBarbaro <= 0 || nivelBarbaro > 20) {
			JOptionPane.showMessageDialog(null, "O nível não está dentro do intervalo especificado ");
			
		}

		Item itemB = new Item();

		Barbaro barbaro = new Barbaro(nomeBarbaro, nivelBarbaro);
		// Resultados sem nenhuma implementação de itens:
		barbaro.getAtack(itemB);
		barbaro.getHP(itemB);
		barbaro.getAttackSpeed(itemB);

		barbaro.levelUp();
		barbaro.addItem(itemB);

		// Resultados com implementação de itens:
		barbaro.getAtack(itemB);
		barbaro.getHP(itemB);
		barbaro.getAttackSpeed(itemB);

		// Teste para tentar criar uma lista com mais de 7 itens
		/*
		 * for(int i = 0; i < 6; i++) { barbaro.addItem(itemB); }
		 */

		String nomeCacador = JOptionPane.showInputDialog("Digite o nome do Caçador: ");
		int nivelCacador = Integer.parseInt(JOptionPane.showInputDialog("Digite o nível do Caçador entre 1 e 20: "));
		
		if (nivelCacador <= 0 || nivelCacador > 20) {
			JOptionPane.showMessageDialog(null, "O nível não está dentro do intervalo especificado ");
			return;
		}

		Item itemC = new Item();

		Cacador cacador = new Cacador(nomeCacador, nivelCacador);
		// Resultados sem nenhuma implementação de itens:
		cacador.getAtack(itemC);
		cacador.getHP(itemC);
		cacador.getAttackSpeed(itemC);

		cacador.levelUp();
		cacador.addItem(itemC);

		// Resultados com implementação de itens:
		cacador.getAtack(itemC);
		cacador.getHP(itemC);
		cacador.getAttackSpeed(itemC);

		// Teste para tentar criar uma lista com mais de 7 itens
		/*
		 * for(int i = 0; i < 6; i++) { cacador.addItem(itemB); }
		*/

	}

}
