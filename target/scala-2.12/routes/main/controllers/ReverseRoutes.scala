// @GENERATOR:play-routes-compiler
// @SOURCE:E:/newrepo/newproject/conf/routes
// @DATE:Mon Dec 11 21:28:01 IST 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:11
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:15
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:16
    def returnJson(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "jsn/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:12
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:13
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/edit/id")
    }
  
    // @LINE:10
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
  }


}
