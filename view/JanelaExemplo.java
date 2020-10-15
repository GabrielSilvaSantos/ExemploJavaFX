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

		/* CRIA��O DO PAINEL */
		Pane meuPane = new Pane();

		/* CRIA��O DO LAYOUT */
		GridPane meuGridLayout = new GridPane();
		FlowPane meuFlowLayout = new FlowPane();

		/* CRIA��O DA CENA */
		Scene minhaScene = new Scene(meuGridLayout, 500, 320);

		/* CRIA��O DOS COMPONENTES */
		Label minhaLabel = new Label("Digite algo aqui: ");
		TextField minhaTxtField = new TextField();
		TextArea minhaTxtArea = new TextArea();
		Button meuButton = new Button("Tornar texto em UpperCase");
		

		/* ADICIONANDO COMPONENTES PARA O meuGridLayout */
		meuGridLayout.add(minhaLabel, 0, 1);
		meuGridLayout.add(minhaTxtField, 0, 2);
		
		/* DEFINI��O DE MARGENS PARA O LAYOUT (meuGridLayout) */
		meuGridLayout.setHgap(10);
		meuGridLayout.setVgap(10);
		meuGridLayout.setPadding(new Insets(10));
		
		/* ADICIONANDO O meuFlowLayout AO meuGridLayout */
		meuGridLayout.add(meuFlowLayout, 0, 4);
		
		/* ADICIONANDO COMPONENTES PARA O meuFlowLayout */
		meuFlowLayout.getChildren().addAll(meuButton, minhaTxtArea);
		
		/* DEFINI��O DE MARGENS PARA O LAYOUT (meuFlowLayout) */
		meuFlowLayout.setHgap(10);
		meuFlowLayout.setVgap(10);

		/* ADICIONANDO CENA AO PALCO */
		meuStage.setScene(minhaScene);

		/* DEFINI��O DE TITULO DA JANELA */
		meuStage.setTitle("Cria��o de Tela - Java FX");

		/* EXIBI��O DA JANELA */
		meuStage.setResizable(false);
		meuStage.show();

		
		/* EVENTO DO BOT�O */
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
