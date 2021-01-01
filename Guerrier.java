package com.patern_strategy1;

import com.patern_strategy.*;

public class Guerrier extends Personnage {
	 
	// le guerier il combat  avec un pistolet
	public Guerrier() {
		this.espritcombatif= new CombatPistolet();
	}
	public Guerrier(EspritCombatif esprit,Soin soin,Deplacement dep) {
		super(esprit,dep,soin);
	}

}
