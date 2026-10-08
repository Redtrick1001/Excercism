class SqueakyClean {
    static String clean(String identifier) {
        char[] characters =  identifier.toCharArray();
        StringBuilder MainOutput = new StringBuilder();
        boolean nextCharUppercase = false;

        if (characters.length == 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();

        for (char character: characters) {
            if (character == '.') {
            } else if (character == '$') {
            } else if (character == '#') {
            } else if (character == '\u0000') {
            } else if (character == '¡') {
            } else if (character == '!') {
            } else {
                output.append(character);
            }
        }

        System.out.println(output.toString());

        for (char character: output.toString().toCharArray()) {
            if (nextCharUppercase) {
                MainOutput.append(Character.toUpperCase(character));
                nextCharUppercase = false;
            } else if (character == ' ') {
                MainOutput.append('_');
            } else if (character == '-') {
                    nextCharUppercase = true;
            } else if (character == '4') {
                MainOutput.append('a');
            } else if (character == '3') {
                MainOutput.append('e');
            } else if (character == '0') {
                MainOutput.append('o');
            } else if (character == '1') {
                MainOutput.append('l');
            } else if (character == '7') {
                MainOutput.append('t');
            } else {
                MainOutput.append(character);
            }
        }


        return MainOutput.toString();
    }
}
