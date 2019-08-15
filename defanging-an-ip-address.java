// https://leetcode.com/problems/defanging-an-ip-address/

class defanging-an-ip-address {
    // tc -> n, sc-> 1
    // public String defangIPaddr(String address) {
    //     address = address.replace(".","[.]");
    //     return address;
    // }
    
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
