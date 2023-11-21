package com.subham.kotlinprojects

class Functions
{
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            println("The sum is ${add(78,89)}")
        }

        fun add(a : Int, b : Int) : Int
        {
            return a + b
        }

        fun add(a : Int, b : Int, c: Int) : Int
        {
            return a + b + c
        }

    }

}
