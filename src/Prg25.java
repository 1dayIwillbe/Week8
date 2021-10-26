public class Prg25 {
        int id;
        String name;
        int age;
        //creating two arg constructor
        Prg25(int i,String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        Prg25(int i,String n,int a){
            id = i;
            name = n;
            age=a;
        }
        public void display(){System.out.println(id+" "+name+" "+age);}

        public static void main(String args[]){
            Prg25 s1 = new Prg25(111,"Karan");
            Prg25 s2 = new Prg25(222,"Aryan",25);
            s1.display();
            s2.display();
        }
    }


