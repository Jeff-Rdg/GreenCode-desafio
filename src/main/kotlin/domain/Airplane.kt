package org.greencode.domain

class Airplane(distance: Double) : Vehicle(distance) {
    override var emission = 0.133

    override fun toString(): String {
        return "Avião: $distance km - Pegada de CO²: ${emissionTotal()} kg"
    }
}