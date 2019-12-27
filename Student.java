package net.codejava;

/**
 * Created by Christiana Temiola on 20/12/2019.
 */
public class Student {

    public enum AttendanceGrade {ABSENT, VERY_POOR, POOR, AVERAGE, GOOD, VERY_GOOD};

    public AttendanceGrade getAttendanceGrade(int attendance) {
        if (attendance < 0 || attendance > 100) throw new IllegalArgumentException();
        if (attendance >= 90) return AttendanceGrade.VERY_GOOD;
        else if (attendance >= 70 && attendance < 90) return AttendanceGrade.GOOD;
        else if (attendance >= 50 && attendance < 70) return AttendanceGrade.AVERAGE;
        else if (attendance >= 30 && attendance < 50) return AttendanceGrade.POOR;	
        else if (attendance > 0 && attendance < 30) return AttendanceGrade.VERY_POOR;
        else return AttendanceGrade.ABSENT;
        
    }
}