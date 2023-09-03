public enum PlanetsFunction {

    Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune;

    public static int getPosition(PlanetsFunction planet){
        return planet.ordinal() + 1;
    }

    public static String getPlanet(int position,String face){
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        System.out.println(faceString);

        return (new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}[position]);
    }

}
