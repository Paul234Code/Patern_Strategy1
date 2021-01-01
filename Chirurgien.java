package com.patern_strategy1;

import com.patern_strategy.*;

public class Chirurgien extends Personnage {
	// le chirurgien fait des operations
	 public Chirurgien(){
		this.soin= new Operation();
	}
	public Chirurgien(EspritCombatif esprit, Deplacement dep, Soin soin){
		  super(esprit,dep,soin);
	}
	

}
