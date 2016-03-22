package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    val a=1+1
    val b=a-2
    Ok(views.html.index("Your new application is ready."))
  }

}
