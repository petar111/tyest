package domain;

/*
 * This enumeration represents a military rank of a military man working in a military system. It is used as attribute
 * of VojnoLice.
 * 
 * 
 */



public enum Cin {
	RAZVODNIK, DESETAR, MLADJI_VODNIK,  /*  Private ranks 0-2*/
	VODNIK, STARIJI_VODNIK, STARIJI_VODNIK_PRVE_KLASE, ZASTAVNIK, ZASTAVNIK_PRVE_KLASE, /* Non-commissioned officer ranks 3-7*/
	POTPORUCNIK, PORUCNIK, KAPETAN, MAJOR, POTPUKOVNIK, PUKOVNIK, /*  Officer ranks 8-13*/
	BRIGANDNI_GENERAL, GENERAL_MAJOR, GENERAL_POTPUKOVNIK, GENERAL /*  General ranks 14-17*/
}
