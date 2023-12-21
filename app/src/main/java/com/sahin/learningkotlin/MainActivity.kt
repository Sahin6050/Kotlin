package com.sahin.learningkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables && Constants -> Değişkenler ve Sabitler.
        // var değişebilir, val ise değişemez.

        // Integer -> Tam sayılar.

        println("---- Integer ----")

        var x = 5
        var y = 4

        println(x * y)

        var age = 35

        val result = age / 7 * 5
        println(result)

        // Defining
        var myInteger : Int
        // Initialize
        myInteger = 4

        val a : Int = 23

        println(a / 2)

        val myLong : Long = 100000


        // Double && Float

        println("---- Double && Float ----")

        val pi = 3.14
        println(pi * 2 )

        val myFloat = 3.14f
        println(myFloat * 2)

        var myAge : Double
        myAge = 23.0
        println(myAge / 2)

        // String
        println("---- String ----")

        val myString = "atıl Samancıoğlu"
        val name = "James"
        val surname = "Hetfield"

        var fullName = name +" "+ surname
        println(fullName)

        val larsName : String = "Lars"
        println(myString.capitalize())


        // Boolean

        println("---- Boolean ----")

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && -> And
        // || -> Or

        println(3 < 5) // true.
        println(6 < 3) // false.
        println(5 == 5) // true.
        println(4 != 3) // true.

        println(3 > 4 && isAlive == true) // false çünkü ilk değer hatalı ikinci değer doğru.
        println(3 > 4 || isAlive == true) // true çünkü bir değerin doğru olması yeterlidir.

        // Conversions

        println("---- Conversions ----")

        var myNumber = 5
        var myLongNumber = myNumber.toLong()

        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()

        println(inputInteger * 2)

        // Collections -> Birden fazla veriyi tutmak için kullanılır.

        // Array
        println("---- Array ----")

        val myArray = arrayOf("James","Kirk","Rob","Lars")

        // index
        println(myArray[0])

        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammet")
        println(myArray[1])

        // Diziler belli ilk boyutuna göre veri alırlar.
        //myArray[4] = "Atıl Samancıoğlu"

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.2,1.3,1.4)

        // kotlinde karışık veri türleri bir arada bulunabilir.
        val mixedArray = arrayOf(1,true,"Atıl",1.2)

        println(mixedArray[0])
        println(mixedArray[1])
        println(mixedArray[2])

        // ArrayList
        println("---- ArrayList ----")

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(0)
        myArrayList.add(200)

        println(myArrayList[1])


        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add(100)
        myMixedArrayList.add(true)
        myMixedArrayList.add("Hello")

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        // Set -> Bir eleman sadece bir kez varolabilir.
        println("---- Set ----")

        val myExampleArray = arrayOf(1,1,2,3,4)
        for (i in myExampleArray){
            println(i)

        }
        println("Set olduğu için 1 yoktur sadece bir defa yazılır")
        val mySet = setOf(1,1,2,3,4)
        for (i in mySet){
            println(i)
        }

        val myStringSet = HashSet<String>()
        myStringSet.add("James")
        myStringSet.add("Ali")
        myStringSet.add("James")

        myStringSet.forEach {
            println(it)
        }

        //Map -> Key,value mantığına göre değerler alır.

        println("---- Map ----")

        val fruitArray = arrayOf("Apple","Banana")
        val caloriesArray = arrayOf(100,150)

        println("${fruitArray[0] }: ${caloriesArray[0]}")

        val fruitCalories = hashMapOf<String,Int>()
        fruitCalories.put("Apple",100)
        fruitCalories.put("Banana",150)

        println("Apple:" +fruitCalories["Apple"])

        // Birden fazla yazım şekli vardır.
        val myHashMap = HashMap<String,String>()

        val myNewHashMap = hashMapOf<String,Int>("Aplle" to 100)

        println("---- Operator ----")

        var m = 5
        m++
        println(m)
        m = m + 1
        println(m)

        var n = 7

        println(m > n) // false çünkü eşitler.


        println(10 + 2)
        println(10 - 2)
        println(10 * 2)
        println(10 / 2)

        // Remainder

        println(10 % 3) // kalan 1 dir modunu hesaplar.

        // IF Control
        println("---- If Control ----")

        val tcNo = 30206410556
        if(tcNo.equals(30206410556)){
            println("Doğru Tc")
        }else{
            println("Yanlış Tc")
        }

        var day = 3

        // Switch - When

        println("---- When ----")

        when(day){
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            4 -> println("Thursday")
            5 -> println("Friday")
            6 -> println("Saturday")
            else -> println("Sunday")

        }

        // Loops

        println("---- For ----")

        val myNumbersOfArray = arrayOf(1,2,3,4,5,6,7,8,9)

        for (i in myNumbersOfArray){
            println(i * 3 )
        }

        for ( i in myNumbersOfArray.indices){
            println(myNumbersOfArray[i] * 2  )
        }

        for (i in 0..3){
            println(i)
        }

        // while loop

        println("---- While ----")

        var j = 0

        while (j <= 30){

            println(j)
            j= j + 3
        }

























    }
}