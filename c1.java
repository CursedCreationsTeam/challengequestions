import java.lang.NullPointerException;

void main(String[] args) {
    if (args == null)
        throw new NullPointerException("args is null!");
    
    for (int i_init = 1; i_init < args.length; i_init++) {
        //System.out.println(args[i_init]);
        // For each character in string
        char[] index = args[i_init].toCharArray();
        for (int i_secondary = 0; i_secondary < index.length; i_secondary++) {
            
        }
    }
}