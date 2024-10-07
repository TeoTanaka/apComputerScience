public class StateSong {


    public static void main(String[] args) {
        String line1 = "I love you, California, you’re the greatest state of all.";
        String line2 = new String("I love you in the winter, summer, spring and in the fall.");
        String line3 = "I love your fertile valleys; your dear mountains I adore.";//this is immutable

        String line1and3 = line2;
        line1and3 += line3;


        System.out.println(line1+4);//implicit tpe conversion
        System.out.println(line1+" "+line2);// + operator
        System.out.println(line1and3);//+=
        System.out.println();
        System.out.println(line1+"\n"+line2+"\n"+line3);//three escape sequences

    }

}
