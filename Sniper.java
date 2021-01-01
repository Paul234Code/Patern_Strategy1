package com.patern_strategy1;

import com.patern_strategy.*;

public class Sniper extends Personnage {
	// un sniper combat avec un couteau
	public Sniper(){
		   this.espritcombatif= new CombatCouteau();
	}
	public Sniper(EspritCombatif esprit,Deplacement dep, Soin soin) {
		super(esprit, dep,soin);
	}


}
