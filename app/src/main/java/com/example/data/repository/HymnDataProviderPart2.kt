package com.example.data.repository

import com.example.data.model.Hymn
import com.example.data.model.HymnLine
import com.example.data.model.HymnSection
import com.example.data.model.SectionType

object HymnDataProviderPart2 {
    fun getHymns(): List<Hymn> = listOf(
        Hymn(
            id = 119,
            number = 119,
            title = "C’uxubinbilun, xcuxet no’ox co’nton",
            crossRef = "Solo a Dios la Gloria #511",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("C’uxubinbilun, xcuxet no’ox co’nton.", "D – G"),
                        HymnLine("Ochemun ta sc’ob Cajval Jesús.", "D - A"),
                        HymnLine("Toj lec yo’nton o, chac’bun bendición.", "D - G"),
                        HymnLine("C’uxun ta yo’nton Cajval Jesús.", "D – A - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Cajval Cristo,", "G"),
                        HymnLine("laloq’uesun ta sc’ob pucuj.", "D - A"),
                        HymnLine("Cajval Cristo,", "D - G"),
                        HymnLine("mu xavac’ ochcun ta yan velta.", "D – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 120,
            number = 120,
            title = "Ta jchi’in jba jchi’uc scotol c’ac’al",
            crossRef = "Solo a Dios la Gloria #346",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ta jchi’in jba jchi’uc scotol c’ac’al", "C - F"),
                        HymnLine("Cristo Jesús, Jcoltavanej.", "C – G7"),
                        HymnLine("Buyuc batcun chixchi’inun.", "C - F"),
                        HymnLine("Mu’yuc chiscomtsanun Cajval.", "C – Am - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Chixchi’inun Jesús Cajval.", "C – G7 – C – F - C"),
                        HymnLine("Chixchabiun scotol c’ac’al.", "C – Am – C – G7"),
                        HymnLine("Xcuxet co’nton ta jchi’in Cajval.", "G7 – C – G7 – C - F - C"),
                        HymnLine("Te chc’ot cotquin te ta vinajel.", "F – C – Am – C – G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 122,
            number = 122,
            title = "Cristo Jchabichij c’otem cu’untic",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cristo Jchabichij c’otem cu’untic,", "C"),
                        HymnLine("yu’un toj lec sc’anojutic.", "G - C"),
                        HymnLine("Scotol ora xchabiojutic o;", "C"),
                        HymnLine("mu’yuc chiscomtsanutic.", "G - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jesucristo sc’anojutic,", "F - C"),
                        HymnLine("yu’un manbilutic yu’un.", "G7 - C"),
                        HymnLine("Xchabiojutic scotol c’ac’al;", "F - C"),
                        HymnLine("Oyutic o ta yo’nton.", "G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 125,
            number = 125,
            title = "Vo’ot, j’ech’el achabioj o",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Vo’ot, j’ech’el achabioj o", "G – Em - Bm"),
                        HymnLine("boch’o chch’un ti chacoltae,", "C - G"),
                        HymnLine("ti nabal o yo’nton ta atojole.", "Am – D7 – G – D – D7"),
                        HymnLine("Malao ti chascolta stuc li Muc’ul Diose.", "G – A7 – D7 – G – Em- Bm – Bm7"),
                        HymnLine("Ja’ stsatsal co’ntontic;", "C – D – G"),
                        HymnLine("ja’ Jcoltavanej cu’untic stuc.", "C – B7 – Em – D7"),
                        HymnLine("Pato avo’nton o yu’un.", "G – D7 - G")
                    )
                )
            )
        ),
        Hymn(
            id = 130,
            number = 130,
            title = "Jujujet avacan",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jujujet avacan, bu chaxanov batel,", "C"),
                        HymnLine("oy jun Dios sq’uelojot.", "G - C"),
                        HymnLine("Sq’uelojot, sq’uelojot,", "D - C"),
                        HymnLine("q’uelo lec bu chaxanov batel", "G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 134,
            number = 134,
            title = "Tsc’an ta xich’ cholel ta sbejel banamil",
            crossRef = "Solo a Dios la Gloria #112",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Tsc’an ta xich’ cholel ta sbejel banamil", "C – F - C"),
                        HymnLine("ti oy Jcoltavanej cu’untique.", "G - C"),
                        HymnLine("Te ta vinajel ilic tal Cajvaltic;", "F - C"),
                        HymnLine("Tal scolta scotol cristianoetic.", "G - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Coliyalbutic li Dios cu’untic", "C – F - G - C"),
                        HymnLine("ti la stacbutic tal Xnich’one.", "Dm – G – F - G"),
                        HymnLine("Ja’ calbetic slequilal scotol c’ac’al", "C – F – C"),
                        HymnLine("ti jayib c’ac’al cuxulutic.", "G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 135,
            number = 135,
            title = "Tsotsuc o me co’ntontic",
            crossRef = "Solo a Dios la Gloria #605",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Tsotsuc o me co’ntontic,", "D - G"),
                        HymnLine("mu me jtic’tic xi’el;", "D – A7"),
                        HymnLine("yajsoldadoutic Jesús.", "D - G"),
                        HymnLine("Li’ xchi’inojutic o;", "D – A7 – D"),
                        HymnLine("ja’ chistuq’uibtasutic,", "A7 – D"),
                        HymnLine("jech tstsal cu’untic li mulil.", "G – Bm – A"),
                        HymnLine("Oy Capitán cu’untic,", "A7 – D – G"),
                        HymnLine("jech xu’ cu’untic scotol.", "D – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 139,
            number = 139,
            title = "Cristo ta sa’ ep yaj’abteltac",
            crossRef = "Solo a Dios la Gloria #620",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cristo ta sa’ ep yaj’abteltac,", "F – Bb - F"),
                        HymnLine("Boch’o tsc’an tschi’inic el,", "G7 - C"),
                        HymnLine("Boch’o chal “Cajval, chapalun vu’un;", "F – Bb - F"),
                        HymnLine("Xu’ ta xitun avu’un.”", "Bb - F")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Cajval cu’un, toj ep to avabtel;", "C7 - F"),
                        HymnLine("sc’an ep avajtunel,", "C7"),
                        HymnLine("Ac’bun me stsatsal co’ntoncutic;", "F – Bb - F"),
                        HymnLine("oy ono’ox boch’o tsc’an chtun.", "Bb - F")
                    )
                )
            )
        ),
        Hymn(
            id = 141,
            number = 141,
            title = "Jts’unbetic sts’unubal sc’op Cajvaltic",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jts’unbetic sts’unubal sc’op Cajvaltic,", "E"),
                        HymnLine("yu’un ja’ te la jtatic coltael.", "B7 - E"),
                        HymnLine("Abtejcutic c’alal yorail to,", "B - F#m - B"),
                        HymnLine("yu’un ja’ chc’ot cac’tic ta stojol Dios.", "E")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jts’unbetic sc’op Jesús;", "E"),
                        HymnLine("tsc’an tsna’ic ti chc’anvan li Diose.", "A - F#m - B"),
                        HymnLine("Tsta yorail ta jc’ajtic;", "E - A"),
                        HymnLine("chc’ot ochuc ta snail yu’un Dios.", "E – B7 - E")
                    )
                )
            )
        ),
        Hymn(
            id = 143,
            number = 143,
            title = "Yajtunelutic Cajvaltic Jesús",
            crossRef = "Solo a Dios la Gloria #504",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Yajtunelutic Cajvaltic Jesús,", "E – A - E"),
                        HymnLine("ja’ laj yic’utic ta yabtel.", "B7 - F#m – B7"),
                        HymnLine("Yu’un la sloq’uesutic ta sc’ob pucuj,", "E – A - E"),
                        HymnLine("jech tsc’an ac’o tuncutic yu’un.", "C#m – B7 - E")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Cac’tic persa, junuc me co’ntontic.", "E – B7 - E"),
                        HymnLine("Mu me xlaj li stsatsal co’ntontic.", "G#m – C#m - F#m – B7"),
                        HymnLine("Tsc’an jech co’ntontic chijtunutic yu’un.", "E – B7 - E"),
                        HymnLine("Jpastic, ja’ no’ox Dios chiscoltautic.", "G#m – C#m - B7 - E")
                    )
                )
            )
        ),
        Hymn(
            id = 150,
            number = 150,
            title = "Boch’o tsc’an tsts’aclin batel li Cristoe",
            crossRef = "Solo a Dios la Gloria #619",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("¿Boch’o tsc’an tsts’aclin batel li Cristoe,", "D – A - D"),
                        HymnLine("ti scotol yo’nton tspasbe c’usi tsc’ane,", "G – D - A"),
                        HymnLine("ti ta yutsil yo’nton tsc’an chtun yu’une,", "A – D"),
                        HymnLine("ti oy ta yo’nton tsc’an chch’unbe smantale?", "G – D – A - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("¿Boch’o jech yo’nton tsc’an?", "D"),
                        HymnLine("¿Boch’o jech tstac’be li Cajvaltique:", "A7"),
                        HymnLine("“Li’ oyun, vu’un chibat”?", "D"),
                        HymnLine("¿Boch’o tsc’an tsts’aclin li c’usi la spase?", "D - G"),
                        HymnLine("¿Boch’o xu’ jech chal: “Xu’ ta jts’aclinot”.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 154,
            number = 154,
            title = "Persa cha’yic scotolic",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Persa cha’yic scotolic }", "G"),
                        HymnLine("sc’oplal Cajvaltic Jesús }", "C - G"),
                        HymnLine("Jcoltavanej cu’untic, }", "D"),
                        HymnLine("mu’yuc yan Dios } 2", "C – G"),
                        HymnLine("Ja’ icham ta cruz cu’untic;", "G – C"),
                        HymnLine("ta xch’ich’al la stoj jmultic.", "G – D"),
                        HymnLine("Mu’yuc boch’o jech chcoltavan.", "G – C"),
                        HymnLine("Persa cha’yic scotolic.", "G – D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 155,
            number = 155,
            title = "Po’ot xa tscha’sut tal Cristo Jesús",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Po’ot xa tscha’sut tal Cristo Jesús;", "E – B"),
                        HymnLine("tscha’tal ta toc jech chac c’u cha’al ibat.", "E"),
                        HymnLine("Chtal yic’ muyel scotol li xnich’nabe,", "A"),
                        HymnLine("Cajvaltic Cristo Jesús.", "B - E")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Tscha’tal noxtoc, tscha’tal noxtoc;", "A - E"),
                        HymnLine("chtal yic’utic muyel ta vinajel.", "B - E"),
                        HymnLine("Sbatel osil, sbatel osil.", "A - E"),
                        HymnLine("Chbat jchi’intic o Cajvaltic.", "B - E")
                    )
                )
            )
        ),
        Hymn(
            id = 158,
            number = 158,
            title = "C’alal tscha’tal Jesucristo",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("C’alal tscha’tal Jesucristo,", "C"),
                        HymnLine("chtal yic’batel xnich’nab.", "F – G7 - C"),
                        HymnLine("Vu’un ta xtal yic’un batel,", "F – G7 - C"),
                        HymnLine("yu’un xnich’onun xa.", "C - F - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Te ta vinajel chbat jchi’in", "C - F - C"),
                        HymnLine("Cajvaltic Jesucristo.", "F – Am – G7 - C"),
                        HymnLine("Xcuxet no’ox co’ntontic te;", "C – F - C"),
                        HymnLine("jchi’uctic Jtotic Dios.", "F – C - G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 160,
            number = 160,
            title = "Vu’utic ti jelbil xa co’ntontique",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Vu’utic ti jelbil xa co’ntontique", "D - A"),
                        HymnLine("scotol c’ac’al tsc’an chapalutic.", "D - A"),
                        HymnLine("Yu’un po’ot xa chtal li Cajvaltique,", "D - A"),
                        HymnLine("jech xcuxet co’ntontic chbat jnuptic.", "D – A - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Po’ot xa chtal li Cajvaltic Cristo,", "G - D"),
                        HymnLine("yu’un chtal yic’an scotol li yu’untac.", "A"),
                        HymnLine("jech chbat jchi’intic o te ta vinajel;", "D - A"),
                        HymnLine("co’ol chijc’ot jech chac c’u cha’al stuc.", "D – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 170,
            number = 170,
            title = "Avu’un, Jesús, laj ca’ay ac’op",
            crossRef = "Solo a Dios la Gloria #327",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Avu’un, Jesús, laj ca’ay ac’op;", "C – G - Am"),
                        HymnLine("ta jna’ ti manbilun avu’un.", "F - C"),
                        HymnLine("Lamanun loq’uel ta sc’ob pucuje;", "C – G - Am"),
                        HymnLine("ta ach’ich’al atojbun jmul.", "F – G - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jesucristo, Jcoltavanejot;", "C – F - C"),
                        HymnLine("jq’uexolot laj atojbun jmul.", "Am - G"),
                        HymnLine("Ta ac’ob xa oyun, vu’un anich’onun;", "C - F"),
                        HymnLine("avu’unun sbatel osil.", "Am – F – G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 171,
            number = 171,
            title = "C’alal ta jq’uel c’usi chal Dios",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("C’alal ta jq’uel c’usi chal Dios ta svun,", "G"),
                        HymnLine("toj jun yutsil li c’usi chiyalbun.", "D - G"),
                        HymnLine("Te chalbe sc’oplal boch’o la smanun;", "G"),
                        HymnLine("te chal ti muc t’ujbiluc boch’o tsc’an.", "D - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Xcuxet co’nton chiq’uejin yu’un,", "G - C"),
                        HymnLine("li Jcoltavanej cu’une.", "D - G"),
                        HymnLine("Icham ta jcoj, la smanun loq’uel", "C"),
                        HymnLine("ta sc’ob li pucuje.", "D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 175,
            number = 175,
            title = "Ep ta velta ta xca’ibetic",
            crossRef = "Solo a Dios la Gloria #13",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ep ta velta ta xca’ibetic", "F – C7"),
                        HymnLine("sc’op Cajvaltic Jesucristo.", "F"),
                        HymnLine("Lec ta xtun ti ta xca’ibetic", "C7"),
                        HymnLine("sc’op Cajvaltic Jesucristo.", "F"),
                        HymnLine("Ja’ tstsatsub o co’ntontic,", "Bb – F"),
                        HymnLine("me chca’itic scotol c’ac’al.", "Bb - F")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Toj jun yutsil sc’op Cajvaltic;", "C7 - F"),
                        HymnLine("ja’ melel c’usi chijyalbutic.", "C7 - F"),
                        HymnLine("Toj jun yutsil sc’op Cajvaltic;", "C7 - F"),
                        HymnLine("chijcuxiutic o ta sventa.", "C7 - F")
                    )
                )
            )
        ),
        Hymn(
            id = 178,
            number = 178,
            title = "Taquin co’nton yu’un li ac’ope",
            crossRef = "Solo a Dios la Gloria #16",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Taquin co’nton yu’un li ac’ope,", "E"),
                        HymnLine("solel oy ta co’nton.", "A - E"),
                        HymnLine("Avocoluc c’uxubinun, Jcoltavanej cu’un.", "B7 – E – B - F# - B"),
                        HymnLine("ac’bun quil li luz avu’une,", "E – B"),
                        HymnLine("ac’o cotquin lec li ac’ope.", "E")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Lec jc’anoj li amantale, li c’usi avaloj,", "E – A - E"),
                        HymnLine("toj lequic, ja’ no’ox stuc jech o.", "B7 - E"),
                        HymnLine("Li ac’ope más to lec jech chac c’u cha’al", "B - E"),
                        HymnLine("c’anal taq’uin.", "B7 - E")
                    )
                )
            )
        ),
        Hymn(
            id = 179,
            number = 179,
            title = "Ch’ul Biblia c’otemot cu’un",
            crossRef = "Solo a Dios la Gloria #9",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ch’ul Biblia c’otemot cu’un,", "D – G - D"),
                        HymnLine("vo’ot bats’i tsots ac’oplal.", "G - D"),
                        HymnLine("Yu’un melel c’usi chaval.", "G - A"),
                        HymnLine("Ja’ li c’usitic tsc’an Dios.", "D - G - A"),
                        HymnLine("Vo’ot chaval c’u xi’elan,", "D – G – D"),
                        HymnLine("bu lital, xchi’uc bu chibat.", "G – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 181,
            number = 181,
            title = "Ch’ul Dios, Ch’ul Dios, Ch’ul Dios",
            crossRef = "Solo a Dios la Gloria #43",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ch’ul Dios, Ch’ul Dios, Ch’ul Dios,", "D – Bm – A – D"),
                        HymnLine("atuc no’ox oy avu’el,", "G – D"),
                        HymnLine("ja’ yu’un chloc’ ta que alequil, avutsilal.", "A – D – Bm - D – E7 – A – A7"),
                        HymnLine("Ch’ul Dios, Ch’ul Dios, Ch’ul Dios,", "D – Bm – A – D"),
                        HymnLine("ta jnijan jba ta atojol.", "G – D"),
                        HymnLine("Vo’ot ti oxib c’u x’elan chavac’aba ta ilel.", "Bm - D7 – G – D7 - G – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 182,
            number = 182,
            title = "Dios cu’un, Cajval",
            crossRef = "Solo a Dios la Gloria #74",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Dios cu’un, Cajval, c’alal ta jq’uel avabtel,", "E – E7 - A"),
                        HymnLine("vo’ot lapas scotol c’usitic oy.", "E – B - E"),
                        HymnLine("Ta xca’ay o, ta melel oy atsatsal.", "E7 - A"),
                        HymnLine("Laj apas c’ac’al, xchi’uc u, xchi’uc c’anale.", "E – B - E")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Xcuxet co’nton chiq’uejin avu’un; }", "A - E"),
                        HymnLine("Toj muc’ot Dios, toj muc’ot Dios. } 2", "G#m – B7 - E")
                    )
                )
            )
        ),
        Hymn(
            id = 183,
            number = 183,
            title = "Colavalbun Jesucristo",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Colavalbun, Jesucristo,", "C – G"),
                        HymnLine("ep chavac’bun bendición.", "F – G – C"),
                        HymnLine("Scotol ora vo’ot chacoltaun;", "C – G"),
                        HymnLine("xcuxet no’ox co’nton avu’un.", "F – G – C"),
                        HymnLine("Jech jun co’nton chiq’uejin avu’un;", "F – Am – Em"),
                        HymnLine("ta jc’an lec chbat ac’oplal cu’un.", "F – G – C"),
                        HymnLine("Jc’an ta xcalbe scotol jchi’il", "C – G"),
                        HymnLine("vo’ot atuc chacoltavan.", "F – G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 185,
            number = 185,
            title = "Oy baq’uintic mu jna’",
            crossRef = "Solo a Dios la Gloria #394",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Oy baq’uintic mu jna’ c’u x’elan xu’ chacalbot,", "D - Bm"),
                        HymnLine("ti c’u x’elan avo’nton chca’ye, Jcoltavanej cu’un.", "Em - A7 - D"),
                        HymnLine("Oy baq’uintic mu jna’ c’u x’elan xu’ chacalbot,", "D - Bm"),
                        HymnLine("ti c’u x’elan avo’nton chca’ye, Jcoltavanej cu’un.", "Em - A7 - D - D7")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Ta jtoj ta vocol scotol c’usi apasoj,", "G - A7 - F#m - Bm"),
                        HymnLine("scotol c’usitic chapas, c’usi ta to xapas.", "Em - A7 - D"),
                        HymnLine("Cajval, ta jtoj ta vocol scotol c’usi apasoj.", "G - A7 - F#m - Bm"),
                        HymnLine("Scotol c’usitic chapas, c’usi ta to xapas.", "Em - A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 188,
            number = 188,
            title = "Colaval, Cajval, yu’un c’usi laj apas",
            crossRef = "Solo a Dios la Gloria #23",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Colaval, Cajval, yu’un c’usi laj apas.", "F"),
                        HymnLine("Laj avalbun ca’ay c’u x’elan amantal.", "F – Bb – F - C7")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Colavalbun, Cajval Cristo.", "F – Bb – F"),
                        HymnLine("Colaval, Jesús.", "Bb – F – C7"),
                        HymnLine("Colavalbun yu’un jmoton.", "Bb - F"),
                        HymnLine("Muc c’usi ta jtoj.", "Bb – F – C7 - F")
                    )
                )
            )
        ),
        Hymn(
            id = 190,
            number = 190,
            title = "Oy jun no’ox Cajval, ja’ li Cristo",
            crossRef = "Solo a Dios la Gloria #303",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Oy jun no’ox Cajval, ja’ li Cristo;", "G"),
                        HymnLine("lec xcuxet co’nton ta stojol.", "D"),
                        HymnLine("Chiq’uejin yu’un Cajvaltic Cristo,", "C"),
                        HymnLine("yu’un toj lec chixc’uxubinun.", "D – G"),
                        HymnLine("La scomtsan smuc’ul ta vinajel;", "G7 – C"),
                        HymnLine("Ta banamil tal scoltautic.", "G"),
                        HymnLine("Lec xcuxet co’nton,", "D - G"),
                        HymnLine("licol xa yu’un Cajval.", "G")
                    )
                )
            )
        ),
        Hymn(
            id = 192,
            number = 192,
            title = "Ich’bilucot ta muc’, Cajval",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ich’bilucot ta muc’, Cajval,", "E"),
                        HymnLine("ta sventa toj lec avo’nton,", "A - B - E"),
                        HymnLine("ta sventa xc’uxul avo’nton", "E"),
                        HymnLine("Jcoltavanej cu’un.", "A - B - E")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Toj ep la ac’anun, Cajval,", "E"),
                        HymnLine("vo’ot lacham ta cruz yu’un jmul", "A – B – E"),
                        HymnLine("lavic’un ta xc’uxul avo’n", "E"),
                        HymnLine("Jcoltavanej cu’un.", "A – B - E")
                    )
                )
            )
        ),
        Hymn(
            id = 195,
            number = 195,
            title = "Chaquich’ ta muc’ c’alal li’ to cuxulune",
            crossRef = "Solo a Dios la Gloria #8",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Chaquich’ ta muc’ c’alal li’ to cuxulune.", "D – A – Bm - F#m – Em7 – C – A7"),
                        HymnLine("Chaquich’ ta muc’ buyuc oyun, Cajval.", "D – A – Bm - F#m – Em7 – A - D"),
                        HymnLine("Chaquich’ ta muc’ ta q’ueojetic, ta q’ueojetic;", "D – A – Bm - F#m – Em7 – C – A7"),
                        HymnLine("Chaquich’ ta muc’ ta q’ueojetic, Cajval.", "D – A – Bm - F#m – Em7 – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 196,
            number = 196,
            title = "Ta jq’uejinta li Cristo",
            crossRef = "Solo a Dios la Gloria #241",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ta jq’uejinta li Cristo", "E – B7 - E"),
                        HymnLine("yu’un ja’ la scoltautic.", "B7"),
                        HymnLine("Ja’ chiscoltaun ta jvocol", "E – A"),
                        HymnLine("yu’un toj c’uxun ta yo’nton.", "E - B7 - E")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Xcuxet co’nton chiq’uejin", "A - E"),
                        HymnLine("yu’un toj lec c’usi la spasbun", "B7 - A - E"),
                        HymnLine("oy ta co’nton chbat jchi’in", "A - E"),
                        HymnLine("te ta slequilal li Jesús.", "B7 - E")
                    )
                )
            )
        ),
        Hymn(
            id = 197,
            number = 197,
            title = "Ac’o yich’ic ta muc’ Cristo",
            crossRef = "Solo a Dios la Gloria #705",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ac’o yich’ic ta muc’ Cristo,", "F – C7 - F"),
                        HymnLine("c’u smuc’ul yox ta toyol.", "C"),
                        HymnLine("C’alal, u, xchi’uc c’analetic,", "F – C7 – F"),
                        HymnLine("xchi’uc li xojobalique.", "C – G7 – C"),
                        HymnLine("Scotol jaychop j’almantal oy.", "C7 – Dm – C"),
                        HymnLine("Albeic smuc’ul slequilal.", "F – C7"),
                        HymnLine("Scotol ora albeic slequilal li Cajvaltic Jesuse.", "F – F7 – Bb – F – C7 - F")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jcotoltic tsc’an chquich’tic ta muc’,", "F"),
                        HymnLine("yu’un toj ech’em smuc’ul stuc.", "Bb – C7 - C"),
                        HymnLine("Yu’un toj ech’em slequil yutsil,", "F"),
                        HymnLine("yu’un toj ech’em slequil yutsil,", "F"),
                        HymnLine("yu’un toj ech’em smuc’ul o stuc,", "F – Bb – F"),
                        HymnLine("xjelov to ta vinajel.", "C7 - F")
                    )
                )
            )
        ),
        Hymn(
            id = 198,
            number = 198,
            title = "Q’uejintao li Cajvaltic",
            crossRef = "Solo a Dios la Gloria #185",
            originalKey = "Bm",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Q’uejintao li Cajvaltic,", "Bm - F#m – Bm"),
                        HymnLine("q’uejintao li Cajvaltic.", "Bm - F#m – Bm"),
                        HymnLine("Q’uejintabo slequilal,", "G – D"),
                        HymnLine("q’uejintabo slequilal.", "G – D"),
                        HymnLine("Q’uejintao li Cajvaltic.", "Bm - F#m - Bm")
                    )
                )
            )
        ),
        Hymn(
            id = 211,
            number = 211,
            title = "Ch’ul Dios, Ch’ul Dios, toj Muc’ot o Dios",
            crossRef = "Solo a Dios la Gloria #39",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ch’ul Dios, Ch’ul Dios, toj Muc’ot o Dios.", "G – C – G"),
                        HymnLine("Xcuxet no’ox co’nton chaquich’ot ta muc’.", "D – G"),
                        HymnLine("Ajvalil, vo’ot jpasmantalot,", "C – G"),
                        HymnLine("vo’ot apasoj canal ta scotol.", "D – G"),
                        HymnLine("Ja’ yu’un atuc no’ox chaquich’ ta muc,", "D – G - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Vo’ot no’ox atuc Ch’ul Diosot, Cajval", "G – C - G"),
                        HymnLine("vo’ot apasoj canal, jun yutsil.", "Em – G – D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 214,
            number = 214,
            title = "Ta jna’ Jesús scotol c’ac’al",
            crossRef = "Solo a Dios la Gloria #510",
            originalKey = "A",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ta jna’ Jesús scotol c’ac’al;", "A - D"),
                        HymnLine("Ta jquejan jba ta stojol Cajval.", "A - D - E7"),
                        HymnLine("Ta xcac’be sventainun Cajval;", "A - E7 - A"),
                        HymnLine("ta xcac’be xchabibun co’nton.", "A - D - A"),
                        HymnLine("Ac’o me oy jvocol li’i,", "A - D"),
                        HymnLine("Jesús chtal sva’an sba ta jts’el,", "D - A - E"),
                        HymnLine("yu’un c’uxun ta yo’ntone.", "A - D - A"),
                        HymnLine("Chiscoltaun yu’un xnich’onun.", "E7 - A")
                    )
                )
            )
        ),
        Hymn(
            id = 215,
            number = 215,
            title = "Jc’opantic li Jesucristo",
            crossRef = "Solo a Dios la Gloria #520",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jc’opantic li Jesucristo;", "C - F"),
                        HymnLine("Ja’ ta scoltautic vu’utic.", "C – G"),
                        HymnLine("Ep la sc’anutic Cajvaltic;", "C – F"),
                        HymnLine("Ja’ tal stojbutic jmultic.", "C – G – C"),
                        HymnLine("Me oy vocol ta banamil,", "G – C"),
                        HymnLine("mu xu’ cu’un jtuctic no’ox.", "F – C - G"),
                        HymnLine("Scotol xu’ yu’un Jesucristo;", "C – F"),
                        HymnLine("ja’ xu’ yu’un ta scoltautic.", "C – G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 216,
            number = 216,
            title = "C’opano li Jesucristo",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("C’opano li Jesucristo;", "G - C"),
                        HymnLine("ja’ ta sc’an chascoltaot.", "D - G"),
                        HymnLine("Tsc’an tsch’aybot amul ta ora;", "G - C"),
                        HymnLine("vo’ot chavich’ ach’ cuxlejal.", "D - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("C’opano, c’opano,", "C - G"),
                        HymnLine("cha’ay ac’op li Cajvaltic.", "D - G"),
                        HymnLine("Chq’uelvan tal li Jesucristo.", "C - G"),
                        HymnLine("Ora no’ox cha’ay jc’optic.", "D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 224,
            number = 224,
            title = "Manbilun xa ta xch’ich’al Jesús",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Manbilun xa ta xch’ich’al Jesús,", "D"),
                        HymnLine("jech xu’ chibat ta vinajel.", "A7 – D"),
                        HymnLine("La smanun loq’uel ta sc’ob pucuj;", "D"),
                        HymnLine("colemun yu’un Cajvaltic.", "A7 - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Toyol jtojol,", "G – D"),
                        HymnLine("Licol xa ta sc’ob pucuje.", "A7 – D"),
                        HymnLine("La smanun Cajvaltic,", "G – D"),
                        HymnLine("jech xnich’onun xa Cajvaltic.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 225,
            number = 225,
            title = "Toyol jtojol la smanun Dios",
            crossRef = "Solo a Dios la Gloria #302",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Toyol jtojol la smanun Dios.", "C"),
                        HymnLine("Yutsil yo’nton la scoltaun.", "G - C"),
                        HymnLine("Mu’yuc sjalan li Xnich’one.", "C"),
                        HymnLine("La stac talel ta banamil.", "G - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Xcuxet no’ox co’nton yu’un;", "C - G - F - C"),
                        HymnLine("la stojbun jmul ta xch’ich’ale.", "G - C"),
                        HymnLine("Ch’aybil xa scotol jmul yu’un;", "C - F - C"),
                        HymnLine("icham xa te ta cruz cu’un.", "F - C")
                    )
                )
            )
        ),
        Hymn(
            id = 226,
            number = 226,
            title = "Jesucristo ja’ Yajval stuc",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jesucristo ja’ Yajval stuc;", "G – D"),
                        HymnLine("ja’ Yajval, ja’ Yajval.", "G"),
                        HymnLine("Jesucristo ja’ Yajval stuc;", "G – D"),
                        HymnLine("ich’biluc ta muc’.", "G"),
                        HymnLine("Li jcuxlejal ja’ yu’un Cajval;", "Am – C"),
                        HymnLine("ja’ yu’un scotol boch’o xch’unoj.", "G"),
                        HymnLine("Ja’ yu’un sbejel li banamil;", "C"),
                        HymnLine("ich’biluc ta muc’.", "G – D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 228,
            number = 228,
            title = "Ja’ stuc Dios spas mantal",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ja’ stuc Dios spas mantal", "G - D"),
                        HymnLine("li’ ta sbejel banamil.", "C - G"),
                        HymnLine("Ja’ smantal ta xtal vo’e;", "G - D"),
                        HymnLine("ja’ smantal ta xq’uep noxtoc.", "C - G"),
                        HymnLine("Jech ta xch’i, ta satinic", "Em - Bm"),
                        HymnLine("Scotol c’usi jts’unojtic.", "C - G"),
                        HymnLine("Jmac’linvanej cu’untic.", "D - G"),
                        HymnLine("Coliyalbutic Jtotic.", "D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 231,
            number = 231,
            title = "Ba’yuc ac’o abaic ta ventainel",
            crossRef = "Solo a Dios la Gloria #54",
            originalKey = "Em",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ba’yuc ac’o abaic ta ventainel yu’un Dios,", "Em"),
                        HymnLine("pasic c’usi tsc’an, pasic c’usi tsc’an.", "B7"),
                        HymnLine("Ba’yuc ac’o abaic ta ventainel yu’un Dios,", "Em"),
                        HymnLine("jech chayac’boxuc scotol c’usi ta xtun avu’unic.", "Am – Em – B7 - Em")
                    )
                )
            )
        ),
        Hymn(
            id = 232,
            number = 232,
            title = "Ba’yuc ac’o abaic ta ventainel yu’un Dios",
            crossRef = "Solo a Dios la Gloria #517",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ba’yuc ac’o abaic ta ventainel yu’un Dios", "C – G – Am - Em"),
                        HymnLine("Pasic c’usi tsc’an yo’nton stuc,", "F – C - G"),
                        HymnLine("jech chayac’bot c’usi chtun avu’unic.", "C – G – Am – Em"),
                        HymnLine("Ich’biluc ta muc’ stuc Dios.", "F – C – G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 234,
            number = 234,
            title = "Ac’bo smoton Avajval",
            crossRef = "Solo a Dios la Gloria #446",
            originalKey = "Dm",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ac’bo smoton Avajval", "Dm"),
                        HymnLine("ta scotoluc avo’nton.", "A7"),
                        HymnLine("C’alal chasc’anbot li Diose,", "Dm"),
                        HymnLine("ac’bo, yu’un ac’anoj", "D7 – Gm"),
                        HymnLine("Mu me xloilaj avo’nton", "Dm"),
                        HymnLine("c’alal me laj avaq’ue.", "A7 - Dm"),
                        HymnLine("Dios chac’be bendición, tsbolesbe", "Gm - Dm"),
                        HymnLine("li boch’o xcuxet yo’nton chac’.", "A7 - Dm")
                    )
                )
            )
        )
    )
}
