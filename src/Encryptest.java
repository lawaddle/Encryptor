public class Encryptest {
    public static void main(String[] args)
    {
        String[][] values = {{"a", "b", "c", "d", "e"},
                {"f", "g", "h", "i", "j"},
                {"k", "l", "m", "n", "o"},
                {"p", "q", "r", "s", "t"}};


//        String[][] uh = Encryptor.arrayRotate(values);
//        EncryptorTester.print2DArray(uh);

//        String[][] oh = Encryptor.colShiftBack(values, 1);
//        EncryptorTester.print2DArray(oh);

        String ah = "Kirby, Kirby, Kirby! That's a name you should know Kirby, Kirby, Kirby! He's the star of the show! He's more than you think, he's got maximum pink Kirby, Kirby, Kirby's the one! He's comin' right back at ya! He's comin' right back at ya! Give it all that you've got, take your very best shot He'll send it right back at ya for sure, yeah! ";
        Encryptor sup = new Encryptor(3, 4);
        String ahh = sup.superEncryptMessage(ah, 2, 2);
        System.out.println(ahh);
        String pls = sup.superDecryptMessage(ahh, 2,2);
        System.out.println(pls);

    }
}

