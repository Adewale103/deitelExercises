package chapterFourteen;

public class SearchingStrings {
    public static void main(String[] args) {
        String sentence = "djifi ofijks iojfi ijolsi";
        int result = search(sentence, 'i');
        System.out.println(result);


    }

    public static int search(String sentence, char character) {
        int count = 0;
        int index = 0;
        while (true) {
            int tempIndex;
            tempIndex = index;
            index = sentence.indexOf(character,index)+1;
            if(tempIndex == index){
                break;
            }
            if(index == 0){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
