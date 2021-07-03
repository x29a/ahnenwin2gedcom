package de.ng.ahnenwin2gedcom.hej

enum class AhnenProperty constructor(
    val columnIndex: Int,
    val datatype: Class<*> = String::class.java
) {
    NUMMER(0, Int::class.java),
    VATER(1, Int::class.java),
    MUTTER(2, Int::class.java),
    NACHNAME(3),
    VORNAMEN(4),
    RUFNAME(50),
    GESCHLECHT(5, Geschlecht::class.java),
    RELIGION(6),
    BERUF(7),
    GEBURTSTAG(8),
    GEBURTSMONAT(9),
    GEBURTSJAHR(10),
    GEBURTSORT(11),
    TAUFTAG(12),
    TAUFMONAT(13),
    TAUFJAHR(14),
    TAUFORT(15),
    TAUFPATE(16),
    LEBENSORT(17),
    STERBETAG(18),
    STERBEMONAT(19),
    STERBEJAHR(20),
    STERBEORT(21),
    TODESURSACHE(22),
    BEERDIGUNG_TAG(23),
    BEERDIGUNG_MONAT(24),
    BEERDIGUNG_JAHR(25),
    BEERDIGUNG_ORT(26),
    QUELLE(49),
    GEBURT_QUELLE(27),
    TAUFE_QUELLE(28),
    STERBEQUELLE(29),
    BEERDIGUNG_QUELLE(30),
    TEXT(31, Array<String>::class.java),
    LEBT(32),
    SCHREIBWEISE(33),
    HOFNAME(36),
    ADRESSE_1(37),
    ADRESSE_2(38),
    PLZ(39),
    ADRESSE_ORT(40),
    ADRESSE_ZUSATZ(41),
    STERBEALTER(45),
    TELEFON(46);
}