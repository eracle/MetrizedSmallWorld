package org.latna.msw;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eracle on 26/05/16.
 */
public class MetrizedSmallWorldTest {



    public static final int NUMBER_OF_THREADS = 4;
    public static final String outFileName = "RealWorldModel01.txt";
    public static final String degreeDistributionFileName = "RealWorldModel01_degrees.txt";
    public static final int initAttempts = 5;
    public static final int nn = 5;
    //   public static final int   size = 3766521;
    //public static final int size = 1000000;
    public static final int size =  404733; //Flickr
    //public static final int size = 1000;

    public static final int dim = 70;

    private static MetrizedSmallWorld sut;

    @BeforeClass
    public static void oneTimeSetUp() {
        sut =  new MetrizedSmallWorld();

    }

    @Test
    public void testMetrizedSmallWorld() {
        assertNotNull(this.sut);
    }


    @Test
    public void testAdd() throws Exception {
        this.sut.setNN(nn);
        this.sut.setInitAttempts(initAttempts);

        int num = 10000;
        for (int i = 0 ; i< num ; i++)
            this.sut.add(new MetricElement() {
                @Override
                public double calcDistance(MetricElement gme) {
                    return 0;
                }
            });
        assertNotNull(this.sut);
        System.out.println(this.sut.toString());
    }

    @Test
    public void testRemoveElement() throws Exception {

    }

    @Test
    public void testNnSearch() throws Exception {

    }

    @Test
    public void testKnnSearch() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}