import ConnectToKrsApi.SendJsonRequest;
import ReadJson.ReadJsonFIle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new SendJsonRequest().readJson("9512032166"));
            ReadJsonFIle readJsonFIle = new ReadJsonFIle();
            System.out.println(readJsonFIle.creatCurrencyFromJson("9512032166"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
