public class CameraView {
    private String image;
    private Category category;
    private int noOfObject;
    private int colorGradiant;

    public void Setimage(String img){
        this.image = img;
    }
    public String Getimage(){
        return image;
    }
    public void Setcategory(Category cat){
        this.category = cat;
    }
    public Category Getcategory(){      
        return category;
    }
    public void Setobject(int no){
        this.noOfObject = no;
    } 
    public int Getobject(){
        return noOfObject;
    }
    public void SetcolorGradiant(int co){
        this.colorGradiant = co;
    }
    public int GetcolorGradiant(){
        return colorGradiant;
    }
    

}

