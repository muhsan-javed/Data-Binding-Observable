
package com.muhsanjaved.databindinginobservables
/*
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry

class Person(pName:String, pAge:Int) : Observable {

    @get:Bindable
    var name:String = pName
    set(value) {
        field = value
        listener.notifyChange(this, BR.name)
    }


    @get:Bindable
    var age:Int = pAge
    set(value) {
        field = value
        listener.notifyChange(this,BR.age)
    }

  */
/*  @Bindable get(){
        return field.toUpperCase()
    }*//*

    val listener:PropertyChangeRegistry = PropertyChangeRegistry()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listener.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listener.remove(callback)
    }
}*/
