package com.patern_strategy1;

import com.patern_strategy.*;


public abstract class Personnage {
	protected EspritCombatif espritcombatif = new Pacifiste();
	protected Deplacement deplacement = new Marcher();
	protected Soin soin = new AucunSoin();
	
	// constructeur par defaut
	Personnage(){
		
	}

	/**
	 * @param espritcombatif
	 * @param deplacement
	 * @param soin
	 */
	public Personnage(EspritCombatif espritcombatif, Deplacement deplacement, Soin soin) {
		super();
		this.espritcombatif = espritcombatif;
		this.deplacement = deplacement;
		this.soin = soin;
	}
	// methodes de deplacement personnage
	public void sedeplacer() {
		// on utilise les objects de deplacement de facon polymorphe
		deplacement.deplacer();
		
	}
	// methodes que les combatants utilisent
	public void combattre() {
		// on utilse les objects de combat de facon polymorphe
		espritcombatif.combat();
		
	}
	// methodes que les soignant utilisent
	public void soigner() {
		// on utilse nos objects polymorphe
		soin.soigne();
	}

	public EspritCombatif getEspritcombatif() {
		return espritcombatif;
	}

	public Deplacement getDeplacement() {
		return deplacement;
	}

	public Soin getSoin() {
		return soin;
	}

	public void setEspritcombatif(EspritCombatif espritcombatif) {
		this.espritcombatif = espritcombatif;
	}

	public void setDeplacement(Deplacement deplacement) {
		this.deplacement = deplacement;
	}

	public void setSoin(Soin soin) {
		this.soin = soin;
	}

}
