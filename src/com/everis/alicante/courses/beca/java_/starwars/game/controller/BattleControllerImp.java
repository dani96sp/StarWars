package com.everis.alicante.courses.beca.java_.starwars.game.controller;

import java.util.Scanner;

import com.everis.alicante.courses.beca.java_.starwars.game.domain.ATAT;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.Destructor;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.Jedi;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.Sith;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.TFighter;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.XWing;
import com.everis.alicante.courses.beca.java_.starwars.game.utils.FactionEnum;

public class BattleControllerImp implements BattleController{

	@Override
	public void addBP() {
		
		System.out.println("Introduce el nombre del participante");
		Scanner in = new Scanner(System.in);
		String pnombre = in.nextLine();

		 String id = pnombre + String.valueOf(1 +Math.random()*25);
		 
		System.out.println("Elige que tipo de participante es:");
		System.out.print("EMPIRE                  	   	REBEL");
		System.out.println("WARRIOR					WARRIOR");
		System.out.println("1) Sith    					2) Jedi");
		System.out.println("");
		System.out.println("EarthMachine 			EarthMachine");
		System.out.println("3) ATAT						Destructor");
		System.out.println("");
		System.out.println(" AirMachine				AirMachine");
		System.out.println("5) XWing					6) TFighter");
		 in = new Scanner(System.in);
//		 BattleParticipant 
		 int opt = in.nextInt();
		 
		 switch(opt) {
		 case 1:
			 Sith sith = new Sith(id, pnombre, 300, 300, FactionEnum.EMPIRE);
			 break;
		 case 2:
			 Jedi jedi = new Jedi(id, pnombre, 300, 300, FactionEnum.REBEL);
			 break;
		 case 3:
			 ATAT atat = new ATAT(id, pnombre, 500, 500, FactionEnum.EMPIRE);
			 break;
		 case 4:
			 Destructor destructor = new Destructor(id, pnombre, 500, 500, FactionEnum.REBEL);
			 break;
		 case 5:
			 XWing xwing = new XWing(id, pnombre, 700, 700, FactionEnum.EMPIRE);
			 break;
		 case 6:
			 TFighter tfighter = new TFighter(id, pnombre, 700, 700, FactionEnum.REBEL);
			 break;
		default:
			System.out.println("OPCION NO VALIDA");
			break;
		 
		 }
		
		
		
		
	}

	@Override
	public void deleteBP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listEmpire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listRebels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
