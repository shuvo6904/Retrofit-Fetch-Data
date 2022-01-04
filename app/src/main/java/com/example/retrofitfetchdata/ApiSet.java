package com.example.retrofitfetchdata;

import com.example.retrofitfetchdata.model.ResponseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiSet {

    @GET("/posts")
    Call<List<ResponseModel>> getData();

}
