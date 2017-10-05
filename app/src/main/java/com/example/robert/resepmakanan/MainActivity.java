package com.example.robert.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<resepMakanan> resepMakananList = new ArrayList<>();
    RecyclerView r1;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.recyclerresep);
        adapter = new Adapter(this,resepMakananList);
        r1.setLayoutManager(new LinearLayoutManager(this));
        r1.setAdapter(adapter);

        isidata();
    }

    private void isidata() {
        resepMakanan baru = new resepMakanan("Opor Ayam"
        ,"Mendengar kata opor ayam, pasti sudah tidak asing di telinga kita. Pastinya otak kita akan"
        +"langsung membayangkan suatu makanan yang lezat, dan tentunya membuat perut kita"
        +"langsung keroncongan kelaparan ingin cepat-cepat memakannya.\n"
        ,"Bahan Opor Ayam:\n"
        +"•\t4 sdm minyak untuk menumis\n" +
                "•\t2 batang Serai, ambil bagian putihnya, memarkan\n" +
                "•\t5 lembar daun jeruk purut\n" +
                "•\t3 lembar daun salam\n" +
                "•\t2 ekor ayam buras, potong masing-masing menjadi 4 bagian\n" +
                "•\t1 1/2 butir kelapa, parut, peras menjadi 250 ml santan kental dan\n" +
                "•\t1 1/2 L santan encer\n"+"\nBumbu yang dihaluskan:\n"+"•\t3 sdt ketumbar butiran, sangrai\n" +
                "•\t1/2 sdt jintan, sangrai\n" +
                "•\t2 sdt merica butiran\n" +
                "•\t6 butir kemiri, goreng\n" +
                "•\t3 cm kencur\n" +
                "•\t3 cm lengkuas\n" +
                "•\t100 g bawang merah\n" +
                "•\t5 siung bawang putih\n" +
                "•\t2 sdt garam\n" +
                "•\t2 sdm gula merah sisir\n"+
                "Cara Memasak Opor Ayam : \n\n"+
                "1.\tPanaskan minyak, tumis bumbu halus, Serai, " +
                "\tdaun jeruk, dan daun salam. Aduk-aduk hingga harum.\n\n" +
                "2.\tMasukkan potongan ayam, aduk-aduk hingga ayam kaku.\n\n" +
                "3.\tMasukkan santan encer, masak terus di atas api sedang " +
                "\thingga mendidih dan ayam empuk.\n\n" +
                "4.\tTambahkan santan kental, aduk sesekali sampai mendidih. " +
                "\tKecilkan api, masak hingga santan agak berminyak.\n\n" +
                "5.\tOpor ayam siap disajikan.\n\n",R.drawable.opor);
        resepMakananList.add(baru);

        baru = new resepMakanan("Gulai Kambing","Bumbu gulai kambing arab biasanya memasukkan bahan bumbu kardamon atau sering disebut"
                +"sebagai kapulaga arab. Meskipun demikian sebenarnya cita rasa yang dihasilkan tidak jauh berbeda dengan resep gulai dari daerah lainnya.\n"
        ,"\nBahan-Bahan : \n\n"
        +"•\tDaging kambing ± 500 gram\n"
        +"•\tBawang putih 3 siung\n" +
                "•\tBawang merah ± 6 buah\n" +
                "•\tKemiri sekitar 3 butir\n" +
                "•\tKetumbar : ± 1 sendok makan\n" +
                "•\tPala bubuk : ±¼ sendok teh\n" +
                "•\tJinten : ±¼ sendok teh\n" +
                "•\tJahe dan kunyit masing masing satu kerat ( seruas jempol tangan )\n" +
                "•\tBagi yang suka pedas bisa memasukkan cabe rawit merah paling tidak 4 buah ( selera )\n" +
                "•\tTeh klabet dan teh adas masing masing paling tidak ¼ sendok teh\n" +
                "•\tGaram dan gula pasir secukupnya.\n\n"
        +"•\tJika anda ingin kuah santan, maka sediakan 1 buah kelapa tua, lantas diparut dan buat santan kental sekitar 1 liter.. Jika ingin tanpa santan ( ditiadakan ).\n" +
                "•\tLengkuas sekitar satu ruas ibu jari\n" +
                "•\tSerai paling tidak 2 batang\n" +
                "•\tSediakan juga cengkeh sekitar 6 buah\n" +
                "•\tDaun salam 3 lembar\n" +
                "•\tKayu manis 1 batang, bisa potong menjadi 3 bagian\n" +
                "•\tKapulaga : ± 4 buah\n" +
                "•\tDaun jeruk nipis atau bisa juga dengan daun jeruk purut sekitar 3 lembar\n" +
                "•\tBawang goreng secukupnya\n" +
                "•\tMinyak goreng sedikit untuk menumis\n" +
                "\nNah setelah semua bahan bahan dan bumbunya terkumpul semua, yuk mulai ikuti petunjuk cara membuat masakan gulai kambing cita rasa spesial enak ini.\n"
        +"\n\nCara Memasak Gulai kambing : \n\n"
        +"1.\tBersihkan daging kambing dari segala kotoran, jika kotoran menempel kuat sebaiknya potong dan buang. Kemudian potong potong kecil sesuai selera, sebaiknya daging kambing jangan di cuci.\n" +
                "2.\tAmbil cobek dan haluskan semua bahan bumbu halus dengan di uleg.\n" +
                "3.\tSiapkan wajan yang cukup besarnya dan mulai menumis bumbu halus. Gunakan api kompor kecil saja. Aduk aduk bumbu halus hingga merata.\n" +
                "4.\tSetelah mulai tercium bau harum, lantas masukkan bahan bumbu pelengkap. Aduk secara perlahan dan tetap dengan nyala api kompor kecil. " +
                "Terus aduk aduk hingga benar benar matang dan tercium bau wangi dan harum.\n" +
                "5.\tSekarang masukkan air bersih secukupnya dan juga daging kambing yang telah di potong potong. Gunakan nyala api kompor sedang.\n" +
                "6.\tTunggu hingga daging empuk dan masukkan air santan. Jangan lupa terus mengaduk secara perlahan supaya santan tidak pecah.\n"
        ,R.drawable.gule);
        resepMakananList.add(baru);

        baru = new resepMakanan("Tengkleng Solo","Salah satu masakan khas Solo yang banyak diburu oleh para pecinta kuliner adalah tengkleng kambing"
                +"yang merupakan salah satu masakan olahan daging kambing beserta tulang kambing dengan sajian yang mirip seperti gulai kambing\n"
        ,"\nBahan – bahan utama :\n"
        +"- Daging kambing muda 100 gram dipotong kotak – kotak\n" +
                "-Iga kambing 200 gram dipotong kotak kotak\n" +
                "-Jeroan kambing 100 gram potong sesuai selera\n" +
                "-Air 500 ml\n" +
                "-Daun salam 3 lembar\n" +
                "-Daun jeruk 3 lembar\n" +
                "-Sereh 1 batang dimemarkan\n" +
                "-Lengkuas 3 cm dimemarkan\n" +
                "-Jahe 3 cm dimemarkan\n" +
                "-Minyak untuk menumis secukupnya\n"
        +"-Bawang putih 4 siung\n" +
                "-Bawang merah 6 butir\n" +
                "-Cabai merah besar 3 buah\n" +
                "-Kunyit 3 cm\n" +
                "-Ketumbar 1 sendok teh\n" +
                "-Lada ½ sendok teh\n" +
                "-Garam secukupnya\n" +
                "-Gula secukupnya\n\n"
        +"Cara membuat tengkleng kambing khas Solo Spesial : \n"
        +"1. Pertama – tama, rebus daging, iga serta jeroan kedalam air mendidih selama kurang lebih 1 jam, setelah 1 jam dan matang, sisihkan.\n" +
                "2. Sementara itu, tumis bumbu halus, kemudian masukan daun jeruk, daun salam, dan juga jahe. Aduk hingga mengeluarkan aroma yang wangi, masukan bumbu yang ditumis ke panci yang tadi berisi rebusan daging serta jeroan dan iga kambing yang tadi direbus.\n" +
                "3. Panaskan lagi panci, dan aduk hingga merata. Tambahkan garam, dan gula secukupnya, bila rasanya dan bumbu sudah pas, maka tutup panci tengkleng dan masak hingga matang dan bumbu meresap.\n" +
                "4. Setelah bumbu matang, maka sajikan tengkleng kambing ini menggunakan mangkuk saji, dan tambahkan bawang merah goreng sebagai bahan pelengkapnya.\n"
        ,R.drawable.tengkleng);
        resepMakananList.add(baru);

        baru = new resepMakanan("Sayur Asem","Masakan yang segar dan pedas memberi kesan berbeda dari masakan lain\n"
        ,"\nBahan bumbu Resep Sayur : \n"
        +"- 2 buah jagung manis,-dipotong-potong besar saja\n" +
                "- 2 sendok makan kacang tanah\n" +
                "- 75 gram kacang panjang,-dipotong-potong kira-kira tiga cm\n" +
                "- 1 buah labu siam,-dikupas & potong seperti dadu\n" +
                "- 2 sendok makan buah melinjo\n" +
                "- daun melinjo 15 lembar atau secukupnya\n" +
                "- 4 buah cabe ijo besar,-dipotong-potong kira-kira 2 cm\n" +
                "- 3 cm lengkuas,-dimemarkan dulu\n" +
                "- 2 lembar daun salam\n" +
                "- 4 sendok makan air asem\n" +
                "- 1,5 liter air bersih\n"
        +"\nBumbu halus tuk Resep sayur asem sunda :\n"
        +"o\t3 siung bawang putih\n" +
                "o\t6 siung bawang merah\n" +
                "o\t1 sendok teh terasi bakar\n" +
                "o\t3 cabe merah\n" +
                "o\tgaram secukupnya\n" +
                "o\tgula merah sisir, 1 sendok makan\n"
        +"\nCara membuat Sayur Asem Sunda Asli : \n"
        +"1.\tPertama-tama Rebuslah air sampai mendidih, lalu masukan sayuran sayuran seperti : jagung, kacang tanah, melinjo dan rebuslah sampai lunak / matang.\n" +
                "2.\tKemudian Tambahkan bumbu yg tlah dihaluskan diatas, lalu masukan juga daun salam & lengkuas, didihkan lagi.\n" +
                "3.\tLalu Masukkanlah sisa sayurannya : kacang panjang, labu siam, daun melinjo & cabe ijo, hmm --> sampe matang.\n" +
                "4.\tSelanjutnya Masukan gula, air asam, garam & aduk-aduk hingga rata juga. selesai nih pembuatan Sayur Asam asli sunda nya.\n"
        ,R.drawable.sayurasem);
        resepMakananList.add(baru);

        baru = new resepMakanan("Nasi Goreng BlueBand","Nasi Goreng merupakan menu makanan yang paling banyak digemari oleh rakyar, karena rasanya yang gurih dan bisa divariasi bermacam=macam,berikut salah satunya.\n"
        ,"\nBahan Utama : \n"
        +"•\tBlue Band  1 sdm\n" +
                "•\tTelur 2 butir\n" +
                "•\tDaun bawang, Potong 1 batang\n" +
                "•\tWortel, Potong dadu. Rebus sebentar 50 gr\n" +
                "•\tNasi 600 gr\n" +
                "•\tRoyco ayam 1 sdm\n" +
                "•\tBawang merah, Iris tipis 5 butir\n" +
                "•\tBawang putih, Cincang halus 3 siung\n" +
                "•\tKecap manis Bango 1/2 sdm\n" +
                "•\tGaram 1/2 sdt / secukupnya\n" +
                "•\tlada 1/4 sdt\n" +
                "•\tGula 1/2 sdt\n" +
                "\nLangkah Penyajian : \n"
        +"1.\tPanaskan Blue Band, tumis bawang putih dan bawang merah hingga harum dan matang.\n" +
                "2.\tMasukkan sosis, masak sebentar. Tambahkan telur, masak hingga matang lalu tambahkan daun bawang.\n" +
                "3.\tMasukkan nasi putih, Royco, garam, lada, gula, dan kecap Bango. Masak hingga semua bumbu tercampur rata dengan nasi. Angkat dan sajikan dengan telur mata sapi.\n"
        ,R.drawable.nasgor);
        resepMakananList.add(baru);
        adapter.notifyDataSetChanged();
    }

}
