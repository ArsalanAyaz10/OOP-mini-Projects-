public class Quiz_tru {

    private String Make;
    private String Model;
    private String NumberPlate;
    private int C_Load;
    private int MaxLoad;
    private int CurrentSpeed = 10;
    private int MaxSpeed;

//    public String getMake() {
//        return Make;
//    }
//
//    public void setMake(String make) {
//        if (make.length() > 5) {
//            this.Make = make;
//        }
//    }
//
//    public String getModel() {
//        return Model;
//    }
//
//    public void setModel(String model) {
//        if (model.length() > 5) {
//            this.Model = model;
//        }
//    }
//
//    public String getNumberPlate() {
//        return NumberPlate;
//    }
//
//    public void setNumberPlate(String numberPlate) {
//        this.NumberPlate = numberPlate;
//    }

    public int getCurrentSpeed() {
        return CurrentSpeed;
    }

    public int setCurrentSpeed(int currentSpeed) {
        this.CurrentSpeed = currentSpeed;
        return currentSpeed;
    }

    public int getC_Load() {
        return C_Load;
    }

    public int setLoad(int load) {
        this.C_Load = load;
        return load;
    }

//    public int getMaxLoad() {
//        return MaxLoad;
//    }
//
//    public int setMaxLoad(int maxLoad) {
//        this.C_Load = maxLoad;
//        return maxLoad;
//    }
//
//    public int getMaxSpeed() {
//        return MaxSpeed;
//    }
//    public int setMaxSpeed(int maxSpeed) {
//        this.MaxSpeed = maxSpeed;
//        return maxSpeed;
//    }
//
//    public void accelerate() {
//        if (this.C_Load < this.MaxLoad) {
//            this.CurrentSpeed += 10;
//
//        }
//    }
//
//    public void deaccelerate() {
//        if (this.C_Load > this.MaxLoad) {
//            this.CurrentSpeed -= 10;
//        }
    }



