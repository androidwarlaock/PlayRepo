// @GENERATOR:play-routes-compiler
// @SOURCE:E:/newrepo/newproject/conf/routes
// @DATE:Mon Dec 11 21:28:01 IST 2023

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBooksController BooksController = new controllers.ReverseBooksController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBooksController BooksController = new controllers.javascript.ReverseBooksController(RoutesPrefix.byNamePrefix());
  }

}
