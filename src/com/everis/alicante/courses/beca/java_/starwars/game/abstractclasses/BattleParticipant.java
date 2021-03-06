package com.everis.alicante.courses.beca.java_.starwars.game.abstractclasses;

import com.everis.alicante.courses.beca.java_.starwars.game.utils.FactionEnum;

abstract class BattleParticipant {
	
	private String id;
	private String pname;
	private Integer hp;
	private Integer power;
	private FactionEnum faction;
	
	
	public String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	protected void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getHp() {
		return hp;
	}
	protected void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getPower() {
		return power;
	}
	protected void setPower(Integer power) {
		this.power = power;
	}
	public FactionEnum getFaction() {
		return faction;
	}
	protected void setFaction(FactionEnum faction) {
		this.faction = faction;
	}
	
	
}
