package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Temporary HTML as an example page.
 * 
 * Based on the Project Workshop code examples.
 * This page currently:
 *  - Provides a link back to the index page
 *  - Displays the list of movies from the Movies Database using the JDBCConnection
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class Index implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html += "<head>" + 
        "<meta charset=\"UTF-8\">" +
        "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">" +
        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
        "<link rel=\"stylesheet\" href=\"styles.css\">" +
        "<title>Coronastats | Landing Page</title>" +
        "</head>";

        // Add some CSS (external file)
        html += "<link rel='stylesheet' type='text/css' href='common.css' />";

        // Add the body
        html += "<body>" +
        "<div class=\"header\"><h1>Coronastats</h1>" +
        "<div class=\"main-nav\">" +
            "<ul>" +
                "<li><a href=\"index.html\">Home</a></li>" +
                "<li><a href=\"data.html\">Data</a></li>" +
                "<li><a href=\"faq.html\">FAQ</a></li>" +
            "</ul>" +
        "</div>" +
        "</div>" +
        "<div class=\"main-content\">" +
        "<h2>Is your country COVID Free?!</h2>" +
        "<img class=\"landing-image\" src=\"covid19.jpeg\">" +
        "<button class=\"btn-landing\"><a href=\"\">Check in your country</a></button>" +
        "<!--Search bar, need to figure out a way to have suggestions appear-->" +
        "<input type=\"text\" placeholder=\"Search your Country/State/Province...\" class=\"search-bar\" wrap=\"soft\"></textarea>" +
    
        "<h3><b>At a Glance</b></h3>" +
        "<div class=\"fact-page\">" +
        
        "<!--Where global stats will be displayed-->" +
        "<div class=\"global-total\">" +
            "<h3>Total Cases:</h3>" +
            "<p class=\"cases\">156,156,859</p>" +
            "<h3>Total Deaths:</h3>" +
            "<p class=\"deaths\">133,456,789</p>" +
       "</div>" +
        "<!--Where top 3 most affected will be displayed-->" +
        "<a href=\"\"><div class=\"most-affected\">" +
            "<h3>India</h3>" +
            "<span>cases</span>" +
            "<p class=\"cases\">33,321,244</p>" +
            "<span>deaths</span>" +
            "<p class=\"deaths\">593,148</p>" +
            "<p>Click for more details</p>" +
        "</div></a>" +
        "<!--Where random stats will be displayed Country: X | Cases X | Deaths: X-->" +
        
    
        "</div>" +
        "<a href=\"\"><div class=\"random-stats\">Country: Australia | Cases: <p class=>29,865</p> | Deaths: <p>910</p></div>" +
        "</a>" +
        "<div class=\"timestamp\">As of <b>06/05/2021, 6:20pm</b></div>" +
        "</div>" +
        "</body>";
    
        context.html(html);
    }

}
