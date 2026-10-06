import java.util.Locale;

class Badge {
    public String print(Integer id, String name, String department) {
        String output = "";
        if (id != null) {
            output += "[" + id + "] - ";
        }
        output += name + " - ";

        if (department == null) {
            output += "OWNER";
        } else {
            output += department.toUpperCase();
        }
        return output;
    }
}
