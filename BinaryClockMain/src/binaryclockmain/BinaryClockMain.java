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


package binaryclockmain;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Ryan Friesen
 * 
 * Below is a GUI that sorts hour and minute values into nodes with values 1, 2, 4, 8, 16, and 32
 * 
 * Just add up the int value of the lit nodes to get the current time in standard 12 hour form.
 * 
 */
public class BinaryClockMain extends Application {

    public long totalMilliseconds;
    public long totalMinutes;
    public long currentMinute;
    public long totalHours;
    public long currentHour;

    @Override

    public void start(Stage primaryStage) {
            
        EventHandler<ActionEvent> eventHandler = e -> {
            
        this.totalMilliseconds = System.currentTimeMillis();
            this.totalMinutes = totalMilliseconds / 60000;
            this.currentMinute = totalMinutes % 60;
            this.currentHour = (System.currentTimeMillis() / 3600000) % 12;

            if (this.currentHour > 8) {

                this.currentHour = currentHour - 8;

            } else {

                this.currentHour = currentHour + 4;

            }

            Pane pane = new Pane();
            pane.setStyle("-fx-background-color: #112211;");

            Circle circle = new Circle(50, 100, 30, Color.BLACK);
            circle.setStroke(Color.GREY);
            circle.setStrokeWidth(3);

            Circle circle2 = new Circle(50, 180, 30, Color.BLACK);
            circle2.setStroke(Color.GREY);
            circle2.setStrokeWidth(3);

            Circle circle3 = new Circle(50, 260, 30);
            circle3.setStroke(Color.GREY);
            circle3.setStrokeWidth(3);

            Circle circle4 = new Circle(50, 340, 30);
            circle4.setStroke(Color.GREY);
            circle4.setStrokeWidth(3);

            Circle circle5 = new Circle(50, 420, 30);
            circle5.setStroke(Color.GREY);
            circle5.setStrokeWidth(3);

            Circle circle6 = new Circle(50, 500, 30);
            circle6.setStroke(Color.GREY);
            circle6.setStrokeWidth(3);

            Rectangle rectangle = new Rectangle(150, 70, 130, 60);
            rectangle.setStroke(Color.GREY);
            rectangle.setStrokeWidth(3);

            Rectangle rectangle2 = new Rectangle(150, 203, 130, 60);
            rectangle2.setStroke(Color.GREY);
            rectangle2.setStrokeWidth(3);

            Rectangle rectangle3 = new Rectangle(150, 336, 130, 60);
            rectangle3.setStroke(Color.GREY);
            rectangle3.setStrokeWidth(3);

            Rectangle rectangle4 = new Rectangle(150, 470, 130, 60);
            rectangle4.setStroke(Color.GREY);
            rectangle4.setStrokeWidth(3);

            if (currentMinute % 2 != 0) {
                circle.setFill(Color.BISQUE);
                circle.setStroke(Color.CORAL);
            } else {
                circle.setFill(Color.BLACK);
            }

            if (currentMinute == 2 || currentMinute == 3 || currentMinute == 6 || currentMinute == 7 || currentMinute == 8 || currentMinute == 10 || currentMinute == 11 || currentMinute == 14 || currentMinute == 15 || currentMinute == 18 || currentMinute == 19 || currentMinute == 22 || currentMinute == 23 || currentMinute == 26 || currentMinute == 27 || currentMinute == 30 || currentMinute == 31 || currentMinute == 34 || currentMinute == 35 || currentMinute == 38 || currentMinute == 39 || currentMinute == 42 || currentMinute == 43 || currentMinute == 46 || currentMinute == 47 || currentMinute == 50 || currentMinute == 51 || currentMinute == 54 || currentMinute == 55 || currentMinute == 58 || currentMinute == 59) {
                circle2.setFill(Color.BISQUE);
                circle2.setStroke(Color.CORAL);
            } else {

                circle2.setFill(Color.BLACK);

            }

            if ((currentMinute > 3 && currentMinute < 8) || (currentMinute > 11 && currentMinute < 16) || (currentMinute > 19 && currentMinute < 24) || (currentMinute > 27 && currentMinute < 32) || (currentMinute > 35 && currentMinute < 40) || (currentMinute > 43 && currentMinute < 48) || (currentMinute > 51 && currentMinute < 56)) {

                circle3.setFill(Color.BISQUE);
                circle3.setStroke(Color.CORAL);
            } else {
                circle3.setFill(Color.BLACK);

            }

            if ((currentMinute > 7 && currentMinute < 16) || (currentMinute > 23 && currentMinute < 32) || (currentMinute > 39 && currentMinute < 47) || (currentMinute > 55)) {

                circle4.setFill(Color.BISQUE);
                circle4.setStroke(Color.CORAL);
            } else {

                circle4.setFill(Color.BLACK);

            }

            if ((currentMinute > 15 && currentMinute < 32) || (currentMinute > 47)) {

                circle5.setFill(Color.BISQUE);
                circle5.setStroke(Color.CORAL);
            } else {

                circle5.setFill(Color.BLACK);

            }

            if (currentMinute > 31) {

                circle6.setFill(Color.BISQUE);
                circle6.setStroke(Color.CORAL);

            } else {

                circle6.setFill(Color.BLACK);

            }

            if (currentHour % 2 == 1) {

                rectangle.setFill(Color.BISQUE);
                rectangle.setStroke(Color.CORAL);

            } else {

                rectangle.setFill(Color.BLACK);

            }

            if (currentHour == 2 || currentHour == 3 || currentHour == 6 || currentHour == 7 || currentHour == 10 || currentHour == 11 || currentHour == 14 || currentHour == 15 || currentHour == 18 || currentHour == 19 || currentHour == 22 || currentHour == 23) {

                rectangle2.setFill(Color.BISQUE);
                rectangle2.setStroke(Color.CORAL);

            } else {

                rectangle2.setFill(Color.BLACK);

            }

            if ((currentHour > 3 && currentHour < 8) || (currentHour == 12)) {


                rectangle3.setFill(Color.BISQUE);
                rectangle3.setStroke(Color.CORAL);

            } else {

                rectangle3.setFill(Color.BLACK);

            }

            if ((int) currentHour > 7) {

                rectangle4.setFill(Color.BISQUE);
                rectangle4.setStroke(Color.CORAL);

            } else {

                rectangle4.setFill(Color.BLACK);

            }


            Label label1 = new Label("I");
            label1.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.REGULAR, 50));
            label1.setTranslateX(43);
            label1.setTranslateY(5);
            label1.setTextFill(Color.LIGHTGREY);

            Label label2 = new Label("I");
            label2.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.REGULAR, 50));
            label2.setTranslateX(207);
            label2.setTranslateY(5);
            label2.setTextFill(Color.LIGHTGREY);

            Label label3 = new Label("XXXII");
            label3.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.REGULAR, 20));
            label3.setTranslateX(30);
            label3.setTranslateY(550);
            label3.setTextFill(Color.LIGHTGREY);

            Label label4 = new Label("VIII");
            label4.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.REGULAR, 20));
            label4.setTranslateX(200);
            label4.setTranslateY(550);
            label4.setTextFill(Color.LIGHTGREY);

            Scene scene = new Scene(pane, 300, 600);
            pane.getChildren().addAll(circle, circle2, circle3, circle4, circle5, circle6, rectangle, rectangle2, rectangle3, rectangle4, label1, label2, label3, label4);
            primaryStage.setTitle("Binary Clock");
            primaryStage.setScene(scene);
            primaryStage.show();

        };

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

    }

}