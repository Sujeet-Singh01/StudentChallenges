class Phone
{
    void call(){
        System.out.println("Phone call");
    }
    void sms(){
        System.out.println("Send sms");
    }
}
interface camera
{
    void click();
    void record();
}
interface musicPlayer
{
    void play();
    void pause();
    void next();
}
class smartPhone extends Phone implements camera,musicPlayer
{
    public void click()
    {
        System.out.println("Snap Clicked");
    }
    public void record()
    {
        System.out.println("Video Recorded");
    }
    public void play()
    {
        System.out.println("Play");
    }
    public void pause()
    {
        System.out.println("Pause");
    }
    public void next()
    {
        System.out.println("Next");
    }
}
public class InterfacePractice2 {
    public static void main(String args[])
    {
        smartPhone sp=new smartPhone();
        sp.call();
        sp.play();
    }
}
