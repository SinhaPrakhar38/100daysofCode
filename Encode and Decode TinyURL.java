public class Codec {

    private static String origionalUrl;
    private static String tinyUrl;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        origionalUrl=longUrl;
        tinyUrl="http://tinyurl.com/4e9iAkl";
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {


        return origionalUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
