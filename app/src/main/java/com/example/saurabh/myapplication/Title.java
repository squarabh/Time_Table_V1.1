package com.example.saurabh.myapplication;

/**
 * Created by main on 18/2/18.
 */

public class Title {

    private int mLtp;
    private String mSubjectName;
    private String mDesc;
    private String mFacultyName;
    private String mTime;

    private String mSubjectName1;
    private String mDesc1;
    private String mFacultyName1;
    private String mTime1;

    private String mSubjectName2;
    private String mDesc2;
    private String mFacultyName2;
    private String mTime2;

    private String mSubjectName3;
    private String mDesc3;
    private String mFacultyName3;
    private String mTime3;

    private String mSubjectName4;
    private String mDesc4;
    private String mFacultyName4;
    private String mTime4;

    public Title(String subjectName, String desc, String facultyName, String time) {
        mSubjectName=subjectName;
        mDesc=desc;
        mFacultyName=facultyName;
        mTime=time;
        mLtp=0;
    }

    public Title(String subjectName1, String desc1, String facultyName1, String time1,String subjectName2, String desc2, String facultyName2, String time2,int ltp) {
        mSubjectName1=subjectName1;
        mDesc1=desc1;
        mFacultyName1=facultyName1;
        mTime1=time1;

        mSubjectName2=subjectName2;
        mDesc2=desc2;
        mFacultyName2=facultyName2;
        mTime2=time2;

        mLtp=ltp;
    }

    public Title(String subjectName1, String desc1, String facultyName1, String time1,String subjectName2, String desc2, String facultyName2, String time2,String subjectName3, String desc3, String facultyName3, String time3,String subjectName4, String desc4, String facultyName4, String time4,int ltp) {
        mSubjectName1=subjectName1;
        mDesc1=desc1;
        mFacultyName1=facultyName1;
        mTime1=time1;

        mSubjectName2=subjectName2;
        mDesc2=desc2;
        mFacultyName2=facultyName2;
        mTime2=time2;

        mSubjectName3=subjectName3;
        mDesc3=desc3;
        mFacultyName3=facultyName3;
        mTime3=time3;

        mSubjectName4=subjectName4;
        mDesc4=desc4;
        mFacultyName4=facultyName4;
        mTime4=time4;

        mLtp=ltp;
    }

    public String getSubjectName() {return mSubjectName;}
    public String getDesc() {return mDesc;}
    public String getFacultyName() {return mFacultyName;}
    public String getTime() {return mTime;}

    public String getSubjectName1() {return mSubjectName1;}
    public String getSubjectName2() {return mSubjectName2;}
    public String getSubjectName3() {return mSubjectName3;}
    public String getSubjectName4() {return mSubjectName4;}

    public String getDesc1() {return mDesc1;}
    public String getDesc2() {return mDesc2;}
    public String getDesc3() {return mDesc3;}
    public String getDesc4() {return mDesc4;}

    public String getFacultyName1() {return mFacultyName1;}
    public String getFacultyName2() {return mFacultyName2;}
    public String getFacultyName3() {return mFacultyName3;}
    public String getFacultyName4() {return mFacultyName4;}

    public String getTime1() {return mTime1;}
    public String getTime2() {return mTime2;}
    public String getTime3() {return mTime3;}
    public String getTime4() {return mTime4;}

    public int getLtp() {return mLtp;}
}
