package com.autoever.hyundaicarlist.api

import com.autoever.hyundaicarlist.models.Car
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiService {
    @GET("cars")
    suspend fun getCarList() : Response<List<Car>> //전체 차량 리스트

    @GET("cars/{id}")
    suspend fun getCar() : Response<Car> //차량 하나 조회

    @POST("cars/{id}")
    suspend fun createCar(@Body car: Car): Response<Car>

    @PUT("cars/{id}")
    suspend fun updateCar(@Path("id") id: String, @Body car: Car) : Response<Car>

    @DELETE("cars/{id}")
    suspend fun deleteCar(@Path("id") id: String) : Response<Unit> //return type은 null을 반환
}