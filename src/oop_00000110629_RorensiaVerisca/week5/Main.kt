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
    println("\n=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet("Jeonghan", 50000.00)
    val creditCard = CreditCard("Jeonghan", 100000.00)

    val payments: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in payments) {

        method.processPayment(75000.00)

        if (method is EWallet) {
            println("Saldo kurang, sistem akan melakukan top up...\n")
            method.topUp(50000.00)
            method.processPayment(75000.00)
        }

        println("------------------")
    }

}