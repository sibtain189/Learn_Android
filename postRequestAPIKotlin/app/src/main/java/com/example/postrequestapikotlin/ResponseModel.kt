package com.example.postrequestapikotlin

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseModel(

	val email: String? = null,
	val password: String? = null,
	val title: String? = null,
	val requestType: String? = null,
	val id: Int? = null
)