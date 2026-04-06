public class EarthVolume {
    static String volumeEarth(int radiusInKm) {
        float radiusInMiles = (float) (radiusInKm / 1.6);
        return "The volume of earth in cubic kilometers is" + (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3)
                + "and cubic miles is " + (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);

    }

    public static void main(String[] args) {
        int radiusInKm = 6378;
        System.out.println(volumeEarth(radiusInKm));

    }

}
