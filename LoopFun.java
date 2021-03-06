 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int result = 1;
          for (int i = 2; i <= number; i++) {
              result = result*i;
            }
          
          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
        String [] phraseArr = phrase.split("");
        String acro = phraseArr[0];
            for (int i = 0; i < phraseArr.length; i++) {
                if (phraseArr[i].equals(" ")) {
                    acro += phraseArr[i+1];
                } 
            }
        return acro.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
          char[] wordArr = word.toCharArray();
          String  newWord = "";
          char letter = ' ';
          for (int i = 0; i < wordArr.length; i++) {
            letter = wordArr[i];
            for(int j = 0; j <alphabet.length; j++) {
                if(wordArr[i] == alphabet[j]) {
                    if(j > 22) {
                        int x = (j+3)-26;
                        letter = alphabet[x];
                        newWord += letter;
                    }
                    else {
                        letter = alphabet[j+3];
                        newWord += letter;
                    }
            
                }
            }


                }
          return newWord;

      }
}
