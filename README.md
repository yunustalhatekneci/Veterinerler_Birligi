# Veterinerler Birliği Projesi

Bu proje, **Java** programlama dili kullanılarak geliştirilmiş bir **veteriner yönetim sistemi** simülasyonudur. Proje, veterinerlerin müşterileri ve onların hayvanlarını yönetmelerine olanak tanıyan temel bir nesne yönelimli programlama (OOP) uygulamasıdır.

## Proje Amacı
Bu proje, aşağıdaki konuların uygulanmasını ve anlaşılmasını hedeflemektedir:

- **Nesne Yönelimli Programlama (OOP)** prensiplerinin uygulanması  
- **Soyut sınıflar (Abstract Class) ve kalıtım (Inheritance)** kavramlarının kullanımı  
- **Generics ve Polimorfizm** konularının örneklenmesi  
- **Java koleksiyonlarının (ArrayList) kullanımı**  
- **Sınıflar arası ilişkilerin modellenmesi** (Veterinerler, Müşteriler ve Hayvanlar arasındaki ilişkiler)  

## Proje Özellikleri
- **Veteriner Yönetimi:**
  - Veteriner ekleme ve listeleme
  - Müşterileri yönetme
- **Müşteri Yönetimi:**
  - Müşterilere hayvan ekleme
  - Sahip olunan hayvanların listelenmesi
- **Hayvan Yönetimi:**
  - Kedi ve köpek türlerinde hayvanların kaydı
  - Aşı sayıları ve cins bilgileriyle hayvanların yönetilmesi
- **Şehir Bazlı Veteriner Takibi:**
  - Şehir bazında veterinerlerin sayısının hesaplanması
- **Yönetim Paneli:**
  - Genel bilgilerin listelenmesini sağlayan bir yönetim paneli

## Kullanılan Teknolojiler
- **Java SE (Standard Edition)**
- **OOP Prensipleri** (Kalıtım, Soyutlama, Polimorfizm, Generics)
- **Koleksiyonlar (ArrayList)**
- **Terminal Üzerinden Çalıştırılabilir Yapı**

## Proje Yapısı

```
Veterinerler_Birligi
├── src/veterinerler_birligi
│   ├── Main.java  # Programın ana çalışma dosyası
│   ├── Kisi.java  # Tüm kişiler için temel sınıf
│   ├── Veteriner.java  # Veteriner sınıfı
│   ├── Musteri.java  # Müşteri sınıfı
│   ├── Hayvan.java  # Soyut hayvan sınıfı
│   ├── Kedi.java  # Kedi sınıfı
│   ├── Kopek.java  # Köpek sınıfı
│   ├── SehirVeterinerlikleri.java  # Şehir bazında veteriner yönetimi
│   ├── YonetimPaneli.java  # Yönetim paneli
```
Bu proje **öğrenci seviyesinde bir eğitim projesi** olup, nesne yönelimli programlamayı anlamaya yönelik bir çalışmadır. 

