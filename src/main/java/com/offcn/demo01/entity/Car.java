package com.offcn.demo01.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
@Data
@AllArgsConstructor//添加有参构造
@NoArgsConstructor //添加无参构造
public class Car {
   private Integer id;
   private String name;
   private Float price;
@JsonFormat(timezone ="GMT+8")
   private Date createdate;

}
