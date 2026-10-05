package com.example.data.repository

import com.example.data.model.Hymn
import com.example.data.model.HymnLine
import com.example.data.model.HymnSection
import com.example.data.model.SectionType

object HymnDataProviderPart1 {
    fun getHymns(): List<Hymn> = listOf(
        Hymn(
            id = 3,
            number = 3,
            title = "Ja’ xa sc’ac’alil ta jcuxtic",
            crossRef = "Solo a Dios la Gloria #416",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ja’ xa sc’ac’alil ta jcuxtic.", "F"),
                        HymnLine("Ja’ yorail chca’itic sc’op Dios.", "C7 – F"),
                        HymnLine("Toj xcuxet no’ox co’ntontic.", "F"),
                        HymnLine("Xu’ ta jta jun co’ntontic.", "C7 – F"),
                        HymnLine("ja’ yorail laj yac’ ta ilel", "Bb – F"),
                        HymnLine("Ti toj ep sc’anojutic o.", "C7 – F"),
                        HymnLine("Ja’ Dios stuc la sliques comel.", "Bb – F"),
                        HymnLine("Ja’ sc’ac’alil Cajvaltic.", "C7 – F")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Jtsob jbatic ta scotol ora,", "F"),
                        HymnLine("yu’un ja’ sventa li Diose,", "C7 – F"),
                        HymnLine("Yu’un ja’ sc’ac’alil svoc’oj stuc.", "F"),
                        HymnLine("Ac’o jc’anbetic perdón.", "C7 – F"),
                        HymnLine("tsotsuc sc’oplal chca’itic o", "Bb – F"),
                        HymnLine("Li xcuxubil co’ntontique.", "C7 – F"),
                        HymnLine("jmalabetic li sc’ac’alil", "Bb – F"),
                        HymnLine("Chc’ot jcuxtic ta vinajel.", "C7 – F")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 3,
                    lines = listOf(
                        HymnLine("Cajval cu’un, chinopajcutic"),
                        HymnLine("ta atojol, yu’un vo’ot Diosot."),
                        HymnLine("Xcuxet co’nton li’ chcalcutic"),
                        HymnLine("alequil, avutsilal."),
                        HymnLine("Mu’yuc ta jcomtsancutic o"),
                        HymnLine("li c’usi laj aliquese,"),
                        HymnLine("Yu’un jech chc’ot jpascutic noxtoc"),
                        HymnLine("te yo’ bu oyot atuc.")
                    )
                )
            )
        ),
        Hymn(
            id = 8,
            number = 8,
            title = "Li jmoj tsobolutic sventa",
            crossRef = "Solo a Dios la Gloria #408",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Li jmoj tsobolutic sventa", "G - D"),
                        HymnLine("chquich’tic ta muc’ Cajvaltic,", "G – D7 – G – D7"),
                        HymnLine("vu’utic ti t’ujbilutic yu’un.", "G - C"),
                        HymnLine("Ich’biluc ta muc’ cu’untic.", "G – D7 – G – D7 - G"),
                        HymnLine("Ja’uc tsots sc’oplal ta co’ntontic", "D7 – G – D7 – G"),
                        HymnLine("tal quich’tic ta muc’ stuc.", "D7 – B7 – Em - A7 – D"),
                        HymnLine("calbetic sc’oplal, yu’un ja’", "G – G7 – C – G"),
                        HymnLine("Jcoltavanej o cu’untic.", "D7 – G - D7 - G")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Vo’ot Cajval, toj lec avo’nton,", "G - D"),
                        HymnLine("ep ts’icumal avu’un.", "G – D7 – G – D7"),
                        HymnLine("Snupin ti ich’bilot ta muc’,", "G - C"),
                        HymnLine("puro lequic avabtel.", "G – D7 – G – D7 - G"),
                        HymnLine("Ja’ yu’un ich’bilot o ta muc’,", "D7 – G – D7 – G"),
                        HymnLine("yu’un ech’em lec avo’nton.", "D7 – B7 – Em - A7 – D"),
                        HymnLine("Ep ta mil boch’o chayich’ot o", "G – G7 – C – G"),
                        HymnLine("ta muc’ sbatel osil.", "D7 – G - D7 - G")
                    )
                )
            )
        ),
        Hymn(
            id = 13,
            number = 13,
            title = "Tal quich’ ta muc’ li Diose",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Tal quich’ ta muc’ li Diose;", "D – A – Bm"),
                        HymnLine("tal quich’ ta muc’ li Diose.", "G – A"),
                        HymnLine("Tal jq’uejintabe ta q’ueoj xch’ulbi.", "D – A – Bm"),
                        HymnLine("Tal quich’ ta muc’ li Diose;", "G – A - D")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("ja’ stuc ital ta jtojol, ja’ jun c’ac’al toj jun yutsil.", "D7 – G - A - F#m - Bm"),
                        HymnLine("La sjelbun li co’ntone, laj yac’un ta jun lequil be.", "G – A - F#m - Bm"),
                        HymnLine("Ja’ yu’un xcuxet co’nton chiq’uejin ta stojol.", "G – A - F#m - Bm"),
                        HymnLine("Tal quich’ ta muc’ li Diose.", "G – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 17,
            number = 17,
            title = "Ta stenlejal ta ti’lum Belen",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ta stenlejal ta ti’lum Belén", "E – A – E"),
                        HymnLine("oy jchabichij tsq’uelic xchijic.", "A - F#m – B7"),
                        HymnLine("Ital ta stojolic j’almantal;", "E – A - E"),
                        HymnLine("li stuquic toj ep ixi’ic.", "A – B7 – E"),
                        HymnLine("Laj yal j’almantal jech chac li’i:", "Ab - C#m"),
                        HymnLine("“Mu xaxi’ic, oy c’usi ta xcal.", "F# - B7"),
                        HymnLine("Ivoc’ xa li Jcoltavaneje;", "E – A – E"),
                        HymnLine("ja’ Jesucristo Avajval.”", "A – B7 - E")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Ja’ jech chataic unin Jesús;"),
                        HymnLine("ta sna vacax pixbil ta poc’.”"),
                        HymnLine("Ivinaj ep j’almantaletic;"),
                        HymnLine("tstojbeic ta vocol Diose."),
                        HymnLine("Laj yal j’almantaletic chac li’i:"),
                        HymnLine("“Toj ech’em yutsil li Diose."),
                        HymnLine("Xcuxet no’ox yo’nton li boch’otic"),
                        HymnLine("Tsmalaic li Jcoltavanej.”")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 3,
                    lines = listOf(
                        HymnLine("Isut ta vinajel j’almantal;"),
                        HymnLine("La sc’opan sbaic jchabichij:"),
                        HymnLine("“Batic ta anil ta lum Belèn;"),
                        HymnLine("Jq’ueltic li Jcoltavanej."),
                        HymnLine("Ibatic yo’ bu oy li olol."),
                        HymnLine("María xchi’uc José la staic."),
                        HymnLine("La staic noxtoc li olol Jesús;"),
                        HymnLine("ja’ Jcoltavanej yu’unic.")
                    )
                )
            )
        ),
        Hymn(
            id = 37,
            number = 37,
            title = "Ep laj yich’ vocol Jesús",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ep laj yich’ vocol Jesús,", "E – E7 - B"),
                        HymnLine("Xnich’on Dios ta vinajel.", "F#m – E – B - E"),
                        HymnLine("Tal chamuc cu’untic ta cruz,", "E – E7 - B"),
                        HymnLine("mu’yuc yan jech chc’uxubinvan.", "E – B - F#m - E")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Ep laj yich’ q’uexlal Jesús", "E – E7 - B"),
                        HymnLine("ta scoj jmultic vu’utic.", "F#m – E – B - E"),
                        HymnLine("Laj yac’ sba ta jq’uexoltic,", "E – E7 - B"),
                        HymnLine("mu’yuc yan jech chc’uxubinvan.", "E – B - F#m - E")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 3,
                    lines = listOf(
                        HymnLine("Mu’yuc smul stuc Cajvaltic;"),
                        HymnLine("icham yu’un jmultic vu’utic,"),
                        HymnLine("yu’un la xc’uxubinutic,"),
                        HymnLine("mu’yuc yan jech chc’uxubinvan.")
                    )
                )
            )
        ),
        Hymn(
            id = 42,
            number = 42,
            title = "Vu’utic ta scoj jmultic icham Cajvaltic",
            crossRef = "Solo a Dios la Gloria #161",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Vu’utic ta scoj jmultic icham Cajvaltic,", "D – G - D"),
                        HymnLine("yu’un la stojbutic scotol jmultic.", "A7 - D"),
                        HymnLine("Ja’ ta sventa xch’ich’al ti xcuxet co’ntontic,", "G - D"),
                        HymnLine("Yu’un mu’yuc xa chbat jtojtic jtuctic.", "A7 - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Ja’ la jq’uexolintic", "D"),
                        HymnLine("Cajvaltic Cristo Jesús.", "Bm"),
                        HymnLine("Ep laj ya’ay vocol cu’untic.", "A7 – Em - A"),
                        HymnLine("Yu’un muc xac’ jtoj jmultic,", "G - D"),
                        HymnLine("jech ital stojbutic.", "G - D"),
                        HymnLine("Ja’ ta sventa ti colemutic.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 43,
            number = 43,
            title = "Cajvaltic Jesús icham ta cruz",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cajvaltic Jesús icham ta cruz,", "E – A - E"),
                        HymnLine("Yu’un jech la stojbutic jmultic.", "B7"),
                        HymnLine("Vu’utic li jpasmulilutic,", "E - A - E"),
                        HymnLine("ta xch’ich’al ich’ay jmultic.", "B - E"),
                        HymnLine("Ta xch’ichal ich’ay li jmultique,", "A"),
                        HymnLine("ta xch’ichal ich’ay li jmultic.", "E - B"),
                        HymnLine("Vu’utic li jpasmulilutic,", "E – A – E"),
                        HymnLine("ta xch’ich’al ich’ay jmultic.", "B7 - E")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Li jun j’eleq’ue icham ta cruz,", "E – A - E"),
                        HymnLine("ja’ la xch’un ti chcol yu’un Jesús.", "B7"),
                        HymnLine("Ac’o me jech to’ox chopol la jpas,", "E - A - E"),
                        HymnLine("laj xa scoltaun Jesús.", "B - E"),
                        HymnLine("Laj xa scoltaun li Jesuse,", "A"),
                        HymnLine("laj scotaun li Jesuse.", "E - B"),
                        HymnLine("Ac’o me jech to’ox chopol la jpas,", "E – A – E"),
                        HymnLine("laj xa scoltaun Jesús.", "B7 - E")
                    )
                )
            )
        ),
        Hymn(
            id = 47,
            number = 47,
            title = "Toj ech’em slequil yo’nton",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Toj ech’em slequil yo’nton li", "G – G7 – C - G"),
                        HymnLine("Cajvaltic Jesucristo.", "C – G – Em - Am"),
                        HymnLine("Vu’utic ta scoj jmultic icham.", "G – G7 – C - G"),
                        HymnLine("Laj yich’ vocol ta cruz.", "Em - Am - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Toj ep slequil yo’nton cu’untic.", "Am – Am7 – Em - G"),
                        HymnLine("La stojbutic jmultic ta cruz.", "Em – G - Am"),
                        HymnLine("Vu’utic ta jcojtic", "G – G7 - C"),
                        HymnLine("ti la smal xchi’ch’ale.", "G - Em – Am - G")
                    )
                )
            )
        ),
        Hymn(
            id = 48,
            number = 48,
            title = "Chcac’ jba ta ac’ob, Cajval Jesús",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Chcac’ jba ta ac’ob, Cajval Jesús", "C – F - C"),
                        HymnLine("vo’ot Cajvalot chac’ot.", "Em - G"),
                        HymnLine("Coltaun, Cajval, ac’o me jna’", "C – F - C"),
                        HymnLine("Ti ep lavich’ vocol.", "G – C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Ep avocol, ep layayij.", "Dm – F - C"),
                        HymnLine("La sbajic ta lavux ac’ob.", "Dm – F - C"),
                        HymnLine("Scoj jmul ti jech lavich’ vocol.", "Am – G – F - C"),
                        HymnLine("Mu me xch’ay ta co’nton.", "G – C")
                    )
                )
            )
        ),
        Hymn(
            id = 49,
            number = 49,
            title = "Toj ep laj yich’ vocol Jesús",
            crossRef = "Solo a Dios la Gloria #172",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Toj ep laj yich’ vocol Jesús", "D"),
                        HymnLine("c’alal icham ta cruz.", "G – D – A7"),
                        HymnLine("Slequil yo’nton laj yac’ sba ta", "D"),
                        HymnLine("milel ta scoj jmultic.", "G – A7 - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Te ta cruz, te ta cruz,", "D"),
                        HymnLine("te la stojbun jmul Jesús,", "A7"),
                        HymnLine("Jech mu’yuc xa sc’oplal chbat jtoj jmule", "D7"),
                        HymnLine("yu’un la jch’un ti laj xa scoltaun Cajval,", "G – D"),
                        HymnLine("jech xcuxet xa no’ox li co’ntone.", "G – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 51,
            number = 51,
            title = "Mu’yuc yan j’et’esejc’op",
            crossRef = "Solo a Dios la Gloria #156",
            originalKey = "Dm",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Mu’yuc yan j’et’esejc’op", "Dm – A – Dm - A"),
                        HymnLine("yu’un li jpasmulile.", "Dm – Am – E - A"),
                        HymnLine("Ja’ no’ox stuc li Jesuse,", "Dm – Gm – C - F"),
                        HymnLine("yu’un ja’ icham ta cruz yu’un.", "C – Dm – A - Dm")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Ja’ la smal xch’ich’al cu’untic.", "Dm – A – Dm - A"),
                        HymnLine("Bats’i tsots svocol laj yich’.", "Dm – Am – E - A"),
                        HymnLine("Ta scoj svocol, xchi’uc icham,", "Dm – Gm – C - F"),
                        HymnLine("Jech la jtatic o perdón.", "C – Dm – A - Dm")
                    )
                )
            )
        ),
        Hymn(
            id = 52,
            number = 52,
            title = "Vo’ot no’ox ch’ul Diosot",
            crossRef = "Solo a Dios la Gloria #257",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Vo’ot no’ox ch’ul Diosot o,", "Gm7 – C7"),
                        HymnLine("ich’bilucot ta muc’.", "Am7 - Dm"),
                        HymnLine("Toj jun no’ox avutsil,", "Gm - C7"),
                        HymnLine("toj labal sba chca’ay,", "Bb/F - F7"),
                        HymnLine("lacham ta cruz scoj jmul,", "Gm7"),
                        HymnLine("pero lacha’cuxi.", "Am7 - Dm"),
                        HymnLine("Vo’ot lavac’ jcuxlejal.", "Gm7 - C7"),
                        HymnLine("Po’ot xa chacha’sut tal.", "F - Bbm - F")
                    )
                )
            )
        ),
        Hymn(
            id = 53,
            number = 53,
            title = "Ich’biluc ta muc’ Cajvaltic",
            crossRef = "Solo a Dios la Gloria #91",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ich’biluc ta muc’ Cajvaltic,", "C"),
                        HymnLine("Yu’un ja’ la smal xch’ich’al ta jcoj.", "G"),
                        HymnLine("Ja’ stuc Ajvalil ti icham;", "C"),
                        HymnLine("ta svocol lijcol ta mulil.", "C – G - C"),
                        HymnLine("Nom to’ox oyun ta stojol Cajval;", "F – C"),
                        HymnLine("toj c’ux jvocol, abul jba laj yil.", "F – G"),
                        HymnLine("Ja’ yu’un la smal xch’ich’al ta jcoj,", "C"),
                        HymnLine("Jech sac licom ta sventa stuc.", "G - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Vo’ot no’ox xu’ avu’un", "C - G"),
                        HymnLine("chasacubtasun", "F - G"),
                        HymnLine("pocun lec ta ach’ich’al, Jesús,", "C - F"),
                        HymnLine("jech lec sac chicom c’u cha’al tayo.", "G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 64,
            number = 64,
            title = "Icuch xa li muc’ta pasc’op",
            crossRef = "Solo a Dios la Gloria #194",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Icuch xa li muc’ta pasc’op", "C – F – Em – G"),
                        HymnLine("Cristo icham, la spas canal.", "C – Am – C – Am – G"),
                        HymnLine("Chiq’uejin yu’un tsalbil icom,", "Em – C – F – Em – G"),
                        HymnLine("coliyal Dios.", "C – G - C")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Iloc’ xa li lajel chamel,", "C – F – Em – G"),
                        HymnLine("xocol icom xch’enal Cajval.", "C – Am – C – Am – G"),
                        HymnLine("Quich’tic ta muc’, q’uejincutic yu’un,", "Em – C – F – Em – G"),
                        HymnLine("coliyal Dios.", "C – G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 69,
            number = 69,
            title = "Toj lec chca’ay, toj xcuxet co’nton",
            crossRef = "Solo a Dios la Gloria #383",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Toj lec chca’ay, toj xcuxet co’nton,", "D – G - D"),
                        HymnLine("yu’un li’ xchi’inojun Jesús.", "A7 - D"),
                        HymnLine("Jun co’nton ta xca’ay o slequil;", "D – G - D"),
                        HymnLine("j’ech’el jun co’nton o.", "A - E7 - A")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Toj lec chca’ay;", "A7 - D"),
                        HymnLine("Jun xa co’nton o.", "G – D"),
                        HymnLine("Scotol ora lec chixchabiun.", "A7"),
                        HymnLine("Chiyac’bun quil be", "D – G"),
                        HymnLine("chixanov o batel.", "D"),
                        HymnLine("Lec ta xca’ay, jun co’nton.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 73,
            number = 73,
            title = "¿C’uxi xu’ ta xtoj o jmul?",
            crossRef = "Solo a Dios la Gloria #173",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("¿C’uxi xu’ ta xtoj o jmul?", "C – C7 - C"),
                        HymnLine("tojem xa ta xch’ich’al Cristo.", "G7 - C"),
                        HymnLine("¿Boch’o xu’ tspasbun perdón?", "C – G7 - C"),
                        HymnLine("Ja’ no’ox li Cajval Cristo.", "G7 - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Tojbil xa scotol jmul.", "C – G - C"),
                        HymnLine("Ta cruz la stoj xa Cristo.", "G7 – Am- A7 - C"),
                        HymnLine("Mu’yuc c’usi ta jtoj vu’un,", "C – G7 - C"),
                        HymnLine("vo’one la stoj xa Cristo.", "G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 78,
            number = 78,
            title = "Quich’oj xa ta muc’ li Cristoe",
            crossRef = "Solo a Dios la Gloria #323",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Quich’oj xa ta muc’ li Cristoe;", "C – F – C"),
                        HymnLine("ja’ la stojbun scotol jmul,", "G – D7 - G"),
                        HymnLine("jech mu xa jc’an c’usi chopol,", "C – F - C"),
                        HymnLine("yu’un laj xa sjelbun co’nton.", "F – C - G7 - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jesucristo, Jesucristo", "C – G – Am - G"),
                        HymnLine("J’ech’el ta xquich’ot ta muc’.", "C – G – D7 - G"),
                        HymnLine("Jesucristo, Jesucristo", "C – F - C"),
                        HymnLine("toj xcuxet co’nton avu’un.", "F – C – G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 79,
            number = 79,
            title = "Mu xa jc’an ta sja’ jmul",
            crossRef = "Solo a Dios la Gloria #345",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Mu xa jc’an ta sja’ jmul, mu xa jc’an ta jsa’ jmul.", "D – A7"),
                        HymnLine("Mu jc’an xcac’be svocol li Ch’ul Espíritu", "Em - A7 - D"),
                        HymnLine("jc’an ti lec chiyilun Cajvaltic Cristo Jesús,", "D7 - G"),
                        HymnLine("jech yu’un mu xa jc’an ta jsa’ jmul.", "D – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 80,
            number = 80,
            title = "Chcac’jba ta ac’ob, Cajval",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Chcac’jba ta ac’ob, Cajval,", "G"),
                        HymnLine("Jech avu’unun o chic’ot.", "D - G"),
                        HymnLine("Tojobtasun me atuc;", "C"),
                        HymnLine("lecubtasun o batel", "G – D - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Pocun ta ach’ich’al, Cajval Jesús.", "C - G"),
                        HymnLine("Loq’uesbun scotol li jchopolil.", "C - G"),
                        HymnLine("Li’ oy li jbec’tale, chcac’ ta ac’ob Cajval;", "C - G"),
                        HymnLine("unino sbatel osil.", "D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 81,
            number = 81,
            title = "Ta jc’an ta jch’in Jesucristo",
            crossRef = "Solo a Dios la Gloria #544",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ta jc’an ta jch’in Jesucristo", "D"),
                        HymnLine("xchi’uc ta jc’an ta xca’ibe sc’op.", "G"),
                        HymnLine("Me ta jnopilanbe sc’op,", "A"),
                        HymnLine("jech te jchi’inoj scotol c’ac’al.", "D – G – D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Ta jc’an ta jchi’in li Jesucristo.", "G"),
                        HymnLine("Xu’ chicham ta scoj me jech la sc’ane.", "A - D"),
                        HymnLine("Ta jc’an ti co’ol chicuxi jchi’uc.", "G"),
                        HymnLine("Ta jc’an jun co’nton chitun o yu’un.", "A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 83,
            number = 83,
            title = "La jnop ta jch’un o ta sjunol c’onton",
            crossRef = "Solo a Dios la Gloria #286",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("La jnop ta jch’un o ta sjunol c’onton.", "C"),
                        HymnLine("La jnop ta jch’un o li Jesucristo.", "F - C"),
                        HymnLine("La jnop ta jch’un o, mu xchibaj co’nton,", "C"),
                        HymnLine("mu xisut o ta jva’lupat.", "Am - G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 84,
            number = 84,
            title = "Nacluc o co’ntontic",
            crossRef = "Solo a Dios la Gloria #600",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Nacluc o co’ntontic, j’ech’el jch’untic o.", "C - G - C"),
                        HymnLine("Xchi’inojutic Jesús, mu xijxi’utic.", "G – D - G"),
                        HymnLine("Ja’ no’ox stuc jpasmantal, ba’yucbe cu’untic.", "C - F"),
                        HymnLine("Ja’ tstojobtasutic, chchanubtasutic.", "G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Nacluc me co’ntontic, j’ech’el jch’untic.", "C - G - C"),
                        HymnLine("Xchi’inojutic Jesús, mu xijxi’utic.", "F – G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 88,
            number = 88,
            title = "Ja’ no’ox ta stsatsal Dios",
            crossRef = "Solo a Dios la Gloria #593",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ja’ no’ox ta stsatsal Dios", "C"),
                        HymnLine("xu’ chjel li co’ntontic,", "G7"),
                        HymnLine("jech xu’ chcac’tic ta ilel", "C"),
                        HymnLine("ti ach’ cristianoutic.", "F"),
                        HymnLine("Ja’ no’ox ta jtsa’clintic"),
                        HymnLine("li Cajvaltic Jesùs,"),
                        HymnLine("yu’un jelbil xa co’ntontic yu’un.", "C – D7 – G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 89,
            number = 89,
            title = "Ach’ubtasbun co’nton, Cajval",
            crossRef = "Solo a Dios la Gloria #466",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ach’ubtasbun co’nton, Cajval,", "D – G – A – D – D7"),
                        HymnLine("mu jc’an te no’ox jtaoj cav.", "G – Em - A7"),
                        HymnLine("Ach’ubtasbun co’nton, Cajval,", "D – G – A – D – D7"),
                        HymnLine("ac’o jchanbot avo’nton.", "G – Em – A7")
                    )
                )
            )
        ),
        Hymn(
            id = 92,
            number = 92,
            title = "Jpasmulil, ich’o ach’ cuxlejal",
            crossRef = "Solo a Dios la Gloria #584",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jpasmulil, ich’o ach’ cuxlejal,", "D – G - D"),
                        HymnLine("jech xcuxet avo’nton achi’uc Dios.", "A7"),
                        HymnLine("Me chac’an ti ta xch’ay amule,", "D – G - D"),
                        HymnLine("Ich’o ach’ cuxlejal yu’un Dios.", "G - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Suteso avo’nton;", "D – A7"),
                        HymnLine("A’ibo sc’op Jcoltavanej Jesús.", "D"),
                        HymnLine("Suteso avo’nton;", "D7 - G"),
                        HymnLine("lec ta sc’anot li Jcoltavanej.", "D – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 94,
            number = 94,
            title = "Me chac’an chbat achi’in Diose",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Me chac’an chbat achi’in Diose,", "E"),
                        HymnLine("la’ ta stojol Jesús.", "B7 – E - B"),
                        HymnLine("Ch’uno ti la stoj amule,", "E – B - E"),
                        HymnLine("c’alal icham ta cruz.", "F#m – B - E")
                    )
                )
            )
        ),
        Hymn(
            id = 95,
            number = 95,
            title = "Me chac’an tsch’ay scotol yepal amul",
            crossRef = "Solo a Dios la Gloria #592",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Me chac’an tsch’ay scotol yepal amul,", "F – B - F"),
                        HymnLine("Ja’ no’ox Jesús xu’ chascoltaot.", "C7 - F"),
                        HymnLine("Me chac’an ti chacol sbatel osil,", "B – F"),
                        HymnLine("ja’ no’ox oy svu’el li Jesús.", "C7 - F")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Oy svu’el Jesús, mu’yuc boch’o yan.", "F – B - F"),
                        HymnLine("Ja’ icham ta acoj.", "C7 - F"),
                        HymnLine("Oy svu’el Jesús, xu’ yu’un chascolta.", "B – F"),
                        HymnLine("Ja’ la smal xch’ich’al ta acoj.", "C7 - F")
                    )
                )
            )
        ),
        Hymn(
            id = 97,
            number = 97,
            title = "La’ ta stojol li Cajvaltique",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("La’ ta stojol li Cajvaltique.", "E - A"),
                        HymnLine("Laj yac’ sba ta milel ta acoj.", "B - E"),
                        HymnLine("Cuxul ta ora, tsc’an chascolta.", "A"),
                        HymnLine("Tsc’an chayac’bot perdón.", "B - E")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("A’ibo sc’op li Cajvaltic Jesús.", "A - B"),
                        HymnLine("Tsc’an chayac’bot li ach’ cuxlejal.", "E - F#m - B"),
                        HymnLine("Tsc’an chachi’in o sbatel osil.", "E - A"),
                        HymnLine("Ac’o aba ta sc’ob.", "B - E")
                    )
                )
            )
        ),
        Hymn(
            id = 100,
            number = 100,
            title = "Mu me xabajic li coltael",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Mu me xabajic li coltael; ja’ lec c’anic me ta ora.", "D – Bm7 – A - D"),
                        HymnLine("Yorail to oy li coltael; ta me xlaj yorail.", "Bm – A – G – A - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("La’ic me ta stojol, mu xamalaic jal;", "D – A - D"),
                        HymnLine("tsc’an chayic’oxuc ta sbatel osil.", "F#m - A - D")
                    )
                )
            )
        )
    )
}
