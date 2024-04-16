package vominh.JPAdemo.models;
import jakarta.persistence.*;
@Entity						
@Table(name = "customer")	
public class Customer {	
    @Id						
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    @Column(name = "id")	
    private int id;
    
    @Column(name = "name")  
    private String name;	  
    @Column(name = "address")
    private String address;

    public Customer() {}

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
