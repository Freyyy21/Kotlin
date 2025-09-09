# **Latihan Kotlin – Advanced (Control Flow & Logic)**

## **Soal 1 – Nested Loop & Pattern**

Buat program untuk menampilkan pola segitiga angka:

```
    1
   121
  12321
 1234321
123454321

```

* Gunakan **nested for loop**
* Gunakan **if** untuk memformat output jika angka genap/ganjil (misal angka genap tambahkan tanda `*`)

---

## **Soal 2 – Matrix Sum & When**

Minta user memasukkan 3x3 angka (matrix).

* Hitung jumlah **baris** dan **kolom**
* Gunakan **when** untuk menampilkan kategori:

    * Jika total > 20 → "Besar"
    * Jika total 10–20 → "Sedang"
    * Jika total < 10 → "Kecil"

---

## **Soal 3 – Do-While dengan Validasi**

Buat program meminta user memasukkan angka positif minimal 5 kali.

* Gunakan **do-while loop** untuk memastikan input valid
* Simpan input ke **ArrayList**
* Setelah selesai, tampilkan **angka terbesar dan terkecil**

---

## **Soal 4 – Labeled Break & Continue**

Buat program nested loop `i` 1–5 dan `j` 1–5.

* Tampilkan `(i,j)`
* Jika `(i+j) % 4 == 0` → **labeled continue** untuk skip inner loop
* Jika `(i,j) = (4,4)` → **labeled break** untuk menghentikan semua loop

---

## **Soal 5 – Kalkulator Multi-Input**

Minta user memasukkan 3 angka dan satu operator (`+`, `-`, `*`, `/`).

* Hitung hasilnya secara berurutan: `((angka1 operator angka2) operator angka3)`
* Gunakan **when expression** untuk operator
* Validasi pembagian dengan 0 menggunakan **if-else**

---

## **Soal 6 – Array Filtering**

Minta user memasukkan 10 angka.

* Gunakan **for loop** untuk menampilkan angka genap saja
* Jika angka > 50 → **labeled continue** untuk langsung lanjut ke angka berikutnya tanpa tampilkan

---

## **Soal 7 – Reverse Input**

Minta user memasukkan kata atau kalimat.

* Gunakan **for loop** untuk membalik kata
* Gunakan **if-else** untuk memisahkan huruf vokal dan konsonan, tampilkan jumlah masing-masing

---

## **Soal 8 – Nested If & When**

Minta user memasukkan nilai ujian 0–100

* Gunakan **nested if** untuk mengecek kelulusan:

    * Nilai ≥ 60 → lulus
    * Nilai < 60 → tidak lulus
* Gunakan **when** untuk memberi predikat:

    * 90–100 → “Sangat Baik”
    * 80–89 → “Baik”
    * 70–79 → “Cukup”
    * 60–69 → “Kurang”

---

## **Soal 9 – Loop & Statistik**

Minta user memasukkan angka hingga memasukkan `0` (loop berhenti dengan **do-while**)

* Hitung jumlah, rata-rata, dan jumlah angka ganjil/genap
* Gunakan **if-else** + **while/do-while** + **ArrayList**

---

## **Soal 10 – Multi-Layer Menu**

Buat menu program sederhana:

```
1. Tambah data
2. Tampilkan data
3. Hapus data
4. Keluar
```

* Gunakan **do-while** untuk looping menu
* Gunakan **when** untuk pilihan menu
* Data disimpan di **ArrayList**
* Gunakan **labeled break** untuk keluar dari menu
* Gunakan **labeled continue** untuk kembali ke menu setelah operasi selesai

---
