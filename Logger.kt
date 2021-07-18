/* REPLACE: With your application id */
package com.example.templates.utils

import android.util.Log

interface RequiresLogger{
    val TAG: String
    fun log(message: String){
        Log.d(TAG, message)
    }
}

/* HOW TO USE? */
/* EXAMPLE: */
class ExampleClass: RequiresLogger{
    /* IMPORTANT: define the variable TAG with anything (preferably your class name) */
    override val TAG = "ExampleClass"
    
    fun exampleFunction(){
        /* NOTE: This is how you log anything */
        log("exampleFunction is being executed")
    }
}
