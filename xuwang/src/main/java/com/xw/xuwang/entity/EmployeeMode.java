package com.xw.xuwang.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class EmployeeMode {
    @Excel(name = "序号", orderNum = "1")
    private Long id;

    @Excel(name = "姓名", orderNum = "2")
    private String name;

    @Excel(name = "年龄", orderNum = "3",replace = {"老年人了_23"})
    private Integer age;
}