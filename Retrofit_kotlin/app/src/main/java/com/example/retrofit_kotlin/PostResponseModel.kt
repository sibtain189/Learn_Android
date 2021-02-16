package com.example.retrofit_kotlin

import com.google.gson.annotations.SerializedName

data class PostResponseModel(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("postId")
	val postId: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("email")
	val email: String? = null
)