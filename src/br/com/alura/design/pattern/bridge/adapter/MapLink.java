package br.com.alura.design.pattern.bridge.adapter;

public class MapLink implements Mapa{

	@Override
	public String devolveMapa(String rua) {
		return "mapa do maplink";
	}

}
