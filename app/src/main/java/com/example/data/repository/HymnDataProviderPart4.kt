package com.example.data.repository

import com.example.data.model.Hymn
import com.example.data.model.HymnLine
import com.example.data.model.HymnSection
import com.example.data.model.SectionType

object HymnDataProviderPart4 {
    fun getHymns(): List<Hymn> = listOf(
        Hymn(
            id = 357,
            number = 357,
            title = "Yajsoldado Cristo c’otemutic xa",
            crossRef = "Solo a Dios la Gloria #600",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Yajsoldado Cristo c’otemutic xa.", "D – A - D"),
                        HymnLine("Ta jcontraintic pucuj, mu xistsalutic.", "A – E - A"),
                        HymnLine("Tsalbil yu’un Cajval; scotol xu’ yu’un.", "D - G"),
                        HymnLine("Nabalutic ta spat Cristo, Capitán cu’untic.", "A")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Yajsoldado Jesucristo c’otemutic xa.", "D – A - D"),
                        HymnLine("Me ta jch’untic smantal, scotol xu’ cu’untic.", "G – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 361,
            number = 361,
            title = "Ja’ no’ox stuc Cristo",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ja’ no’ox stuc Cristo, mu’yuc boch’o yan,", "C - Dm"),
                        HymnLine("la scoltautic ta scoj jmultic.", "G - C"),
                        HymnLine("Li Dios cu’untic, mu’yuc boch’o jech li’i.", "F - C"),
                        HymnLine("Ja’ no’ox jun Dios oy te ta vinajel.", "Dm – G - C")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("La xa stoj jmul Cristo, laj xa smal xch’ich’al,", "C - Dm"),
                        HymnLine("ja’ jech liloc’ ta sc’ob pucuj.", "G - C"),
                        HymnLine("Yu’un mu’yuc c’usi xu’ ta jpas chicol o,", "F - C"),
                        HymnLine("ja’ yu’un la smal li xch’ul ch’ich’al ta jcoj.", "Dm – G - C")
                    )
                )
            )
        ),
        Hymn(
            id = 364,
            number = 364,
            title = "Toj lec yo’nton Cajval",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "A",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Toj lec yo’nton Cajval, ech’em stsatsal noxtoc.", "A - D"),
                        HymnLine("Yu’un oy svu’el, jech xu’ yu’un scotol.", "E - A"),
                        HymnLine("Yaloj ti chixchabiun c’alal to chtal yic’un.", "A - D"),
                        HymnLine("Mu’yuc boch’o yan jech chixchabiun.", "E - A")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Xcuxet co’nton ti jayib c’ac’al li’ oyun,", "A - D"),
                        HymnLine("yu’un ta jna’ ti oy Jcoltavanej.", "E - A"),
                        HymnLine("Ac’o me ep jvocol, mu xlo’ilaj o co’nton,", "A - D"),
                        HymnLine("yu’un ta jna’ ti mu xiscomtsanun.", "E - A")
                    )
                )
            )
        ),
        Hymn(
            id = 365,
            number = 365,
            title = "Li Diose ja’ jtsatsal o",
            crossRef = "Solo a Dios la Gloria #146",
            originalKey = "Dm",
            sections = listOf(
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Li Diose ja’ jtsatsal o;", "Dm – G - Dm"),
                        HymnLine("ja’ jpojubbail c’otem.", "Am - Dm"),
                        HymnLine("Li Diose ja’ jtsatsal o;", "Dm – G – Dm"),
                        HymnLine("ja’ Jcoltavanej cu’un.", "Am - Dm")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Vo’ot chatojobtasun el ta tuq’uil be;", "F – Bb"),
                        HymnLine("chachanubtasun lec.", "C7 – F"),
                        HymnLine("Vo’ot chacoltaun ta stsalel scotol,", "Bb"),
                        HymnLine("jech mu xchibaj co’nton.", "C7 - F")
                    )
                )
            )
        ),
        Hymn(
            id = 369,
            number = 369,
            title = "Cajval, ta jc’an nopol oyun ta ats’el",
            crossRef = "Solo a Dios la Gloria #314",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cajval, ta jc’an nopol oyun ta ats’el.", "D – A7 – G – D – A7"),
                        HymnLine("Lec chca’ay ti ac’anojun, xcuxet co’nton.", "D – A7 – G – D- A7 - D"),
                        HymnLine("Ventainbun li jbec’tal, pocbun li co’ntone.", "G – D- G – D - A"),
                        HymnLine("Ac’o me quil asat te ta atojol.", "D – A7 – G – D- A7 - D")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Tsta yorail ta jq’uel ti bu oyote,", "D – A7 – G – D – A7"),
                        HymnLine("yu’un laj xa jch’unot, toj jun yutsil.", "D – A7 – G – D- A7 - D"),
                        HymnLine("Chc’ot cal alequilal, ta jq’uejinta abi.", "G – D- G – D - A"),
                        HymnLine("Toj xcuxet no’ox co’nton te ta atojol.", "D – A7 – G – D- A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 370,
            number = 370,
            title = "Jech c’u cha’al chij",
            crossRef = "Solo a Dios la Gloria #471",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Jech c’u cha’al chij", "G"),
                        HymnLine("ti tsa’ yoxo’ yuch’e,", "Em – Bm"),
                        HymnLine("ja’ jech ch-oc’ co’nton avu’un,", "C – G – C"),
                        HymnLine("Cajval, Dios cu’un.", "D – G"),
                        HymnLine("C’ac’al ac’bal, jun ta taqui’o’nal,", "Em – Bm"),
                        HymnLine("ta jsa’ coltael ta atojol.", "C – Am – D"),
                        HymnLine("Nojesbus lec co’nton, Cajval.", "G – D – C – D"),
                        HymnLine("Ac’bun mas li c’anel avu’un.", "G – D – C – D"),
                        HymnLine("Taquin co’nton ta atojol,", "Am – Em - C – D"),
                        HymnLine("nojesbun co’nton.", "C – D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 374,
            number = 374,
            title = "Cristo ja’ ch’en ta Horeb",
            crossRef = "Solo a Dios la Gloria #143",
            originalKey = "Em",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Cristo ja’ ch’en ta Horeb, te ta xloc’ tal vo’", "Em – B"),
                        HymnLine("ja’ vo’ sventa cuxlejal, lec chtun avu’un.", "Em"),
                        HymnLine("Cristo ja’ ch’en ta Horeb, te ta xloc’ tal vo’", "E7 - Am"),
                        HymnLine("ja’ vo’ sventa cuxlejal, lec chtun avu’un.", "Em – B7 – Em"),
                        HymnLine("La’ me uch’anic,", "Am"),
                        HymnLine("más chi’ c’u cha’al muc’ta pom.", "D7 – G"),
                        HymnLine("Tsicub avo’nton, tsicub scotol abec’tal.", "B7 – Em"),
                        HymnLine("Cristo ja’ ch’en ta Horeb, te ta xloc’ tal vo’", "E7 – Am"),
                        HymnLine("ja’ vo’ sventa cuxlejal, lec chtun avu’un.", "Em – B7 - Em")
                    )
                )
            )
        ),
        Hymn(
            id = 376,
            number = 376,
            title = "Tojobtasun, Jesús",
            crossRef = "Solo a Dios la Gloria #144",
            originalKey = "Em",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Tojobtasun, Jesús,", "Em- Am- Em"),
                        HymnLine("ch’ul Jchapanvanej cu’un.", "B – Em- B"),
                        HymnLine("lecuc chbat c’usitic ta jpas,", "Em- C – Am – B"),
                        HymnLine("Jech c’u cha’al chal ac’op.", "Em- Am - Em")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Mu me xcac’ el cacan", "Em- Am- Em"),
                        HymnLine("ti bu mu’yuc leque.", "B – Em- B"),
                        HymnLine("Mu me jpas c’usitic chopol,", "Em- C – Am – B"),
                        HymnLine("coltaun, c’uxubinun.", "Em- Am - Em")
                    )
                )
            )
        ),
        Hymn(
            id = 378,
            number = 378,
            title = "Más to lecubtasun",
            crossRef = "Solo a Dios la Gloria #339",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Más to lecubtasun, ja’ comuc mulil.", "D – A"),
                        HymnLine("Ja’ pajuc slo’il co’nton, taluc c’usi lec.", "D – Bm – E7 – A"),
                        HymnLine("Ac’bun más jch’un batel, tuq’uibtasun mas.", "A7 – D – G – D"),
                        HymnLine("Tuncun mas avu’un, ac’o jc’opanot.", "D – G – D – A7 - D")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Tuq’uibtasbun co’nton, tsotsuc lec co’nton.", "D – A"),
                        HymnLine("Ventainun o atuc, ac’o jts’aclinot.", "D – Bm – E7 – A"),
                        HymnLine("Ac’o jpat o co’nton, yu’un vo’ot chacoltaun", "A7 – D – G – D"),
                        HymnLine("Ja’ ac’o jc’an vinajel, ja’ más xcuxet te.", "D – G – D – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 384,
            number = 384,
            title = "Xcuxet no’ox co’nton ta ora",
            crossRef = "Solo a Dios la Gloria #5",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Xcuxet no’ox co’nton ta ora", "D"),
                        HymnLine("yu’un Cajvaltic Jesús.", "A – D"),
                        HymnLine("Ja’ laj yal comel ti muc ta xcat", "G"),
                        HymnLine("co’nton ti mu xixi’.", "D"),
                        HymnLine("Ja’ chispasbun xa ta jun co’nton", "A – D"),
                        HymnLine("yu’un la jch’un xa sc’op.", "G – D – A - D"),
                        HymnLine("Xcuxet no’ox co’nton.")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Toj ech’em avutsil, Cristo,", "D"),
                        HymnLine("mu’yuc boch’o yan jech yutsil.", "G – D"),
                        HymnLine("Toj ech’em amuc’ul, Cristo,", "Bm"),
                        HymnLine("jech chquich’ot o ta muc’.", "G – D – A - D")
                    )
                )
            )
        ),
        Hymn(
            id = 387,
            number = 387,
            title = "Dios cu’un, chajc’anot",
            crossRef = "Solo a Dios la Gloria #27",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Dios cu’un, chajc’anot;", "D – G"),
                        HymnLine("Li’ chaquich’cutic ta muc’.", "D – A7 – D"),
                        HymnLine("Ich’bilucot o ta muc’ atuc;", "D – G – A"),
                        HymnLine("ac’o ich’icot ta muc’ scotolic.", "D – G - F#m – Bm"),
                        HymnLine("Ich’bilucot o ta muc’ atuc.", "G – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 390,
            number = 390,
            title = "Laj xa jta jun co’nton",
            crossRef = "Solo a Dios la Gloria #321",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Laj xa jta jun co’nton ta sventa Cajvaltic.", "G – C – G"),
                        HymnLine("Ta vo’onee talbat no’ox co’nton", "A7 – D"),
                        HymnLine("Ja’ no’ox xu’ tstaic li yu’untac Cajvaltic.", "G – C"),
                        HymnLine("Toj jun yutsil, mu’yuc slajebal.", "G – D7 - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Toj jun no’ox co’nton;", "C – G"),
                        HymnLine("Ja’ laj yac’bun li Jtotic Diose.", "Em – A7 – C"),
                        HymnLine("Ta jc’anbe ti j’ech’el ac’o junuc co’nton", "G – C"),
                        HymnLine("ta sventa ti toj ep sc’anojun.", "G – D7 - G")
                    )
                )
            )
        ),
        Hymn(
            id = 394,
            number = 394,
            title = "Li Jesucristo ja’ ti’ na",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Li Jesucristo ja’ ti’ na;", "G"),
                        HymnLine("ja’ sbelal vinajel.", "D7 – G"),
                        HymnLine("Ti me chac’an chavil li Dios,", "G"),
                        HymnLine("ich’o ta muc’ Jesús.", "D7 - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("¿Bu beal atamoj?", "D7"),
                        HymnLine("¿Me laj xa anop lec?", "D – G"),
                        HymnLine("¿Me ta stojol Jesús,", "D7"),
                        HymnLine("o me sbelal ch’ayel?", "D – G"),
                        HymnLine("Nopo bu lec chabat.", "D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 395,
            number = 395,
            title = "Boch’o tsch’un ti chcoltaat yu’un Dios",
            crossRef = "Los que esperan en Jehová",
            originalKey = "D",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Boch’o tsch’un ti chcoltaat yu’un Dios,", "D"),
                        HymnLine("mu xa xlo’ilaj li yo’ntone.", "A"),
                        HymnLine("Mu xch’un c’usi chtal ta yo’nton,", "D - G"),
                        HymnLine("ti ja’ yabtel pucuje.", "D - A - D"),
                        HymnLine("Ja’ tspasilan li c’usi lec,", "D7 – G - D"),
                        HymnLine("jech tstsal yu’un c’usi chopol", "A - D"),
                        HymnLine("yu’un chcoltaat yu’un jtotic Dios,", "G - D"),
                        HymnLine("yu’un jech yo’nton tspas c’usi lec.", "A – A7 - D")
                    )
                )
            )
        ),
        Hymn(
            id = 400,
            number = 400,
            title = "Ac’o me me’onun mu’yuc c’usi oy cu’un",
            crossRef = "Solo a Dios la Gloria #651",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Ac’o me me’onun mu’yuc c’usi oy cu’un,", "G - C - G"),
                        HymnLine("jun ono’ox co’nton yu’un chbat xa jchi’in Dios.", "Am - D - C - G"),
                        HymnLine("Ac’o me abul jba, me ta vocol oyun,", "G - C - G"),
                        HymnLine("sc’anojun li Cajval, yu’un toj lec yo’nton.", "Am - D - G")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("Te ta vinajel, te ta vinajel, }", "C - G"),
                        HymnLine("vu’un oy lec jna, toj lec, }", "D"),
                        HymnLine("toj lec jna te ta vinajel. } 2", "G - D - G")
                    )
                )
            )
        ),
        Hymn(
            id = 415,
            number = 415,
            title = "Xcuxet co’nton ta xchi’inun Jesús",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "G",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Xcuxet co’nton ta xchi’inun Jesús.", "G – D"),
                        HymnLine("Xcuxet co’nton ti chisc’opanun.", "D7 – G"),
                        HymnLine("Chistojobtasun ta be,", "G7"),
                        HymnLine("c’alal to ta vinajel.", "C – Am"),
                        HymnLine("Xcuxet co’nton ta xchi’inun Jesús.", "D – D7 - G")
                    )
                )
            )
        ),
        Hymn(
            id = 418,
            number = 418,
            title = "Chi’inuncutic batel, Jesús",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Chi’inuncutic batel, Jesús;", "C – G7 – C"),
                        HymnLine("q’ueluncutic scotol ora.", "F – C"),
                        HymnLine("Ventainuncutic ta abtel,", "G7 – C"),
                        HymnLine("c’alal to chisutcutic tale.", "F – C – G7 - C"),
                        HymnLine("Ventainbuncutic li quecutic;", "C – F"),
                        HymnLine("ac’o calcutic no’ox lequil c’op.", "C – G7"),
                        HymnLine("Ventaino c’usi ta jpascutic;", "C – F"),
                        HymnLine("Vinajuc ti jch’unojcutique.", "C – F - G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 420,
            number = 420,
            title = "Chabibilutic yu’un Jesús",
            crossRef = "Solo a Dios la Gloria #448",
            originalKey = "A",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Chabibilutic yu’un Jesús,", "A – E7 – A"),
                        HymnLine("ac’o me jtuctic oyutic.", "D - A"),
                        HymnLine("Te ono’ox xchi’inojutic o,", "E7 – A"),
                        HymnLine("yu’un ja’ Jchabivanej o cu’untic.", "D – A- E7 - A")
                    )
                ),
                HymnSection(
                    type = SectionType.CHORUS,
                    lines = listOf(
                        HymnLine("C’alal chtal li Jesucristo,", "A – D"),
                        HymnLine("te ta vinajel chijc’otutic.", "A – E7"),
                        HymnLine("Jmoj tsobol chijc’ot jchi’uctic Cristo,", "A – D"),
                        HymnLine("ta jchi’intic xa li Jchabivanej.", "A – D - E7 - A")
                    )
                )
            )
        ),
        Hymn(
            id = 430,
            number = 430,
            title = "Mu’yuc vocol te yo’ bu oy Jesús",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Mu’yuc vocol te yo’ bu oy Jesús,", "C – F – C"),
                        HymnLine("yo’bu oy Jesús, yo’ bu oy Jesús.", "G – G7 – C"),
                        HymnLine("Mu’yuc vocol te yo’ bu oy Jesús;", "C – F – C"),
                        HymnLine("sbatel osil toj lec o.", "F – G7 - C")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Mu’yuc chamel te yo’ bu oy Jesús,", "C – F – C"),
                        HymnLine("yo’ bu oy Jesús, yo’ bu oy Jesús.", "G – G7 – C"),
                        HymnLine("Mu’yuc chamel te yo’ bu oy Jesús;", "C – F – C"),
                        HymnLine("sbatel osil toj lec o.", "F – G7 - C")
                    )
                )
            )
        ),
        Hymn(
            id = 432,
            number = 432,
            title = "Oy c’usi ta jc’an ta xcalboxuc",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "F",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("Oy c’usi ta jc’an ta xcalboxuc", "F – C7"),
                        HymnLine("ti me chac’an chach’unique.", "F"),
                        HymnLine("ja’ me chacalbeic sc’oplale", "C7"),
                        HymnLine("li boch’o la stoj li jmultique.", "F")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("Comtsano scotol amule;", "F – C7"),
                        HymnLine("La’ me ta stojol Cajvaltic.", "F"),
                        HymnLine("Jipo ta avo’nton jamal be;", "C7"),
                        HymnLine("ja’ me li sbelal ch’ayele.", "F")
                    )
                )
            )
        ),
        Hymn(
            id = 437,
            number = 437,
            title = "Boch’o la spas li c’ac’altic",
            crossRef = "Solo a Dios la Gloria",
            originalKey = "C",
            sections = listOf(
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 1,
                    lines = listOf(
                        HymnLine("¿Boch’o la spas li c’ac’altic,", "C"),
                        HymnLine("li c’ac’altic, li c’ac’altic?", "F – C"),
                        HymnLine("¿Boch’o la spas li c’ac’altic?", "G7 - C"),
                        HymnLine("Jtotic Dios.")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 2,
                    lines = listOf(
                        HymnLine("¿Boch’o la spas li banamil,", "C"),
                        HymnLine("li banamil, li banamil?", "F – C"),
                        HymnLine("¿Boch’o la spas li banamil?", "G7 - C"),
                        HymnLine("Jtotic Dios.")
                    )
                ),
                HymnSection(
                    type = SectionType.VERSE,
                    sectionNumber = 3,
                    lines = listOf(
                        HymnLine("¿Boch’o la spas li nabetic,", "C"),
                        HymnLine("li nabetic, li nabetic?", "F – C"),
                        HymnLine("¿Boch’o la spas li nabetic?", "G7 - C"),
                        HymnLine("Jtotic Dios.")
                    )
                )
            )
        )
    )
}
