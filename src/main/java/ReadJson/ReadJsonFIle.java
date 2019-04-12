package ReadJson;

import ConnectToKrsApi.SendJsonRequest;
import com.google.gson.Gson;

import java.io.IOException;

public class ReadJsonFIle {

    public Company creatCurrencyFromJson(String nip) throws IOException {
        Gson gson = new Gson();
        SendJsonRequest sendJsonRequest = new SendJsonRequest();
        Company currencyObject = gson.fromJson(sendJsonRequest.readJson(nip), Company.class);
        return currencyObject;
    }
}
