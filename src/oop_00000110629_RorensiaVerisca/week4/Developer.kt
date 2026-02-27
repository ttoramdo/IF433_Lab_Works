package oop_00000110629_RorensiaVerisca.week4

class Developer (name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work(){
        println("\n$name sedang ngoding menggunakan $programmingLanguage.")
    }
}