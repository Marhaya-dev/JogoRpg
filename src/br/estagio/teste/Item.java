package br.estagio.teste;

import java.util.ArrayList;
import java.util.List;

public class Item {

	public int attackIncrease;
	public int healthIncrease;
	public int attackSpeedIncrease;

	List<Integer> itens = new ArrayList<>();

	public Item() {

	}

	public int getAttackIncrease() {
		return attackIncrease;
	}

	public int getHealthIncrease() {
		return healthIncrease;
	}

	public int getAttackSpeedIncrease() {
		return attackSpeedIncrease;
	}

}
