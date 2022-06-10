package pl.lublin.wsei.java.cwiczenia.lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Infografika {
    public static void main(String[] args) {
        String exItem ="\t<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Koniunktura gospodarcza w maju 2022 r.]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Fri, 27 May 2022 15:42:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-maju-2022-r-,38,71.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-maju-2022-r-,38,71.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022.png\" type=\"image/png\" width=\"2362\" height=\"4548\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(exItem);
        if(m.find())
            System.out.println("Znaleziono tytuł: "+m.group(1));
        else
            System.out.println("Nie znaleziono tytułu... ");
        Pattern pat2 = Pattern.compile("<link>(.*)</link>");
        Matcher m2 = pat2.matcher(exItem);
        if(m2.find())
            System.out.println("Adres strony to "+m2.group(1));
        else
            System.out.println("Nie odnaleziono adresu... ");
        Pattern pat3 = Pattern.compile("<media:thumbnail url=\"(.*)\" />");
        Matcher m3 = pat3.matcher(exItem);
        if(m3.find())
            System.out.println("adres grafiki to "+m3.group(1));
        else
            System.out.println("Nie odnaleziono szerokości... ");
        Pattern pat4 = Pattern.compile("<guid isPermaLink=\"false\">(.*)</guid>");
        Matcher m4 = pat4.matcher(exItem);
        if(m4.find())
            System.out.println("Adres miniaturki  to "+m4.group(1));
        else
            System.out.println("Nie odnaleziono adresu miniaturki... ");
    }

}
