
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class javafx extends Application {

	public static void main(String[] args) {
		launch();
	}

	public void start(Stage primaryStage) throws Exception {
		HBox Ground = new HBox();
		Button exitButton = new Button("Close");// ger namn p� f�rsta Knappen
		Ground.getChildren().add(exitButton);
		exitButton.setOnAction(event -> {
			primaryStage.close();// N�r man klickar p� close kanppen s� g�r dennna koden att knappen st�nger
									// programet

		});

		Rectangle rectangle = new Rectangle();// layout f�r rektanglen
		rectangle.setHeight(100);
		rectangle.setWidth(100);
		rectangle.setFill(Color.BLUE);
		rectangle.setTranslateX(-30); // ger figuren en position p� X-Axeln
		rectangle.setTranslateY(100);// ger figuren en position p� Y-Axeln

		Button ButtonX = new Button("Rectangle");
		Ground.getChildren().add(ButtonX);

		ButtonX.setOnAction(event -> {
			Ground.getChildren().add(rectangle);

		});

		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setFill(Color.YELLOW);
		circle.setTranslateX(-30);
		circle.setTranslateY(100);

		Button ButtonY = new Button("Circle");
		Ground.getChildren().add(ButtonY);

		ButtonY.setOnAction(event -> {
			Ground.getChildren().add(circle);

		});

	 
		Scene scene = new Scene(Ground, 500, 300);// storleken p� beh�llaren

		primaryStage.setScene(scene);
		primaryStage.show(); // visar beh�llaren n�r man startar programet

	}

}
