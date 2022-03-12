public class Encryptor
{
  /** A two-dimensional array of single-character strings, instantiated in the constructor */
  private String[][] letterBlock;

  /** The number of rows of letterBlock, set by the constructor */
  private int numRows;

  /** The number of columns of letterBlock, set by the constructor */
  private int numCols;

  /** Constructor*/
  public Encryptor(int r, int c)
  {
    letterBlock = new String[r][c];
    numRows = r;
    numCols = c;
  }
  
  public String[][] getLetterBlock()
  {
    return letterBlock;
  }
  
  /** Places a string into letterBlock in row-major order.
   *
   *   @param str  the string to be processed
   *
   *   Postcondition:
   *     if str.length() < numRows * numCols, "A" in each unfilled cell
   *     if str.length() > numRows * numCols, trailing characters are ignored
   */
  public void fillBlock(String str)
  {
    int count = 0;
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        if(count < str.length())
        {
          letterBlock[i][j] = str.substring(count, count+1);
          count++;
        } else
        {
          letterBlock[i][j] = "A";
        }
      }
    }
  }

  /** Extracts encrypted string from letterBlock in column-major order.
   *
   *   Precondition: letterBlock has been filled
   *
   *   @return the encrypted string from letterBlock
   */
  public String encryptBlock()
  {
    String sus = "";
    for (int i = 0; i < numCols; i++) {
      for (int j = 0; j < numRows; j++) {
        sus+= letterBlock[j][i];
      }
    }
    return sus;
  }

  /** Encrypts a message.
   *
   *  @param message the string to be encrypted
   *
   *  @return the encrypted message; if message is the empty string, returns the empty string
   */
  public String encryptMessage(String message)
  {
    if (message.equals(""))
    {
      return "";
    } else
    {
      String sussy = "";
      for (int i = 0; i < message.length(); i += (numRows*numCols)) {
        String segment = "";
        if (i+(numRows*numCols) < message.length())
        {
          segment = message.substring(i, i+(numRows*numCols));
        } else {
          segment = message.substring(i);
        }
        fillBlock(segment);
        sussy += encryptBlock();
      }
      return sussy;
    }

  }
  
  /**  Decrypts an encrypted message. All filler 'A's that may have been
   *   added during encryption will be removed, so this assumes that the
   *   original message (BEFORE it was encrypted) did NOT end in a capital A!
   *
   *   NOTE! When you are decrypting an encrypted message,
   *         be sure that you have initialized your Encryptor object
   *         with the same row/column used to encrypted the message! (i.e. 
   *         the �encryption key� that is necessary for successful decryption)
   *         This is outlined in the precondition below.
   *
   *   Precondition: the Encryptor object being used for decryption has been
   *                 initialized with the same number of rows and columns
   *                 as was used for the Encryptor object used for encryption. 
   *  
   *   @param encryptedMessage  the encrypted message to decrypt
   *
   *   @return  the decrypted, original message (which had been encrypted)
   *
   *   TIP: You are encouraged to create other helper methods as you see fit
   *        (e.g. a method to decrypt each section of the decrypted message,
   *         similar to how encryptBlock was used)
   */
  public String decryptMessage(String encryptedMessage)
  {
    if (encryptedMessage.equals(""))
    {
      return "";
    } else
    {
      String notSussy = "";
      for (int i = 0; i < encryptedMessage.length(); i += (numRows*numCols)) {
        String segment = "";

        segment = encryptedMessage.substring(i, i+(numRows*numCols));
//        System.out.println(segment);
        String[][] pls = tempFill(segment);
//        System.out.println(decryptBlock(pls));
        notSussy += decryptBlock(pls);
      }

      while(notSussy.substring(notSussy.length()-1).equals("A"))
      {
        notSussy = notSussy.substring(0, notSussy.length()-1);
      }
      return notSussy;
    }
  }

  public String[][] tempFill(String words)
  {
    int count = 0;
    String[][] ahhhh = new String[numCols][numRows];
    for (int i = 0; i < numCols; i++) {
      for (int j = 0; j < numRows; j++) {
        if(count < words.length())
        {
          ahhhh[i][j] = words.substring(count, count+1);
          count++;
        } else
        {
          ahhhh[i][j] = "A";
        }
      }
    }
    return ahhhh;
  }

  public String decryptBlock(String[][] please)
  {
    String notSus = "";
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        notSus+= please[j][i];
      }
    }
    return notSus;
  }

// public static String shiftChar(String cha, int num)
// {
//   char c = cha.charAt(0);
//   String uni = Integer.toHexString(c | 0x10000).substring(0);
//   //System.out.println( "\\u" + uni);
//   int uniNum = Integer.parseInt(uni);
//   uniNum+= num;
//   char[] please = Character.toChars(uniNum);
//   String oop = String.copyValueOf(please);
//   return oop;
// }
//
// public String shiftString(String mess, int num)
// {
//   String age = "";
//   for (int i = 0; i < mess.length(); i++) {
//     age+=shiftChar(mess.substring(i,i+1), num);
//   }
//   return age;
// }

 public static String shiftString(String ok, int num)
 {
   char[] result = ok.toCharArray();
   for (int i = 0; i < result.length; i++) {
     result[i] += num;
   }
   return new String(result);
 }

 //moves front # of rows to the end
 public static String[][] rowShiftBack(String[][] arry, int num)
 {
   int uh = num;
   if(num < 0)
   {
     uh = arry.length+num;
   }
      String[][] ok = new String[uh][arry[0].length];
      for (int i = 0; i < uh; i++) {
        ok[i] = arry[i];
      }
      for (int i = uh; i < arry.length; i++) {
        arry[i-uh] = arry[i];
      }
      for (int i = 0; i < uh; i++) {
        arry[arry.length-uh+i] = ok[i];
      }
   return arry;
 }

 public static String[][] colShiftBack(String[][] arry, int num)
 {
   String[][] temp = arrayRotate(arry);
   temp = rowShiftBack(temp, num);
   temp = arrayRotate(temp);
   return temp;
 }

 public static String[][] arrayRotate(String[][] arry)
 {
   String[][] rote = new String[arry[0].length][arry.length];
   for (int i = 0; i < arry[0].length; i++) {
     for (int j = 0; j < arry.length; j++) {
       rote[i][j] = arry[j][i];
     }
   }
   return rote;
 }



  public String superEncryptMessage(String message, int rowShift, int colShift)
  {
    if (message.equals(""))
    {
      return "";
    } else
    {
      String sussy = "";
      for (int i = 0; i < message.length(); i += (numRows*numCols)) {
        String segment = "";
        if (i+(numRows*numCols) < message.length())
        {
          segment = message.substring(i, i+(numRows*numCols));
        } else {
          segment = message.substring(i);
        }
        segment = shiftString(segment, i);
        fillBlock(segment);
        letterBlock = rowShiftBack(letterBlock, rowShift);
        letterBlock = colShiftBack(letterBlock, colShift);
        sussy += encryptBlock();
      }
      int mesNum = message.length();
      String tempS = "" + mesNum;
      int okpls = tempS.length();
      sussy =  "" + okpls + tempS + sussy;
      return sussy;
    }

  }

  public String superDecryptMessage(String encryptedMessage, int rowShift, int colShift)
  {
    int startNums = Integer.parseInt(encryptedMessage.substring(0, 1));
    int origMesLen = Integer.parseInt(encryptedMessage.substring(1, 1+startNums));
    encryptedMessage = encryptedMessage.substring(1+startNums);

    if (encryptedMessage.equals(""))
    {
      return "";
    } else
    {
      String notSussy = "";
      for (int i = 0; i < encryptedMessage.length(); i += (numRows*numCols)) {
        String segment = "";

        segment = encryptedMessage.substring(i, i+(numRows*numCols));
        segment = shiftString(segment, -i);
        String[][] pls = tempFill(segment);
        pls = rowShiftBack(pls, -rowShift);
        pls = colShiftBack(pls, -colShift);
        notSussy += decryptBlock(pls);
      }

      while(notSussy.substring(notSussy.length()-1).equals("A"))
      {
        notSussy = notSussy.substring(0, notSussy.length()-1);
      }
      notSussy = notSussy.substring(0, origMesLen);
      return notSussy;
    }
  }

}