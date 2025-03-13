# Java-da-verilen-metin-uzerinden-string-islemleri
Yazılım müh. 2.sınıf birinci dönem ödev-2

1. Yeni metin tanımlayınız. Örnek metin:
“Günümüzde teknoloji yoğun olarak kullanılmaktadır. Bunun bir sonucu olarak yapay zekanın kullanımı ön
plana çıkmıştır. Yapay zekanın ön plana çıkmasıyla ona olan ilgi yapay değil ciddi oranda artmıştır. Bu
durumdan eğitim kurumları da etkilenmiştir. Eğitim ve öğretimde zekanın gelişimi için kişiselleştirilmiş
uygulamalar ortaya çıkmıştır. Ayrıca uyarlanabilir akıllı öğrenme sistemleri olarak kullanılan yapay zeka
uygulamaları da geliştirilmektedir.”

3. Bir metin içerisindeki tüm kelimelerin kaç kez tekrar ettiğini bulur. En çok tekrar
eden ilk 3 kelimeyi bulur ve yazdırır, tekrar sayıları ile birlikte. Küçük ya da büyük harf -> küçük harf olarak değerlendirilmelidir.
Sonuç: yapay, zekanın, çıkmıştır şeklinde.

5. Kaç cümleden oluştuğunu bulur ve tüm cümleleri alt alta yazar. (Her cümle
sonunda sadece nokta vardır kod buna göre tasarlanmıştır dilerseniz içerisinden split(".") fonksiyonun parametresini değiştirerek revize edebilirsiniz.)

6. Her bir cümledeki ilk ve son kelimeleri cümle üzerinde yer değiştirir. Kelimelerin
ilk harfinin büyük/küçük olarak değiştiriniz ve gösterir. (Bu kısım tam olarak doğru çalışmamamktadır.)
Sonuç: (Sadece ilk cümle gösterilmiştir. Alt alta tüm cümleleri gösteriniz.)
Kullanılmaktadır teknoloji yoğun olarak günümüzde.

***Kodlar javaKodlari klasöründe eclipse'in oluşturduğu şekilde verilmiştir. Çalıştırmakta zorlanırsanız TUM_SINIFLAR_2329 -> main_2329 java dosyası içinden kopyalabilirsiniz :)



English:
Software Engineering 2nd Year, 1st Semester - Assignment 2

    Define a new text. Example text:
    "Nowadays, technology is being used extensively. As a result, the use of artificial intelligence has come to the forefront. With the rise of artificial intelligence, interest in it has increased significantly, and not artificially. Educational institutions have also been affected by this situation. In education and teaching, personalized applications have emerged for the development of intelligence. Additionally, adaptive intelligent learning systems using artificial intelligence are also being developed."

    Find how many times each word appears in the text. Identify and print the top three most frequently occurring words along with their frequencies.
        Case-insensitive comparison should be applied (uppercase and lowercase letters should be considered the same).
        Example output: "artificial, intelligence, has"

    Count the number of sentences in the text and print all sentences one below the other.
        Each sentence ends with a period (.), and the code is designed accordingly.
        You can modify the split function (split(".")) parameter if needed.

    Swap the first and last words in each sentence and adjust their capitalization accordingly.
        Example result (only the first sentence is shown, all sentences should be displayed one below the other):
        "Is being used technology extensively nowadays."
        (Note: This part does not work perfectly yet.)

Code files are provided in the javaKodlari folder as structured by Eclipse.
If you have trouble running it, you can copy the necessary files from TUM_SINIFLAR_2329 -> main_2329.java :)
