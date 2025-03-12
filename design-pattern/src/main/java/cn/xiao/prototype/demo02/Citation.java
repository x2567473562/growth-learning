package cn.xiao.prototype.demo02;

public class Citation implements Cloneable{
    private Student student;

    public void setStu(Student student) {
        this.student = student;
    }

    public Student getStu() {
        return student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
