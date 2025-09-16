# POST_TEST-2-PBO

DWI PEBRIYANTO PRADANA | 2409116012 | SISTEM INFORMASI A'2024

# SISTEM PENGAJUAN DESAIN DEPARTEMEN COMINFO
Departemen Communication and Media Information atau bisa disingkat COMINFO merupakan salah satu departemen dari himpunan mahasiswa Sistem Informasi Universitas Mulawarman yaitu INFORSA.Departemen ini bertanggung jawab untuk menulis dan melaporkan berita atau informasi yang disajikan dalam bentuk multimedia di media sosial INFORSA. 

Sebagai bentuk dukungan terhadap kebutuhan desain publikasi di lingkungan himpunan, Departemen COMINFO membuka layanan pengajuan desain bagi departemen lain. Untuk mempermudah proses tersebut, dibangunlah Sistem Pengajuan Desain Departemen COMINFO. Sistem ini dirancang untuk Mempermudah pengelolaan pengajuan desain agar lebih terstruktur dan terorganisir, Meningkatkan efisiensi kerja tim desain COMINFO dalam menyelesaikan setiap permintaan. Dengan adanya sistem ini, setiap departemen dapat mengajukan kebutuhan desain mereka secara mudah, dan cepat sehingga dapat mendukung kelancaran kegiatan INFORSA secara profesional.

# PENJELASAN STRUKTUR PACKAGES

<img width="560" height="218" alt="image" src="https://github.com/user-attachments/assets/fdce79ba-0ba7-4599-89d3-2868e236e361" />

Program ini menggunakan konsep MVC yang dipisahkan ke dalam tiga package utama. 
1. Package model

   berisi class Pengajuan yang merepresentasikan data atau entitas dari sistem, lengkap dengan atribut dan constructor untuk menyimpan informasi pengajuan desain. 

2. Package service

   berisi class Sistem yang menjalankan logika utama aplikasi, seperti operasi CRUD (Create, Read, Update, Delete) dan fitur pencarian (search), sehingga bagian ini bertindak sebagai Controller yang mengatur jalannya data.

3. package main

   berisi class Main yang berfungsi sebagai titik masuk (entry point) program dan menyediakan menu interaktif untuk pengguna, sehingga bagian ini berperan sebagai View.

# PENJELASAN ALUR PROGRAM
## Menu Utama

<img width="470" height="203" alt="image" src="https://github.com/user-attachments/assets/70b1a88c-9bfb-4914-993d-7d84ea906cb8" />

saat memulai Program, user akan masuk kemenu utama dari program ini, kemudian user diminta untuk menginput angka berapa untuk memlih menu yang dia inginkan.

<img width="439" height="453" alt="image" src="https://github.com/user-attachments/assets/1cfd1afe-6aae-4bcd-b62f-385f7427644d" />


Jika user tidak menginput angka sesuai dengan pilihan yang ada maka akan program akan menampilkan pesan "Pilihan tidak tersedia, coba lagi." dan menu utama akan muncul kembali.

## 1. AJUKAN DESAIN

<img width="638" height="415" alt="image" src="https://github.com/user-attachments/assets/09825379-b5ea-4c15-a12d-aeb81c3ceac5" />

Jika user menginput angka 1 atau memilih menu Ajukan Desain, selanjutnya user akan diminta untuk memasukan jenis desain yang ingin dibuatkan (contoh: Banner. Plakat, dll), link referensi jika ada, nama pengaju desain, kontak yang dapat dihubungi, dan deadline pengerjaannya (contoh: 9 September 2025). jika user sudah selesai mengisi, akan muncul "Desain berhasil diajukan!" sebagai tanda bahwa desainnya sudah diajukan.

## 2. Lihat Daftar Desain

<img width="534" height="745" alt="image" src="https://github.com/user-attachments/assets/2a52ea93-0733-4f90-bdba-9ac999421057" />

Jika user menginput angka 2 atau memilih Lihat Daftar Desain, program akan menampilkan daftar desain yang telah di ajukan oleh user dan juga program menampikan desain yang baru saja ditambahkan user.

## 3. Ubah/Perbaiki Pengajuan

<img width="615" height="432" alt="image" src="https://github.com/user-attachments/assets/49c22c87-cf02-4c91-b101-669cfa0dc6d7" />


Jika user menginput angka 3 atau memilih Ubah/Perbaiki Pengajuan, program akan meminta user memasukkan nomor urut dari pengajuan desain yang ingin di ubah atau diperbaiki berdasarkan daftar desain. jika user sudah memilih, user akan diminta memasukkan data terbaru seperti jenis desain yang ingin dibuatkan (contoh: Banner. Plakat, dll), link referensi jika ada, nama pengaju desain, kontak yang dapat dihubungi, dan deadline pengerjaannya (contoh: 9 September 2025). pada contoh user mengubah bagian jenis desain, link referensi, dan deadline dari desain yang diajukan.

Sebelum:

<img width="467" height="759" alt="image" src="https://github.com/user-attachments/assets/7466807d-096a-4220-a383-6b2084bd0f27" />

Sesudah :

<img width="429" height="751" alt="image" src="https://github.com/user-attachments/assets/23c82842-cda1-45fb-b0d9-ab7a51d8e3d5" />

Dari gambar di atas terlihat jenis desain, link refrensi, dan deadline desain yang diajukan di desain 3 sudah berubah.

## 4. Hapus Pengajuan

<img width="532" height="315" alt="image" src="https://github.com/user-attachments/assets/63e00bef-771c-461d-97e8-0c896909a3f7" />

Jika user menginput angka 4 atau memilih Hapus Pengajuan, program akan meminta user memasukkan nomor urut dari pengajuan desain yang ingin di Hapus berdasarkan daftar desain. Pada gambar diatas user ingin menghapus/membatalkan pengajuan desain ke-2 yaitu plakat GTA.

sebelum:

<img width="490" height="754" alt="image" src="https://github.com/user-attachments/assets/239fb7da-6e92-4eac-8c57-cd4a06657ad9" />

Sesudah:

<img width="494" height="567" alt="image" src="https://github.com/user-attachments/assets/b3681756-74fd-4764-a9ab-7da412a6922d" />

Pada gambar gambar diatas terlihat saat user mengecek daftar pengajuan desain, pengajuan desain plakat GTA telah terhapus.

## 5. Cari Pengajuan Desain

<img width="534" height="440" alt="image" src="https://github.com/user-attachments/assets/a0898454-57a8-4b8e-ac21-7d0bd75e44ae" />

Jika user menginput angka 5 atau memilih Cari Pengajuan Desain, program akan meminta user memasukkan keyword untuk mencari berdasarkan jenis desain atau nama yang mengajukan desain. Pada gambar user memasukan keyword "kc", maka muncul desain yang diajukan yardan yaitu Banner KC.

## 6. Keluar

<img width="801" height="375" alt="image" src="https://github.com/user-attachments/assets/8d67607e-90af-4bb0-9568-b0177ff20e8a" />

Jika user menginput angka 6 atau memilih Keluar, maka program selesai.
