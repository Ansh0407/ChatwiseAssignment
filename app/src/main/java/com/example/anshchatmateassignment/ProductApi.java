package com.example.anshchatmateassignment;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductApi {
    @GET("products")
    Call<ProductsResponse> getProducts();
}
