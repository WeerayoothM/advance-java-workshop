public class DemoClean {
    public static void main(String[] args) {

        // Type 1
        if (true){
            if (true){
                if (true){
                    // TODO Sth
                }
            }
        }

        // Type 2 fail fast , return early
        if (false) {return ;}
        if (false) {throw new RuntimeException("2");}
        if (false) {throw new RuntimeException("3");}
        // TODO Sth
    }

    String demo02() {
        String result = "";
        if (true){
            result += "1";
        }
        if (true) {
            result += "2";
        }
        return result;
    }

    String demo03(int score) {
        String result = "";
        if (score >= 80){
            return "A";
        }
        if (score >= 70) {
            return  "B";
        }
        return result;
    }
}
