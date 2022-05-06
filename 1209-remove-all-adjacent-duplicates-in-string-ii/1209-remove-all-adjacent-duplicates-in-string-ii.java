class Solution {
    public String removeDuplicates(String s, int k) {
		//basically we are maintaining count of continuous stream of letters
        int count=1;
        for(int i=1;i<s.length();i++){
			//if the same letter occured again
            if(i>0 && s.charAt(i-1)==s.charAt(i)){
                count++;
            }
            else{
                count=1;
            }
			//now checking if its count has reached k
            if(count==k){
                String temp=s;
				//removing the letters
                s=temp.substring(0,i-k+1)+temp.substring(i+1,temp.length());
				//i-k for coming back to correct position after removing the letters
				//i-k -k one more -k to check if after removing the letters, some previous letters are also counting to k or not
                if(i-2*k>=0){
                    i=i-2*k;
                }
                else{
                    i=0;
                }
                count=1;
            }
        }
        return s;
    }
}