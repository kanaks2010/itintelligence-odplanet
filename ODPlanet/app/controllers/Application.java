package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result heading() {
        return ok(index.render("This is amanur rahman kanak."));
    }    
    public static Result contact() {
        return ok(index.render("This is amanur rahman kanak."));
    }
}
