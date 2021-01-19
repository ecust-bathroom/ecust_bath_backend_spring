package io.github.shigure19.ecustbath.mapper;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "room")
public class Room {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer bathroomid;
    private Integer roomid;
    private Integer status;
}
