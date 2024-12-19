package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;
import com.korit.service.TestPrint;
import com.sun.source.tree.NewClassTree;

import java.util.Random;

public class main1 {
    public static void main(String[] args) {
        //version 1.0.0
//        TestPrint testPrint = new ATestService();
//        testPrint.print();
        //왜 업케스팅 인가?
        // 좀 더 포괄적인 범위에서 -> 제거하여 구현 하면 하위
        // 추상적일수록 상위 반대면 하위


        //new 남는 공간에 복사해서 넣음
        //static 클래스 자체에서
        ATestService aTestService = new ATestService();
        ATestService aTestService1 = new ATestService();
        BTestService bTestService = new BTestService();

        System.out.println(aTestService);
        System.out.println(aTestService1);
        Random random = new Random();
        TestPrint testPrint = null;
        int randomInt = random.nextInt(100);

        if (randomInt % 2 == 0) {
            testPrint = aTestService;
        }else {
            testPrint = bTestService;
        }
        String str;
        testPrint.print();



    }
}
