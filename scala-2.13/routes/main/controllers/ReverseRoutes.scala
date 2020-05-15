// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pratham/Desktop/jaibajrangballi/great work/completion of play/play-samples-play-scala-forms-example/conf/routes
// @DATE:Thu May 14 14:35:36 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseWebSocketChat(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chatSocket")
    }
  
    // @LINE:21
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chat")
    }
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createUser1")
    }
  
    // @LINE:14
    def columnAndBarChart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "columnAndBarChart")
    }
  
    // @LINE:17
    def bubbleChart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bubbleChart")
    }
  
    // @LINE:13
    def lineChart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "line")
    }
  
    // @LINE:15
    def areaAndPieChart(): Call = {
    
      () match {
      
        // @LINE:15
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "areaAndPieChart")
      
      }
    
    }
  
    // @LINE:11
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout1")
    }
  
    // @LINE:9
    def validateLoginPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validatePost1")
    }
  
    // @LINE:12
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index")
    }
  
    // @LINE:18
    def Homepage(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
