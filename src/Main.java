import address.EmployeeAddress;
import address.EmployeeData;
import animal.Animal;
import animal.Elephant;
import animal.Lion;
import animal.Seal;

public class Main {
    public static void main(String[] args) {
        EmployeeAddress laciAddress = new EmployeeAddress("HUN",2113,"Nap","2/A");
        EmployeeAddress laciAddressUj = new EmployeeAddress("HUN",2113,"Jozesf","4F");
        EmployeeAddress juliAddress = new EmployeeAddress("HUN",8000,"JozesfFöldi","II");

        EmployeeData laci = new EmployeeData();
        EmployeeData juli = new EmployeeData();
        laci.addAddress(laciAddress);
        laci.addAddress(laciAddressUj);
        juli.addAddress(juliAddress);
        System.out.println(laci.getAddressList());
        System.out.println(juli.getAddressList());
        laci.removeAddress(laciAddress);
        System.out.println(laci.getAddressList());

        Animal dumbo = new Elephant("Dumbó");
        Animal mufasza = new Lion("Múfasza");
        Animal foki = new Seal("Fókikoma");

        dumbo.addnickName("füles");
        dumbo.addnickName("repcsi");
        dumbo.addnickName("elef");
        dumbo.addnickName("égiegér");
        dumbo.makeSound();
        System.out.println(dumbo.getNickName());
        Animal.numberOfAnimals();




    }
}