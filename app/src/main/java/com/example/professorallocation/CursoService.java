package com.example.professorallocation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

//mapeia os metodos para usar no backend
public interface CursoService {

    @POST("courses")
    Call<CursoResponse> createRequestPost(@Body CursoPost cursoPost);

    @PUT("courses/{course_id}")
    Call<CursoResponse> createRequestPut(@Body CursoPost cursoPost, @Path("course_id") int id);

    @DELETE("courses/{course_id}")
    Call<Object> createRequestDelete(@Path("course_id") int id);

    @GET("courses")
    Call<List<CursoResponse>> createRequestGetAll();
}
