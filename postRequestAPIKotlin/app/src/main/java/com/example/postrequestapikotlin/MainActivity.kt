package com.example.postrequestapikotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPost.setOnClickListener {
            val apiClient = Network.getInstance().create(APIClient::class.java)
            val requestModel = RequestModel(
                etEmail.text.toString(),
                etPassword.text.toString(),
                etTitle.text.toString(),
                etRequestType.text.toString()
            )
            apiClient.getPost(requestModel).enqueue(object : Callback<ResponseModel> {
                override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                }

                override fun onResponse(
                    call: Call<ResponseModel>,
                    response: Response<ResponseModel>
                ) {
                    if (response.code() == 201) {
                        response.body()?.let {

                            val intent = Intent(this@MainActivity, SecondActivity::class.java)
                            intent.putExtra("email", it.email)
                            intent.putExtra("title", it.title)
                            intent.putExtra("req", it.requestType)
                            intent.putExtra("id",it.id)
                            startActivity(intent)

                        }

                    }
                }

            })

        }
    }

}