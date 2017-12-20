package jaira.cabarrubias.com.recipelist.user.recipelist;

/**
 * Created by user on 17/12/2017.
 */

public class Items {
    private String title, shortdesc;



    public Items(String title, String shortdesc) {
        this.title = title;
        this.shortdesc = shortdesc;
    }

    public void setTitle(String title) {

        this.title = title;
    }



    public String getTitle() {

        return title;
    }

    public String getShortdesc() {

        return shortdesc;
    }
}
