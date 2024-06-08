package application;
	
import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	//NOMBRES DE LOS COLORES EN MAP
    private static final Map<Color, String> colorNames = new HashMap<>();

    static {
        colorNames.put(Color.ALICEBLUE, "Alice Blue");
        colorNames.put(Color.ANTIQUEWHITE, "Antique White");
        colorNames.put(Color.AQUA, "Aqua");
        colorNames.put(Color.AQUAMARINE, "Aquamarine");
        colorNames.put(Color.AZURE, "Azure");
        colorNames.put(Color.BEIGE, "Beige");
        colorNames.put(Color.BISQUE, "Bisque");
        colorNames.put(Color.BLACK, "Black");
        colorNames.put(Color.BLANCHEDALMOND, "Blanched Almond");
        colorNames.put(Color.BLUE, "Blue");
        colorNames.put(Color.BLUEVIOLET, "Blue Violet");
        colorNames.put(Color.BROWN, "Brown");
        colorNames.put(Color.BURLYWOOD, "Burly Wood");
        colorNames.put(Color.CADETBLUE, "Cadet Blue");
        colorNames.put(Color.CHARTREUSE, "Chartreuse");
        colorNames.put(Color.CHOCOLATE, "Chocolate");
        colorNames.put(Color.CORAL, "Coral");
        colorNames.put(Color.CORNFLOWERBLUE, "Cornflower Blue");
        colorNames.put(Color.CORNSILK, "Cornsilk");
        colorNames.put(Color.CRIMSON, "Crimson");
        colorNames.put(Color.CYAN, "Cyan");
        colorNames.put(Color.DARKBLUE, "Dark Blue");
        colorNames.put(Color.DARKCYAN, "Dark Cyan");
        colorNames.put(Color.DARKGOLDENROD, "Dark Goldenrod");
        colorNames.put(Color.DARKGRAY, "Dark Gray");
        colorNames.put(Color.DARKGREEN, "Dark Green");
        colorNames.put(Color.DARKKHAKI, "Dark Khaki");
        colorNames.put(Color.DARKMAGENTA, "Dark Magenta");
        colorNames.put(Color.DARKOLIVEGREEN, "Dark Olive Green");
        colorNames.put(Color.DARKORANGE, "Dark Orange");
        colorNames.put(Color.DARKORCHID, "Dark Orchid");
        colorNames.put(Color.DARKRED, "Dark Red");
        colorNames.put(Color.DARKSALMON, "Dark Salmon");
        colorNames.put(Color.DARKSEAGREEN, "Dark Sea Green");
        colorNames.put(Color.DARKSLATEBLUE, "Dark Slate Blue");
        colorNames.put(Color.DARKSLATEGRAY, "Dark Slate Gray");
        colorNames.put(Color.DARKTURQUOISE, "Dark Turquoise");
        colorNames.put(Color.DARKVIOLET, "Dark Violet");
        colorNames.put(Color.DEEPPINK, "Deep Pink");
        colorNames.put(Color.DEEPSKYBLUE, "Deep Sky Blue");
        colorNames.put(Color.DIMGRAY, "Dim Gray");
        colorNames.put(Color.DODGERBLUE, "Dodger Blue");
        colorNames.put(Color.FIREBRICK, "Fire Brick");
        colorNames.put(Color.FLORALWHITE, "Floral White");
        colorNames.put(Color.FORESTGREEN, "Forest Green");
        colorNames.put(Color.FUCHSIA, "Fuchsia");
        colorNames.put(Color.GAINSBORO, "Gainsboro");
        colorNames.put(Color.GHOSTWHITE, "Ghost White");
        colorNames.put(Color.GOLD, "Gold");
        colorNames.put(Color.GOLDENROD, "Goldenrod");
        colorNames.put(Color.GRAY, "Gray");
        colorNames.put(Color.GREEN, "Green");
        colorNames.put(Color.GREENYELLOW, "Green Yellow");
        colorNames.put(Color.HONEYDEW, "Honeydew");
        colorNames.put(Color.HOTPINK, "Hot Pink");
        colorNames.put(Color.INDIANRED, "Indian Red");
        colorNames.put(Color.INDIGO, "Indigo");
        colorNames.put(Color.IVORY, "Ivory");
        colorNames.put(Color.KHAKI, "Khaki");
        colorNames.put(Color.LAVENDER, "Lavender");
        colorNames.put(Color.LAVENDERBLUSH, "Lavender Blush");
        colorNames.put(Color.LAWNGREEN, "Lawn Green");
        colorNames.put(Color.LEMONCHIFFON, "Lemon Chiffon");
        colorNames.put(Color.LIGHTBLUE, "Light Blue");
        colorNames.put(Color.LIGHTCORAL, "Light Coral");
        colorNames.put(Color.LIGHTCYAN, "Light Cyan");
        colorNames.put(Color.LIGHTGOLDENRODYELLOW, "Light Goldenrod Yellow");
        colorNames.put(Color.LIGHTGRAY, "Light Gray");
        colorNames.put(Color.LIGHTGREEN, "Light Green");
        colorNames.put(Color.LIGHTPINK, "Light Pink");
        colorNames.put(Color.LIGHTSALMON, "Light Salmon");
        colorNames.put(Color.LIGHTSEAGREEN, "Light Sea Green");
        colorNames.put(Color.LIGHTSKYBLUE, "Light Sky Blue");
        colorNames.put(Color.LIGHTSLATEGRAY, "Light Slate Gray");
        colorNames.put(Color.LIGHTSTEELBLUE, "Light Steel Blue");
        colorNames.put(Color.LIGHTYELLOW, "Light Yellow");
        colorNames.put(Color.LIME, "Lime");
        colorNames.put(Color.LIMEGREEN, "Lime Green");
        colorNames.put(Color.LINEN, "Linen");
        colorNames.put(Color.MAGENTA, "Magenta");
        colorNames.put(Color.MAROON, "Maroon");
        colorNames.put(Color.MEDIUMAQUAMARINE, "Medium Aquamarine");
        colorNames.put(Color.MEDIUMBLUE, "Medium Blue");
        colorNames.put(Color.MEDIUMORCHID, "Medium Orchid");
        colorNames.put(Color.MEDIUMPURPLE, "Medium Purple");
        colorNames.put(Color.MEDIUMSEAGREEN, "Medium Sea Green");
        colorNames.put(Color.MEDIUMSLATEBLUE, "Medium Slate Blue");
        colorNames.put(Color.MEDIUMSPRINGGREEN, "Medium Spring Green");
        colorNames.put(Color.MEDIUMTURQUOISE, "Medium Turquoise");
        colorNames.put(Color.MEDIUMVIOLETRED, "Medium Violet Red");
        colorNames.put(Color.MIDNIGHTBLUE, "Midnight Blue");
        colorNames.put(Color.MINTCREAM, "Mint Cream");
        colorNames.put(Color.MISTYROSE, "Misty Rose");
        colorNames.put(Color.MOCCASIN, "Moccasin");
        colorNames.put(Color.NAVAJOWHITE, "Navajo White");
        colorNames.put(Color.NAVY, "Navy");
        colorNames.put(Color.OLDLACE, "Old Lace");
        colorNames.put(Color.OLIVE, "Olive");
        colorNames.put(Color.OLIVEDRAB, "Olive Drab");
        colorNames.put(Color.ORANGE, "Orange");
        colorNames.put(Color.ORANGERED, "Orange Red");
        colorNames.put(Color.ORCHID, "Orchid");
        colorNames.put(Color.PALEGOLDENROD, "Pale Goldenrod");
        colorNames.put(Color.PALEGREEN, "Pale Green");
        colorNames.put(Color.PALETURQUOISE, "Pale Turquoise");
        colorNames.put(Color.PALEVIOLETRED, "Pale Violet Red");
        colorNames.put(Color.PAPAYAWHIP, "Papaya Whip");
        colorNames.put(Color.PEACHPUFF, "Peach Puff");
        colorNames.put(Color.PERU, "Peru");
        colorNames.put(Color.PINK, "Pink");
        colorNames.put(Color.PLUM, "Plum");
        colorNames.put(Color.POWDERBLUE, "Powder Blue");
        colorNames.put(Color.PURPLE, "Purple");
        colorNames.put(Color.RED, "Red");
        colorNames.put(Color.ROSYBROWN, "Rosy Brown");
        colorNames.put(Color.ROYALBLUE, "Royal Blue");
        colorNames.put(Color.SADDLEBROWN, "Saddle Brown");
        colorNames.put(Color.SALMON, "Salmon");
        colorNames.put(Color.SANDYBROWN, "Sandy Brown");
        colorNames.put(Color.SEAGREEN, "Sea Green");
        colorNames.put(Color.SEASHELL, "Seashell");
        colorNames.put(Color.SIENNA, "Sienna");
        colorNames.put(Color.SILVER, "Silver");
        colorNames.put(Color.SKYBLUE, "Sky Blue");
        colorNames.put(Color.SLATEBLUE, "Slate Blue");
        colorNames.put(Color.SLATEGRAY, "Slate Gray");
        colorNames.put(Color.SNOW, "Snow");
        colorNames.put(Color.SPRINGGREEN, "Spring Green");
        colorNames.put(Color.STEELBLUE, "Steel Blue");
        colorNames.put(Color.TAN, "Tan");
        colorNames.put(Color.TEAL, "Teal");
        colorNames.put(Color.THISTLE, "Thistle");
        colorNames.put(Color.TOMATO, "Tomato");
        colorNames.put(Color.TURQUOISE, "Turquoise");
        colorNames.put(Color.VIOLET, "Violet");
        colorNames.put(Color.WHEAT, "Wheat");
        colorNames.put(Color.WHITE, "White");
        colorNames.put(Color.WHITESMOKE, "White Smoke");
        colorNames.put(Color.YELLOW, "Yellow");
        colorNames.put(Color.YELLOWGREEN, "Yellow Green");
    }
	
    //OBTENER LOS NOMBRES DE LOS COLORES
    private String getColorName(Color color) {
        for (Map.Entry<Color, String> entry : colorNames.entrySet()) {
            if (entry.getKey().equals(color)) {
                return entry.getValue();
            }
        }
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
    
    //INTERFAZ PRINCIPAL 
    @Override
    public void start(Stage primaryStage) {
        
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();

        Button confirmButton = new Button("Confirmar");
      
        Label resultLabel = new Label();

        confirmButton.setOnAction(e -> {
           
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "No seleccionada";
            Color selectedColor = colorPicker.getValue();
            String colorName = getColorName(selectedColor);

            resultLabel.setText("Fecha seleccionada: " + selectedDate + "\nColor seleccionado: " + colorName);
           
        });

        VBox vbox = new VBox(15); 
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton, resultLabel);

        Scene scene = new Scene(vbox, 400, 280);
        primaryStage.setTitle("ColorPicker Y DatePicker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	    public static void main(String[] args) {
	        launch(args);
	    }
}
