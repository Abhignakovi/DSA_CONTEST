class Sol
{
    int isPossible (String S)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            int val=map.getOrDefault(ch,0);
            map.put(ch,val+1);
        }
        
        int count=0;
        for(int freq:map.values()){
            if(freq%2!=0){
                count++;
            }
        }
        if(count>=1){
            return 0;
        }
        else{
            return 1;
        }
        
    }
}