package ConnectToKrsApi;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class SendJsonRequest implements IConnect {

    public String readJson(String nip) throws IOException {
        URL url = new URL("https://api-v3.mojepanstwo.pl/dane/krs_podmioty.json?conditions[q]=" + nip + "\n");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("USER_AGENT", "Chrome");
        InputStream inputStream = url.openStream();
        Scanner scanner = new Scanner(inputStream);
        String request = scanner.nextLine();
        return request;
    }
}