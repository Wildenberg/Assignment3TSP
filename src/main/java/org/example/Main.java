package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println();
        priceOfDistance();
    }

    public static void priceOfDistance(){
        HashMap<String, Integer> roadPrice1 = new HashMap<>();
        roadPrice1.put("TimisoaraArad", 118);
        roadPrice1.put("AradSibiu", 140);
        roadPrice1.put("SibiuRimnicuvilcea", 80);
        roadPrice1.put("RinmicuvilceaPitesti", 97);
        roadPrice1.put("PitestiBucharest", 101);

        HashMap<String, Integer> roadPrice2 = new HashMap<>();
        roadPrice2.put("TimisoaraArad", 118);
        roadPrice2.put("AradSibiu", 140);
        roadPrice2.put("SibiuFagaras", 99);
        roadPrice2.put("FagarasBucharest", 211);

        HashMap<String, Integer> roadPrice3 = new HashMap<>();
        roadPrice3.put("TimisoaraArad", 118);
        roadPrice3.put("AradZerind", 75);
        roadPrice3.put("ZerindOradea", 71);
        roadPrice3.put("OradeaSibiu", 151);
        roadPrice3.put("SibiuRimnicuvilcea", 80);
        roadPrice3.put("RimnicuvilceaPitesti", 97);
        roadPrice3.put("PitestiBucharest", 101);

        HashMap<String, Integer> roadPrice4 = new HashMap<>();
        roadPrice4.put("TimisoaraArad", 118);
        roadPrice4.put("AradZerind", 75);
        roadPrice4.put("ZerindOradea", 71);
        roadPrice4.put("OradeaSibiu", 151);
        roadPrice4.put("SibiuFagaras", 99);
        roadPrice4.put("FagarasBucharest", 211);


        HashMap<String, Integer> roadPrice5 = new HashMap<>();
        roadPrice5.put("TimisoaraLugoj", 111);
        roadPrice5.put("LugojMechadia", 70);
        roadPrice5.put("MechadiaDrobeta", 75);
        roadPrice5.put("DrobetaCraiova", 120);
        roadPrice5.put("CraiovaPitesti", 138);
        roadPrice5.put("PitestiBucharest", 101);

        HashMap<String, Integer> roadPrice6 = new HashMap<>();
        roadPrice6.put("TimisoaraLugoj", 111);
        roadPrice6.put("LugojMechadia", 70);
        roadPrice6.put("MechadiaDrobeta", 75);
        roadPrice6.put("DrobetaCraiova", 120);
        roadPrice6.put("CraiovaRimnicuvilcea", 146);
        roadPrice6.put("RimnicuVilceaPitesti", 97);
        roadPrice6.put("PitestiBucharest", 101);


        System.out.println("Road 1 " + roadPrice1);
        System.out.println("Road 2 " + roadPrice2);
        System.out.println("Road 3 " + roadPrice3);
        System.out.println("Road 4 " + roadPrice4);
        System.out.println("Road 5 " + roadPrice5);
        System.out.println("Road 6 " + roadPrice6);

        int sumRoadPrice1 = 0;
        int sumRoadPrice2 = 0;
        int sumRoadPrice3 = 0;
        int sumRoadPrice4 = 0;
        int sumRoadPrice5 = 0;
        int sumRoadPrice6 = 0;

        for (int i : roadPrice1.values()){
            sumRoadPrice1 += i;
        }

        for (int i : roadPrice2.values()){
            sumRoadPrice2 += i;
        }

        for (int i : roadPrice3.values()){
            sumRoadPrice3 += i;
        }

        for (int i : roadPrice4.values()){
            sumRoadPrice4 += i;
        }

        for (int i : roadPrice5.values()){
            sumRoadPrice5 += i;
        }

        for (int i : roadPrice6.values()){
            sumRoadPrice6 += i;
        }

        System.out.println("Road 1 costs: " + sumRoadPrice1);

        System.out.println("Road 2 costs: " + sumRoadPrice2);

        System.out.println("Road 3 costs: " + sumRoadPrice3);

        System.out.println("Road 4 costs: " + sumRoadPrice4);

        System.out.println("Road 5 costs: " + sumRoadPrice5);

        System.out.println("Road 6 costs: " + sumRoadPrice6);

        int roadPrices[] ={sumRoadPrice1, sumRoadPrice2, sumRoadPrice3, sumRoadPrice4, sumRoadPrice5, sumRoadPrice6};

        Arrays.sort(roadPrices);
        System.out.println("The road which costs the least from Timisoara to Bucharest costs " + roadPrices[0]);
        System.out.println("Maximum = " + roadPrices[roadPrices.length-1]);

    }
}
