package com.gui.springel;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by guijianliang on 2019-03-05.
 */


@Setter
@Getter
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;
}
