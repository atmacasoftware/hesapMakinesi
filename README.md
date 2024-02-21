# Hesap Makinesi Uygulaması

Switch - Case yapısı kullanılarak hesap makinesi uygulaması yapılacaktır.

İşlem sırası;
* Kullanıcıdan `int sayi1, sayi2` değişkenleri için Scanner sınıfı ile 2 adet sayı alınmaktadır.
* Kullanıcıdan yapacağı işlem için (1-Toplama, 2-Çıkarma, 3-Çarpma, 4-Bölme) `int select` değişkeni için 1 den 4 e kadar rakam girilmesi sağlanarak seçim yapılması sağlanmıştır.
* Eğer farklı bir seçim yaparsa `default` ile hatalı seçim yaptığına dair mesaj gönderilmektedir.
* Bölme işlemi için taban sıfır olması durumunda hata alınabileceğinden `if - else` ifadeleri ile sıfır kontrolü yapılarak işlem yapılmıştır.
