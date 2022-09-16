package com.HbOnetoManyUni;

import com.HbOnetoManyUni.daoimpl.TrainerDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	TrainerDaoImpl d = new TrainerDaoImpl();
    	d.addTrainer();
    	d.fetchTrainer();
    }
}
