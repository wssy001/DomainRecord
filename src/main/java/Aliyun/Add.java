package Aliyun;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;


import com.aliyuncs.alidns.model.v20150109.*;

public class Add {

    public static void addDomainRecord() {

        AddDomainRecordRequest request = new AddDomainRecordRequest();
        request.setDomainName(Strings.domainName);
//        设置主机记录
        request.setRR("dcs");
//        设置记录类型
        request.setType("A");
//        设置记录值
        request.setValue(Strings.IP);
//        设置TTL
        request.setTTL(Long.valueOf("600")); //单位：秒 默认 600秒，即 10分钟

        try {
            AddDomainRecordResponse response = Strings.client.getAcsResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}
