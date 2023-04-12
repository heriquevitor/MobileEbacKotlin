package com.heriqueoliveira.ebacmod03

    fun main() {
        var primeiraVariavel: Int = 6
        primeiraVariavel = 5
        println(primeiraVariavel)

        // Variavel Imutavel - Erro "Val connot be reassigned"//
        /*
        val segundaVariavel: Int = 6
        segundaVariavel = 7
        println(segundaVariavel)*/

        //Crie uma Condicional para teste de par//

        var resultadoPar: Int = 10
        if (resultadoPar % 2 == 0) {
            println("O número $resultadoPar é par")
        } else {
            println("O número $resultadoPar  é impar")
        }
        //Crie uma Condicional para teste de impar//
        var resultadoImpar: Int = 5
        if (resultadoImpar % 2 == 1) {
            println("O número $resultadoImpar é impar")
        } else {
            println("O número $resultadoImpar é par")
        }
        // Agora utilize a Condicional When//
        when {
            resultadoPar % 2 == 0 && resultadoImpar % 2 == 1 -> println("O número $resultadoPar é par e o $resultadoImpar é impar")
            else -> println("Erro!")
        }

        // Crie um array de inteiro de tamanho 40 e escreva
        // os números de 1 a 39 usando comando for//

        var array: IntArray = IntArray(40)
        for (i in array.indices - 0)
            println(i)

        // Crie uma Lista de Inteiro
        // Crie uma variavel soma com valor 0
        // percorra a lista e acrescente o valor da
        //posição atual a variável soma//

        var mutableList: MutableList<Int> = mutableListOf()
        for (i in 1..99 step 1) {
            mutableList.add(i)
            println(mutableList.size)
            var soma: Int = 0
            for(numb in mutableList)
                soma +=numb
            println(soma)
        }
        }

