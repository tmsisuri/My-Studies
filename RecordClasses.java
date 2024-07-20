// class Alien {
//     private final int id;
//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id = " + id + ", name = " + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(java.lang.Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }    
// }

record Alien (int id , String name) {

    public Alien {
        if(id == 0) 
           throw new IllegalArgumentException("id cannot be zero");
    }
}

public class RecordClasses {
    public static void main(String[] args) {

        //record is a class
        //all the variables are in record are private and final
        //record cannot extend any other class but it can implement the interfaces
        //we can create normal , static methods and static variables inside a record
        
        Alien a1 = new Alien(1,"Navin");
        Alien a2 = new Alien(1,"Navin");
        Alien a3 = new Alien(0,"Navin");

        System.out.println(a1);
        System.out.println(a1.equals(a2));
        System.out.println(a3);
    }
}
