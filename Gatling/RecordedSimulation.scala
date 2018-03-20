
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://detectportal.firefox.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:57.0) Gecko/20100101 Firefox/57.0")

	val headers_0 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Pragma" -> "no-cache")

	val headers_5 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_6 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_49 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_68 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity")

    val uri1 = "www.urjc.es"
    val uri2 = "http://detectportal.firefox.com/success.txt"
    val uri3 = "https://cdnjs.cloudflare.com/ajax/libs"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/success.txt")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/success.txt")
			.headers(headers_0)))
		.pause(1)
		.exec(http("request_2")
			.get("/success.txt")
			.headers(headers_0)
			.resources(http("request_3")
			.get("/success.txt")
			.headers(headers_0),
            http("request_4")
			.get("/success.txt")
			.headers(headers_0)))
		.pause(10)
		.exec(http("request_5")
			.get("https://" + uri1 + ":443/estudios/grado")
			.headers(headers_5)
			.resources(http("request_6")
			.get("https://" + uri1 + ":443/components/com_k2/css/k2.css?v=2.8.0")
			.headers(headers_6),
            http("request_7")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css/master-webkit.css")
			.headers(headers_6),
            http("request_8")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css-compiled/demo-422f4a1ec6c581a3caadfd275853c548.css")
			.headers(headers_6),
            http("request_9")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css-compiled/mediaqueries.css")
			.headers(headers_6),
            http("request_10")
			.get("https://" + uri1 + ":443/libraries/gantry/css/grid-responsive.css")
			.headers(headers_6),
            http("request_11")
			.get("https://" + uri1 + ":443/media/sliders/css/style.min.css")
			.headers(headers_6),
            http("request_12")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css-compiled/menu.css")
			.headers(headers_6),
            http("request_13")
			.get("https://" + uri1 + ":443/plugins/system/rokbox/assets/styles/rokbox.css")
			.headers(headers_6),
            http("request_14")
			.get("/success.txt")
			.headers(headers_0),
            http("request_15")
			.get("https://" + uri1 + ":443/templates/rt_hadron/roksprocket/layouts/features/themes/slideshow/slideshow.css")
			.headers(headers_6),
            http("request_16")
			.get("https://" + uri1 + ":443/media/jui/js/jquery-noconflict.js?f1960440e7574e8e05421e37149d4650"),
            http("request_17")
			.get("https://" + uri1 + ":443/media/jui/js/jquery-migrate.min.js?f1960440e7574e8e05421e37149d4650"),
            http("request_18")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css/rt_hadron-custom.css")
			.headers(headers_6),
            http("request_19")
			.get("https://" + uri1 + ":443/media/k2/assets/js/k2.frontend.js?v=2.8.0&sitepath=/"),
            http("request_20")
			.get("https://" + uri1 + ":443/media/jui/js/jquery.min.js?f1960440e7574e8e05421e37149d4650"),
            http("request_21")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css-compiled/bootstrap.css")
			.headers(headers_6),
            http("request_22")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css-compiled/master-422f4a1ec6c581a3caadfd275853c548.css")
			.headers(headers_6),
            http("request_23")
			.get("https://" + uri1 + ":443/media/sliders/js/script.min.js"),
            http("request_24")
			.get("https://" + uri1 + ":443/media/system/js/core.js?f1960440e7574e8e05421e37149d4650"),
            http("request_25")
			.get("https://" + uri1 + ":443/media/jui/js/bootstrap.min.js?f1960440e7574e8e05421e37149d4650"),
            http("request_26")
			.get("https://" + uri1 + ":443/plugins/system/rokbox/assets/js/rokbox.js"),
            http("request_27")
			.get("https://" + uri1 + ":443/media/system/js/mootools-core.js?f1960440e7574e8e05421e37149d4650"),
            http("request_28")
			.get("https://" + uri1 + ":443/templates/rt_hadron/js/chart.js"),
            http("request_29")
			.get("https://" + uri1 + ":443/templates/rt_hadron/js/rokmediaqueries.js"),
            http("request_30")
			.get("https://" + uri1 + ":443/libraries/gantry/js/browser-engines.js"),
            http("request_31")
			.get("https://" + uri1 + ":443/templates/rt_hadron/js/custom.js"),
            http("request_32")
			.get("https://" + uri1 + ":443/modules/mod_roknavmenu/themes/default/js/rokmediaqueries.js"),
            http("request_33")
			.get("https://" + uri1 + ":443/modules/mod_roknavmenu/themes/default/js/sidemenu.js"),
            http("request_34")
			.get("https://" + uri1 + ":443/modules/mod_news_pro_gk5/interface/scripts/engine.mootools.js"),
            http("request_35")
			.get("https://" + uri1 + ":443/components/com_roksprocket/assets/js/mootools-mobile.js"),
            http("request_36")
			.get("https://" + uri1 + ":443/components/com_roksprocket/assets/js/rokmediaqueries.js"),
            http("request_37")
			.get("https://" + uri1 + ":443/components/com_roksprocket/assets/js/roksprocket.js"),
            http("request_38")
			.get("https://" + uri1 + ":443/media/system/js/mootools-more.js?f1960440e7574e8e05421e37149d4650"),
            http("request_39")
			.get("https://" + uri1 + ":443/components/com_roksprocket/layouts/features/themes/slideshow/slideshow.js"),
            http("request_40")
			.get("https://" + uri1 + ":443/components/com_roksprocket/assets/js/moofx.js"),
            http("request_41")
			.get("https://" + uri1 + ":443/components/com_roksprocket/layouts/features/assets/js/features.js"),
            http("request_42")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css/override-2i.css")
			.headers(headers_6),
            http("request_43")
			.get("/success.txt")
			.headers(headers_0),
            http("request_44")
			.get("https://" + uri1 + ":443/templates/rt_hadron/css/godaiworks.css")
			.headers(headers_6),
            http("request_45")
			.get("https://" + uri1 + ":443/media/mod_languages/images/web_en_Espanol.gif"),
            http("request_46")
			.get("https://" + uri1 + ":443/media/mod_languages/images/zh_cn.gif"),
            http("request_47")
			.get("https://" + uri1 + ":443/components/com_k2/images/system/font_decrease2.gif"),
            http("request_48")
			.get("https://" + uri1 + ":443/media/mod_languages/images/site_in_English.gif"),
            http("request_49")
			.get("https://" + uri1 + ":443/templates/rt_hadron/favicon.ico")
			.headers(headers_49),
            http("request_50")
			.get("https://" + uri1 + ":443/images/Covers/2017cover_estudios.jpg"),
            http("request_51")
			.get("https://" + uri1 + ":443/components/com_k2/images/system/font_increase2.gif"),
            http("request_52")
			.get("https://" + uri1 + ":443/images/Logos/ir_a_Facebook_1.png"),
            http("request_53")
			.get("https://" + uri1 + ":443/images/Logos/ir_a_Twitter_1.png"),
            http("request_54")
			.get("https://" + uri1 + ":443/images/Logos/Energia.png"),
            http("request_55")
			.get("https://" + uri1 + ":443/images/Logos/seguir_RSS_1.png"),
            http("request_56")
			.get("https://" + uri1 + ":443/images/Logos/ir_a_Instagram_1.png"),
            http("request_57")
			.get("https://" + uri1 + ":443/images/Logos/ir_a_Youtube_1.png"),
            http("request_58")
			.get("https://" + uri1 + ":443/images/Logos/ir_a_Flickr_1.png"),
            http("request_59")
			.get("https://" + uri1 + ":443/images/Logos/Universia2.png"),
            http("request_60")
			.get("https://" + uri1 + ":443/images/Logos/unefe_nuevo.png"),
            http("request_61")
			.get("https://" + uri1 + ":443/images/Logos/rcc.png"),
            http("request_62")
			.get("https://" + uri1 + ":443/images/Logos/URJC-Logo.png"),
            http("request_63")
			.get("https://" + uri1 + ":443/images/menu_web/urjc_oficina.jpg"),
            http("request_64")
			.get("https://" + uri1 + ":443/images/menu_web/urjc_online.jpg"),
            http("request_65")
			.get("https://" + uri1 + ":443/images/menu_web/urjc.png"),
            http("request_66")
			.get("https://" + uri1 + ":443/images/menu_web/urjc_matricula.jpg"),
            http("request_67")
			.get("https://" + uri1 + ":443/images/menu_web/urjc_grados.jpg"),
            http("request_68")
			.get("https://" + uri1 + ":443/libraries/gantry/assets/jui/fonts/IcoMoon.woff")
			.headers(headers_68),
            http("request_69")
			.get("https://" + uri1 + ":443/templates/rt_hadron/fonts/BebasNeue.woff")
			.headers(headers_68),
            http("request_70")
			.get("https://" + uri1 + ":443/images/Search.png"),
            http("request_71")
			.get("https://" + uri1 + ":443/libraries/gantry/assets/jui/fonts/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_68),
            http("request_72")
			.get("https://" + uri1 + ":443/templates/rt_hadron/fonts/OpenSans-CondLight.woff")
			.headers(headers_68),
            http("request_73")
			.get("/success.txt")
			.headers(headers_0)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}