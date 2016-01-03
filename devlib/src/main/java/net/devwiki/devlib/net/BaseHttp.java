package net.devwiki.devlib.net;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * 基础的网络访问类
 * Created by Asia on 2016/1/2 0002.
 */
public class BaseHttp {

    private static String serverScheme = "http";
    private static String serverHost = "";

    public static void initHttp(String scheme, String host){
        BaseHttp.serverScheme = scheme;
        BaseHttp.serverHost = host;
    }

    public static String getServerHost() {
        return serverHost;
    }

    public static String getServerScheme() {
        return serverScheme;
    }

    private OkHttpClient client;

    public BaseHttp(){
        client = new OkHttpClient();
    }

    public void doGet(String url,BaseParams params){
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {

            }
        });
    }

    public void doGetSync(String url, BaseParams params){
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private HttpUrl getUrl(String url, BaseParams params){
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.scheme(serverScheme)
                .host(serverHost)
                .addPathSegment(url);
        return builder.build();
    }
}
