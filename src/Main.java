import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	private Master master;

	@Override
	public void start(Stage s) {
		try {
			master = new Master();
			master.init(s);
//			s.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
