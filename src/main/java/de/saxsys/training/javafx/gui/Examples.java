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
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

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
        resultLabel.textProperty().bind(Bindings.concat("result: ", new EventsTraining(bindingsTraining).result));
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

        VBox aSliderContainer = new VBox();
        Slider aSlider = new Slider(0, 10, 1);
        aSlider.valueProperty().bindBidirectional(bindingsTraining.a);
        Label aLabel = new Label("a");
        aSliderContainer.getChildren().addAll(aSlider, aLabel);

        VBox bSliderContainer = new VBox();
        Slider bSlider = new Slider(0, 10, 1);
        bSlider.setBlockIncrement(1.0);
        bSlider.valueProperty().bindBidirectional(bindingsTraining.b);
        Label bLabel = new Label("b");
        bSliderContainer.getChildren().addAll(bSlider, bLabel);

        Label label = new Label();
        label.textProperty().bind(Bindings.concat("a greater b? ", bindingsTraining.aGreaterB.asString()));

        Label heading = new Label("Uebung 1: ");

        container.getChildren().addAll(heading, aSliderContainer, bSliderContainer, label);

        return container;
    }

    private Node initPythagorasBinding() {
        HBox container = new HBox();
        container.setSpacing(20.0);

        Label label = new Label();
        label.textProperty().bind(Bindings.concat("Hypothenuse: ", bindingsTraining.c.asString()));

        Label heading = new Label("Uebung 2: ");

        container.getChildren().addAll(heading, label);
        return container;
    }

    /**
     * 2 Textfelder sollen nebeneinander angeordnet werden und den Vor- und Nachnamen aus BindingsTraining anzeigen.
     * Eine Aenderung der Namen soll diese auch im Modell aendern. Sobald der Name "Bruce Wayne" eingetragen ist, soll
     * in der Kopfzeile "I am batman" angezeigt werden (implementiert in {@link #initResultDisplay()}).
     */
    private Node initNameBinding() {
        HBox container = new HBox();
        container.setSpacing(20.0);

        Label firstNameLabel = new Label("First Name: ");
        TextField firstName = new TextField();
        firstName.textProperty().bindBidirectional(bindingsTraining.firstName);

        Label lastNameLabel = new Label("Last Name: ");
        TextField lastName = new TextField();
        lastName.textProperty().bindBidirectional(bindingsTraining.lastName);

        Label heading = new Label("Uebung 3: ");

        container.getChildren().addAll(heading, firstNameLabel, firstName, lastNameLabel, lastName);

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

        ListView<String> cityList = new ListView<>(bindingsTraining.cityNames);
        // Initial sollen keine Staedte gefiltert werden
        ListView<String> filterCityList = new ListView<>(bindingsTraining.cityNames);

        TextField filterName = new TextField();
        filterName.textProperty().addListener((bean, oldVal, newVal) ->
                filterCityList.setItems(bindingsTraining.cityNames.filtered(city -> city.startsWith(newVal))));

        Label heading = new Label("Uebung 5: ");

        container.getChildren().addAll(heading, filterName, cityList, filterCityList);

        return container;
    }
}
