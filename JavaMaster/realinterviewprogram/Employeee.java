package realinterviewprogram;

public class Employeee {
    int id;
    String name;

    public Employeee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
      else  if(! (obj instanceof Employeee))
        {
            return false;
        }else {

            Employeee e = (Employeee) obj;
            return e.id == this.id;
        }
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\''  +
                '}';
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
