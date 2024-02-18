package main.java;

import javax.swing.JFrame;

public class WeatherForecastGui extends JFrame {
    public WeatherForecastGui(){
        //setup gui and add title
        super("Weather Application");

        //configure gui to end the program's process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //set size of gui(in pixels)
        setSize(450,650);

        //load gui at the center of screen
        setLocationRelativeTo(null);

        //make manager null so that we can manually position components within gui
        setLayout(null);

        //prevent resize 
        setResizable(false);
        
    }
    
}
