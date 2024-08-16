package org.greencode.domain

abstract class Vehicle(protected var distance: Double) {

    abstract var emission: Double

    fun emissionTotal() : Double{
        return distance * emission
    }
}