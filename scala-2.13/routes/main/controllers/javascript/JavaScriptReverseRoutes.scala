// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pratham/Desktop/jaibajrangballi/great work/completion of play/play-samples-play-scala-forms-example/conf/routes
// @DATE:Thu May 14 14:35:36 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseWebSocketChat(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebSocketChat.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatSocket"})
        }
      """
    )
  
    // @LINE:21
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebSocketChat.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser1"})
        }
      """
    )
  
    // @LINE:14
    def columnAndBarChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.columnAndBarChart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "columnAndBarChart"})
        }
      """
    )
  
    // @LINE:17
    def bubbleChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.bubbleChart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bubbleChart"})
        }
      """
    )
  
    // @LINE:13
    def lineChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.lineChart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "line"})
        }
      """
    )
  
    // @LINE:15
    def areaAndPieChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.areaAndPieChart",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areaAndPieChart"})
          }
        
        }
      """
    )
  
    // @LINE:11
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout1"})
        }
      """
    )
  
    // @LINE:9
    def validateLoginPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.validateLoginPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validatePost1"})
        }
      """
    )
  
    // @LINE:12
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
    // @LINE:18
    def Homepage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Homepage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
