package IP;


import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GetPublicIP {
    public static void main(String[] args) {
        System.out.println(getPublicIP());
    }
    public static String getPublicIP() {
        String ip;
        Document doc;
        Elements eles = null;
        try {
            doc = Jsoup.connect("http://chaipip.com/").get();
            eles = doc.select("#ip");
        } catch (IOException e) {
            e.printStackTrace();
//        返回ip地址
        } finally {
            assert eles != null;
            ip = eles.attr("value");
        }

        return ip;
    }
}
