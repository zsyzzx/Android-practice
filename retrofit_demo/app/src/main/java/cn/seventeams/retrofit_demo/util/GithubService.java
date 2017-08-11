package cn.seventeams.retrofit_demo.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

import cn.seventeams.retrofit_demo.GithubRepo;
import io.reactivex.Observer;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Url;

/**
 * Created by seven on 2017/8/5.
 */

public interface GithubService {
    @Headers({
            "Accept: application/vnd.github.v3.full+json",
            "User-Agent: Retrofit-Sample-App",
            "Cache-Control: max-age=640000"
    })
    @GET("users/{user}/repos")
    Call<List<GithubRepo>> listRepos(@Path("user") String user);

    @GET
    Call<List<String>> listUsers(@Url String url);

    @HTTP(method = "GET", path = "users", hasBody = false)
    Call<JsonArray> listUsers2();

    @GET("emojis")
    Call<JsonObject> getEmot();

}
