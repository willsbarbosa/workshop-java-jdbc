package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			return null;
		}
	}
	
	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node)event.getSource()).getScene().getWindow(); 
		/*
		 Retorna o stage do bot�o clicado. Por exemplo ao clicar no bot�o New
		 o stage � retornado para poder jogar o form na tela.
		 */
	}
}
