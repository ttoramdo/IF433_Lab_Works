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

    print("Cape kuliah mau nge game dulu gak? 1. Mau, 2. Belajar aja ah: ")
    val tipeh = scanner.nextInt()
    scanner.nextLine()

    if (tipeh == 1){
        println("\n=== MINI RPG BATTLE ===")
        print("Nama Hero: ")
        val heroName = scanner.nextLine()

        print("Base Damage: ")
        val damage = scanner.nextInt()
        scanner.nextLine()

        val hero = Hero(heroName, damage)
        var enemyHp = 100

        while (hero.isAlive() && enemyHp > 0){
            println("\n1. Serang")
            println("2. Kaburrr")
            print("Pilihan: ")
            val pilihan = scanner.nextInt()
            scanner.nextLine()

            if (pilihan == 1) {

                hero.attack("Enemy")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("HP Enemy tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Enemy menyerang balik sebesar $enemyDamage!")
                    hero.takeDamage(enemyDamage)
                    println("HP Hero tersisa: ${hero.hp}")
                }

            } else if (pilihan == 2) {
                println("Hero kabur dari pertarungan!")
                break
            }
        }
        println("\n=== HASIL PERTARUNGAN ===")
        if (hero.isAlive() && enemyHp == 0) {
            println("${hero.name} MENANG!")
        } else if (!hero.isAlive()) {
            println("${hero.name} KALAH!")
        } else {
            println("Pertarungan selesai.")
        }

    } else {
        println("Pilihan yang bagus, semoga kamu makin pintar!")
    }

    }





