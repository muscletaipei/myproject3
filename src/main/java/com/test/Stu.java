package com.test;

public class Stu {
    String name;
    int id;
    int math;
    int english;

    public Stu(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }


    public int getAverage(){
     return ((math + english) /2);
    }

    public void print(){
        int average = getAverage();
        char grading = getGrading();
        System.out.println("學生姓名：" + name + "\n平均成績為："
                + getAverage() + "\n最高成績為："
                + higtest() + "\n學期成績為" + ((average >= 60) ? "及格" : "不及格"));
        System.out.println("學期成績等級為：" + grading);

    }

    public int higtest(){
        int max = (english > math) ? english : math;
        return max;
/*        int max = 0;
        if (english > math){
            max = english;
        }else {
            max = math;
        }return max;*/
    }

    public char getGrading(){
        int average = getAverage();
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }return grading;
    }




}

