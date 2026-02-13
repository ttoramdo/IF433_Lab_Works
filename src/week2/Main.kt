package week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System. `in`)
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    if(nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("status : Pendaftaran Selesai")
    }
    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else{
        println("Pilihan ngawur, pendaftaran batal!")
    }
    print("Mau Pinjam Buku? (1. Mauu, 2. Skip): ")
    val tipe = scanner.nextInt()
    scanner.nextLine()

    if (tipe == 1) {
        println("--- Library UMN ---")
        print("Judul: ")
        val judul = scanner.nextLine()

        print("Peminjam: ")
        val peminjam = scanner.nextLine()

        print("Durasi: ")
        var durasi = scanner.nextInt()
        scanner.nextLine()

        if (durasi < 0) {
            durasi = 1
        }

            val loan = Loan(judul, peminjam, durasi)
            println("--- Detail Peminjam ---")
            println("=========DETAIL PEMINJAM=========\nNama: $peminjam\nJudul: $judul\nDurasi: $durasi\nDenda  : ${loan.calculateFine()}\n================================" )
        } else
            println("Yahh, perbanyak membaca kids.")



    }





