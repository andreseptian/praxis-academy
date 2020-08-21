package project.latihan.latihanGson;

import java.util.HashMap;
import com.google.gson.Gson;

class JsonEncode {

    private final Gson serializer = new Gson();

    public static void main(String[] args) {

        new JsonEncode().mulai();
    }

    public void mulai() {
        HashMap<String, Object> obj = new HashMap<>();

        obj.put("name", "foo");
        obj.put("num", 100);
        obj.put("balance", 1000.21);
        obj.put("is_vip", true);

        String json = this.serializer.toJson(obj);
        System.out.print(json);
    }

}