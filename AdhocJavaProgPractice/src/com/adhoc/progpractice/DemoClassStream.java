package com.adhoc.progpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoClassStream {
    public static void main(String[] args) {
        Department dept = new Department();
        dept.setDeptId(1);
        Department dept1= new Department();
        dept1.setDeptId(2);
        Department dept2= new Department();
        dept1.setDeptId(1);

        List<Department> deptList = new ArrayList<>();
        deptList.add(dept);
        deptList.add(dept1);
        deptList.add(dept2);

        deptList.stream().filter(x-> x.getDeptId()==1).forEach(x->System.out.println(x.getDeptId()));
//        System.out.println(deptList.stream().filter(x-> x.getDeptId()==1).collect(Collectors.toList()));


    }
}
