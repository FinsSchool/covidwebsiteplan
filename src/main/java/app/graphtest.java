package app;
import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Example Index HTML class using Javalin
 * "<p>"
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class graphtest implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";
        html +=
        "<link rel='stylesheet' href='graph-test.css'>" +

        "<figure class='css-chart' style='--custom-fixed-size: 1000px;'>" +

        "<ul class='line-graph'>" +

          "<li style='--x:40px; --y:83.3333px;'>" +
            "<div class='data-point' data-value='25'></div>" +
            "<div class='line-segment' style='--hypotenuse: 123.33333333333333; --angle:-71.07535558394876;'></div>" +
          "</li>" +
          "<li style='--x: 80px; --y: 200px;'>" +
            "<div class='data-point' data-value='60'></div>" +
            "<div class='line-segment' style='--hypotenuse: 64.03124237432849; --angle:51.34019174590991;'></div>" +
          "</li>" +
          "<li style='--x: 120px; --y: 150px;'>" +
            "<div class='data-point' data-value='45'></div>" +
            "<div class='line-segment' style='--hypotenuse: 43.333333333333336; --angle:-22.61986494804045;'></div>" +
          "</li>" +
        "</figure>"+
        "</html>";
        
        context.html(html);
    }

}