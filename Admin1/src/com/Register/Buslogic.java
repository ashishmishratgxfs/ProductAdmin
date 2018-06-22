package com.Register;

import Register.DAO.DataRegister;
import model.com.RegisterModel;

public class Buslogic {
	
	public void AddtoDB1(RegisterModel mdl) {
		
		
	
		if (mdl.getDeptname().equals("Admin"))
		{
			System.out.println("Yes");
			DataRegister DR = new DataRegister();
			DR.addtodb(mdl);
		}
		
		else
		{
			System.out.println("No");
		}
		
	}

}
