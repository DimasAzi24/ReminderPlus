# ReminderPlus
## Introduction	
a. Project Title		
* ReminderPlus (APLIKASI PENGINGAT TUGAS HARIAN )


b. Short Description		
* ReminderPlus adalah aplikasi sederhana yang bertujuan membantu pengguna dalam mencatat dan mengingat tugas atau kegiatan harian mereka.	

c. Project Team				
1. Fransiskus Xaverius Gunawan_121140010
2. Dimas Azi Rajab Aizar_121140135
3. Andrean Syahrezi_121140169
4. Daniel Dianutama Barus_121140180
5. Arof Andestama_121140182

## Proposed Application						
a. Application Description						
* ReminderPlus adalah sebuah aplikasi pengingat tugas harian yang dirancang untuk membantu pengguna dalam mengatur dan melacak aktivitas sehari-hari dengan lebih efisien. Dengan fitur-fitur dasarnya, pengguna dapat dengan mudah menambahkan, mengelola, dan mengatur notifikasi untuk setiap tugas atau kegiatan yang mereka inginkan.Dengan ReminderPlus, pengguna dapat meningkatkan efisiensi dan produktivitas dalam mengelola tugas-tugas harian mereka. Aplikasi ini tidak hanya berfungsi sebagai pengingat sederhana, tetapi juga sebagai alat yang membantu dalam mengatur waktu dan prioritas.
    
b. Application Advantages				
* Aplikasi ReminderPlus memberikan berbagai keuntungan bagi penggunanya, di antaranya:
1. Manajemen tugas yang lebih efisien, di mana pengguna dapat menambahkan, mengelola, dan mendapat pengingat tentang tugasnya dalam hari-harinya.
2. Peningkatan Produktivitas, di mana fokus pengguna dalam mengerjakan tugas-tugasnya semakin terjaga karena tenggat waktu menyelesaikan tugas selalu diingatkan dengan fitur notifikasi.
3. Kemudahan dalam mencapai tujuan, di mana pengguna dapat memastikan bahwa tugasnya sudah selesai dilakukan dengan memberikan penanda sehingga dapat langsung beralih ke tugas yang lain sesuai prioritasnya.

c. Application Benefits
* Aplikasi ReminderPlus memberikan berbagai manfaat bagi penggunanya, di antaranya:
1. Pengorganisasian tugas yang lebih baik, di mana pengguna dapat mengelompokkan tugasnya dan mengatur skala prioritas tugasnya
2. Pengingat yang efektif, di mana pengguna dapat menerima notifikasi pengingat akan tugasnya jika semakin dekat menuju tenggat waktu mengerjakan tugas
3. Peningkatan kinerja, dengan tugas-tugas yang lebih terstruktur pengerjaannya baik dari segi skala prioritas dan waktu, pengguna dapat menyelesaikan tugas lebih banyak dan lebih baik.
4. Peningkatan kualitas hidup, dengan tugas yang terselesaikan dengan baik, pengguna dapat terhindar dari kecemasan dan pengerjaan tugas yang tergesa-gesa

## System Planning
a. Entity Relationship Diagram (ERD)	
*Tabel Pengguna menyimpan informasi tentang pengguna, termasuk jumlah tugas yang selesai, tertunda, dan belum dikerjakan.
*Tabel Tugas berisi detail setiap tugas, termasuk nama tugas, status (selesai, tertunda, atau belum dikerjakan), waktu deadline, dan kunci asing ID_pengguna yang menghubungkannya dengan pengguna yang bertanggung jawab atas tugas tersebut.
*Tabel Kalender digunakan untuk menghubungkan tanggal deadline tugas dengan tugas tertentu melalui kunci asing ID_tugas.

b. UML Design
* Activity Diagram: 
1. Start: Diagram dimulai dari sini.
2. Add Task: Pengguna memulai dengan menambahkan tugas atau kegiatan harian beserta detailnya seperti judul, tanggal, dan waktu.
3. Set Notification: Pengguna mengatur notifikasi untuk tugas atau kegiatan yang telah ditambahkan.
4. Set Priority: Pengguna memilih untuk menandai prioritas tugas atau kegiatan (tinggi, sedang, rendah).
5. Group Task: Pengguna mengelompokkan tugas atau kegiatan dalam kategori tertentu, seperti pekerjaan, pribadi, belanja, dll.
6. Mark as Done: Ketika sebuah kegiatan atau tugas selesai, pengguna menandainya sebagai selesai.
7. End: Diagram berakhir di sini.

* Sequence Diagram:
1. User/Actor masuk kedalam aplikasi lalu user dapat membuat pengingat tugas baru ataupun melihat tugas yang telah dibuat pada aplikasi.
2. Setelah user membuat pengingat tugas baru maka akan di simpan ke dalam database.
3. Database akan memberikan tugas yang telah dibuat pengingat dan akan menamplikan pengingat yang dibuat di aplikasi
4. Aplikasi akan mengingatkan user tentang tugas yang telah dibuat pengingatnya

* Class Diagram:


d. UI Design (Figma)
 							
https://www.figma.com/file/Z9fVfkyRE5viy6vS9dqWgW/Pengingat-Tugas%2FUAS-PAM-9?type=design&node-id=80%3A12&mode=design&t=24J69PD0ncwm8BiH-1

Application Development Stage
 							
a. Implementation Stage
 							
Pengemabangan aplikasi ini menggunakan metode Agile.Metode Agile cocok untuk pengembangan aplikasi pengingat tugas karena fleksibilitasnya dalam menyesuaikan diri dengan perubahan kebutuhan pengguna, peningkatan transparansi dan fokus pada nilai pelanggan, pengiriman bertahap yang memungkinkan identifikasi masalah lebih awal, keterlibatan pengguna yang memastikan solusi yang sesuai, peningkatan kualitas melalui pengujian berkelanjutan, kemampuan untuk mengatasi kompleksitas pengembangan, serta responsivitas yang lebih tinggi terhadap umpan balik pengguna.
 							
b. Time Plan
 							
[Add a table or list with time estimates for each stage] 
Berikut adalah contoh timeline pengerjaan untuk proyek pembuatan aplikasi pengingat tugas harian:

1. **Tahap Perencanaan (1 minggu)**
   - Hari 1-2: Identifikasi kebutuhan pengguna dan tujuan aplikasi.
   - Hari 3-4: Riset pasar dan analisis kompetitor.
   - Hari 5-6: Perencanaan desain aplikasi dan fitur utama.
   - Hari 7: Finalisasi rencana proyek dan pembagian tugas.

2. **Tahap Desain (1 minggu)**
   - Hari 8-9: Pembuatan wireframe dan storyboard.
   - Hari 10-11: Desain antarmuka pengguna (UI) dan pengalaman pengguna (UX).
   - Hari 12-13: Pembuatan desain ikon dan grafis.
   - Hari 14: Review desain dengan tim dan klien, revisi jika diperlukan.

3. **Tahap Pengembangan (2 minggu)**
   - Hari 15-18: Pengembangan frontend aplikasi.
   - Hari 19-22: Pengembangan backend dan integrasi database.
   - Hari 23-25: Implementasi fitur pengingat tugas harian.
   - Hari 26-27: Pengujian fungsionalitas dan debug aplikasi.
   - Hari 28: Persiapan untuk peluncuran aplikasi.

c. Akun
Akun yang sudah terdaftar : admin@gmail.com (12345678)





