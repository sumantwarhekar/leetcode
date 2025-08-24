class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        int limit = 3;

        Arrays.sort(products);

        List<List<String>> result = new ArrayList<>();

        for(int i=0;i<searchWord.length();i++){
            result.add(new ArrayList<String>());
        }

        for(String str : products){
            for(int i=0;i<searchWord.length();i++){
                if(i<str.length() && str.charAt(i)==searchWord.charAt(i)){
                    if(result.get(i).size() < limit)
                        result.get(i).add(str);
                }
                else{
                    break;
                }
            }
        }
        
        return result;
    }
}