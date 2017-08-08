package cn.seventeams.retrofit_demo.util;

import java.util.List;

import cn.seventeams.retrofit_demo.GithubRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by seven on 2017/8/5.
 */

public interface GithubService {
    @GET("users/{user}/repos")
    Call<List<GithubRepo>> listRepos(@Path("user") String user);
}
