package com.patern_strategy1;

import com.patern_strategy.*;

public class Medecin extends Personnage {
	// le medecin donne des premiers soins
	public Medecin() {
		this.soin= new PremiereSoin();
	}
	public Medecin(EspritCombatif esprit, Deplacement dep, Soin soin){
		  super(esprit,dep,soin);
	}

}
