package io.github.shigure19.ecustbath.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName(value = "user")
public class User {
    @TableId(value="id")
    private Integer id;
    private String openId;
    private Integer bathroomId;
}
