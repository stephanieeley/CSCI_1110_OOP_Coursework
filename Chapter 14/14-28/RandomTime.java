import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//Stephanie Eley
//06/02/2020

public class RandomTime extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(Stage primaryStage) {
		int hour = (int) (Math.random()* 11);
		int min = (int)(Math.random()* 29);
		int sec = (int)(Math.random()* 59);
		if(min <= 14) {
			min = 0;
		}
		else {
			min = 30;
		}
		ClockPane clock = new ClockPane(hour, min, sec,true, true, false);
		String timeString = clock.getHour() + ":" + clock.getMinute() 
		+ ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);

		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("DisplayClock"); 
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
