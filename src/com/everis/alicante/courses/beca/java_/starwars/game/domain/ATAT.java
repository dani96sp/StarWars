package com.everis.alicante.courses.beca.java_.starwars.game.domain;

import com.everis.alicante.courses.beca.java_.starwars.game.abstractclasses.EarthMachine;
import com.everis.alicante.courses.beca.java_.starwars.game.utils.FactionEnum;

public class ATAT  extends EarthMachine {

	public ATAT(String id, String pname, Integer power, Integer hp, FactionEnum faction) {
		super();
		this.setPname(pname);
		this.setPower(power);
		this.setId(id);
		this.setHp(hp);
		this.setFaction(faction);
		
	} 
	
}
