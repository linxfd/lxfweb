package com.shedule.dao;

import com.shedule.pojo.SysSchedule;

import java.util.List;


/**
 * @version 1.0
 *
 */
public interface SysScheduleDao {
    /**
     * 用于向数据中增加一条日程记录
     * @param sysSchedule 日程数据以SysSchedule实体对象形式传入参
     * @return   增加成功返回影响数据库记录的行数，失败返回等于0，成功返回大于0
     */
    int addSchedule(SysSchedule sysSchedule);

    /**
     * 查询所有用户的所有日程
     * @return  将所有日程放入一个List<SysSchedule>集合中返回
     */
    List<SysSchedule> findAll();
}
