package org.greencode.domain

class Car(distance: Double) : Vehicle(distance) {
    override var emission = 0.21

    override fun toString(): String {
        return "Carro: $distance km - Pegada de CO²: ${emissionTotal()} kg"
    }
}