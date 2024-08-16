package org.greencode.domain

class Bus(distance: Double) : Vehicle(distance) {
    override var emission = 0.105

    override fun toString(): String {
        return "Onibus: $distance km - Pegada de CO²: ${emissionTotal()} kg"
    }
}