import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    HashMap<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!this.dialingCodes.containsKey(code) && !this.dialingCodes.containsValue(country)) {
            this.dialingCodes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (int code: this.dialingCodes.keySet()) {
            if (country == this.dialingCodes.get(code)) {
                return code;
            }
        }
        return null;

    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (this.dialingCodes.containsValue(country)) {
            this.dialingCodes.remove(findDialingCode(country));
            addNewDialingCode(code, country);
        }
    }
}
