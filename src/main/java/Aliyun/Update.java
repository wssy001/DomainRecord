package Aliyun;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.alidns.model.v20150109.*;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainRecordsResponse.Record;

public class Update {

    public static void updateDomainRecord() {
        Record record = null;
        record = Get.getDomainRecord();
        assert record != null;
        if (!record.getRecordId().equals("0")) {
            UpdateDomainRecordRequest updateRequest = new UpdateDomainRecordRequest();
            updateRequest.setRecordId(record.getRecordId());
//            设置主机记录
            updateRequest.setRR("WWW");
//            设置记录类型
            updateRequest.setType("A");
//            设置记录值
            updateRequest.setValue("111.1.1.1");
//            设置TTL
            updateRequest.setTTL(Long.valueOf("600")); //单位：秒
            try {
                UpdateDomainRecordResponse updateDomainRecordResponse = Strings.client.getAcsResponse(updateRequest);
            } catch (ServerException e) {
                e.printStackTrace();
            } catch (ClientException e) {
                System.out.println("ErrCode:" + e.getErrCode());
                System.out.println("ErrMsg:" + e.getErrMsg());
                System.out.println("RequestId:" + e.getRequestId());
            }
        }
    }
}
