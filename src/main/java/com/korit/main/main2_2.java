package com.korit.main;

import com.korit.utill.ForEachPrinter;

public class main2_2 {

    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1,2,3,4,5,6,7,8,9};
        Integer[] nums2 = new Integer[] {11,12,13,14,15,16,17,18,19};
        Integer[] nums3 = new Integer[] {111,112,113,114,115,116,117,118,119};

        //new 남는 공간에 복사해서 넣음 (새로운 주소를) -> static 은 빼고 만듬 독립적




        //this = 현주소 (본래주소 x)
        //static 클래스 자체에서 주소값만 던저줌
        //움직이지 않음 생성할 필요 없음
        //클래스 내에 독립적 직관적으로 사용
        //메모리안에 정적할당됨

        //정적할당 컴파일에 사용할 공간
        //동적할당 런타임후에 사용되거나 반납할 빌린 공간
        //리터널: 원래있는것
        //
        ForEachPrinter.print(nums);

    }
}
