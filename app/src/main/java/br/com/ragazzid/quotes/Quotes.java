package br.com.ragazzid.quotes;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zero on 10/08/17.
 */

public class Quotes {

    String category;
    String icon_url;
    String url;
    String value;


    public Quotes(String jsonString) {
        try {
            jsonParser(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private void jsonParser(String json) throws JSONException {
        JSONObject object = new JSONObject(json);
        setUrl(object.getString("url"));
        setIcon_url(object.getString("icon_url"));
        setCategory(object.getString("category"));
        setValue(object.getString("value"));
    }
}
