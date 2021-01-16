package io.github.shigure19.ecustbath.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "room")
public class Room {
    @TableId(value = "id")
    private Integer bathroomId;
    private Integer roomId;
    private Integer status;
}
