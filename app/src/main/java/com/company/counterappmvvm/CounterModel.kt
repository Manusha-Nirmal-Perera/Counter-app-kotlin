package com.company.counterappmvvm

data class CounterModel(var count : Int)

class CounterRepository{
    private var counter = CounterModel(0)

    fun getCounter() = counter

    fun incrementCounter(){
        counter.count++;
    }
    fun decrementCounter(){
        counter.count--
    }
}