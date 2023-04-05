package com.muhsanjaved.databindinginobservables.viewModel

import androidx.lifecycle.ViewModel
import com.muhsanjaved.databindinginobservables.model.Person

class MainViewModel : ViewModel() {

    var person = Person("Ali", 25)
}