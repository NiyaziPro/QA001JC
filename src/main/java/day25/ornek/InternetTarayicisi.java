package day25.ornek;

public class InternetTarayicisi {

    String webSitesi;

    String url;

    public InternetTarayicisi(String webSitesi, String url) {
        this.webSitesi = webSitesi;
        this.url = url;
    }

    @Override
    public String toString() {
        return "InternetTarayicisi{" +
                "webSitesi='" + webSitesi + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
