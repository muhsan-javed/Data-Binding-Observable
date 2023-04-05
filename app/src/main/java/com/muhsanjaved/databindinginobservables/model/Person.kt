package com.muhsanjaved.databindinginobservables.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.muhsanjaved.databindinginobservables.BR

class Person(pName:String, pAge:Int) : BaseObservable() {

    @get:Bindable
    var name:String = pName
    set(value) {
        field = value
        notifyPropertyChanged(BR.name)
    }

    @get:Bindable
    var age:Int = pAge
        set(value) {
            field = value
            notifyPropertyChanged(BR.age)
        }
}