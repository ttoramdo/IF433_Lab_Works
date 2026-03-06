package oop_00000110629_RorensiaVerisca.week5

class Admin(nama: String): Pegawai(nama){
    override fun bekerja(){
        println("$nama sedang sibuk duduk di depan komputer melayani administrasi")
    }

    fun doAdminWork(){
        println("$nama sedang merekap data absensi mahasiswa.")
    }
}