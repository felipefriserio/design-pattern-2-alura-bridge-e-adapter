package br.com.alura.design.pattern.bridge.adapter;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;


public class Main {

	public static void main(String[] args) throws Exception {
		// Bridge - ponte com software de terceiros
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");

		// Adapter - ajuste para codigo legado
		RelogioDoSistema relogio = new RelogioDoSistema();
		Calendar hoje = relogio.hoje();
	}
}
