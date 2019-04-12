package ReadJson;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CompanyInfo {
    @SerializedName("krs_podmioty.nip")
    private String krs_podmioty_nip;
}
