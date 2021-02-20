package com.example.callling_api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseDTO(

	@field:SerializedName("fileSizeBytes")
	val fileSizeBytes: Int? = null,

	@field:SerializedName("url")
	val url: String? = null
)