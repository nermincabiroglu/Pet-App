package com.kemanci.petapp;

import java.util.ArrayList;

public class InformationArrays {

    private ArrayList<InfoModel> birdInformationArray;
    private ArrayList<InfoModel> dogInformationArray;
    private ArrayList<InfoModel> catInformationArray;

    public InformationArrays() {
        this.birdInformationArray=new ArrayList<>();
        this.dogInformationArray=new ArrayList<>();
        this.catInformationArray=new ArrayList<>();
        populateArrays();
    }





    public void populateArrays(){
        populateBirdArray();
        populateCatArray();
        populateDogArray();
    }


    private void populateBirdArray(){
        this.birdInformationArray.add(new InfoModel("1.\tMuhabbet kuşlarına nasıl bakılır?","•\tBeslenme: Evinize bir muhabbet kuşu edindiğiniz zaman herhangi bir petshoptan muhabbet kuşlarına özel yemlerden alabilir ve onun temel gıda ihtiyacını karşılayabilirsiniz. Bununla birlikte sevebileceği ot ve yeşillikleri de deneme yanılma yolu ile ona yedirmeye çalışmanız mümkün.\n\n" +
                "•\tBarınma: Muhabbet kuşunuz için bir kafes satın alırken kafesin olabildiğince geniş olmasına ve tel aralıklarının da olabildiğince sık olmasına dikkat etmelisiniz. Eğer muhabbet kuşunuza içinde uçabilmesi ve özgürce hareket edebilmesi için yeteri büyüklükte bir alan tanımazsanız çok kısa bir sürede onun depresyona girmesine sebep olabilirsiniz. Bununla birlikte kuşunuz size, ortamına ve yeni evine alıştıktan sonra onu düzenli olarak kafesinden salmanızda da fayda olacaktır.\n\n" +
                "•\tEğlence: Muhabbet kuşunuz için alabileceğiniz eğlenceli ve eğitici oyuncakların sayısı neredeyse sınırsız. Bununla birlikte hareketi ve aktiviteyi seven kuşların uzun süre kafes içerisinde tutulması, biriken enerjilerini harcayamamalarına sebep olabiliyor. Bu yüzden de kafesin içerisinde farklı ve yaratıcı oyuncakların olması kuşunuzun sıkılmasını ve depresyona girmesini önleyebiliyor. Aynalar, merdivenler, ziller ve kemirme taşları, muhabbet kuşunuzu eğlendirecek araçlardan sadece birkaç tanesi. Bununla birlikte muhabbet kuşunuzun kafesine koymak üzere seçeceğiniz oyuncakları yalnızca petshoplardan almaya dikkat etmenizde fayda var; zira onların sağlığına uygun olarak üretilmemiş olan yabancı maddeler, zehirlenme tehlikesi oluşturabilmekte.\n\n" +
                "•\tGüvenlik: Bu küçük, meraklı, çevik ve zeki evcil hayvana tehlike oluşturabilecek potansiyel faktörlere karşı uyanık olmak çok önemli. Serbest uçarken açık camlar ya da üstü kaplanmamış aynalar, açık tuvalet kapakları, yanan ocak, kaynayan yemek ya da ortalıkta sallanan ipler gibi pek çok faktör, muhabbet kuşunuz için bir tehlike unsuru oluşturabilir. Güvenliğini her daim göz önünde bulundurmanızda ve onu uçurmadan önce alabileceğiniz tüm önlemleri almanızda fayda vardır.\n\n" +
                "•\tSağlık: Tabii ki bir muhabbet kuşuna bakmak, bir evcil hayvan sahibi olarak o kadar da kolay bir görev değil. Mantar, grip ve benzeri bakterileri kolayca kapabilen muhabbet kuşları doğru beslenmedikleri ve düzgün bir şekilde bakılmadıkları sürece zayıf bünyeleri ile bu tür rahatsızlıklara karşı gelemeyecek halde olabilirler. Muhabbet kuşunuzda olağandışı gördüğünüz herhangi bir fiziksel reaksiyon olduğunda mutlaka anında veterinere gitmeli ve hekimin size vereceği tedavi prosedürüne birebir uymalısınız. Takviye vitaminler, gagadan verilen antibiyotikler ya da suya katılan ek besin sıvıları, muhabbet kuşunuzun tedavisi için önerilebilecek yöntemlerden birkaç tanesi. Her daim sağlıklı bir muhabbet kuşuna sahip olmak ve kapacağı virüsleri minimize etmek için yemini ve suyunu düzenli olarak yenilemeli, kafesini de sürekli olarak temizlemelisiniz.\n\n"));

        this.birdInformationArray.add(new InfoModel("2.\tMuhabbet kuşlarının kafesinde neler olmalı?","•\tKafes: Oldukça bariz bir seçimmiş gibi gelebilir ancak muhabbet kuşunuz için kafes seçmek de ciddi bir iş. Seçeceğiniz muhabbet kuşu kafesinin doğru ebatlarda olması ve kafes demirleri arasında yeterli boşluk olması çok önemli. Eğer tek bir muhabbet kuşunuz varsa 45x45x45 santimetre boyutlarındaki bir kafes, alabileceğiniz en küçük kafeslerden olmalı. Bununla birlikte kafesin korkulukları arasındaki boşluk 1.2 santimetre civarında olmalı; bu aralıklardan daha geniş bir rakam kuşunuzun kafasını demirlerin arasına sıkıştırmasına yol açabilir.\n\n" +
                "•\tTünek: Kafesinizin büyüklüğüne bağlı olarak en az 3 tane tüneğe ihtiyacınız olacağı kesin. Muhabbet kuşları kafesin tabanında oturmaya alışık kuşlar değildir ve daima insan seviyesinden 1-2 metre yüksekte tutulmalıdırlar; bu yüzden de kafesin içine yerleştireceğiniz tüneklerin muhabbet kuşunuzun psikolojisi üzerinde de etkisi büyüktür.\n\n" +
                "•\tYemlik: Muhabbet kuşu sayınız 1 olsa bile kafesinizde en az iki yemlik bulundurmalısınız. Bir tanesinde kuş yemini, diğerinde de muhabbet kuşunuzun sağlığı için elzem olan sebze, meyve ve otları tutabilirsiniz. Yemliklerinizi temizlemek ve sterilize etmek için tek yapmanız gereken onları kaynar sudan geçirmek; zira plastikten üretilen bu yemlikler kolaylıkla su altında tutulabilir ve üzerindeki bakteriler anında ölür.\n\n" +
                "•\tSuluk: Tabii ki yemlik demişken suluğu da atlamamakta fayda var. Muhabbet kuşu kafesleri için özel olarak tasarlanmış suluklar, takması ve çıkarması kolay olan kafes aksesuarlarındandır. Tıpkı yemlik gibi temizlemesi kolay olay suluklar, korumalı kapak özellikleri sayesinde dışarıdan kolay kolay yabancı madde almazlar.\n\n" +
                "•\tOyuncak: Her ne kadar opsiyonel olsalar da muhabbet kuşu kafesleri için özel olarak üretilen oyuncaklar, kuşunuzun psikolojisi ve ruh hali üzerinde şüphesiz olumlu etki yaratır. Çıngıraklı aynalar, merdivenler, ziller ve çok daha fazlası muhabbet kuşu oyuncak seçenekleri arasında sizleri bekliyor.\n\n" +
                "•\tKuş Yemi: Tabii ki bir muhabbet kuşu kafesi dolu bir yemlik olmadan düşünülemez. Muhabbet kuşunuzu temin eder etmez ilk yapmanız gereken şey, bir veterinere gidip kuşunuz için ideal olan diyet listesini öğrenmek olacaktır. Size kaliteli ve sağlıklı bir kuş yemi markası önerecek olan veterinerinizin takviye gıda tavsiyelerine de uyarak sağlıklı mı sağlıklı, aslan gibi bir muhabbet kuşu yetiştirmeniz mümkün.\n\n" +
                "•\tGaga Taşı: Son olarak muhabbet kuşunuzun kafesine ekleyebileceğiniz bir diğer aksesuar da gaga taşıdır. Muhabbet kuşunuzun gagasını kaşıyabilmesi ve ihtiyaç duydukça törpüleyebilmesi için yine petshoplardan muhabbet kuşunun sağlığına zarar vermeyecek bir gaga taşı temin etmeniz ve onu sevindirmeniz mümkün.\n\n" +
                " \n\n"));

        this.birdInformationArray.add(new InfoModel("3.\tMuhabbet kuşlarının tırnak kesimi nasıl olmalıdır?","•\tİhtiyacınız olan şeyler:\n\n" +
                "-Havlu: Muhabbet kuşunuzu sabit bir şekilde elinizde tutmak ve kaçmasını önlemek için onu öncelikle bir havluya sarmanız gerekecek. Böylece hem kendisi daha sakin kalacak, hem de sizi ısırma olasılığı azalacaktır. \n\n" +
                "-Tırnak Makası: Eğer hali hazırda elinizin altında hayvanlara özel bir tırnak makası yoksa, herhangi bir petshoptan kolayca edinmeniz mümkün. Online olarak satın alacağınız muhabbet kuşu tırnak makasları ise çok daha bütçe dostudur, belirtmiş olalım.\n\n" +
                "-Yardımcı bir kişi: Her ne kadar bu işi yapmak için iki kişiye ihtiyaç olmasa da siz muhabbet kuşunuzun tırnaklarını keserken yanınızda birinin olması ister istemez sizde pozitif bir etki bırakacaktır. Bununla birlikte eğer aşırı hareketli ve agresif bir muhabbet kuşuna sahipseniz bu işlem sırasında mutlaka bir başkasından destek almanız şart.\n\n" +
                "•\tMuhabbet kuşunun tırnaklarını kesmeye geçmeden önce onu havlu üzerinde tabiri caizse “kilitlemeniz” gerekiyor. Bunu yapmak için havluyu pürüzsüz bir yüzeye yayın ve muhabbet kuşunuzu havlunun üzerine yerleştirin. Adeta bir dürüm sarar gibi havluya sardığınız muhabbet kuşunuzun sadece ayaklarının havlunun dışında kaldığından emin olun. Siz bu işlemi yaparken kendisi büyük bir ihtimalle bolca ötecek ve ciyaklayacaktır. Bu, onun canını yakıyor olduğunuz anlamına gelmiyor; sadece kendi kontrolü dışında zapt edilmekten hoşlanmadığı için muhabbet kuşunuz memnuniyetsizliğini dile getiriyor diyebiliriz.\n\n" +
                "Şimdi sıra tırnakları kesmeye geldi. Her bir tırnağı tek tek kesmeden önce muhabbet kuşunuzun ayaklarını iyice gözlemlemenizde fayda var. Bu şekilde ayaktan geçen damarları tespit edebilir ve onlardan uzak durmanız gerektiğini anlayabilirsiniz. Damarları tespit etmek ise çok kolay; ayak derisinin üzerinden geçen hafif kırmızı şeritler, ayak damarlarını işaret ediyor.\n\n" +
                "Muhabbet kuşunuzun tırnağının ucunu, tırnak makasının içerisine yerleştirin ve makasın tutacaklarını yavaşça birleştirin. Bu süreç boyunca muhabbet kuşunuz korkabilir ve çırpınabilir; ancak tırnak kesme işleminin ona bir gram bile acı vermediğini aklınızdan çıkarmayın.\n\n" +
                "Her bir tırnağı özenle kestikten sonra işiniz bitti sayılır. Bu adımda tek yapmanız gereken muhabbet kuşunuzu nazik ve sakin bir biçimde elinizden bırakarak dilediği yere gitmesine izin vermek. Yaşadığı stresten kurtulmak için ilk etapta hızlıca nefes alacağını fark edeceksiniz; merak etmeyin, özgür olduğunu anladıktan kısa bir süre sonra nefesi ve tabii ki tavırları olağan haline dönecektir; siz de o sevimli ve uysal muhabbet kuşunuza göz açıp kapayıncaya kadar geri kavuşacaksınız. Bol şans!\n\n" +
                "•\tMuhabbet kuşunuzun damarlarından birini keserseniz öncelikle kesinlikle panik yapmayın. Muhabbet kuşunuzun canı çok az acımış olsa bile bu anlık bir acı olacaktır ve kanama başladığı andan itibaren duracaktır. Avcunuzun içine bir miktar bebek pudrası serpin ve kanayan tırnağı pudranın içine bandırın. Pudra kanamayı çok kısa bir sürede durduracak ve muhabbet kuşunuzun keyfini anında yerine getirecektir.\n\n"));


        this.birdInformationArray.add(new InfoModel("4.\tMuhabbet kuşunun cinsiyeti nasıl anlaşılır?","•\tMuhabbet kuşunuzun gagasının üstünde zara bakın. Zar normal şartlar altında burnun bulunması gereken yerdedir. Erkek muhabbet kuşunun zarı çoğunlukla mavimsi ya da morumsu bir renkte olur ve dişi kuşlara oranla daha büyük ebattadır. Dişi kuşların zarı ise daha mat ve soluk renklerde olur. Çoğu zaman beyaz olan bu zar bazen soluk pembe renkte olabilir.\n\n" +
                "•\tMuhabbet kuşunuzu gözlemleyin. Erkek muhabbet kuşları dişi kuşlarla kıyasla daha sakin ve dışadönüktür. Erkek muhabbet kuşları aynı zamanda daha dost canlısı ve tepkisel olurken dişiler daha agresif, sinirli ve dominant olur. Bir grup muhabbet kuşunun etkileşimlerini takip ediyorsanız daha cana yakın ve daha agresif olanları ayırt etmeye çalışan. Dostça davrananlar büyük bir ihtimalle erkekken sizi kendine yaklaştırmayanlar dişi çıkacaktır.\n\n" +
                "•\tMuhabbet kuşunuza kulak verin. Bir muhabbet kuşunun cinsiyetini tespit etmenin belki de en kolay yollarından bir tanesi de onu dinlemektir. Erkekler dişi muhabbet kuşlarına oranla çok daha fazla şarkı söyler ve öterler. Söz konusu dişi muhabbet kuşlarının ötmesi olduğu zaman ise çıkardıkları seslerin daha gürültülü ve öfkeli olduğunu fark edeceksiniz. Erkek muhabbet kuşları adeta “şakırken”, dişi muhabbet kuşları öttüklerinde sanki bağırıyormuş hissi veriyorlar.\n\n"));

    }


    private void populateDogArray(){
        this.dogInformationArray.add(new InfoModel("1.\tYavru köpek bakımı nasıl olmalıdır?","•\tGüvenilir bir veteriner bulun.\n\n" +
                "•\tYavru köpeğinizle ilk defa veterinere gittiğinizde bu ziyareti maksimum verim ile tamamlıyor olmanız çok önemli. Hangi köpek mamalarını tavsiye ettiğinden ne kadar sıklıkla yemek yemesi gerektiğine kadar aklınızda olan tüm soruları sormayı ihmal etmeyin. Köpeğiniz için bir aşı takvimi belirleyin. Hem iç hem dış olmak üzere parazitleri kontrol altına almanın güvenli yöntemlerini konuşun. Yavru köpeğin ilk birkaç ayı içerisinde geliştirebileceği semptomların hangi hastalıklara işaret olduğunu öğrenin. Köpeğinizi ne zaman kısırlaştırmanız gerektiği konusuna da değinin.\n\n" +
                "•\tKaliteli bir köpek maması alın. Unutmamak gerekir ki yavru köpekler, yetişkin köpeklere kıyasla daha farklı bir beslenme rejimine ve mama türüne ihtiyaç duyarlar. En temel hali ile yaş aralıklarına göre günlük beslenme alışkanlıkları şu şekilde olmalı: 6-12 haftalıkken günde 4 öğün, 3-6 aylıkken günde 3 öğün,6-12 aylıkken günde 2 öğün.\n\n" +
                "•\tTuvalet eğitimini verin. Tahmin edersiniz ki yavru köpekler, bez kullanmaktan pek hoşlanmazlar, bu yüzden de evde tuvalet eğitimi çoğu yavru köpek sahibinin ilk dönemlerdeki öncelik listesi arasındadır. \n\n" +
                "Köpeğiniz aşılarını tamamlayana kadar, tuvaletini yaptırmak için onu başka hayvanların olmadığı yerlere götürmenizde fayda vardır. Bu şekilde virüs ya da hastalık kapmasını önlemiş olursunuz. Köpeğinizi ne zaman dışarıya çıkartmanız gerektiğini bilmek de bir diğer önemli unsur. İşte köpeğinizi dışarıya çıkartmanız gereken en yaygın zamanlar:\n\n" +
                "Uyandığınızda\n\n" +
                "Uyumadan önce\n\n" +
                "Yavru köpeğiniz fazla miktarda yemek yedikten ya da su içtikten sonra\n\n" +
                "Yavru köpeğiniz uykudan uyandığında\n\n" +
                "Fiziksel aktivite sırasında ve sonrasında\n\n" +
                "•\tHastalığa karşı gardınızı alın. Yavru köpeğinizi eve getirdiğiniz ilk birkaç ay, hastalığa yakalanma ya da iltihap kapma riski en yüksek olan dönemdir. Belli semptomları gösterirse derhal veteriner hekiminize başvurun unutmayın erken teşhis çok önemli. O semptomlar: İştahsızlık, yetersiz kilo alımı, kusma, şişkin karın bölgesi, yorgunluk, ishal, nefes alma zorluğu, öksürme ve tıksırma, soluk diş etleri, şiş ve kırmızı gözler, gözlerde çapaklanma, tuvalete çıkamama.\n\n" +
                "•\tİtaat etmeyi öğretin. Yavru köpeğinize iyi davranmasını öğrettiğiniz sürece ona ömür boyu pozitif etkileşim alışkanlıkları aşılamış olursunuz. Buna ek olarak itaat eğitimleri, köpeğinizle aranızda çok daha güçlü bir bağ oluşmasına vesile olacaktır.\n\n" +
                "•\tSosyal kalın. Unutmayın, köpekler sosyal hayvanlardır ve tıpkı insanlarda olduğu gibi sürekli olarak iletişim kurmaya, sosyalleşmeyi ve etkileşime girmeye ihtiyaç duyarlar. Sosyalleşme aynı zamanda köpeğinizin ilerleyen dönemlerinde davranışsal problemler yaratma riskini de minimize eder. Yavru köpeğiniz ile 2 aylıktan itibaren sosyalleşme çabalarınızı başlatmalı ve bu alışkanlığı tercihen ömür boyu sürdürmelisiniz.\n\n"));

        this.dogInformationArray.add(new InfoModel("2.\tKöpeklere tuvalet eğitimi nasıl verilir?","Uzmanlar, köpeğinize tuvalet eğitimi süreçlerine köpek 12-16 haftalıkken başlanması gerektiğini belirtiyor. Bu noktada köpek idrarını ve dışkısını kontrol edebilecek bir durumda oluyor ve tutmasını bilebiliyor.\n\n" +
                "Eğer köpeğinizi eve ilk defa getirdiğinizde 12 aylık ve daha büyük ise evde tuvalet eğitimi vermek biraz daha uzun ve zorlayıcı olabilir. Bunun için her şeyden önce köpeğinizin bu zamana kadar alışmış olduğu alışkanlıklarını yeniden şekillendirmeniz gerekecektir.\n\n" +
                "\tEvde tuvalet eğitimine başlarken şu adımları izlemeniz gerekir:\n\n" +
                "•\tKöpeğinizi düzenli bir beslenme rutininde tutun ve yemek saatleri arasında mamasını daima ortadan kaldırın.\n\n" +
                "•\tKöpeğinizi sabah ilk iş dışarıya çıkartın, ardından da her yarım saatte ya da 1 saatte bir çıkartmaya devam edin. Bunu yemeklerden sonra ve uykudan uyandıktan sonra da yapın. Yalnız bırakılmadan ya da gece uykusuna yatmadan önce de son bir kez dışarıya çıkmakta fayda vardır.\n\n" +
                "•\tKöpeğinizi tuvaletini yapabilmesi için her zaman aynı lokasyona götürün.\n\n" +
                "•\tEvde tuvaletini yapmamaya alışana kadar dışarıdayken her daim yanında durun.\n\n" +
                "•\tKöpeğiniz dışarıya tuvaletini yaptığında onu ödüllendirin; ödül maması ya da mahallede kısa bir yürüyüş güzel bir ödül olabilir.\n\n" +
                "Elbette bir köpeğe tuvalet eğitimi verirken sahibi olarak tuvalete gitmesi gerektiğinin          işaretlerini algılayabiliyor olmanız çok önemli. Köpeğinizin tuvaleti geldiyse büyük bir ihtimalle size şu göstergelerden bir ya da birkaçını sunacaktır:\n\n" +
                "•\tAğlama\n\n" +
                "•\tDaireler çizme\n\n" +
                "•\tKoklama\n\n" +
                "•\tHavlama\n\n" +
                "•\tKapıyı tırmalama\n\n"));


        this.dogInformationArray.add(new InfoModel("3.\tKöpekler neden tüy dökerler?","Köpekler, gevşek ve zarar gören tüylerini doğal olarak dökerler. Her ne kadar köpeklerde tüy dökme gayet normal bir süreç olsa da, dökülen tüylerin miktarı ve zamanlaması çoğu zaman cinsine ve sağlığına bağlıdır. Bununla birlikte köpeklerde tüy dökme, mevsimlerden de doğrudan etkilenmektedir; pek çok köpek kış aylarında kalık bir tüy tabakası geliştirir, bahar aylarında ise bu tabakayı dökmeye başlar. Her daim ev içerisinde tutulan köpekler ise tüy kalınlığı konusunda daha az dalgalanmalara sahiptir, dolayısıyla da yıl boyu eşit oranda tüy dökerler.\n\n" +
                "Bazı köpeklerde “aşırı” olarak nitelendirilen tüy dökme, bazı cinsler için oldukça normaldir; ama aşırı tüy dökmenin en temel sebepleri arasında stres, tıbbi bir sorun ya da zayıf beslenme yer almaktadır. Tabii ki aşırı tüy dökme söz konusu olduğunda sebebi en doğru şekilde tespit edebilecek kişi yine veterinerizdir. Bu sebepleri şu şekilde sıralamak mümkün:\n\n" +
                "•\tParazitler (Kene, bit, pire vs.)\n\n" +
                "•\tBakteriyel enfeksiyonlar\n\n" +
                "•\tGıda temelli alerjiler\n\n" +
                "•\tBazı ilaçlar\n\n" +
                "•\tHamilelik ya da emzirme\n\n" +
                "•\tKaraciğer, böbrek ya da tiroit rahatsızlıkları\n\n" +
                "•\tYalamaya bağlı travma\n\n" +
                "•\tKanser\n\n" +
                "•\tBağışıklık sistemi bozuklukları\n\n" +
                "•\tGüneş yanığı\n\n" +
                "•\tYakıcı madde ile temas\n\n" +
                "Eğer aşağıdaki durumlardan herhangi biri ile karşılaştırsanız, tüy dökme sorununuzu artık bir veterinere gösterme vaktiniz gelmiş demektir.\n\n" +
                "\n\n" +
                "•\tCilt kızarıklığı ve hassasiyeti\n\n" +
                "•\tAçık yaralar\n\n" +
                "•\tKel noktalar\n\n" +
                "•\tTüy tabakasında gözle görünür oranda incelme\n\n" +
                "•\tKuru ve kolay kopan tüyler\n\n" +
                "•\tKaşınma\n\n" +
                "•\tSürekli olarak yüz ovuşturma ve pati yalama\n\n" +
                "Her ne kadar sağlıklı bir köpeğin normal tüy dökmesini durdurma imkanınız olmasa da, evinizdeki tüy miktarını köpeğinizi düzenli olarak tarayarak minimize etmeniz mümkün. Veterineriniz, köpeğinizin cinsine uygun bir tarak çeşidi önerecektir, böylece ev içerisinde etrafa dökülen tüyleri kontrol altına almanız mümkün olacaktır.\n\n"));

    }

    private void populateCatArray(){
        this.catInformationArray.add(new InfoModel("1.\tKediler Yıkanmalı mıdır?","Kedilerin kendine has bir temizleme ve temizlenme rutinlerinin olduğu aşikar. Dillerinde ve dişlerinde yer alan özel temizleme partikülleri sayesinde kediler, tek bir yalanma seansı sonrası bile banyodan yeni çıkmış bir insandan daha temiz hale gelebilir. Bununla birlikte bazı özel durumlarda kediler yıkanmak için sahiplerine ihtiyaç duyabilirler. Yapışkan, kokan ya da pis bir şeyin içine girdiğinde ya da pire şampuanı ile yıkanması gerektiğinde kedinizi suyun altına sokma zahmetine girmeniz gerekecektir. Minimum stres ve maksimum verimlilik ile kedinizi yıkayabilmek için bu ipuçlarını dikkate almanız önemlidir."));

        this.catInformationArray.add(new InfoModel("2.\tKediler Nasıl Yıkanmalı?","•\tDoğru zamanlamayı bulun: Kediniz en sakin olduğu zamanlarda onu yıkamayı tercih etmenizde fayda var.\n\n" +
                "•\tSize saldırma ihtimaline karşı banyo öncesi tırnaklarını kesin.\n\n" +
                "•\tGevşek kalmış tüm tüyleri alabilmek adına onu iyice tarayın. Bu aynı zamanda su ile temas sonrası tüylerde düğümlenme oluşumunu da minimuma indirecektir.\n\n" +
                "•\tKediyi yıkarken onu su dolu bir küvete ya da tasa daldırmak yerine ince uçlu bir hortum ya da duş başlığı kullanın. Özellikle kulaklarına, gözlerine ya da ağzına su gelmesini önlemek için hortumu boyundan aşağısına tutmaya dikkat edin. Eğer kediniz izin verirse kafasına şeffaf bir duş şapkası da geçirebilirsiniz.\n\n" +
                "\n\n" +
                "•\tSu ile temas ettiği anda kediniz büyük bir ihtimalle çırpınmaya ve içinde bulunduğu durumdan kurtulmaya çalışacaktır. Bu durumu önceden kestirip, yıkama işlemini iki kişi gerçekleştirmenizde fayda olacaktır. Bir kişi kediyi tutarken diğeri yıkama ve durulama işlemini gerçekleştirmelidir.\n\n" +
                "\n\n" +
                "•\tKedinizi tamamen ıslattıktan sonra kedilere özel şampuan kullanarak tüm tüylerini güzelce köpükleyin. Nazik bir şekilde masaj yaparak şampuanı tüylere yedirin.\n\n" +
                "•\tHem su hem şampuan kullanımında her daim kulak, göz ve ağızdan uzak durun.\n\n" +
                "•\tYıkama işlemi tamamlandıktan sonra hem üşütmemesi hem daha çabuk kuruyabilmesi için kedinizi kuru ve temiz bir havluya sarın. Havlunun büyük ve pamuklu olması size avantaj sağlar. Oda sıcaklığının bir tık üstünde sıcaklıkta bir ortamda kurumaya bırakın. Eğer kedinizin tüyleri uzunsa, geniş dişli bir tarak kullanarak oluşabilecek düğümleri açın.\n\n" +
                "•\tÖdül maması verin. Eğer kediniz tüm bu aşamaları geçip kurutma aşamasına gelmişse, gerçekten de en lezzetlisinden bir ödül maması hak etmiş demektir. Banyo sonrası ona en sevdiği ödülü vermeniz, bir sonraki banyo seansında bu kadar korkmamasına ön ayak olabilir.\n\n"));

        this.catInformationArray.add(new InfoModel("3.\tYavru Kediler için Süt Tozu Kullanımı","Eğer edindiğiniz yavru kedi annesiz ve 6 haftalıktan küçükse, kesinlikle özel bakıma ihtiyaç duyacaktır. Bu yüzden de sokaktan ufak bir yavru kedi almadan önce bu bilinçte olmanız ve özellikle ilk aylarda sizi uğraştıracak bir sürecin beklediğinin farkında olmanız gerekir. Bu süreçte en önemli nokta ise yavru kedinin beslenmesidir. İdeal koşullarda yeni doğmuş bir yavru kedi sabah akşam anne sütü ile beslenir. Ancak annesi tarafından bırakılan yavrularda anne sütünün ideal ikamesi, yavru kedi için süt tozudur.\n\n" +
                "Yavru kedi için süt tozu, veteriner kliniklerinde ve pethsoplarda bulunur. Annesi olmadan yetişen kedi yavrularının beslenmesinde süt tozu kullanılırken dikkat edilmesi gereken bir diğer nokta da aşırı beslenmeden kaçınmaktır. Yavru kedinin midesi hali hazırda küçük ve hassastır, o yüzden mideyi çok fazla doldurmamaya dikkat edilmelidir. Yavru kedilerin ilk haftalardaki mide kapasitesi, kilogram başına 50 mililitre civarındadır, bu yüzden de özellikle ilk 2-3 hafta boyunca aşırı süt tozu tüketiminden kaçınılmalıdır. Ortalama olarak bakacak olursak yavru kedileri günde 6 saatte bir, yani aşağı yukarı 4 kez beslemek gerekir. Bu beslenme periyotlarındaki porsiyonlar ise 100-150 gram aralığındaki bir yavru için ortalama 5 mililitredir. Yavru kedi, henüz mama kabı vb. gereçlere alışık olmayacağı ve ne zaman durması gerektiğini bilemeyeceği için süt tozunun enjektörler ya da damlalıklarla verilmesi gerekir.\n\n"));



        this.catInformationArray.add(new InfoModel("4.\tHangi Kumu Kullanmak Gerekir?","İşin aslına bakarsanız kedi kumlarını kafanızı fazla bulandırmadan iki ana grupta toplamak mümkündür: Bentonit kedi kumu ve silika kedi kumu.\n\n" +
                "Bentonit Kedi Kumu: İsminden de anlaşılacağı üzere bentonit adı verilen özel bir malzemeden üretilen bentonit kedi kumları, kum tanesi inceliğinde killerden meydana gelir. Topaklanma konusunda başarılı olan ve sıvı ile temas ettiği anda büyük bir tomağa dönüşen bentonit kumlar, açık gri-bej arası bir renge sahiptir.\n\n" +
                "Silika Kedi Kumu: Silika kumlar ise yine adından anlayabileceğiniz gibi silika denen bir malzemeden üretilir. Silika kedi kumları, kum taneciklerinden ziyade daha çok ufak elmas tanelerine benzer bir yapıya sahiptir; yani bentonit kumlardan daha iri tanelidir. Bazı silika kumların arasında koku yaymaya yönelik ufak mavi tanecikler de bulunur.\n\n" +
                "Her iki kedi kumunun karakteristik ve fiziksel özelliklerini inceledikten sonra sıra, ikisini birbiri ile kıyaslamaya geliyor. Hangi kedi kumunun sizin ve kediniz için daha iyi olduğuna, bu kıyaslamayı inceledikten sonra kendiniz karar verebilirsiniz:\n\n" +
                "•\tKoku: Silika kedi kumu, kokuyu hapsetme ve dışarıya yaymama konusunda bentonit kedi kumuna göre daha başarılıdır.\n\n" +
                "•\tTopaklanma: Silika kedi kumu neredeyse hiç topaklanmaz desek yeridir. Kedinizin silika kum üzerine bıraktığı sıvı atık, olduğu gibi kumun üzerinde kalarak yalnızca kumun sararmasına sebep olur. Öte yandan bentonit kum, özellikle kedi kumu markasının kalitesine bağlı olarak doğrudan topaklanma ve sertleşme özelliğine sahiptir. Böylece kedi tuvaleti içerisindeki atık kumu temizlemek çok daha kolay ve pratik hale gelir.\n\n" +
                "•\tTozlanma: Bentonit kedi kumu ince taneli kilden meydana geldiği için özellikle paket ilk açıldığında ve tuvalete döküldüğünde etrafta tozlanma yaratabilir. Bu tozlanma, seçtiğiniz kum markası kaliteli ve güvenilir olmadığı zaman kullanım boyu, her eşelemede ortaya çıkabilir. Silika kumlarda böyle bir tozlanma riski bulunmaz.\n\n" +
                "•\tSağlık: Uzmanlar ve veterinerler, bentonit kumların silika kumlara oranla kediniz için daha sağlıklı bir seçim olduğunu vurguluyor.\n\n" +
                "•\tUzun süreli kullanım: Çabuk topaklandığı için bentonit kum, kısa bir süre içerisinde tuvaletin içerisinde irili ufaklı topak birikmesine neden oluyor, bu da tuvalette temiz ve kullanılabilir kumun azalmasına sebebiyet veriyor. Öte yandan silika kedi kumu topaklanmadığı için miktarı azalmıyor; ancak uzun süre kirli olarak kalan silika taneleri bakteri oluşumunu hızlandırabiliyor.\n\n" +
                "•\tHijyen & Temizlik: Topaklandığı ve bakterileri sert yapısı içerisine hapsettiği için bentonit kumlar silika kumlara göre daha yüksek hijyen sağlıyor.\n\n" +
                "•\tFiyat: Her iki kedi kumu arasında fiyat kıyaslaması yapmak mümkün olmuyor; zira kedi kumu fiyatları seçeceğiniz markaya ve kumun kalitesine göre farklılık gösterebiliyor.\n\n" +
                "Hangi kedi kumunun daha iyi olduğuna karar vermek için önce veterineriniz ile görüşmeli ve onun uzman görüşünü almalısınız. Ardından tavsiye üzerine aldığınız kedi kumunu en önemli karar merciine, yani kedinize test ettirmeli ve nihai kararı ona bırakmalısınız.\n\n"));



        this.catInformationArray.add(new InfoModel("5.\tYaş mama türleri ve seçimi","Doğru ıslak mamayı bulmak, daha doğrusu doğru ıslak mamayı bulmuş olduğunuzu anlamak, her zaman tek seferde yapabileceğiniz bir şey olmayabilir. Kedinizin yüzde yüz memnun olacağı bir ıslak mamada karar kılmadan önce onu da işin içine dahil ederek birkaç kez test yapmanız gerekebilir. Bu deneme yanılma süreci boyunca kediniz için en uygun ıslak mamayı bulacağınızdan ise kesinlikle şüpheniz olmasın.\n\n" +
                "Kedinizin canının ne çektiğini tespit etmek için deneyler yapmaktan çekinmeyin. Çoğu ıslak kedi maması markasının farklı içerikleri, çeşit çeşit lezzetleri ve tatları bulunmaktadır. Bununla birlikte yetişkin kedi maması, yavru kedi maması ya da kısır kedi maması olmak üzere farklı kedi gruplarına yönelik ıslak mama çeşitleri bulmak da mümkündür. İşte onlardan bazıları: \n\n" +
                "•\tEzme (Pate): Çoğu zaman tek bir parça halindedir, orta yoğunlukta bir kıvamı vardır ve pürüzsüzdür.\n\n" +
                "•\tTiftiklenmiş: Tiftiklenmiş ıslak kedi mamaları, içerisinde tiftik tiftik tavuk etini andıran parçalar barındırır. Bu parçalar genellikle et parçalarıdır ve yoğun kıvamlı bir sos içinde yüzerler.\n\n" +
                "•\tKüp şeklinde: Piyasada en yaygın olarak bulabileceğiniz ıslak mama çeşididir. Yine kıvamlı bir sos içinde yüzen tavuk, et ya da balık parçaları, bu sefer küp şeklinde doğranmış ve konserve haline getirilmiştir.\n\n" +
                "•\tPullu: Orta yoğunlukla bir kıvama sahip olan sos içinde yüzen küçük, yassı ve ince et parçalarıdır.\n\n" +
                "•\tYahni: Et ve sebze parçaları barındıran, sıvı bir ıslak mamadır.\n\n" +
                "•\tKarışık: İçerisinde hem ezme, hem tiftiklenmiş et, hem küp küp doğranmış parçalar, hem de sebze barındırabilecek bir ıslak mama karışımıdır.\n\n" +
                "Islak mama seçimi yaparken ve kedinizi ıslak mama ile beslerken dikkat etmeniz gereken noktalar şu şekilde:\n\n" +
                "•\tDüşük proteinli ıslak mamalardan uzak durun: İdel protein oranı en az %8.8’dir.\n\n" +
                "•\tKarbonhidrat tüketimine dikkat edin: Yine uzman veterinerler, karbonhidratların sağlıklı bir kedinin beslenmesinde minimal bir rol oynaması gerektiğini vurguluyor. Kediniz için ıslak ya da kuru; mama seçimi yaparken karbonhidrat oranlarının her daim son önceliğiniz olması gerekiyor. Bunu yaparken seçeceğiniz ıslak mamada buğday, mısır, soya, pirinç ve benzeri nişastalı besinlerin olabildiğince az olmasına dikkat etmeniz lazım.\n\n" +
                "•\tAlerji belirtilerine karşı dikkatli olun.\n\n" +
                "•\tYapay içerikli ıslak mamalardan uzak durun\n\n" +
                "•\tKedinizin günlük ıslak mama ihtiyacını aldığından emin olun. Bunun için veterinerinize danışabilirsiniz.\n\n" +
                "\n\n" +
                "•\tIslak mamanın yeterli oranda sıvı barındırmasını sağlayın: Bazı ıslak mamalar, her ne kadar isminde “ıslak” geçse de içerisinde yeterince su barındırmıyor, bu da kedinize bu ıslak mamayı vermenin amacından sapıyor. İdeal bir ıslak mamadaki sıvı oranı, en az %75 olmalı.\n\n"));



        this.catInformationArray.add(new InfoModel("6.\tYavru kediler nasıl beslenir?","Yavru kedilerin yağ, yağlı asit ve vitamin ihtiyaçları, yetişkin kedilerin ihtiyaçları ile aynıdır, ancak yavru kedilerin yüksek oranda amino asit, mineral ve protein ihtiyacı da bulunmaktadır. Bu yüzden de çoğu uzman, yavru kediniz 1 yaşına ulaşana kadar onu sadece özel olarak formüle edilmiş yavru kedi maması ile beslemenizi öneriyor. Elbette her yaşta kedide olduğu gibi bolca temiz içme suyu da yavru kedinizin diğer elzem beslenme ihtiyaçlarından.\n\n" +
                "Çok küçük yavru kedilerin rejimleri dahilinde az da olsa ıslak mamaya erişimlerinin olması önemlidir. Yeni doğan kedilerin dişleri henüz çok küçük olduğundan dolayı kuru mamaları çok iyi çiğneyemezler. Islak mama olmadan düzgünce büyüyebilmeleri için ihtiyaçları olan besin takviyesini alamazlar. Kedinize hem kuru hem ıslak mama vermeyi tercih ediyorsanız, ıslak mama oranını günde 2 öğüne çıkartmanız önemlidir. Öte yandan kedinizi sadece ıslak mama ile beslemeyi seçiyorsanız bu öğün sayısı 4’e çıkartılmalıdır.\n\n"));


        this.catInformationArray.add(new InfoModel("7.\tKedi gribi nedir?","Kedi gribi, tıpkı insanlarda oluşan grip gibi, akan bir buruna, yaşlı gözlere ve tahriş olmuş bir boğaza yol açabilir. Kedi gribinin diğer semptomları arasında kas ve eklemlerde ağrı, ağızda yaralar, burun çekme ve ateş yer alır. Kedi gribi, yetişkin kediler söz konusu olduğunda fazla ciddi bir hastalık olmamakla birlikte ağrıların azalması ve iyileşme sürecinin hızlandırılması için veterinere görünmeyi gerektirebilir.\n\n" +
                "Öte yandan yavru kediler grip olduğunda durum yetişkin kedilerde olduğundan daha ciddi bir hal alır. Yavru kedi griplerinde oluşan en büyük risk, gözde oluşabilecek kalıcı hasardır. Özellikle yavru kedilerde grip sırasında görülebilen göz ülseri, zamanında müdahale edilmediği takdirde kalıcı bir hal alabilir. Her halükarda kediniz grip olduğu anda onu veterinere götürmekte ve muayene ettirmekte fayda vardır.\n\n"));

        this.catInformationArray.add(new InfoModel("8.\tKedilerin tırnakları nasıl kesilir?","İdeal dünyada kedinizi tırnak makası ile o daha yavruyken tanıştırmanız gerekir. Sessiz ve sakin bir oda seçerek kedinizle birlikte bir sandalyeye oturun ve onu kucağınıza yerleştirin. Bunu yapmadan önce kedinizin sakin, rahat ve hatta uykulu olduğu bir anı seçin; mesela mama yedikten sonraki ağırlık çöküşü dönemi gibi.\n\n" +
                "Kediniz sizden öteye bakar halde kucağınızda otururken patisinin orta kısmına masaj uygulayarak basınç yapın ve tırnakların tamamen dışarıya çıkmasını sağlayın. Tırnak kökünün nereden başladığını ve her bir tırnak için ne kadar kesmeniz gerektiğine önceden karar verin. Önce sadece tırnağın ucunu keserek ona hemen bir ödül maması verin. Eğer kediniz tırnağının ucunu kestiğinizi fark etmediyse bir tane daha kesin, ancak kediniz rahatsız olursa tek seferde ikiden fazla tırnak kesmemeye çalışın. İlk birkaç tırnak kesme seansında tek seferde tek pati ile yetinmek zorunda kalabileceğinizi unutmayın.\n\n" +
                "Bunları asla yapmayın:\n\n" +
                "•\tEğer kediniz tırnak kestirmeye karşı direnirse onu cezalandırmayın ve ona bağırmayın.\n\n" +
                "•\tKediniz sinirli ya da saldırgan iken asla tırnaklarını kesmeye kalkmayın.\n\n" +
                "•\tAcele ile tırnak kesmeyin; bu tırnak köküne zarar vermenize sebep olabilir.\n\n" +
                "•\tTek seferde tüm tırnakları kesmeyi denemeyin.\n\n"));

        this.catInformationArray.add(new InfoModel("9.\tKedileri birbirine nasıl alıştırırız?","•\tKedileri doğru bir biçimde birbirleri ile tanıştırın. Yeni kediyi, diğer kedi onun kokusunu kapıdan alabilsin diye başka bir odada tutun. Eğer boş bir odanız yoksa banyoyu kullanabilirsiniz. Eski kediniz uyurken yeni kedinin üzerinde kokusu olan bir şeyi vererek uyumasını sağlayın. Böylece kokusuna alışmasını sağlayacaksınız.\n\n" +
                "•\tHer bir kedi için yaşam alanı oluşturun. Her iki kedi için de ayrı mama kapları, ayrı su kapları, ayrı kum ve ayrı kedi yatağı temin etmeniz gerekmektedir. Bu şekilde birbirleri ile rekabet içerisinde olmazlar ve ortak bir objeyi kullanmak zorunda kaldıkları zaman strese girmezler.\n\n" +
                "•\tOluşabilecek sorunlarla başa çıkmaya çalışın. Olur da kedileriniz durup dururken agresifleşerek birbirleri ile kavga etmeye başlarlarsa el çırpma ya da su fışkırtma yöntemine başvurun. Unutmayın ki kedilerin hiçbir sorunu, fiziksel kavga ile çözülmez, yalnızca daha da uzaklaşmalarına sebebiyet verir. Bu yüzden de caydırıcı yöntemler kullanarak onları kavga etmeye alıştırmamaya özen gösterin. Alkış ya da su işe yaramadığı durumlarda kedi sakinleştirici spreylerden yararlanabilirsiniz. Ayrıca hepsini eşit derecede sevin ve hepsine aynı derecede ilgi göstermeye çalışın.\n\n"));


        this.catInformationArray.add(new InfoModel("10.\tKedilerde aşı takvimi","Kedilerde aşılama kedinizin sağlığı açısından oldukça önemlidir. Yavru bir kediye yapılması gereken 3 temel aşı bulunmaktadır. Bunlar karma, kuduz ve leukemia (lösemi) aşısıdır. Yavru bir kedinin aşı programı aşağıdaki gibi uygulanmaktadır:\n\n" +
                "•\t6-8 Haftalık:\tGenel Kontrol + İç ve Dış Parazit (2 Ayda 1 Tekrarlanır)\n\n" +
                "•\t8-10 Haftalık:\tGenel Kontrol + Karma Aşı\n\n" +
                "•\t9-11 Haftalık:\tGenel Kontrol + Leukemia (Lösemi) Aşısı (Leukemia Testi)\n\n" +
                "•\t10-12 Haftalık:\tGenel Kontrol + Karma Aşısı (Tekrarı)\n\n" +
                "•\t11-13 Haftalık:\tGenel Kontrol + Leukemia (Lösemi) Aşısı (Tekrarı)\n\n" +
                "•\t12-14 Haftalık:\tGenel Kontrol + Kuduz Aşısı (3 Aydan Küçüklere Yapılmaz)\n\n" +
                "1 yaşına ulaştıktan sonra her yıl için 1 karma, 1 Leukemia ve 1 de kuduz aşısı yapılır.  Parazit uygulamaları da kedinizin ömrü boyunca iki ayda bir yapılmalıdır.\n\n" +
                "Aşı yapıldıktan sonra kedinize stres yaratabilecek durumlar oluşturmamaya çalışın. Mümkünse istirahat etmesini sağlayın. Aşıdan sonra genel yan etkiler arasında hafif rahatsızlık, hafif ateş, iştah kaybı, aktivite kaybı yer almaktadır. Bunları gözlemlediğinizde hemen panik yapmayın. Kedinizde normal dışı gelişmeler ya da alerji söz konusu ise vakit geçirmeden veterinerinizle irtibata geçin.  Nadiren de olsa bazı kediler aşıya karşı reaksiyon geliştirebilirler.\n\n"));


    }










    public ArrayList<InfoModel> getBirdInformationArray() {
        return birdInformationArray;
    }

    public void setBirdInformationArray(ArrayList<InfoModel> birdInformationArray) {
        this.birdInformationArray = birdInformationArray;
    }

    public ArrayList<InfoModel> getDogInformationArray() {
        return dogInformationArray;
    }

    public void setDogInformationArray(ArrayList<InfoModel> dogInformationArray) {
        this.dogInformationArray = dogInformationArray;
    }

    public ArrayList<InfoModel> getCatInformationArray() {
        return catInformationArray;
    }

    public void setCatInformationArray(ArrayList<InfoModel> catInformationArray) {
        this.catInformationArray = catInformationArray;
    }
}
