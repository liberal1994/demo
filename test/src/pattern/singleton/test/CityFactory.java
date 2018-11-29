package pattern.singleton.test;

import utils.StringUtil;

import java.util.HashMap;
import java.util.Map;

public class CityFactory {
    private static Map<String,City> cityMap=new HashMap<>();

    public static City getCity(String name){
        if(StringUtil.isEmpty(name)){
            return null;
        }
        City city= cityMap.get(name);
        if(city==null){
            city=new City(name);
            cityMap.put(name,city);
        }
        return city;
    }

}
