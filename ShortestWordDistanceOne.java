public class ShortestWordDistanceOne {


    //TC:O(N) where N is number of words. As we are iterating all the elemnts in the words array
    //SC: O(1) Not using any extra space
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        if( wordsDict == null || wordsDict.length == 0) return -1;
        
        int pointerOne = -1;
        int pointerTwo = -1;
        int n = wordsDict.length;
        int minimumDistance = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(wordsDict[i].equals(word1)) {
                pointerOne = i;
            }
            if(wordsDict[i].equals(word2)) {
                pointerTwo = i;
            }
            
            if(pointerOne!=-1 && pointerTwo!=-1) {
                minimumDistance = Math.min(minimumDistance, Math.abs(pointerOne - pointerTwo));
            }
        }
        
        return minimumDistance;
    }
    public static void main(String[] args) {
        ShortestWordDistanceOne shortDistanceObj = new ShortestWordDistanceOne();
        int result = shortDistanceObj.shortestDistance(new String[] {"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice");
        System.out.println("The result: "+result);
    }
}