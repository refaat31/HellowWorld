import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MyFirstApp extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Before");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("hello world");
        stage.setWidth(400);
        stage.setHeight(500);

        //parent
        VBox parent = new VBox();

        Label coolLabel = new Label("This is a cool label");


        Scene scene1 = new Scene(parent);
        Label label1 = new Label("Thus Refaat was defeated");
        Label label2 = new Label("Or was he?");
        Hyperlink link1 = new Hyperlink("click me",label1);

        //lambda expression
        link1.setOnAction(e->{
            System.out.println("why u click me");
        });
        link1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label1.setText("Or was he???");
            }
        });
        //
        Button b1 = new Button("_What is a mnemonic");
        b1.setMnemonicParsing(true);
        b1.setOnAction(e->{
            System.out.println("clicked");
        });
        parent.getChildren().addAll(link1,coolLabel,b1);
        scene1.getStylesheets().add("stylesheets/style.css");
        stage.setScene(scene1);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After");
    }
}
