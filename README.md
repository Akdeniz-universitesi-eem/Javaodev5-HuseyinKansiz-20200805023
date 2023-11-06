# Javaodev5-HuseyinKansiz-20200805023
Akdeniz Universitesi İleri Programlama Dersi 5.Odevi





1-UML nedir? En Yaygın kullanılan UML nedir? Ve İşlevleri

   UML, kısaca Birleşik Modelleme Dili anlamına gelir ve yazılım geliştiricilerin sistemleri ve yazılımı belirleme, görselleştirme, inşa etme ve belgeleme amacıyla geliştirilmiş bir bütünleşik diyagram kümesini içeren standartlaştırılmış bir modelleme dilidir. Aynı zamanda iş modellemesi ve diğer yazılım dışı sistemler için de kullanılır.
     
   UML, nesne yönelimli yazılım geliştirmenin ve yazılım geliştirme sürecinin çok önemli bir parçasıdır. UML, yazılım projelerinin tasarımını ifade etmek için genellikle grafik gösterimleri kullanır. UML kullanmak, proje ekiplerinin iletişim kurmalarına, potansiyel tasarımları keşfetmelerine ve yazılımın mimari tasarımını doğrulamalarına yardımcı olur.
       
   UML diyagramı tipleri genel itibariyle 2ye ayrılır:Structural,Behavioral.Structural yazılımın yapısıyla alakalı diyagramlar olurken ,behavioral diyagramlar yazılımın davranışsal tepkilerini ifade eder.En yaygın kullanılan UML muhtemelen Class Diagramdır, Çünkü javada yazılım genellikle nesne odaklı programlamaya dayalıdır, sınıf diyagramı bu sebeple muhtemelen en yaygın olarak kullanılan UML diyagramdır.
     
   Class Diagram
     
   Bir sınıf diyagramı, bir sistemdeki farklı sınıfları, nitelikleri, işlemleri ve nesneler arasındaki ilişkileri göstererek sistemin yapılarını haritalamanıza olanak tanır. Hem yazılım mühendisleri hem de iş yöneticileri, bu etkileşim diyagramını kullanarak bir süreç içindeki farklı bağlantıları modelleyebilir.
![image5-1](https://github.com/HuseyinKansiz/Javaodev5-HuseyinKansiz-20200805023/assets/147552534/ace5c8d5-b4c8-4891-b400-6dc2741bfeb8)

   Bu diyagram basit bir class diyagramına örnek olarak verilebilir.Burada gördüğümüz her dikdörtken ayrı bir classı ifade ederken üst kısımdaki kelimelerde Class ismini belirtir.Class isimlerinin altındaki kısımda classın içerdiği attributelar(nitelikler) bulunur,bu classları birbirine bağlayan çizgiler diğer classlar ile alakalılığı gösterir.Bu örnekte bulunmasada Genellikle methodlarda bu diyagramlarda Operasyon(Operation) adıyla yer alırlar.Class attributelarının private public veya protected olduğu bilgiside bu diyagramlarda verilebilir.Böylece aslında yaptığımız iş daha karmaşık gözüken bir sistemi basite indirgemek ve tüm yazılımı en küçük parçalarına kadar göz önüne sermektir.Böylece farklı yazılım dilleri kullanan diğer yazılımcılarla iletişime geçilebilir, yazılım alanıyla ilgilenmeyen iş insanlarına da proje genel itibariyle aktarılabilir.

   2)Array List, LinkedList, HashMap, HashSet farkları ve kullanış alanları
 Farkları incelemeden önce kısaca bu kavramların anlamlarına değinelim
 
Array List

   ArrayList, Java'da List arabiriminin en yaygın kullanılan uygulamalarından biridir. Bu, yerleşik dizilere dayalıdır, fakat öğeleri ekledikçe veya kaldırdıkça dinamik olarak büyüyebilir veya küçülebilir. Liste öğelerine erişmek için sıfırdan başlayan indexleri kullanırız. Yeni bir öğe eklemek istediğimizde hem sona hem de belirli bir konuma ekleyebiliriz.
      
Linked List

   ArrayList'ın aksine, verileri bir LinkedList'e depoladığımızda, her öğe öncekine bir bağlantı (link) tutar. Standart Liste ekleme yöntemlerinin yanı sıra, LinkedList, listeye bir öğe eklemek için başa veya sona eklemeyi destekleyen ek yöntemleri de sunar.
       
HashMap
      ArrayList ve LinkedList'in aksine, HashMap Map arabirimini uygular. Bu, her anahtarın tam olarak bir değere eşlendiği anlamına gelir. Koleksiyondan ilgili değeri almak için her zaman anahtarı bilmemiz gerekir.
      
HashSet

  HashSet, her öğenin benzersiz olduğu bir öğeler koleksiyonudur
Array list ve linked list arasındaki temel fark linked listteki verilerin kendinden bir önceki veriye bağlı olmasıdır.

Diğer farklara örnek olarak:

+ArrayList, öğeleri depolamak için içsel olarak dinamik bir dizi kullanırken; LinkedList, öğeleri depolamak için içsel olarak çift yönlü bağlı bir liste kullanır.

+ArrayList ile yapılan işlemler yavaş olabilir çünkü içsel olarak bir dizi kullanır. Eğer diziden herhangi bir öğe kaldırılırsa, diğer tüm öğeler hafızada kaydırılır. LinkedList ile yapılan işlemler, ArrayList'e göre daha hızlıdır çünkü çift yönlü bağlı bir liste kullanır, bu nedenle hafızada bit kaydırma gerektirmez.

+ArrayList, veri depolamak ve erişmek için daha uygundur. LinkedList, veri manipülasyonu için daha uygundur.


HashMapin diğer Veri Depolama Tiplerine Karşı Avantaj ve Dezavantajları:

  Avantaj olarak: Farklı liste uygulamalarının aksine, HashMap, belirli bir değere atlamak için dizinleme kullanır, bu da arama zamanını büyük koleksiyonlar için bile sabit yapar. HashMap kullanmak, verileri depolamak istediğimizde eşsiz(unique) anahtarlar mevcutsa mantıklıdır. Bir anahtara göre öğeleri ararken ve hızlı erişim zamanı önemli bir gereksinimse Bu veri depolama tipinin kullanılması makuldur.
  
  Dezavantaj olarak: HashMap kullanmak daha çok hafıza tüketir. (eşsiz anahtarların bulunmasından kaynaklı) ve HashMapte veriler sıralı depolanmazlar (duruma göre bi dezavantaj sayılabilir).


HashSet ve Hashmap Arasındaki Fark

   Aralarındaki temel fark, HashSet'in ilişkilendirilmiş değeri olmayan benzersiz öğeleri depolarken, HashMap'in anahtar-değer çiftlerini depoladığı ve anahtarların benzersiz tanımlayıcılar, değerlerin ise ilişkilendirilmiş veriler olduğu bir koleksiyon tuttuğudur. Örneğin, benzersiz kullanıcı adlarının bir listesini depolamak için bir HashSet kullanabilirsiniz. Öte yandan, HashMap, benzersiz tanımlayıcılar olan anahtarlar ve ilişkilendirilmiş verilerin olduğu bir anahtar-değer çiftleri koleksiyonunu depolamanız gerektiğinde kullanılır.Örneğin, her anahtarın benzersiz bir kullanıcı adı olduğu ve her değerin kullanıcının profil verileri olduğu bir kullanıcı profili listesini depolamak için bir HashMap kullanabilirsiniz.Özetle Hashmap 2 boyutlu bir sistem sunarken Hashset tek boyutludur ve aldığı her değer birbirinden farklı olmak zorundadır(hashmapte bunun için ayrı bir string değeri tanımlanmıştır bu yüzden 2 boyutludur).



