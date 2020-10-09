public enum CatColor
{
    WHITE("Белый"),            // #1
    BLACK("Черный"),           // #2
    SILVER("Серебряный"),      // #3
    GOLDEN("Золотой"),         // #4
    CREAM("Кремовый"),         // #5
    CHOCOLATE("Шоколадный"),   // #6
    BLUE("Голубой");           // #7

    private final String translation;
    CatColor(String translation) { this.translation = translation; }
    public String getTranslation()
    { return translation; }
}

//public enum CatColor {
//    WHITE(1),      // #1
//    BLACK(2),      // #2
//    SILVER(3),     // #3
//    GOLDEN(4),     // #4
//    CREAM(5),      // #5
//    CHOCOLATE(6),  // #6
//    BLUE(7);       // #7
//    ; //each is an instance of Color
//
//    private int value;
//
//    private CatColor(){}
//
//    private CatColor(int i){
//        this.value = i;
//    }
//
//    //define instance method
//    public void printValue(){
//        System.out.println(this.value);
//    }
//}

//public enum CatColor
//{
//    WHITE("Белый"),      // #1
//    BLACK("Черный"),      // #2
//    SILVER("Серебряный"),     // #3
//    GOLDEN("Золотой"),     // #4
//    CREAM("Кремовый"),      // #5
//    CHOCOLATE("Шоколадный"),  // #6
//    BLUE("Голубой");        // #7
//    private String translation;
//    CatColor(String translation) { this.translation = translation; }
//    public String getTranslation()
//    { return translation; }
//}

//public enum CatColor
//{
//    WHITE,      // #1
//    BLACK,      // #2
//    SILVER,     // #3
//    GOLDEN,     // #4
//    CREAM,      // #5
//    CHOCOLATE,  // #6
//    BLUE        // #7
//}

//enum Color {
//    WHITE, BLACK, SILVER, GOLDEN, CREAM, CHOCOLATE, BLUE,
//}
//public class enumColor {
//
//    public static void main(String[] args) {
//        Color 1 = Color.WHITE;
//        System.out.println(1);
//        Color 2 = Color.BLACK;
//        System.out.println(2);
//        Color 3 = Color.SILVER;
//        System.out.println(3);
//        Color 4 = Color.GOLDEN;
//        System.out.println(4);
//        Color 5 = Color.CREAM;
//        System.out.println(5);
//        Color 6 = Color.CHOCOLATE;
//        System.out.println(6);
//        Color 7 = Color.BLUE;
//        System.out.println(7);
//    }
//}

//enum Color {
//    WHITE,
//    BLACK,
//    SILVER,
//    GOLDEN,
//    CREAM,
//    CHOCOLATE,
//    BLUE
//}
//public class catColor{
//    public static void main(String[] args) {
//        switch (catColor) { //The name of the enumertion constants are used without their enumeration
//            case 1: //only constants defined under enum Directions can be used
//                System.out.println("WHITE direction");
//                break;
//            case 2:
//                System.out.println("BLACK direction");
//                break;
//            case 3:
//                System.out.println("SILVER directiion");
//                break;
//            case 4:
//                System.out.println("GOLDEN directiion");
//                break;
//            case 5:
//                System.out.println("CREAM directiion");
//                break;
//            case 6:
//                System.out.println("CHOCOLATE directiion");
//                break;
//            case BLUE:
//                System.out.println("BLUE directiion");
//                break;
//        }
//    }
//}

//WHITE = 1,
//BLACK = 2,
//SILVER = 3,
//GOLDEN = 4,
//CREAM = 5,
//CHOCOLATE = 6,
//BLUE = 7,
