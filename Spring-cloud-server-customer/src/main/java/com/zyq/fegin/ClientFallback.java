package com.zyq.fegin;

import com.zyq.dao.CustomerDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClientFallback implements CustomerDao{
    @Override
    public List<Map<String, String>> index() {
        List<Map<String, String>> maps = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("error","调用服务超时，调用方法index  -根据id查询所有记录");
        maps.add(map);
        return maps;
    }
}
