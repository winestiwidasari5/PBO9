public class RepLaceString {
    public static void main(String[] args) {
        String string1 ="Hello How Are You";
        String GantiKarakter = string1.replace('H', 'T');
        String GantiKalimat = string1.replace("Hello", "Good Morning");
        System.out.println("Untuk replace karakter : "+GantiKarakter);
        System.out.println("Untuk replace kalimat: "+GantiKalimat);

    }
}

//output :
//Untuk replace karakter : Tello Tow Are You
//Untuk replace kalimat: Good Morning How Are You