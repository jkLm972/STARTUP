package fr.efrei.factory;
import fr.efrei.domain.Job;
import fr.efrei.util.Helper;
import java.util.*;
public class JobFactory {

    public static Job creatJob(String title, int positionCode){
        if (Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(String.valueOf(positionCode)))  {
            return null;
        }
        Job job = new Job.Builder()
                .setTitle(title)
                .setPositionCode(positionCode)

                .build();
        return job;
    }

    public static Job creatJob(String title){
        if (Helper.isNullOrEmpty(String.valueOf(title))){
            return null;
        }
        Job job = new Job.Builder()
                .setTitle(title)
                .build();
        return job;
    }
}