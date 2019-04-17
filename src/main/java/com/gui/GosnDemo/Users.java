package com.gui.GosnDemo;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by guijianliang on 2019-03-18.
 */


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    public String name;
    public Integer age;

//     这里加上这个后,可以起一个别名:"{\"name\":\"gui\",\"age\":18,\"Email\":\"guijianliang@124.com\"}";

    // email => 起别名: Email
    @SerializedName("Email")
    public String email;
}
