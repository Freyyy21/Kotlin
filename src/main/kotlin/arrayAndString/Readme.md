# 🚀 Latihan Soal Kotlin (Advanced)

Latihan ini mencakup **Array, String, Basics, dan Control Flow** dalam Kotlin.  
Kerjakan semua soal di bawah dengan menggunakan bahasa Kotlin.

---

## 1. Array & Input Validation
Buat program yang meminta user memasukkan **N angka integer** ke dalam array.
- Validasi input: hanya boleh integer (`toIntOrNull()` + `continue`)
- Tampilkan **jumlah bilangan genap** dan **jumlah bilangan ganjil**.

---

## 2. Nilai Ujian + Predikat
Minta user memasukkan nilai ujian beberapa mahasiswa ke dalam array.  
Gunakan:
- `if-else` untuk status lulus/tidak lulus
- `when` untuk predikat:
    - 0–69 → Kurang
    - 70–79 → Cukup
    - 80–89 → Baik
    - 90–100 → Sangat Baik

---

## 3. Minimum & Maximum Finder
Buat program yang membaca array angka dari user.  
Gunakan loop `for` untuk mencari **nilai minimum** dan **nilai maksimum** tanpa memakai fungsi built-in (`.min()` atau `.max()`).

---

## 4. Reverse String
Minta user memasukkan sebuah string, lalu tampilkan string tersebut dalam urutan terbalik.
- Jangan gunakan fungsi built-in `reversed()`.
- Gunakan loop `for` mundur.

---

## 5. Hitung Jumlah Huruf Vokal
Minta user memasukkan sebuah kalimat.
- Hitung jumlah huruf vokal (`a, i, u, e, o`).
- Abaikan huruf besar/kecil (`toLowerCase()`).

---

## 6. Cari Angka di Array
Buat program yang menyimpan array angka.  
Minta user memasukkan angka yang dicari.
- Gunakan `for` untuk mencari.
- Tampilkan index jika ketemu.
- Jika tidak ketemu, tampilkan pesan `"tidak ditemukan"`.

---

## 7. Perkalian Matriks 2D
Buat dua array 2D (matriks).  
Gunakan loop bersarang (`for`) untuk menghitung hasil perkalian matriks.

---

## 8. Password Strength Checker
Minta user memasukkan password.  
Gunakan kombinasi `if-else` + `when` untuk menentukan kekuatan password:
- < 8 karakter → Lemah
- Mengandung huruf + angka → Sedang
- Mengandung huruf besar + huruf kecil + angka + simbol → Kuat

---

## 9. Statistik Data Array
Minta user memasukkan beberapa angka ke array.  
Hitung dan tampilkan:
- Jumlah semua elemen
- Rata-rata
- Median (urutkan dulu array dengan loop sederhana)

---

## 10. Labeled Break pada Nested Loop
Buat array 2D angka, lalu cari **angka pertama yang lebih besar dari 50**.  
Gunakan nested loop `for` dan `break@label` supaya langsung keluar dari kedua loop ketika angka ditemukan.

---
