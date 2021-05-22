package day32_arrays_split;
import java.util.*;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("---- Starting Deployment of Etsy App to AWS zones ----");

        String [] zonesToDeploy = zones.split(",");
        for(String eachZone : zonesToDeploy){
            System.out.println(eachZone);
        }

        for(String eachZone: zonesToDeploy) {
            System.out.println("Deploying [" +app+ "] to " + eachZone);
            System.out.println("Deployment completed for " + eachZone);

        }
        System.out.println("--- All Deployments Complete: Traffic Enabled ---");

    }
}
