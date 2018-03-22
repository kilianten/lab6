
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
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.products.Product
/*2.2*/import models.users.User

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User, orders: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.55*/("""

"""),_display_(/*5.2*/main("View Orders", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""


    """),format.raw/*8.5*/("""<div class="container">

    <h1>Order History</h1>
    <br>

    """),_display_(/*13.6*/if(flash.containsKey("success"))/*13.38*/ {_display_(Seq[Any](format.raw/*13.40*/("""
      """),format.raw/*14.7*/("""<div class="alert alert-success">
        """),_display_(/*15.10*/flash/*15.15*/.get("success")),format.raw/*15.30*/("""
      """),format.raw/*16.7*/("""</div>
    """)))}),format.raw/*17.6*/("""

    """),_display_(/*19.6*/for(o <- orders) yield /*19.22*/{_display_(Seq[Any](format.raw/*19.23*/("""

      """),_display_(/*21.8*/o/*21.9*/.getOrderDate),format.raw/*21.22*/("""

                """),format.raw/*23.17*/("""<table class="table table-bordered">
                  <thead>
                    <tr>
                      <th>Id</th>
                      <th>Name</th>
                      <th>Quantity</th>
                      <th>Price</th>
                      <th>Total</th>
                    </tr>
                  </thead>
                  <tbody>
                        """),_display_(/*34.26*/for(item <- 0 to o.getItems.size - 1) yield /*34.63*/{_display_(Seq[Any](format.raw/*34.64*/("""
                            
                            """),format.raw/*36.29*/("""<tr>
                            <td>"""),_display_(/*37.34*/(item + 1)),format.raw/*37.44*/("""</td>
                            <td>"""),_display_(/*38.34*/o/*38.35*/.getItems.get(item).getProduct.getName),format.raw/*38.73*/("""</td> 
                            <td>"""),_display_(/*39.34*/o/*39.35*/.getItems.get(item).getQuantity),format.raw/*39.66*/("""</td> 
                            <td>"""),_display_(/*40.34*/o/*40.35*/.getItems.get(item).getProduct.getPrice),format.raw/*40.74*/("""</td> 
                            <td>"""),_display_(/*41.34*/o/*41.35*/.getItems.get(item).getItemTotal),format.raw/*41.67*/("""</td> 
                            </tr>
                        """)))}),format.raw/*43.26*/("""
                  """),format.raw/*44.19*/("""</tbody>

              </table>
              <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*47.67*/("%.2f".format(o.getOrderTotal))),format.raw/*47.99*/("""</strong></p>
              
                  <a href=""""),_display_(/*49.29*/routes/*49.35*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*49.69*/("""" class="btn btn-success btn-sm">
                  cancel
                  </a>
             
              <br>
    """)))}),format.raw/*54.6*/("""

"""),format.raw/*56.1*/("""</div>

""")))}))
      }
    }
  }

  def render(user:User,orders:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(user,orders)

  def f:((User,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (user,orders) => apply(user,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 17:15:37 GMT 2018
                  SOURCE: /home/wdd/webapps/lab6/app/views/viewOrders.scala.html
                  HASH: 52a2868c8f1bb4cd8ebfa2996d38122ca731b489
                  MATRIX: 651->1|689->33|1053->59|1201->112|1229->115|1262->140|1301->142|1334->149|1427->216|1468->248|1508->250|1542->257|1612->300|1626->305|1662->320|1696->327|1738->339|1771->346|1803->362|1842->363|1877->372|1886->373|1920->386|1966->404|2369->780|2422->817|2461->818|2547->876|2612->914|2643->924|2709->963|2719->964|2778->1002|2845->1042|2855->1043|2907->1074|2974->1114|2984->1115|3044->1154|3111->1194|3121->1195|3174->1227|3271->1293|3318->1312|3444->1411|3497->1443|3581->1500|3596->1506|3651->1540|3801->1660|3830->1662
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|40->8|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|51->19|51->19|51->19|53->21|53->21|53->21|55->23|66->34|66->34|66->34|68->36|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|75->43|76->44|79->47|79->47|81->49|81->49|81->49|86->54|88->56
                  -- GENERATED --
              */
          