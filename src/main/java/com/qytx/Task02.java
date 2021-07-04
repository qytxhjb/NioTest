package com.qytx;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * 第二周作业
 */
public class Task02 {

    public static void main(String[] args) {
        try {
            HttpGet httpGet = new HttpGet("http://localhost:8801");
            HttpResponse httpResponse = new DefaultHttpClient().execute(httpGet);
            HttpEntity entity = httpResponse.getEntity();
            InputStream is = entity.getContent();
            String res = EntityUtils.toString(entity);
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
