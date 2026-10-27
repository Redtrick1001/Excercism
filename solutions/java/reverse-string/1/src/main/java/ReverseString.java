class ReverseString {

    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        return sb.toString();
    }
  
}
