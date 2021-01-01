package com.patern_strategy1;
//import com.patern_strategy.*;

public class Test {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				Personnage [] tabPerson= {new Guerrier(), new Medecin(),new Chirurgien(),new Civil(),
						new Sniper()};
				for ( int i= 0; i< tabPerson.length; i++) {
					System.out.println("Instance de  "+ tabPerson[i].getClass());
				System.out.println("------------------------------------------------------");
				tabPerson[i].combattre();
				tabPerson[i].sedeplacer();
				tabPerson[i].soigner();
				System.out.println();
				}
			}

		}


	


