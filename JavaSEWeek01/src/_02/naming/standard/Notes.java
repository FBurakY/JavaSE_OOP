package _02.naming.standard;

public class Notes {

}

//### Class ve Interface icin isimlendirme standardi;
//1) class ve interface isimleri BUYUk harfle baslamalidir. 
// camelCase yapisina uygun olmalidir. her kelimemnin ilk harfi buyuk olsun.

//2) class isimleri -> noun/isim
// CustomerAccount
// Person
// Student ... vs

//3) interface isimleri-> adjective/sifat
// public interface Runnable 
// public interface Comparable<T> 
// public interface Closeable extends AutoCloseable 
// public interface Serializable 


//#### methodlar
// kucuk harfle baslamali, camelCase yapida olmali ,fiil-isim (verb-noun) cifti seklinde olmalidir.

// getCustomerOrder
// calculateCustomerOrder
// saveExcelFile

// ### degiskenler icin ;
// camelCase yapida olmali , kucuk harfle baslamali.
// int i;
// mumkun oldugunda degiskenlere , metotlara , class lara duzgun mantikli isimler vermek gereklidir.

//### sabitler/constant
//sabitler /constant lar javada genel olarak static final tanimlanir.
// BUTUN HARFLER BUYUKTUR. kelimeler arasinda _ olacaktir!!!

// public static final int   MIN_VALUE 