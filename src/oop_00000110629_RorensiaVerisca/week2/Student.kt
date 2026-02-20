package week2

class Student (
    val name : String,
    val nim : String,
    var major : String,
    var gpa : Double = 0.0){
    init {
        if (nim.length != 5) {
            println("WARNING : Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG : objek Student $name berhasil dialokasikan di Memory.")
            println("test")
        }
    }
    constructor(name: String, nim: String) : this (name, nim, "Non-Matriculated"){
        println("LOG : Menggunkan constructor jalur umum (Tanpa Jurusan).")
    }
}