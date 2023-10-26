import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TarefaPOO_FX_Ex19 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Teste de Eventos");

        Label label = new Label("Texto ");

        Button button = new Button("OK");

        button.setOnAction( event -> {
            System.out.println("Hello World!");
        });

        VBox layout = new VBox(30); //espaçamento de 10 px entre cada elemento
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label, button);

        Scene scene = new Scene(layout, 200, 100);
        primaryStage.setScene(scene);

        primaryStage.show();
	}
	
	
	
}

