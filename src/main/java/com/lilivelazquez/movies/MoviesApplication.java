package com.lilivelazquez.movies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(MoviesApplication.class, args);

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url("https://jsonplaceholder.typicode.com/posts/1")
				.build();

		Response response = client.newCall(request).execute();

		System.out.println(response.body().string());

	}

}
