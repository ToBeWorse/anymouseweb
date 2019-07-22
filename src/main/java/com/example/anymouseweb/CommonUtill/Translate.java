package com.example.anymouseweb.CommonUtill;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class Translate {

    // 在平台申请的APP_ID 详见
    // http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20180921000210346";
    private static final String SECURITY_KEY = "jizoK8d6GalAiwaT4rGo";

    /**
     * unicode 转 String
     *
     * @param unicode
     * @return
     */
    public static String unicode2String(String unicode) {
        StringBuffer string = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            // 转换出每一个代码点
            int data = Integer.parseInt(hex[i], 16);
            // 追加成string
            string.append((char) data);
        }
        return string.toString();
    }

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        String inputStr = "1";
		String str = api.getTransResult(inputStr, "auto", "en");
		JSONObject json = new JSONObject(api.getTransResult(inputStr, "auto", "en"));
		JSONArray array = json.getJSONArray("trans_result");
		JSONObject jt = (JSONObject) array.get(0);
		String unicodeStr = jt.get("dst").toString();
		System.out.println(jt.get("dst").toString());
    }

    /**
     *
     * @param inputStr
     * @return
     */
    public static String TranslateC2E(String inputStr) {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        JSONObject json = new JSONObject(api.getTransResult(inputStr, "auto", "wyw"));
        JSONArray array = json.getJSONArray("trans_result");
        JSONObject jt = (JSONObject) array.get(0);
        String unicodeStr = jt.get("dst").toString();
        return jt.get("dst").toString();
    }

}
