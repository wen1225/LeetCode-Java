class Solution {
    public String defangIPaddr(String s) {
        String ans = new String();
        for (int i = 0; i < s.length(); i++) {
            if ((s.toCharArray())[i] == '.') {
                ans += "[.]";
                continue;
            }
            ans += (s.toCharArray())[i];
        }
        return ans;
    }
}
        
//Not the fastest solution, the faster one would be:
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
