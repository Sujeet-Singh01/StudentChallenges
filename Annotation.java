@interface Annot
{
    String name();
    String Project();
    String date() default "today";
}
@Annot(name="Sujeet",Project="College")
public class Annotation {
    public static void main(String args[])
    {
        int i=0;
    }
}
