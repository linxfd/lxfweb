package com.shedule.dao.impl;

import com.shedule.dao.BaseDao;
import com.shedule.dao.SysScheduleDao;
import com.shedule.pojo.SysSchedule;

import java.util.List;

/**
 * @version 1.0
 * dao.impl中存在的是接口的具体实现(class)
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule sysSchedule) {
        String sql = "insert into sys_schedule values(null,?,?,?)";
        int rows = baseUpdate(sql, sysSchedule.getUid(), sysSchedule.getTitle(), sysSchedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "select sid,uid,title,completed from sys_schedule";
        List<SysSchedule> list = baseQuery(SysSchedule.class, sql);
        return list;
    }
}
