package address;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    private List<EmployeeAddress> addressList = new ArrayList<>();

    public void addAddress(EmployeeAddress address){
        addressList.add(address);
    }
    public void removeAddress(EmployeeAddress address){
//        for (int i = 0; i < addressList.size(); i++) {
//            if (addressList.get(i).equals(address)){
//                addressList.remove(i);
//            }
//        }
        addressList.remove(address);

    }
    public List<EmployeeAddress> getAddressList(){
        return addressList;
    }






}
