package br.estagio.teste;

import javax.swing.JOptionPane;

public class Personagem {

	public static void main(String[] args) {

		String nomeBarbaro = JOptionPane.showInputDialog("Digite o nome do B�rbaro: ");
		int nivelBarbaro = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�vel do B�rbaro ente 1 e 20: "));
		
		if (nivelBarbaro <= 0 || nivelBarbaro > 20) {
			JOptionPane.showMessageDialog(null, "O n�vel n�o est� dentro do intervalo especificado ");
			
		}

		Item itemB = new Item();

		Barbaro barbaro = new Barbaro(nomeBarbaro, nivelBarbaro);
		// Resultados sem nenhuma implementa��o de itens:
		barbaro.getAtack(itemB);
		barbaro.getHP(itemB);
		barbaro.getAttackSpeed(itemB);

		barbaro.levelUp();
		barbaro.addItem(itemB);

		// Resultados com implementa��o de itens:
		barbaro.getAtack(itemB);
		barbaro.getHP(itemB);
		barbaro.getAttackSpeed(itemB);

		// Teste para tentar criar uma lista com mais de 7 itens
		/*
		 * for(int i = 0; i < 6; i++) { barbaro.addItem(itemB); }
		 */

		String nomeCacador = JOptionPane.showInputDialog("Digite o nome do Ca�ador: ");
		int nivelCacador = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�vel do Ca�ador entre 1 e 20: "));
		
		if (nivelCacador <= 0 || nivelCacador > 20) {
			JOptionPane.showMessageDialog(null, "O n�vel n�o est� dentro do intervalo especificado ");
			return;
		}

		Item itemC = new Item();

		Cacador cacador = new Cacador(nomeCacador, nivelCacador);
		// Resultados sem nenhuma implementa��o de itens:
		cacador.getAtack(itemC);
		cacador.getHP(itemC);
		cacador.getAttackSpeed(itemC);

		cacador.levelUp();
		cacador.addItem(itemC);

		// Resultados com implementa��o de itens:
		cacador.getAtack(itemC);
		cacador.getHP(itemC);
		cacador.getAttackSpeed(itemC);

		// Teste para tentar criar uma lista com mais de 7 itens
		/*
		 * for(int i = 0; i < 6; i++) { cacador.addItem(itemB); }
		*/

	}

}
