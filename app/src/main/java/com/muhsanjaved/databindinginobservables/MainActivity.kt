package com.muhsanjaved.databindinginobservables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.Bindable
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.muhsanjaved.databindinginobservables.databinding.ActivityMainBinding
import com.muhsanjaved.databindinginobservables.viewModel.MainViewModel


class MainActivity : AppCompatActivity() {

    /*private val person = Person("Ali", 35);
    private val person = PrimitiveObservablePerson("Ali", 35)
    private var person = ObservableField<PrimitiveObservablePerson> =
        ObservableField(PrimitiveObservablePerson("Ali", 35))
    val listData : ObservableArrayList<String> = ObservableArrayList()
    val mapData : ObservableArrayMap<String, Any> = ObservableArrayMap()*/

    private lateinit var binding: ActivityMainBinding
//    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

     /*   listData.add("Ali")
        listData.add("Muhsan")
        listData.add("Hyder")

        mapData.put("name","Ali")
        mapData.put("age", 22)
        binding.data = mapData
        binding.person = person
*/


      /*  viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.mainViewModel = viewModel
        binding.handler = this*/
    }

    fun onClick(view: View) {
      /*  viewModel.person.name = "Muhsan"
        viewModel.person.age = 11*/

        /*listData.add(0,"Muhsan Javed")
        mapData.put("name","Usman")
        mapData.remove("age", 22)
        Toast.makeText(this, "Observable Custom", Toast.LENGTH_SHORT).show()
        person.age.set(person.age.get()+1)
        person = PrimitiveObservablePerson( "Ali", 5)
         person = Person("A", 100)
        person.name.set("Usman")
        binding.person = person
        person.set(PrimitiveObservablePerson("Ali", 35))
        Toast.makeText(this, "Person age is ${person.age.get()}", Toast.LENGTH_SHORT).show()*/
    }

}

/*
data class Person(var name: String, var age: Int) {

//    @get:Bindable
//    var a: Int = 10

    */
/* @Bindable
     get() {
         return feild
     }*//*

}*/
