// import java.awt.Desktop;
// import java.net.URI;

public class Desktop
{
    private String url;
    public Desktop()
    {
        url = "https://www.google.com";
        Runtime rt = Runtime.getRuntime();
        try
        {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        }
        catch (java.io.IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
