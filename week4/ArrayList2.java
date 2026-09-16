package week4;

public class ArrayList2{
    int[] vals = new int[3];
    
   /* public static void valList(){
        vals[0] = 16;
        vals[1] = 20;
        vals[2] = 5;

    }
    int size;*/

    //defaults holding 3 vals
    //write 
    public ArrayList2(){
        this.vals = new int[3];
        int size = 3;
    }
    //constuctor
    public int getVal(int location){
        if(location >= 0 && location < size){
            return this.vals[location];
        }
        return -1;
    }
    //then a getVal that take a location 
    public void setVal(int value, int location){
        if(location >= 0 && locations < size){
            this.vals[location] = value;
        }
    }
    //setVal that takes a val and a location
    public void append(int value){
        if(this.size>= this.vals.length){
            int temp = new int[this.vals.length = 2];
            for(int x = 0; x < this.vals.length; x++){
                temp[x] = this.vals[x];
            }
            this.vals = temp;
        }
        this.vals[size] = value;
        this.size++;
    }
    //write an append that takes a val


    public static void main(String[] args) {
        int[] nums = new int[3];

        nums[0]=2;
        nums[1]=4;
        nums[2]=8;
    }
}