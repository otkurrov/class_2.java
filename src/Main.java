import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(weatherForWalking(30,20));
        System.out.println(weatherForWalking(60,32));
        System.out.println(weatherForWalking(25,15));
        System.out.println(weatherForWalking(55,-22));
        System.out.println(weatherForWalking(15,8));
        Random random = new Random();
        int randomAge = random.nextInt(71);
        int randomTemperature = random.nextInt(81)-40;
        System.out.println(weatherForWalking(randomAge,randomTemperature));
        System.out.println("Random Age - "+randomAge+" Random Temperature - " + randomTemperature );
    }

    public static String weatherForWalking(int ageUser, int temperature) {
        if ((20 < ageUser && ageUser < 45 && (-20) < temperature && 30 > temperature) ||
                (ageUser < 20 && (0 < temperature && temperature > 28))) {
            return ("Можно идти гулять");

        } else if (ageUser > 45 && (-20)<temperature && 25>temperature) {
            return ("Можно идти гулять");
            
        }else{
            return ("Оставайтесь дома");
        }
    }

}