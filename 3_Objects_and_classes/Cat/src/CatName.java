public enum CatName
{
    MURKA("Мурка"),         // #1
    NICE("Найс"),           // #2
    KUZYA("Кузя"),          // #3
    VASIA("Вася"),          // #4
    BARSIK("Барсик"),       // #5
    KRIS("Крис"),           // #6
    MONSTER("Монстер"),     // #7
    SPARTAK("Спартак"),     // #8
    MOZART("Моцарт"),       // #9
    BEETHOVEN("Бетховен"),  // #10
    SNOW("Снежок"),         // #11
    VASELISA("Васелиса");   // #12

    private final String translation;
    CatName(String translation) { this.translation = translation; }
    public String getTranslation()
    { return translation; }
}
