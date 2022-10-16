package Static;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("online ogrenci:"+ Student.howStudent());
        System.out.println("-----");


        Student s1=new Student("ali",220,40);
        System.out.println("online ogrenci:"+ Student.howStudent());
        System.out.println("static olmayan:"+s1.value());
        System.out.println("-----");

        Student s2=new Student("AYSE",360,80);
        System.out.println("online ogrenci:"+ Student.howStudent());
        System.out.println("static olmayan:"+s2.value());
        System.out.println("-----");

        Student s3=new Student("mehmet",260,70);
        System.out.println("online ogrenci:"+ Student.howStudent());
        System.out.println("static olmayan:"+s3.value());
        System.out.println("-----");

        s1.exit();
        System.out.println("online ogrenci:"+ Student.howStudent());


        int[] notlar=new int[3];
        notlar[0]=s1.point;
        notlar[1]=s2.point;
        notlar[2]=s3.point;

        System.out.println(Student.calcOverall(notlar));




    }
}
