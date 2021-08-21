package com.example.codehiveregistration

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.*
import com.example.codehiveregistration.API.APIclient
import com.example.codehiveregistration.API.APIinterface
import com.example.codehiveregistration.Models.Registrationrequest
import com.example.codehiveregistration.databinding.ActivityMainBinding
import retrofit2.Callback
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    lateinit var binding:ActivityMainBinding
    lateinit var etName:EditText
    lateinit var etDob:EditText
    lateinit var etidnumber:EditText
    //lateinit var etnationality:EditText
    lateinit var etPhonenumber:EditText
    lateinit var etEmail:EditText
    lateinit var btnRegister:Button
    lateinit var spnationality:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSpinner()
    clickRegister()
    }

fun setupSpinner() {
    etName = findViewById(R.id.etName)
    etDob = findViewById(R.id.etDob)
    etNationality = findViewById(R.id.etNationality)
    etidnumber = findViewById(R.id.etidnumber)
    etPhonenumber = findViewById(R.id.etPhonenumber)
    etEmail = findViewById(R.id.etEmail)
    btnRegister = findViewById(R.id.btnRegister)
  spnationality=findViewById(R.id.spnationality)
    var nationalities= arrayOf("Kenyan","South Sudan","Ugandan")
    var nationalityAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,nationalities)
    nationalityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    binding.spNationality.adapter=nationalityAdapter

}
        fun clickRegister(){
     binding.btnRegister.setOnClickListener{
         binding.pbRegistration.visibility=View.VISIBLE
     }
           var Name=binding.etName.text.toString()
           if(Name.isEmpty()){
            binding.etName.setError("name is required")
           }
            var Dob=binding.etDob.text.toString()
            var idnumber=binding.etidnumber.text.toString()
            var Nationality=binding.spNationality.selectedItem.toString()
            var Phonenumber=binding.etPhonenumber.text.toString()
            var Email=binding.etEmail.text.toString()
         var password=binding.etpassword.text.toString()

         if(!error(){
                 binding.pbRegistration.visibility=View.VISIBLE
             var registerRequest=Registrationrequest(
                 name= Name,
                 phonenumber = Phonenumber,
                 Email = Email,
                 dateofbirth = Dob,
                 nationality = Nationality.upperCase,
                 password = password,
             )
                 var retrofit=APIclient.buildApiClient(APIinterface::class.java)
                 var request=retrofit.registerStudent(registerRequest)
                 request.enqueue(object :Callback<Registrationrequest>
                 ){
                     binding.pbRegistration.visibility=View.GONE
                     if(response.isSuccessful){
                         Toast.makeText()
                 }
                     else
             }


            var student=Student(Name,Dob,idnumber,Nationality,Phonenumber,Email)
            Toast.makeText(baseContext,Name,Toast.LENGTH_LONG).show()
            val intent=Intent(baseContext,CourseActivity::class.java)
            startActivity(intent)
            val intent2=Intent(baseContext,CourseActivity::class.java)
            startActivity(intent2)
        }


    }
}






//data class  Student(
//    var name:String,
//    var Dob:String,
//    var idnumber:String,
//    var nationality:String,
//    var Phonenumber:String,
//    var email:String
)







