package structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ManagementFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager =(Manager) EMPLOYEE_MAP.get(department);
        if(manager == null){
            manager = new Manager(department);
            System.out.println("创建部门经理" + department);
            String content = department + "部门汇报工作";
            manager.setContent(content);
            System.out.println(department + "部门汇报完成");
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;

    }
}
