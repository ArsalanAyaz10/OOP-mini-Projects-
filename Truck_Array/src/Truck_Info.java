import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeHost;

public class Truck_Info {

    private String Make;
    private String Model;
    private String NumPlate;
    private int M_Year;
    private String Input;


    public String getInput()
    {
        return Input;
    }
    public String setInput(String input)
    {
        this.Input = input;
        return input;
    }


    public String getMake()
    {
        return Make;
    }
    public String setMake(String make)
    {
        this.Make = make;
        return make;
    }


    public String getModel()
    {
        return Model;
    }
    public String setModel(String model)
    {
        this.Model = model;
        return model;
    }


    public String getNumPlate()
    {
        return NumPlate;
    }
    public String setNumPlate(String Nplate)
    {
        this.NumPlate = Nplate;
        return Nplate;
    }

    public int getM_Year()
    {
        return M_Year;
    }
    public int setM_Year(int m_Year)
    {
        this.M_Year = m_Year;
        return m_Year;
    }

}
