package java9.http2.support;

import java.io.IOException;
import java.net.URI;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

/**
 * A new way of performing HTTP calls arrives with Java 9. 
 * This is a much overdue replacement for the old "HttpURLConnection" API.
 * It also supports WebSockets and HTTP/2 out of the box
 * </br></br>
 * However, it is included as a part of jdk.incubator module, which means it
 * cannot be considered 100% ready yet. Still we can use this API for HTTP calls
 * </br></br>
 * <b>Note:</b> You need to include the module jdk.incubator.httpclient else it
 * will throw NoClassDefFoundError at the runtime
 * @author saukedia1
 *
 */
public class Http2SupportDemo {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.google.com"))
            .header("User-Agent", "Java")
            .GET()
            .build();

        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());

        System.out.println(resp.body());
    }

}
