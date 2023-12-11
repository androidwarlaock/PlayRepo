
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Book],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm: Form[Book])(implicit messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*2.1*/("""


"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/layout("Edit")/*7.16*/{_display_(Seq[Any](format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""<h1>Edit book</h1>

    """),_display_(/*11.6*/helper/*11.12*/.form(action =routes.BooksController.update())/*11.58*/{_display_(Seq[Any](format.raw/*11.59*/("""

       """),_display_(/*13.9*/helper/*13.15*/.inputText(bookForm("id"))),format.raw/*13.41*/("""
       """),_display_(/*14.9*/helper/*14.15*/.inputText(bookForm("title"))),format.raw/*14.44*/("""
       """),_display_(/*15.9*/helper/*15.15*/.inputText(bookForm("price"))),format.raw/*15.44*/("""
       """),_display_(/*16.9*/helper/*16.15*/.inputText(bookForm("author"))),format.raw/*16.45*/("""


        """),format.raw/*19.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i> Edit Book</button>
    """)))}),format.raw/*20.6*/("""
    
  """)))}),format.raw/*22.4*/("""

"""))
      }
    }
  }

  def render(bookForm:Form[Book],messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)(messages)

  def f:((Form[Book]) => (play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => (messages) => apply(bookForm)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-12-10T09:56:45.432750100
                  SOURCE: E:/newrepo/newproject/app/views/edit.scala.html
                  HASH: fcb93543337e8e0671eabf807771bcd1539274ae
                  MATRIX: 930->1|1064->67|1108->63|1137->83|1164->85|1186->99|1224->100|1252->102|1303->127|1318->133|1373->179|1412->180|1448->190|1463->196|1510->222|1545->231|1560->237|1610->266|1645->275|1660->281|1710->310|1745->319|1760->325|1811->355|1849->366|1990->477|2029->486
                  LINES: 27->1|30->5|33->2|36->6|37->7|37->7|37->7|39->9|41->11|41->11|41->11|41->11|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|49->19|50->20|52->22
                  -- GENERATED --
              */
          