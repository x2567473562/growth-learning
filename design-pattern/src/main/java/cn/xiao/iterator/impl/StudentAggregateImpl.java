package cn.xiao.iterator.impl;

import cn.xiao.iterator.Student;
import cn.xiao.iterator.StudentAggregate;
import cn.xiao.iterator.StudentIterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate {
    // 学生列表
    private List<Student> list = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
