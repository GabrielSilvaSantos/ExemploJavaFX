package view;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

/* @author GabrielSilvaSantos
 * @date 12/10/2020
 */

public class JanelaExemplo extends Application {

	@Override
	public void start(Stage meuStage) throws Exception {

		/* CRIAÇÃO DO PAINEL */
		Pane meuPane = new Pane();

		/* CRIAÇÃO DO LAYOUT */
		GridPane meuGridLayout = new GridPane();
		FlowPane meuFlowLayout = new FlowPane();

		/* CRIAÇÃO DA CENA */
		Scene minhaScene = new Scene(meuGridLayout, 500, 320);

		/* CRIAÇÃO DOS COMPONENTES */
		Label minhaLabel = new Label("Digite algo aqui: ");
		TextField minhaTxtField = new TextField();
		TextArea minhaTxtArea = new TextArea();
		Button meuButton = new Button("Tornar texto em UpperCase");
		

		/* ADICIONANDO COMPONENTES PARA O meuGridLayout */
		meuGridLayout.add(minhaLabel, 0, 1);
		meuGridLayout.add(minhaTxtField, 0, 2);
		
		/* DEFINIÇÃO DE MARGENS PARA O LAYOUT (meuGridLayout) */
		meuGridLayout.setHgap(10);
		meuGridLayout.setVgap(10);
		meuGridLayout.setPadding(new Insets(10));
		
		/* ADICIONANDO O meuFlowLayout AO meuGridLayout */
		meuGridLayout.add(meuFlowLayout, 0, 4);
		
		/* ADICIONANDO COMPONENTES PARA O meuFlowLayout */
		meuFlowLayout.getChildren().addAll(meuButton, minhaTxtArea);
		
		/* DEFINIÇÃO DE MARGENS PARA O LAYOUT (meuFlowLayout) */
		meuFlowLayout.setHgap(10);
		meuFlowLayout.setVgap(10);

		/* ADICIONANDO CENA AO PALCO */
		meuStage.setScene(minhaScene);

		/* DEFINIÇÃO DE TITULO DA JANELA */
		meuStage.setTitle("Criação de Tela - Java FX");

		/* EXIBIÇÃO DA JANELA */
		meuStage.setResizable(false);
		meuStage.show();

		
		/* EVENTO DO BOTÃO */
		meuButton.setOnAction(new EventHandler() {
			
			@Override
			public void handle(Event event) {
				minhaTxtArea.setText(minhaTxtField.getText().toUpperCase());
			}
		});

	}

	public static void main(String[] args) {
		Application.launch(JanelaExemplo.class, args);
	}

}
