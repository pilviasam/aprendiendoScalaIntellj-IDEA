import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

    private String coche;
    private String auto;

    {
        coche = "insignia";
        auto = "insignia";
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        if (this.coche.equals(this.auto)) {
            System.out.print//.
            ("hola que tal");
        }
    }
}


