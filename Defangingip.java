class Solution {
    public String defangIPaddr(String address) {
        String ans = "";
        int index = 0;

        while (index < address.length()) {

            if (address.charAt(index) == '.') {
                ans = ans + "[.]";
            } else
                ans += address.charAt(index);

            index++;

        }

        return ans;

    }
}