// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pratham/Desktop/jaibajrangballi/great work/completion of play/play-samples-play-scala-forms-example/conf/routes
// @DATE:Thu May 14 14:35:36 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWebSocketChat WebSocketChat = new controllers.ReverseWebSocketChat(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWebSocketChat WebSocketChat = new controllers.javascript.ReverseWebSocketChat(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
