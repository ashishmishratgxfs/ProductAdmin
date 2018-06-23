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
	
public boolean checklogin(RegisterModel mdl)
{
	DataRegister DR1 = new DataRegister();
	boolean A = DR1.CheckLoginDB(mdl);
	return A;
}

}
