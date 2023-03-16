public class Animal {

    private double weightInKgs;
    private String diet;

    public Animal(double weightInKgs, String diet) {
        this.weightInKgs = weightInKgs;
        this.diet = diet;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void ambulate(){
        String ambulatoryObservtion = this.weightInKgs < 60 ?
                String.format("%s can spring like there is no tomorrow", this.getClass().getSimpleName()) :
                String.format("%s does find it difficult to carry it around", this.getClass().getSimpleName());
    }
}
