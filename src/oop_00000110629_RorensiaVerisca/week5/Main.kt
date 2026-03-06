package oop_00000110629_RorensiaVerisca.week5

fun main(){
    val dosen1 = Dosen(nama = "Pak Jeonghan", nidn= "100495")
    val admin1 = Admin(nama = "Bu Hanie")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai){
        pegawai.bekerja()
        when (pegawai){
            is Dosen-> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin-> {
                println("=> Terdeteksi sebagai Admin.")
                pegawai.doAdminWork()
            }
        }
        println("=====================")
    }
}