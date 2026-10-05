package com.example.data.repository

import com.example.data.model.Hymn
import com.example.data.model.HymnLine
import com.example.data.model.HymnSection
import com.example.data.model.SectionType

object HymnDataProviderPart3 {
    fun getHymns(): List<Hymn> = listOf(
        Hymn(
            id = 244,
            number = 244,
            title = "Cajval Jesús, vo’ot no’ox atuc",
            crossRef = "Solo a Dios la Gloria #3",
            originalKey = "A",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cajval Jesús, vo’ot no’ox atuc", "A – D"),
                        HymnLine("ich’bilot o ta muc’.", "A – Esus - E"),
                        HymnLine("Q’uejintabil o, avu’el atsatsal,", "A – D – Bm7"),
                        HymnLine("alequil, avutsilal,", "A – E7 – A"),
                        HymnLine("yu’un vo’ot lapas scotol", "A – E7"),
                        HymnLine("li c’usitic oye.", "A"),
                        HymnLine("Jech la sc’an avo’nton atuc.", "E7 – A"),
                        HymnLine("Laj apas sventa avich’el ta muc’.", "A7 – D – Dm"),
                        HymnLine("Ich’bilucot ta muc’.", "A – E7 - A")
                    )
                )
            )
        ),
        Hymn(
            id = 246,
            number = 246,
            title = "Sbejel li banamil ja’ yu’un Dios",
            crossRef = "Solo a Dios la Gloria #67",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Sbejel li banamil ja’ yu’un Dios, ja’ la spas stuc.", "D – A7- D – G – D- A"),
                        HymnLine("Scotol li c’usi pasbile chich’ ta muc’ li Diose.", "D – A7 – D – A7 – D"),
                        HymnLine("Ja yu’un Dios scotol,", "A7 – D – G – A7 – D"),
                        HymnLine("xcuxet co’ntontic yu’un.", "G – D"),
                        HymnLine("Ja’ la spas c’usi oy ta toyol,", "A7 – D – A7 – D"),
                        HymnLine("banamil xchi’uc nabetic.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 248,
            number = 248,
            title = "Ja’ Jcoltavajej cu’untic",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ja’ Jcoltavajej cu’untic,", "D – A – D"),
                        HymnLine("Cajvaltic Jesucristo.", "A – D"),
                        HymnLine("Chijyac’butic ach’ cuxlejal;", "A – D"),
                        HymnLine("chijcuxiutic ta sventa.", "A - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Lec oyutic, chisq’uelutic;", "D – G – D"),
                        HymnLine("mu’yuc xi’el ta co’ntontic.", "G – D"),
                        HymnLine("Ja’ stuc chiscoltautic tana,", "A – D"),
                        HymnLine("Cajvaltic Jesucristo.", "A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 251,
            number = 251,
            title = "Jcoltavanejot, Cajval",
            crossRef = "Solo a Dios la Gloria #364",
            originalKey = "E",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jcoltavanejot, Cajval,", "E – B"),
                        HymnLine("cuxulot sbatel osil.", "E – A – B – E"),
                        HymnLine("Oy ti c’usi mu xu’ cu’un;", "E – B"),
                        HymnLine("vo’ot no’ox chacoltaun.", "E – B7 – E"),
                        HymnLine("Chabiun scotol c’ac’al;", "E – A- E"),
                        HymnLine("coltaun jech lec ta jpas.", "A – E"),
                        HymnLine("Jcoltavanejot, Cajval,", "E – B"),
                        HymnLine("vo’ot no’ox chaquich’ ta muc’.", "E – A – B7 - E")
                    )
                )
            )
        ),
        Hymn(
            id = 253,
            number = 253,
            title = "Me chquich’tic vocol",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Me chquich’tic vocol, chcalbetic Cristo.", "C – G- C"),
                        HymnLine("Mu xcuch cu’untic me jtuctic no’ox.", "G – Am- G"),
                        HymnLine("Ja’ chcoltavan li Cajvaltic Cristo.", "C – G – C"),
                        HymnLine("Mu’yuc bu yan xu’ chijcolutic.", "Am – G – Am- C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Chcalbetic Cristo, chcalbetic Cristo;", "C – F – C"),
                        HymnLine("mu xu’ cu’untic me ep chquich’tic vocol.", "G – Em- G"),
                        HymnLine("Chixchabiutic xa ta scotol ora.", "C – G – C"),
                        HymnLine("Ep c’uxutic ta yo’nton Cajval.", "Am – G – Am- C")
                    )
                )
            )
        ),
        Hymn(
            id = 255,
            number = 255,
            title = "Scotol c’ac’al li oy ta jtojol Cristo",
            crossRef = "Solo a Dios la Gloria #317",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Scotol c’ac’al li oy ta jtojol Cristo", "D – G"),
                        HymnLine("tspabun co’nton c’alal oy jvocol.", "A7 – D"),
                        HymnLine("Yu’un jch’unoj ti ech’em svu’el stsatsal", "G"),
                        HymnLine("mu xlo’ijal co’nton, xchi’uc mu xixi’i.", "A7 – D"),
                        HymnLine("Ech’em to tspasbun ta jun co’nton o.", "G"),
                        HymnLine("Mu jtatic ta nopel c’usi tspas,", "A7 – D"),
                        HymnLine("yu’un mu’yuc spajebal sc’anojutic.", "G"),
                        HymnLine("Ja’ ono’ox chac’butic c’usi lec.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 256,
            number = 256,
            title = "Li Muc’ul Dios ja’ luz cu’un",
            crossRef = "Solo a Dios la Gloria #667",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Li Muc’ul Dios ja’ luz cu’un;", "D – G – D – G - D"),
                        HymnLine("mu’yuc c’usi ta jxi’be o.", "A – D – G – A"),
                        HymnLine("¿C’u yu’un ep chlo’ilaj co’nton", "A – A7 – Bm- E7 - A"),
                        HymnLine("me ja’ yip co’nton li Diose?", "Em- A7 – Bm – D – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 263,
            number = 263,
            title = "C’alal lubenot, lajem atsatsal",
            crossRef = "Solo a Dios la Gloria #515",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("C’alal lubenot, lajem atsatsal,", "C – F – C"),
                        HymnLine("albo Cajvaltic, albo Cajvaltic.", "G7 – C"),
                        HymnLine("Me chch’ay avo’nton ta scoj avocol,", "C – F – C"),
                        HymnLine("albo Cristo, ja’ Yajval.", "G7 – C"),
                        HymnLine("Albo Cajvaltic, albo Cajvaltic.", "G7 – C"),
                        HymnLine("Ja’ achi’il, tuc’ yo’nton.", "F – G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Mu’yuc yan achi’il c’u cha’al Cristo.", "C – F- C"),
                        HymnLine("Ja’ no’ox albo o stuc.", "G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 269,
            number = 269,
            title = "Me ta jchi’in Jesús",
            crossRef = "Solo a Dios la Gloria #358",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Me ta jchi’in Jesús, chac’bun quil bu lec be.", "F - C7 - F – C7- F"),
                        HymnLine("Te ta svun Dios chca’ay c’usi tsc’an.", "Bb – F – C7"),
                        HymnLine("Ja’ ta sc’an ta jch’unbe scotol smantaltaque.", "F – C7 – F – C7 – F"),
                        HymnLine("Ja’ ta xac’ jtsatsal, jech xu’ ta jpas.", "Bb – C7 - F")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jch’unbetic me", "C7 – F"),
                        HymnLine("c’usi tsc’an Cajvaltic,", "D7 – Gm"),
                        HymnLine("yu’un laj xa scoltautic.", "C7 – F"),
                        HymnLine("Jch’unbetic me smantal.", "C7 - F")
                    )
                )
            )
        ),
        Hymn(
            id = 270,
            number = 270,
            title = "Cajvalinoj li Cajvaltique",
            crossRef = "Solo a Dios la Gloria #363",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cajvalinoj li Cajvaltique;", "C – F – C"),
                        HymnLine("xcuxet co’nton li’ xchi’inojun.", "G – D7 – G"),
                        HymnLine("Oyun ta sc’ob li Cajval Jesús,", "C – F – C"),
                        HymnLine("yu’un laj xa sjelbun li co’ntone.", "F – G7 - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jun no’ox co’nton ta stojol Jesús;", "C – F- C"),
                        HymnLine("xcuxet co’nton ta xitun yu’un.", "F – C – D7 – G"),
                        HymnLine("Yu’un tojbil xa jmul yu’un Cajvaltic,", "G7 – C – F – C"),
                        HymnLine("jech xcuxet co’nton chquich’ o ta muc’.", "F – G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 274,
            number = 274,
            title = "Tsc’an chich’ cholbel sc’oplal",
            crossRef = "Solo a Dios la Gloria #274",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Tsc’an chich’ cholbel sc’oplal;", "C"),
                        HymnLine("tsc’an cha’yic scotolic,", "F"),
                        HymnLine("boch’otic oy svocol, boch’otic abul sba,", "C - Am – D7 – G"),
                        HymnLine("ti laj xa stac talel Jpat-o’ntonal cu’untic", "C – C7 – F"),
                        HymnLine("li Dios ta vinajel", "C – G7 - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Ital ta banamil li Jpat-o’ntonale", "C7 - F"),
                        HymnLine("ti yaloj ono’ox Dios ti tstacbutic tale.", "C – Am- D7 – G"),
                        HymnLine("Ja’ svinajeb ti ep c’anbilutic yu’un.", "C – C7 – F"),
                        HymnLine("Jech tsc’an pucbel sc’oplal.", "C – G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 275,
            number = 275,
            title = "Espíritu yu’un Dios, ventainbun jcuxlej",
            crossRef = "Solo a Dios la Gloria #263",
            originalKey = "Em",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Espíritu yu’un Dios, ventainbun jcuxlej. }", "Em – D"),
                        HymnLine("Ventainbun co’nton xchi’uc jbec’tal } 2", "C – B7"),
                        HymnLine("Ventainun, ventainun.", "Em"),
                        HymnLine("Li’me oyan o ta jtojol, ventainun.", "D"),
                        HymnLine("Ventainun ta atsatsal xchi’uc ta sventa", "C"),
                        HymnLine("C’anel avu’un.", "B7")
                    )
                )
            )
        ),
        Hymn(
            id = 279,
            number = 279,
            title = "Yo’ bu oyot, Cristo Jesús",
            crossRef = "Solo a Dios la Gloria #655",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Yo’ bu oyot, Cristo Jesús,", "D – G"),
                        HymnLine("mu’yuc vi’nal, mu’yuc chamel.", "D – A7"),
                        HymnLine("xcuxet yo’nton scotolic te;", "D – G"),
                        HymnLine("mu jechuc li’ ta banamil.", "D – A7 - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Ta vinajel mu’yuc vocol.", "D – A7"),
                        HymnLine("Mu’yuc ta x’och c’usi chopol.", "D"),
                        HymnLine("Yo’ bu Jesús toj lec scotol.", "A7 - G"),
                        HymnLine("Jun co’ntontic sbatel osil.", "D – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 283,
            number = 283,
            title = "C’alal chca’itic li oq’ues te ta sc’ac’alil ch-oq’ue",
            crossRef = "Solo a Dios la Gloria #639",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("C’alal chca’itic li oq’ues te ta sc’ac’alil ch-oq’ue,", "G – C – G"),
                        HymnLine("ta xvinaj ti chyal xa tal li Cajvaltic.", "D"),
                        HymnLine("Chtal yic’ muyel scotol boch’otic ti xch’unojic xae;", "G – C – G"),
                        HymnLine("te ta snup sbaic ta toc ta vinajel", "D - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Chbat jchi’intic Cajvaltic Cristo;", "D"),
                        HymnLine("jmoj tsobol chijc’ot ta stojol.", "G – C"),
                        HymnLine("Chbat jchi’intic Cajvaltic Cristo;", "G"),
                        HymnLine("j’ech’el te ta jchi’intic o ta naclej.", "G – D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 292,
            number = 292,
            title = "Cristo ep chisc’anutic",
            crossRef = "Solo a Dios la Gloria #569",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cristo ep chisc’anutic;", "C – G7 – C"),
                        HymnLine("tsi’babil ta sc’op ta jq’uel.", "F – C"),
                        HymnLine("Vo’one xa ta cruz icham;", "G7 – C"),
                        HymnLine("sbelal vinajel la sjam.", "F – C - G7 - C")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Cristo chisc’anun,", "C – F"),
                        HymnLine("Cristo chisc’anun,", "C – G7"),
                        HymnLine("Cristo chisc’anun,", "C - F"),
                        HymnLine("jech comen ta svunal.", "C - G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 294,
            number = 294,
            title = "Ep la sc’anutic li Xnich’on Diose",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ep la sc’anutic li Xnich’on Diose;", "C"),
                        HymnLine("Laj yac’ sba ta milel cu’untic.", "G7 – C"),
                        HymnLine("Yu’un la jch’untic ti ja’ la stoj jmultic,", "G"),
                        HymnLine("lec xa chijyilutic Jtotic Dios.", "G – D7 - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Jpucbetic sc’op Jesús;", "C – F – C"),
                        HymnLine("jc’uxubintic scotol cristianoetic.", "G7"),
                        HymnLine("Oy stsatsal li sc’ope,", "C – F – C"),
                        HymnLine("jech chcolic scotol boch’o tsch’unic.", "G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 295,
            number = 295,
            title = "Cuxul Dios cu’un",
            crossRef = "Solo a Dios la Gloria #50",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cuxul Dios cu’un, li xc’uxul avo’ntone,", "D – G – A7 – D"),
                        HymnLine("me jutuc mu’yuc chib sc’oplal chca’ay.", "G – D – E7 – A"),
                        HymnLine("Li slequil yutsil avo’nton ta jtojole,", "A7 – D – G"),
                        HymnLine("staoj yav te oy o sbatel osil.", "G#dim – A7 - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Li stuq’uil avo’ne, li stuq’uil avo’ne", "A – D – B7 – Em"),
                        HymnLine("Jujuliquel chquil, lec ta xtun cu’un.", "A7 – D – E7 – A"),
                        HymnLine("Mu’yuc c’usi sc’an, yu’un chavac’bun scotol.", "A7 - D – G"),
                        HymnLine("Toj muc’ li stuq’uil avo’nton, Cajval.", "G#dim – D - A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 296,
            number = 296,
            title = "Dios, toj ech’ no’ox tuc’ avo’nton",
            crossRef = "Solo a Dios la Gloria #52",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Dios, toj ech’ no’ox tuc’ avo’nton. }", "D – D7 – Em"),
                        HymnLine("Mu c’usi xco’laj li stuq’uil avo’ne. }", "A – G – D"),
                        HymnLine("Mu boch’o xco’laj jech c’u cha’al vo’ot. }", "Bm – Em"),
                        HymnLine("Toj ech’ no’ox tuc’ avo’nton. } 3", "A – G - D")
                    )
                )
            )
        ),
        Hymn(
            id = 300,
            number = 300,
            title = "Toj ep li c’anel yu’un Diose",
            crossRef = "Solo a Dios la Gloria #251",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Toj ep li c’anel yu’un Diose;", "C"),
                        HymnLine("mu stac atel o c’u yepal.", "G7 – C"),
                        HymnLine("Mu xca’ibe smelol c’u x’elan", "G7 – C"),
                        HymnLine("la sc’an cristiano li Diose.", "F – C"),
                        HymnLine("C’alal i’och mulil ta scoj li", "G7 – C"),
                        HymnLine("Adán xchi’uc Eva ta Edèn,", "F – C"),
                        HymnLine("la sloq’ues el, pero laj yal", "G7 - C"),
                        HymnLine("ti chtal Jcoltavanej.")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Toj ep li c’anel yu’un Diose;", "F – C"),
                        HymnLine("te chloc’ o tal c’u cha’al vo’.", "G7 – C"),
                        HymnLine("Te oy o ta sbatel osil;", "F – C"),
                        HymnLine("j’ech’el mu xlaj o sc’oplal.", "G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 303,
            number = 303,
            title = "C’usi chajtojbe o, ti toj ep lac’anun",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("C’usi chajtojbe o, ti toj ep lac’anun,", "D - A"),
                        HymnLine("ti lavac’ aba ta milel ta scoj jmul.", "G - D"),
                        HymnLine("Li stojol chacac’be, amoton chacac’bot.", "A7 - D"),
                        HymnLine("Cajval Jesucristo, juteb no’ox chacac’bot ta", "G - D"),
                        HymnLine("scotol co’nton.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 304,
            number = 304,
            title = "Li c’anel avu’un",
            crossRef = "Solo a Dios la Gloria #536",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Li c’anel avu’un }", "D – A"),
                        HymnLine("más chi’ c’u cha’al pom }", "Bm7"),
                        HymnLine("Li c’uxubinel avu’une }", "G – D"),
                        HymnLine("Ch-ach’ub jujun c’ac’al } 2", "Em7 – A"),
                        HymnLine("Ja’ yu’un chaquich’ot ta muc’ }", "Em7 – A"),
                        HymnLine("Ja’ yu’un chitun avu’un. }", "Gmaj - F#m7"),
                        HymnLine("Ja’ yu’un ta jc’anot ta } 2", "C2 – G"),
                        HymnLine("scotol co’nton.", "D – A9 – D – G - D")
                    )
                )
            )
        ),
        Hymn(
            id = 305,
            number = 305,
            title = "Colaval Cajval, toj ep ac’anojun",
            crossRef = "Solo a Dios la Gloria #389",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Colaval Cajval, toj ep ac’anojun.", "C - F"),
                        HymnLine("Colaval Cajval, toj ep ac’anojun.", "G - C"),
                        HymnLine("C’alal chca’ay ac’ope,", "F - C"),
                        HymnLine("ti chc’ot lec ta yut co’ntone,", "G - C"),
                        HymnLine("ta jn’a o ti toj ep ac’anojune.", "F - G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 306,
            number = 306,
            title = "Dios, ep chac’anvan",
            crossRef = "Solo a Dios la Gloria #56",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Dios, ep chac’anvan.", "D"),
                        HymnLine("Toj ep laj ac’anun.", "A7"),
                        HymnLine("Toj jun no’ox yutsil,", "D"),
                        HymnLine("mu xlaj sbatel osil.", "G – Em"),
                        HymnLine("Ja’ Ch’ul c’anel avu’un.", "Em7 – A7"),
                        HymnLine("Más muc’ chac c’u cha’al nab.", "D – A7 – D – Em"),
                        HymnLine("Xjelov to ta vinajel", "Em – A"),
                        HymnLine("li c’anel avu’un.", "A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 314,
            number = 314,
            title = "Toj lec, toj jun yutsil",
            crossRef = "Solo a Dios la Gloria #428",
            originalKey = "Em",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Toj lec, toj jun yutsil,", "Em"),
                        HymnLine("me co’ol co’ntontic.", "Am – Em"),
                        HymnLine("Xijtse’in no’ox, xcuxet co’ntontic.", "Am - Bm - Em"),
                        HymnLine("Toj lec, toj jun yutsil,", "Am – Em"),
                        HymnLine("me co’ol co’ntontic.", "Am – Bm - Em"),
                        HymnLine("Xijtse’in no’ox, xcuxet co’ntontic.", "Am"),
                        HymnLine("Toj lec, toj jun yutsil,", "Em"),
                        HymnLine("me co’ol co’ntontic.", "C – D – Em"),
                        HymnLine("Vu’utic ti cuts’calal jbatic.", "Am - Em - C - D - Em")
                    )
                )
            )
        ),
        Hymn(
            id = 315,
            number = 315,
            title = "Ac’o me jna’ scotol c’usitic snopoj Dios",
            crossRef = "1 Corintios 13",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ac’o me jna’ scotol c’usitic snopoj Dios,", "C - G"),
                        HymnLine("me toj bijun,", "Am - Em"),
                        HymnLine("me jna’ scotol, me mu xic’anvan;", "F - C - G"),
                        HymnLine("Ac’o me toj yan sba xch’unojel co’nton,", "C - G"),
                        HymnLine("xu’ ta jloq’ues", "Am - Em"),
                        HymnLine("li vitsetic, me mu xic’anvan,", "F - G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 316,
            number = 316,
            title = "Jun xa c’otemutic",
            crossRef = "Solo a Dios la Gloria #405",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jun xa c’otemutic, ta sbi Cristo junutic.", "D – Bm - Em - A"),
                        HymnLine("Jun xa c’otemutic, ta sbi Cristo junutic.", "D – Bm - Em - A"),
                        HymnLine("Co’ol xa co’ntontic li’ ta banamile.", "D – Bm - Em – A"),
                        HymnLine("Co’ol xa co’ntontic li’ ta banamile.", "D – Bm - Em - A"),
                        HymnLine("Jun xa c’otemutic o, jtsacbe jba jc’ob jcotoltic,", "G – A, F#m – Bm"),
                        HymnLine("bat cac’tic ta ilel slequilal Cajvaltic.", "Em – A – D - D7"),
                        HymnLine("Jech chlic xojobanuc li slequilal Cajvaltic,", "G – A - F#m – Bm"),
                        HymnLine("jech xu chlic sna’ic ti vo’ot atuc Diosot.", "Em - A – D - D7")
                    )
                )
            )
        ),
        Hymn(
            id = 318,
            number = 318,
            title = "Jun oyutic ta sventa stuc Cajvaltic",
            crossRef = "Solo a Dios la Gloria #403",
            originalKey = "Em",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jun oyutic ta sventa stuc Cajvaltic,", "Em"),
                        HymnLine("jun oyutic, junutic xa.", "B – Em"),
                        HymnLine("Jun oyutic ta sventa stuc Cajvaltic,", "Em"),
                        HymnLine("jun oyutic, junutic xa.", "B - Em"),
                        HymnLine("Jun Dios cu’untic, jun no’ox Cajvaltic,", "Am – Em"),
                        HymnLine("jun xch’unojel co’ontic, jun c’anubbail.", "B – Em"),
                        HymnLine("Jun no’ox li ich’ voe,", "E7 – Am"),
                        HymnLine("jun no’ox Espíritu quich’ojtic,", "Em"),
                        HymnLine("ja’ li Jpat-o’ntonal.", "B - Em")
                    )
                )
            )
        ),
        Hymn(
            id = 322,
            number = 322,
            title = "Oy jun li Boch’o toj lec sc’anojun o",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Oy jun li Boch’o toj lec sc’anojun o,", "F"),
                        HymnLine("sc’anojun, sc’anojun.", "C – F"),
                        HymnLine("Oy jun li Boch’o toj lec sc’anojun o,", "F"),
                        HymnLine("ja’ Cajvaltic Jesús.", "C – F"),
                        HymnLine("Lec chisc’anun, lec chisc’anun,", "Bb – F"),
                        HymnLine("yu’un mu sc’an ti ch’ayel chibate.", "C – F"),
                        HymnLine("Lec chisc’anun, lec chisc’anun.", "Bb – F"),
                        HymnLine("Ja’ Cajvaltic Jesús.", "C - F")
                    )
                )
            )
        ),
        Hymn(
            id = 341,
            number = 341,
            title = "Isacub (I’ic’ub) xa cu’untic",
            crossRef = "Solo a Dios la Gloria #486",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Isacub (I’ic’ub) xa cu’untic,", "D"),
                        HymnLine("xcuxet no’ox co’ntoncutic.", "D"),
                        HymnLine("Li’ chiq’uejincutic avu’un,", "G – D"),
                        HymnLine("yu’un li achi’inojuncutic.", "G – D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Chcac’bot ta ac’ob Cajval, }", "G – D"),
                        HymnLine("chcac’bot ta ac’ob Cajval }", "B7 – Em"),
                        HymnLine("Li jch’iumalcutic. }", "E7 – A7"),
                        HymnLine("(li jch’iumalcutic). } 2", "G - D")
                    )
                )
            )
        ),
        Hymn(
            id = 348,
            number = 348,
            title = "Ta sventa Jcoltavanej",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ta sventa Jcoltavanej", "D"),
                        HymnLine("Chiq’uejin yu’un tsc’anun.", "A"),
                        HymnLine("Ja’ toj lec ta xca’ay vu’un, chiscoltaun.", "G - F#m - A"),
                        HymnLine("Ta ic’osil la staun;", "D"),
                        HymnLine("la scoltaun ta chuquel,", "F#m – Bm"),
                        HymnLine("mu’yuc chibat ta ch’ayel, oy jcoltael.", "D – A - D")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Cajval cu’un, Cajval cu’un,", "D - G"),
                        HymnLine("ja’ toj lec ta q’uejintael li abi.", "F#m – Bm - A"),
                        HymnLine("Laj apocun ta ach’ich’al;", "D"),
                        HymnLine("laj xa quich’ ach’ cuxlejal.", "G"),
                        HymnLine("Xcuxet co’nton o ta xca’ay, Cajval cu’un.", "D - F#m – A - D")
                    )
                )
            )
        )
    )
}
