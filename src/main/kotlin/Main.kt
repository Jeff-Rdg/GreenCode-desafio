package org.greencode

import org.greencode.domain.Airplane
import org.greencode.domain.Bus
import org.greencode.domain.Car
import org.greencode.domain.Vehicle

val vehiclesType = arrayOf("carro", "onibus", "aviao")
val result = mutableListOf<Vehicle>()

fun main() {
    println("Bem vindo ao App GreenCode!")

    try {
        menu()

    } catch (e: Exception) {
        println("ocorreu um erro: ${e.message}")
    }

}

fun chooseVehicle(vehicleType: Int, distance: Double) : Vehicle {
    return when (vehicleType) {
        1 -> Car(distance)
        2 -> Bus(distance)
        3 -> Airplane(distance)
        else -> {
            throw IllegalArgumentException("parametro [$vehicleType] inválido, tente novamente")
        }
    }
}

fun menu() {
    println()
    println("Selecione uma opção:")
    println("[1] - Registrar veículo.")
    println("[2] - Listar veículos cadastrados.")
    println("[0] - Sair.")

    menuOption(readln().toInt())
}

fun menuOption(option: Int) {

       when (option) {
           1 -> vehicleRegister()
           2 -> vehicleEach()
           0 -> println("até mais!")
           else -> {
               println("opção inválida, tente novamente")
               menu()
           }
       }

}

fun vehicleRegister() {
    println("Escolha o veículo dentre as opções:")
    vehiclesType.forEachIndexed { index, vehicle -> println("[${index + 1}] - $vehicle") }
    val vehicleType = readln().toInt()

    if (vehicleType > 3 || vehicleType <= 0) {
        throw IllegalArgumentException("parametro [$vehicleType] inválido, tente novamente")
    }

    print("Informe a quilometragem realizada em km: ")
    val distance = readln().toDouble()

    val vehicle = chooseVehicle(vehicleType, distance)
    result.add(vehicle)
    menu()
}

fun vehicleEach() {
    for (value in result) {
        println(value.toString())
    }
    menu()
}

