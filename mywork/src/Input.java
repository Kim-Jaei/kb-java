public class Input {

    public static void Input(){}

    public static String Input(String title){
        return title;
    }
    public static String Input(String title, String defaultTitle) {
        if(title.equals("")){
            return defaultTitle;
        }else{
            return title;
        }
    }
}
//    public static String readTitle(String title, String defaultValue) {
//        System.out.print(defaultValue);
//        return title;
//    }
//}