package com.patern_strategy1;

import com.patern_strategy.*;

public class Civil extends Personnage {
	// le civil ne combat pas 
	public Civil(){
		 this.espritcombatif = new Pacifiste ();
	}
	public Civil(EspritCombatif esprit, Deplacement dep, Soin soin){
		  super(esprit, dep,soin);
	}


}
