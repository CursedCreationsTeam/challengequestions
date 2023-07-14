//import java.lang.NullPointerException;

void main() {
    String[] strings = new String[] {"flower", "flow", "flight"};
    System.out.println(findPrefix(strings));
}

String findPrefix(String[] strings) {
    String prefix = "";
    int startnum = 0;
    char[] index = strings[startnum].toCharArray();
    for (int i_init = startnum+1; i_init < strings.length; i_init++) {
        //System.out.println(strings[i_init]);
        // For each character in string
        char[] nextIndex = strings[i_init].toCharArray();
        for (int i_secondary = 0; i_secondary < index.length; i_secondary++) {
            
        }
    }
}