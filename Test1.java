

public class Test1 {
        public static void main(String[] args) {
                for (int i = 0; i < Integer.MAX_VALUE; ++i) {
                        String str = replaceChars("898fe51c-f07e-36fa-aed6-8080305772cf");
                }                
        }

        private static String replaceChars(String token) {
                if ((token != null) && (token.length() > 0) && (token.length() > 4)) {
                        // mask everything after first 4 characters
                        StringBuilder sb = new StringBuilder();
                        sb.append(token.substring(0, 4));
                        for (int i = 5; i < token.length(); ++i) {
                                sb.append("*");
                        }
                        return sb.toString();
                } else if (token.length() <= 4) {
                        // nothing to mask
                        return token;
                }
                // empty token
                return "";
        }
}

