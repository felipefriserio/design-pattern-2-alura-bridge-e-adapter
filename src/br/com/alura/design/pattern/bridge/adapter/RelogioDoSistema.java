package br.com.alura.design.pattern.bridge.adapter;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio{
	public Calendar hoje(){
		return Calendar.getInstance();
	}
}
