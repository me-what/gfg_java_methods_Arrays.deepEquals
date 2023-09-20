public class Employee {
    int Eid;
    String Ename;

    public Employee(int Eid, String Ename)
    {
        this.Eid = Eid;
        this.Ename = Ename;
    }

    @Override
    public boolean equals(Object obj)
    {
        // type casting obj to Employee
        Employee s = (Employee)obj;
        return (this.Eid == s.Eid && this.Ename.equals(s.Ename));
    }
}