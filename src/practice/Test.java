package practice;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {

		LinkedHashMap<String, String> map1 = new LinkedHashMap<>();//挿入順に出力される
		map1.put("2", "秋の田の");
        map1.put("3", "かりほの庵の");
        map1.put("4", "苫をあらみ");
        map1.put("1", "わが衣手は");
        map1.put("5", "露にぬれつつ ");

        for (String key : map1.keySet()){
            System.out.println(map1.get(key));
        }
       
        //実行結果

//        秋の田の
//        かりほの庵の
//        苫をあらみ
//        わが衣手は
//        露にぬれつつ

        System.out.println();

        TreeMap<String, String> map2 = new TreeMap<>();//Keyのルールでソートされる
        map2.put("4", "わが衣手は");
        map2.put("2", "かりほの庵の");
        map2.put("1", "秋の田の");
        map2.put("3", "苫をあらみ");
        map2.put("5", "露にぬれつつ");

        for (String key : map2.keySet()){
            System.out.println(map2.get(key));
        }
        
        //実行結果

//      秋の田の
//      かりほの庵の
//      苫をあらみ
//      わが衣手は
//      露にぬれつつ

	}

}
