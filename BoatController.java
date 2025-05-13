package org.poblete.boat;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.Line;


public class BoatController {
    @FXML
    public Canvas canvas; // Canvas that is used to draw the boat on

    @FXML
    private void drawBoat(){ // Method to draw a boat

        // the points that will be used to create the boats hull
        final double topRight_X = 400.0;
        final double topRight_Y = 200.0;
        final double topLeft_X = 100.0;
        final double topLeft_Y = 200.0;
        final double bottomLeft_X = 100.0;
        final double bottomLeft_Y = 300.0;
        final double bottomRight_X = 400.0;
        final double bottomRight_Y = 300.0;

        // creates the lines that will be drawn
        Line line1 = new Line(topRight_X, topRight_Y, topLeft_X, topLeft_Y);
        Line line2 = new Line(topLeft_X, topLeft_Y, bottomLeft_X, bottomLeft_Y);
        Line line3 = new Line(bottomLeft_X, bottomLeft_Y, bottomRight_X, bottomRight_Y);
        Line line4 = new Line(bottomRight_X, bottomRight_Y, topRight_X, topRight_Y);

        // draws the lines onto the canvas
        canvas.getGraphicsContext2D().strokeLine(line1.getStartX(), line1.getStartY(), line1.getEndX(), line1.getEndY());
        canvas.getGraphicsContext2D().strokeLine(line2.getStartX(), line2.getStartY(), line2.getEndX(), line2.getEndY());
        canvas.getGraphicsContext2D().strokeLine(line3.getStartX(), line3.getStartY(), line3.getEndX(), line3.getEndY());
        canvas.getGraphicsContext2D().strokeLine(line4.getStartX(), line4.getStartY(), line4.getEndX(), line4.getEndY());

        // the points that will be used to create the mast
        final double mastBottomRight_X = 255.0;
        final double mastBottomRight_Y = 200.0;
        final double mastTopRight_X = 255.0;
        final double mastTopRight_Y = 50.0;
        final double mastTopLeft_X = 245.0;
        final double mastTopLeft_Y = 50.0;
        final double mastBottomLeft_X = 245.0;
        final double mastBottomLeft_Y = 200.0;

        // creates the lines that will be drawn
        Line line6 = new Line(mastBottomRight_X, mastBottomRight_Y, mastTopRight_X, mastTopRight_Y);
        Line line7 = new Line(mastTopRight_X, mastTopRight_Y, mastTopLeft_X, mastTopLeft_Y);
        Line line8 = new Line(mastTopLeft_X, mastTopLeft_Y, mastBottomLeft_X, mastBottomLeft_Y);

        // draws the lines onto the canvas
        canvas.getGraphicsContext2D().strokeLine(line6.getStartX(), line6.getStartY(), line6.getEndX(), line6.getEndY());
        canvas.getGraphicsContext2D().strokeLine(line7.getStartX(), line7.getStartY(), line7.getEndX(), line7.getEndY());
        canvas.getGraphicsContext2D().strokeLine(line8.getStartX(), line8.getStartY(), line8.getEndX(), line8.getEndY());

        // the points for the sail/flag
        final double flag_X1 = 255.0;
        final double flag_Y1 = 100.0;
        final double flag_X2 = 305.0;
        final double flag_Y2 = 75.0;
        final double flag_X3 = 255.0;
        final double flag_Y3 = 50.0;

        // lines that are created between each point
        Line line9 = new Line(flag_X1, flag_Y1, flag_X2, flag_Y2);
        Line line10 = new Line(flag_X2, flag_Y2, flag_X3, flag_Y3 );
        Line line11 = new Line(flag_X3,flag_Y3, flag_X1, flag_Y1);

        // draws the lines onto the canvas
        canvas.getGraphicsContext2D().strokeLine(line9.getStartX(), line9.getStartY(), line9.getEndX(), line9.getEndY());
        canvas.getGraphicsContext2D().strokeLine(line10.getStartX(), line10.getStartY(), line10.getEndX(), line10.getEndY());
        canvas.getGraphicsContext2D().strokeLine(line11.getStartX(), line11.getStartY(), line11.getEndX(), line11.getEndY());
    }
}

