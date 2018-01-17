/**
 * The MIT License
 * Copyright (c) 2018 Ryan Friesen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 *Add package line below after creating package in IDE, then create a new .java file for NameOutput.java listed in repository
 */

package facebooknamegeneratorgui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Ryan Friesen
 */
public class FacebookNameGeneratorGUI extends Application {

    TextField tfGender = new TextField();
    TextField tfFirstName = new TextField();
    TextField tfMiddleInitial = new TextField();
    TextField tfLastName = new TextField();
    TextField tfYoMamma = new TextField();
    TextField tfBirthPlace = new TextField();
    TextField tfBirthMonth = new TextField();
    TextField tfBirthDay = new TextField();
    TextField tfStarWars = new TextField();
    TextField tfStripper = new TextField();
    TextField tfVampire = new TextField();
    TextField tfApocalypse = new TextField();
    TextField tfMedieval = new TextField();
    TextField tfHeavyMetal = new TextField();
    TextField tfIncremental = new TextField();
    TextField tfIncrementalConsonant = new TextField();
    TextField tfDecremental = new TextField();
    TextField tfDecrementalConsonant = new TextField();
    Button btEnter = new Button("Enter");

    @Override

    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: linear-gradient(#3b5998 7%, #8b9dc3 7%);");
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        Label titleLabel = new Label("Facebook Name Generator");
        titleLabel.setTranslateY(-15.0);
        titleLabel.setTranslateX(65.0);
        titleLabel.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 20 arial; -fx-font-weight: bold;");
        Label label1 = new Label("Gender (type \"Male\" or \"Female\":");
        label1.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label2 = new Label("First Name:");
        label2.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label3 = new Label("Middle Initial:");
        label3.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label4 = new Label("Last Name:");
        label4.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label5 = new Label("Your Mother's Maiden Name:");
        label5.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label6 = new Label("Your Birth City:");
        label6.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label7 = new Label("The Month You Were Born In:");
        label7.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label8 = new Label("The Day You Were Born:");
        label8.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label9 = new Label("Your Star Wars Name is:");
        label9.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label10 = new Label("Your Stripper Name is:");
        label10.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label11 = new Label("Your Vampire Name is:");
        label11.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label12 = new Label("Your Apocalypse Name is:");
        label12.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label13 = new Label("Your Medieval Name is:");
        label13.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label14 = new Label("Your Heavy Metal Name is:");
        label14.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label15 = new Label("Your Vowel-incremented Name is:");
        label15.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label16 = new Label("Your Consonant-incremented Name is:");
        label16.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label17 = new Label("Your Vowel-decremented Name is:");
        label17.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Label label18 = new Label("Your Consonant-decremented Name is:");
        label18.setStyle("-fx-text-fill: #f7f7f7; -fx-font: 13 arial; -fx-font-weight: bold;");
        Button btEnter = new Button("Enter");
        gridPane.add(titleLabel, 0, 0);
        gridPane.add(label1, 0, 1);
        gridPane.add(tfGender, 1, 1);
        gridPane.add(label2, 0, 2);
        gridPane.add(tfFirstName, 1, 2);
        gridPane.add(label3, 0, 3);
        gridPane.add(tfMiddleInitial, 1, 3);
        gridPane.add(label4, 0, 4);
        gridPane.add(tfLastName, 1, 4);
        gridPane.add(label5, 0, 5);
        gridPane.add(tfYoMamma, 1, 5);
        gridPane.add(label6, 0, 6);
        gridPane.add(tfBirthPlace, 1, 6);
        gridPane.add(label7, 0, 7);
        gridPane.add(tfBirthMonth, 1, 7);
        gridPane.add(label8, 0, 8);
        gridPane.add(tfBirthDay, 1, 8);
        gridPane.add(btEnter, 0, 9);
        gridPane.add(label9, 0, 10);
        gridPane.add(tfStarWars, 1, 10);
        gridPane.add(label10, 0, 11);
        gridPane.add(tfStripper, 1, 11);
        gridPane.add(label11, 0, 12);
        gridPane.add(tfVampire, 1, 12);
        gridPane.add(label12, 0, 13);
        gridPane.add(tfApocalypse, 1, 13);
        gridPane.add(label13, 0, 14);
        gridPane.add(tfMedieval, 1, 14);
        gridPane.add(label14, 0, 15);
        gridPane.add(tfHeavyMetal, 1, 15);
        gridPane.add(label15, 0, 16);
        gridPane.add(tfIncremental, 1, 16);
        gridPane.add(label16, 0, 17);
        gridPane.add(tfIncrementalConsonant, 1, 17);
        gridPane.add(label17, 0, 18);
        gridPane.add(tfDecremental, 1, 18);
        gridPane.add(label18, 0, 19);
        gridPane.add(tfDecrementalConsonant, 1, 19);
        gridPane.setAlignment(Pos.CENTER);
        tfGender.setAlignment(Pos.BOTTOM_RIGHT);
        tfFirstName.setAlignment(Pos.BOTTOM_RIGHT);
        tfMiddleInitial.setAlignment(Pos.BOTTOM_RIGHT);
        tfLastName.setAlignment(Pos.BOTTOM_RIGHT);
        tfYoMamma.setAlignment(Pos.BOTTOM_RIGHT);
        tfBirthPlace.setAlignment(Pos.BOTTOM_RIGHT);
        tfBirthMonth.setAlignment(Pos.BOTTOM_RIGHT);
        tfBirthDay.setAlignment(Pos.BOTTOM_RIGHT);
        btEnter.setAlignment(Pos.CENTER);
        tfStarWars.setAlignment(Pos.BOTTOM_RIGHT);
        tfStripper.setAlignment(Pos.BOTTOM_RIGHT);
        tfVampire.setAlignment(Pos.BOTTOM_RIGHT);
        tfApocalypse.setAlignment(Pos.BOTTOM_RIGHT);
        tfMedieval.setAlignment(Pos.BOTTOM_RIGHT);
        tfHeavyMetal.setAlignment(Pos.BOTTOM_RIGHT);
        tfIncremental.setAlignment(Pos.BOTTOM_RIGHT);
        tfIncrementalConsonant.setAlignment(Pos.BOTTOM_RIGHT);
        tfDecremental.setAlignment(Pos.BOTTOM_RIGHT);
        tfDecrementalConsonant.setAlignment(Pos.BOTTOM_RIGHT);
        tfGender.setStyle("-fx-background-color: #dfe3ee;");
        tfFirstName.setStyle("-fx-background-color: #dfe3ee;");
        tfMiddleInitial.setStyle("-fx-background-color: #dfe3ee;");
        tfLastName.setStyle("-fx-background-color: #dfe3ee;");
        tfYoMamma.setStyle("-fx-background-color: #dfe3ee;");
        tfBirthPlace.setStyle("-fx-background-color: #dfe3ee;");
        tfBirthMonth.setStyle("-fx-background-color: #dfe3ee;");
        tfBirthDay.setStyle("-fx-background-color: #dfe3ee;");
        btEnter.setStyle("-fx-background-color: #dfe3ee;");
        tfStarWars.setStyle("-fx-background-color: #dfe3ee;");
        tfStripper.setStyle("-fx-background-color: #dfe3ee;");
        tfVampire.setStyle("-fx-background-color: #dfe3ee;");
        tfApocalypse.setStyle("-fx-background-color: #dfe3ee;");
        tfMedieval.setStyle("-fx-background-color: #dfe3ee;");
        tfHeavyMetal.setStyle("-fx-background-color: #dfe3ee;");
        tfIncremental.setStyle("-fx-background-color: #dfe3ee;");
        tfIncrementalConsonant.setStyle("-fx-background-color: #dfe3ee;");
        tfDecremental.setStyle("-fx-background-color: #dfe3ee;");
        tfDecrementalConsonant.setStyle("-fx-background-color: #dfe3ee;");
        tfStarWars.setEditable(false);
        tfStripper.setEditable(false);
        tfVampire.setEditable(false);
        tfApocalypse.setEditable(false);
        tfMedieval.setEditable(false);
        tfHeavyMetal.setEditable(false);
        tfIncremental.setEditable(false);
        tfIncrementalConsonant.setEditable(false);
        tfDecremental.setEditable(false);
        tfDecrementalConsonant.setEditable(false);
        btEnter.setOnAction(e -> NameHandler());

        Scene scene = new Scene(gridPane, 450, 650);
        primaryStage.setTitle("Facebook Name Generator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void NameHandler() {

        String firstNameString = (tfFirstName.getText());
        String lastNameString = (tfLastName.getText());
        String genderString = (tfGender.getText());
        String birthTownString = (tfBirthPlace.getText());
        String yoMammaString = (tfYoMamma.getText());
        String birthMonthString = (tfBirthMonth.getText());
        String middleInitialString = (tfMiddleInitial.getText());
        String heavyMetalString = (tfHeavyMetal.getText());
        String incrementalString = (tfIncremental.getText());
        String incrementalConsonantString = (tfIncrementalConsonant.getText());
        String decrementalString = (tfDecremental.getText());
        String decrementalConsonantString = (tfDecrementalConsonant.getText());
        int birthDay = Integer.parseInt(tfBirthDay.getText());

        NameOutput nameOutput = new NameOutput(firstNameString, lastNameString, birthTownString, yoMammaString, genderString, middleInitialString, birthMonthString, heavyMetalString, birthDay, incrementalString, incrementalConsonantString, decrementalString, decrementalConsonantString);

        tfStarWars.setText(nameOutput.starWars());
        tfStripper.setText(nameOutput.stripperName());
        tfVampire.setText(nameOutput.vampireName());
        tfApocalypse.setText(nameOutput.apocalypseName());
        tfMedieval.setText(nameOutput.medievalName());
        tfHeavyMetal.setText(nameOutput.heavyMetalName());
        tfIncremental.setText(nameOutput.incrementalize() + " " + nameOutput.incrementalizeLast());
        tfIncrementalConsonant.setText(nameOutput.consonantIncrement() + " " + nameOutput.consonantIncrementLast());
        tfDecremental.setText(nameOutput.decrementalize() + " " + nameOutput.decrementalizeLast());
        tfDecrementalConsonant.setText(nameOutput.consonantDecrement() + " " + nameOutput.consonantDecrementLast());

    }

}
