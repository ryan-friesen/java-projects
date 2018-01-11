/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebooknamegeneratorgui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Captain Kirk Cameron
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
        Button btCalculate = new Button("Enter");

        /**
        String starWarsName = starWars(firstNameString, lastNameString, birthPlaceString, yoMammaString);
        String stripperName = stripperName(firstNameString, middleInitialString, lastNameString );
        String vampireName = vampireName(firstNameString, birthMonthString);
        String apocalypseName = apocalypseName(firstNameString, birthMonthString, genderString);
     * @param primaryStage
*/
        @Override
        
        public void start(Stage primaryStage) {
        
         GridPane gridPane = new GridPane();
         gridPane.setHgap(5);
         gridPane.setVgap(5);
         gridPane.add(new Label("Gender (type \"Male\" or \"Female\"):"), 0, 0);
         gridPane.add(tfGender, 1, 0);
         gridPane.add(new Label("First Name:"), 0, 1);
         gridPane.add(tfFirstName, 1, 1);
         gridPane.add(new Label("Middle Initial:"), 0, 2);
         gridPane.add(tfMiddleInitial, 1, 2);
         gridPane.add(new Label("Last Name:"), 0, 3);
         gridPane.add(tfLastName, 1, 3);
         gridPane.add(new Label("Your Mother's Maiden Name:"), 0, 4);
         gridPane.add(tfYoMamma, 1, 4);
         gridPane.add(new Label("Your Birth City:"), 0, 5);
         gridPane.add(tfBirthPlace, 1, 5);
         gridPane.add(new Label("What Month You Were Born In:"), 0, 6);
         gridPane.add(tfBirthMonth, 1, 6);
         gridPane.add(new Label("The day of month you were born:"), 0, 7);
         gridPane.add(tfBirthDay, 1, 7);
         gridPane.add(btCalculate, 0, 8);
         gridPane.add(new Label("Your Star Wars Name is:"), 0, 9);
         gridPane.add(tfStarWars, 1, 9);
         gridPane.add(new Label("Your Stripper Name is:"), 0, 10);
         gridPane.add(tfStripper, 1, 10);
         gridPane.add(new Label("Your Vampire Name is:"), 0, 11);
         gridPane.add(tfVampire, 1, 11);
         gridPane.add(new Label("Your Apocalypse Name is:"), 0, 12);
         gridPane.add(tfApocalypse, 1, 12);
         gridPane.add(new Label("Your Medieval Name is:"), 0, 13);
         gridPane.add(tfMedieval, 1, 13);
         gridPane.add(new Label("Your Heavy Metal Name is:"), 0, 14);
         gridPane.add(tfHeavyMetal, 1, 14);
         
         gridPane.setAlignment(Pos.CENTER);
         tfGender.setAlignment(Pos.BOTTOM_RIGHT);
         tfFirstName.setAlignment(Pos.BOTTOM_RIGHT);
         tfMiddleInitial.setAlignment(Pos.BOTTOM_RIGHT);
         tfLastName.setAlignment(Pos.BOTTOM_RIGHT);
         tfYoMamma.setAlignment(Pos.BOTTOM_RIGHT);
         tfBirthPlace.setAlignment(Pos.BOTTOM_RIGHT);
         tfBirthMonth.setAlignment(Pos.BOTTOM_RIGHT);
         tfBirthDay.setAlignment(Pos.BOTTOM_RIGHT);
         btCalculate.setAlignment(Pos.CENTER);
         tfStarWars.setAlignment(Pos.BOTTOM_RIGHT);
         tfStripper.setAlignment(Pos.BOTTOM_RIGHT);
         tfVampire.setAlignment(Pos.BOTTOM_RIGHT);
         tfApocalypse.setAlignment(Pos.BOTTOM_RIGHT);
         tfMedieval.setAlignment(Pos.BOTTOM_RIGHT);
         tfHeavyMetal.setAlignment(Pos.BOTTOM_RIGHT);
         tfStarWars.setEditable(false);
         tfStripper.setEditable(false);
         tfVampire.setEditable(false);
         tfApocalypse.setEditable(false);
         tfMedieval.setEditable(false);
         tfHeavyMetal.setEditable(false);
         
         btCalculate.setOnAction(e -> NameHandler());
         
         Scene scene = new Scene(gridPane, 400, 450);
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
            int birthDay = Integer.parseInt(tfBirthDay.getText());
            
            NameOutput nameOutput = new NameOutput(firstNameString, lastNameString, birthTownString, yoMammaString, genderString, middleInitialString, birthMonthString, heavyMetalString, birthDay);
            
            tfStarWars.setText(nameOutput.starWars());
            tfStripper.setText(nameOutput.stripperName());
            tfVampire.setText(nameOutput.vampireName());
            tfApocalypse.setText(nameOutput.apocalypseName());
            tfMedieval.setText(nameOutput.medievalName());
            tfHeavyMetal.setText(nameOutput.heavyMetalName());
            
            }

}