package com.shedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 */
@AllArgsConstructor   //添加了全参构造
@NoArgsConstructor    //添加了无参构造
@Data
public class SysSchedule {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;

    @Override
    public String toString() {
        return "SysSchedule{" +
                "sid=" + sid +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}'+'\n';
    }
}
