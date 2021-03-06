package com.peaceful.apm.alert.el;

import com.google.common.collect.Maps;
import com.peaceful.boot.common.helper.Console;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author WangJun
 * @version 1.0 16/6/21
 */
public class TermQueryTest {
    TermQuery termQuery = new TermQuery();

    @Test
    public void bool() throws Exception {
        Map<String, String> map = Maps.newHashMap();
        map.put("count", "111");
        map.put("min", "6");
        Console.log(termQuery.bool("${count}>100&${min}<6", map));
    }

}