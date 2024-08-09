package com.bridgelabz.EmpJpa.model;

import jakarta.persistence.*;

@Entity
@Table(name="emp")
public class Employee
{
    @Id
    @GeneratedValue
    private int empno;

    @Column(name="ename")
    private String ename;

    @Column(name="job")
    private String job;

//    @Column(name="mgr",nullable = false)
//    private int mgr;

    @Column(name="sal")
    private int sal;

//    @Column(name="comm")
//    private int comm;

    @Column(name="deptno")
    private int deptno;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

//    public int getMgr() {
//        return mgr;
//    }
//
//    public void setMgr(int mgr) {
//        this.mgr = mgr;
//    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

//    public int getComm() {
//        return comm;
//    }
//
//    public void setComm(int comm) {
//        this.comm = comm;
//    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", deptno=" + deptno +
                '}';
    }
}
