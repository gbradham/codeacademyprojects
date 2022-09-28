public class Droid {
   int batteryLevel = 0;
   String name = "";
   
   public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
}
    void energyReport(){
        System.out.println("The battery level is " + batteryLevel);
    }

    int performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
        return batteryLevel;
    }
   public static void main(String[] args){
       Droid newDroid = new Droid("Codey");
       System.out.println(newDroid);
       newDroid.performTask("Drawing");
       
        
    }

}
