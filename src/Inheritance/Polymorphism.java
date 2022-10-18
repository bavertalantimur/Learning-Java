package Inheritance;

public class Polymorphism {
    public static void main(String[] args) {
        Employee emp1=new Employee("baver","sdajbns@gmail.com","0554665");
        Academician a1=new Academician("bavertalantimur","gfkfdkk","1235","gjkfkjgfj","fklsgl","kjgkjd");
        Lecturer l1=new Lecturer("fdlşsldsl","ofpdopgfo","opfdo","kdlflkgd","gdfdofd","dfllfdldf","asistan");
        Officers of1=new Officers("sasd","dsfds","fggdf");

        // çalışan akademisyeni üst sınııfı olduğu için çalışan sınıfından bir akademisyen nesnesi üretilebilir.
        // çalışan sınıfı emp2 için referans gösterildi ama emp2 akemisyen sınıfından üretilmiş bir nesne gibi davranır
        Employee emp2=new Academician("bawer","dfsldls","fsslşflşdsf","klfdklkdfkl","fgopopfds","fkld");
        System.out.println(emp2.giris());

        // Academician[] abc={a1,l1,of1}; akademisyen türünden bir dizi oluşturursak alt sınıflarından ve kendiisinden oluşmuş nesneleri alır.
        // of1 akademisyenin alt sınıfı olmadığı için of1 almaz ;


        Employee[] girisListesi={a1,l1,of1};
        Employee.listele(girisListesi);








    }
}
