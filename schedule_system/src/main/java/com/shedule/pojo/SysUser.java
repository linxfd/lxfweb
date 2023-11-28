package com.shedule.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * @version 1.0
 *1 实体类的类名、属性名和数据库应该对应（对应不是相等）
 *2 每一个属性都必须是私有的
 *3 每一个属性都应该有getter setter
 *4 必须有无参构造器
 *5 应该实现序列化接口(缓存 分布式项目数据传递可能会将数据序列化)
 *6 应该重写类的hashcode和equals方法
 *tostring是否重写都可以
 * 可以直接使用Lombok插件自动生成
 *  1.安装插件
 *  2.Settings->Build,Execution,Deployment->Compiler
 *      ->Annotation Processors->Enable annotation processing
 *  3.导入lomok的依赖，jar包
 *  4.在添加对应的注释来自动添加方法
 */
@AllArgsConstructor   //添加了全参构造
@NoArgsConstructor    //添加了无参构造
@Data   //相当于@Getter（get方法） @Setter（set方法） @EqualsAndHashCode（hashcode方法） @ToString（toString方法）
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

    @Override
    public String toString() {
        return "SysUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
