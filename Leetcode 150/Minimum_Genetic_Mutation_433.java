class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>();
        for(String b: bank){
            bankSet.add(b);
        }

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(startGene);
        visited.add(startGene);

        int level =0;
        char[] genes = {'A','C','G','T'};

        while(!q.isEmpty()){
            int size = q.size();

            while(size-->0){
                String curr = q.poll();

                if(curr.equals(endGene))
                    return level;

                for(char ch : genes){
                    for(int i=0;i<curr.length();i++){
                        char[] arr = curr.toCharArray();
                        if (arr[i] == ch) continue;
                        arr[i] = ch;
                        String neighbor = new String(arr);

                        if(!visited.contains(neighbor) && bankSet.contains(neighbor)){
                            visited.add(neighbor);
                            q.offer(neighbor);
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}