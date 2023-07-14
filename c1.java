import java.util.Arrays;

void main() {
    String[] strings = new String[] {"flower", "flow", "flight"};
    System.out.println(findPrefix(strings));
}

String findPrefix(String[] strings) {
    String[] prefixes = new String[strings.length-1];
    for (int i = 0; i < prefixes.length; i++)
        prefixes[i] = ""; 
    System.out.println(Arrays.toString(prefixes));
    int startnum = 0;
    char[] index = strings[startnum].toCharArray();
    for (int i_init = startnum+1; i_init < strings.length; i_init++) {
        //System.out.println(strings[i_init]);s
        // For each character in string
        char[] nextIndex = strings[i_init].toCharArray();
        for (int i_secondary = 0; i_secondary < (index.length > nextIndex.length ? nextIndex.length : index.length); i_secondary++) {
            char current = nextIndex[i_secondary];
            if (current == index[i_secondary])
                prefixes[i_init-1] += current;
        }
    }
    return Arrays.toString(prefixes);
    // String fPrefix = "";
    // index = prefixes[startnum].toCharArray();
    // for (int i_init = startnum; i_init < prefixes.length; i_init++) {
    //     //System.out.println(strings[i_init]);s
    //     // For each character in string
    //     char[] nextIndex = prefixes[i_init].toCharArray();
    //     for (int i_secondary = 0; i_secondary < (index.length > nextIndex.length ? nextIndex.length : index.length); i_secondary++) {
    //         char current = nextIndex[i_secondary];
    //         if (current == index[i_secondary])
    //             fPrefix += current;
    //     }
    // }
    // return fPrefix;
}