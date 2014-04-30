package de.saxsys.training.javafx.gui;

/**
 * Created by michael.thiele on 29.04.2014.
 */

import de.saxsys.training.javafx.BindingsTraining;
import de.saxsys.training.javafx.EventsTraining;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Examples extends Application {

    private BindingsTraining bindingsTraining;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        bindingsTraining = new BindingsTraining();

        VBox root = new VBox();
        root.setPadding(new Insets(20.0, 20.0, 20.0, 20.0));
        root.setSpacing(20.0);

        root.getChildren().add(initResultDisplay());
        root.getChildren().add(initAGreaterBBinding());
        root.getChildren().add(initPythagorasBinding());
        root.getChildren().add(initNameBinding());
        root.getChildren().add(initCityBinding());

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node initResultDisplay() {
        Label resultLabel = new Label();
        resultLabel.textProperty().bind(new EventsTraining(bindingsTraining).result);
        resultLabel.setStyle("-fx-font-size: 18px");

        return resultLabel;
    }

    /**
     * 2 Slider sollen nebeneinander angeordnet werden und die Werte fuer "a" und "b" setzen. Rechts daneben soll ein
     * Label anzeigen, ob "a" groesser "b" ist.
     */
    private Node initAGreaterBBinding() {
        HBox container = new HBox();
        container.setSpacing(20.0);

        // TODO: implement

        return container;
    }

    private Node initPythagorasBinding() {
        Label label = new Label();
        label.textProperty().bind(Bindings.concat("Hypothenuse: ", bindingsTraining.c.asString()));

        return label;
    }

    /**
     * 2 Textfelder sollen nebeneinander angeordnet werden und den Vor- und Nachnamen aus BindingsTraining anzeigen.
     * Eine Aenderung der Namen soll diese auch im Modell aendern. Sobald der Name "Bruce Wayne" eingetragen ist, soll
     * in der Kopfzeile "I am batman" angezeigt werden (implementiert in {@link #initResultDisplay()}).
     */
    private Node initNameBinding() {
        HBox container = new HBox();
        container.setSpacing(20.0);

        // TODO: implement

        return container;
    }

    /**
     * Zeigt ein Textfeld und 2 Listen an. Die erste Liste enthaelt alle Staedtenamen, die zweite die gefilterten
     * Staedtenamen. Das Textfeld dient dazu den Filter zu bestimmen: die Eingabe bestimmt, mit welchen Buchstaben die
     * Staedte der zweiten Liste anfangen sollen.
     */
    private Node initCityBinding() {
        HBox container = new HBox();
        container.setSpacing(20.0);

        // TODO: implement
        // Initial sollen keine Staedte gefiltert werden

        return container;
    }
}
