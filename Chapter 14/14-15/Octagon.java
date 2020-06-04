import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Octagon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		StackPane pane =  new StackPane(); 
		Text t = new Text("STOP");
		t.setFill(Color.WHITE);
		t.setFont(Font.font("Verdana", 80));
		pane.getChildren().addAll(new MyOctagon(), t);
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("ShowOctagon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

class MyOctagon extends Pane {
	private void paint() {
		// Create a polygon and place polygon to pane
		Polygon oct = new Polygon();
		oct.setFill(Color.RED);
		oct.setStroke(Color.BLACK);
		oct.setRotate(22.5);

		ObservableList<Double> list = oct.getPoints();

		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;
		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;

		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}     
		getChildren().add(oct); 
	}
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}