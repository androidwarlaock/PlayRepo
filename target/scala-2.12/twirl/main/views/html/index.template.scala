
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(books : List[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("All Books")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""

	"""),format.raw/*7.2*/("""<h1>All books</h1>

       <button type="button"><a href=""""),_display_(/*9.40*/routes/*9.46*/.BooksController.create()),format.raw/*9.71*/("""">NEW</a></button>
<br><br>
   		"""),_display_(/*11.7*/for(book <- books) yield /*11.25*/{_display_(Seq[Any](format.raw/*11.26*/("""
   		   """),format.raw/*12.9*/("""<a href=""""),_display_(/*12.19*/routes/*12.25*/.BooksController.show(book.id)),format.raw/*12.55*/("""">"""),_display_(/*12.58*/book/*12.62*/.title),format.raw/*12.68*/("""</a>
   		   <p>Price : """),_display_(/*13.21*/book/*13.25*/.price),format.raw/*13.31*/("""</p>
   		   <p>Author: """),_display_(/*14.21*/book/*14.25*/.author),format.raw/*14.32*/("""</p>
   		   
   		""")))}),format.raw/*16.7*/("""
""")))}),format.raw/*17.2*/("""


"""))
      }
    }
  }

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-12-10T09:56:45.443649800
                  SOURCE: E:/newrepo/newproject/app/views/index.scala.html
                  HASH: b0a2dec4d5089abd5d47ba6f928a83a993812fe8
                  MATRIX: 912->3|1026->24|1053->26|1080->45|1118->46|1147->49|1232->108|1246->114|1291->139|1351->173|1385->191|1424->192|1460->201|1497->211|1512->217|1563->247|1593->250|1606->254|1633->260|1685->285|1698->289|1725->295|1777->320|1790->324|1818->331|1868->351|1900->353
                  LINES: 27->3|32->4|33->5|33->5|33->5|35->7|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|45->17
                  -- GENERATED --
              */
          