public class Lasagna {
  Integer RECIPIEOVENTIME = 40;
  Integer RECIPIEPREPTIME = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public Integer expectedMinutesInOven(){
      return RECIPIEOVENTIME;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public Integer remainingMinutesInOven(Integer time){
      return expectedMinutesInOven() - time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public Integer preparationTimeInMinutes(Integer layers){
      return layers * RECIPIEPREPTIME;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public Integer totalTimeInMinutes(Integer layers, Integer time){
      return preparationTimeInMinutes(layers) + time;
    }
}
