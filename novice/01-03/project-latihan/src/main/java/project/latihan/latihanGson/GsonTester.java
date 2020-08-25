package project.latihan.latihanGson;

import java.util.Arrays;
import com.google.gson.Gson;

public class GsonTester {
   public static void main(String args[]) {

      Gson gson = new Gson();
      String name = "Andre Septian";
      long rollNo = 1;
      boolean verified = false;
      int[] marks = { 100, 90, 85 };

      // Serialization
      System.out.println("{");
      System.out.println("name: " + gson.toJson(name) + ",");
      System.out.println("rollNo: " + gson.toJson(rollNo) + ",");
      System.out.println("verified: " + gson.toJson(verified) + ",");
      System.out.println("marks:" + gson.toJson(marks));
      System.out.println("}");

      // De-serialization
      name = gson.fromJson("\"Andre Septian\"", String.class);
      rollNo = gson.fromJson("1", Long.class);
      verified = gson.fromJson("false", Boolean.class);
      marks = gson.fromJson("[100,90,85]", int[].class);

      System.out.println("name: " + name);
      System.out.println("rollNo: " + rollNo);
      System.out.println("verified: " + verified);
      System.out.println("marks:" + Arrays.toString(marks));
   }
}