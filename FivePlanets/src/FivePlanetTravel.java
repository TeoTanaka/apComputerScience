public class FivePlanetTravel {
    public static int mercury,venus,mars,jupiter,saturn,lightSpeed,ourSpeed,roundedTotal;
    public static double timeToMercury,timeToVenus,timeToJupiter,timeToMars,timeToSaturn,total,numPlanets = 5;
    public static void main(String[] args)
    {
        // theplanets.org average distance from earth to the planets
        mercury = 56974146;
        venus = 25724767;
        mars = 48678219;
        jupiter = 390674710;
        saturn = 792248270;

        // speed of light and our speed
        lightSpeed =  670616629;
        ourSpeed = lightSpeed /= 10;

        printTimes();

    }
    public static void getTimes() {
        timeToMercury = (double) mercury / ourSpeed; //casting it
        timeToVenus = (double) venus / ourSpeed; //casting it
        timeToMars = (double) mars / ourSpeed; //casting it
        timeToJupiter = (double) jupiter / ourSpeed; //casting it
        timeToSaturn = (double) saturn / ourSpeed; //casting it
        total = timeToMercury+timeToVenus+timeToMars+timeToJupiter+timeToSaturn;
        roundedTotal = (int) ((total/numPlanets+.5));
    }

    public static void printTimes(){
        getTimes();
        System.out.println("hours to Mercury"+ timeToMercury);
        System.out.println("hours to Venus"+ timeToVenus);
        System.out.println("hours to Mars"+ timeToMars);
        System.out.println("hours to Jupiter"+ timeToJupiter);
        System.out.println("hours to "+ timeToSaturn);
        System.out.println("total hours "+total);
        System.out.println("average hours "+total/numPlanets);
        System.out.println("rounded average hours "+roundedTotal);
    }


}

