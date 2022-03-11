public class Encryptmore {
    public static void main(String[] args)
    {
        Encryptor susHide = new Encryptor(6, 4);
        String sus = susHide.encryptMessage("Kirby, Kirby, Kirby! " +
                "That's a name you should know " +
                "Kirby, Kirby, Kirby! " +
                "He's the star of the show! " +
                "He's more than you think, he's got maximum pink " +
                "Kirby, Kirby, Kirby's the one! " +
                "He's comin' right back at ya! " +
                "He's comin' right back at ya! " +
                "Give it all that you've got, take your very best shot " +
                "He'll send it right back at ya for sure, yeah!");
        String notSus = susHide.decryptMessage(sus);
        System.out.println(sus);
        System.out.println(notSus);
        System.out.println();

        Encryptor devin = new Encryptor(5, 3);
        String devinNotSus = devin.decryptMessage("Io ic vtslleh asa easnt r dhptn ci edontredghi sy!sY,o .e uYo g eurhtr,ithe onatlkgthoi  ise!AA xAAAttAAA");
        System.out.println(devinNotSus);

        Encryptor mc = new Encryptor(4,5);
        String mcTrue = mc.decryptMessage("Wmcriek s  mhlfy uo SooAAmwAToAA rAAtrAA");
        System.out.println(mcTrue);

        String uhOh = devin.decryptMessage(sus);
        System.out.println(uhOh);

        System.out.println();
        Encryptor ah = new Encryptor(3,4);
        String ahh = ah.encryptMessage("What are you doing next weekend?");
        System.out.println(ahh);

        Encryptor oh = new Encryptor(6,5);
        String ohh = oh.encryptMessage("This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again.");
        System.out.println(ohh);

        System.out.println();

        Encryptor uh = new Encryptor(3,2);
        String uuh = uh.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A");
        System.out.println(uuh);

        Encryptor hi = new Encryptor(5,5);
        String hii = hi.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA");
        System.out.println(hii);

        Encryptor we = new Encryptor(6,5);
        String wewe = we.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA");
        System.out.println(wewe);

        Encryptor ee = new Encryptor(9,8);
        String eee = ee.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA");
        System.out.println(eee);

        String uni = Integer.toHexString('a' | 0x10000).substring(0);
        System.out.println( "\\u" + uni);
        int uniNum = Integer.parseInt(uni);
        uniNum-= 3;
        char[] please = Character.toChars(uniNum);
        String oop = String.copyValueOf(please);
        System.out.println(oop);

        System.out.println(Encryptor.shiftChar("a", -3));



    }
}
