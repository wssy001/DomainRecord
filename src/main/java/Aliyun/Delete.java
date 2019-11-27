package Aliyun;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainRecordsResponse.Record;
import com.aliyuncs.alidns.model.v20150109.*;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

public class Delete {

    public static void deleteDomainRecord() {
        Record record = Get.getDomainRecord();
        DeleteDomainRecordRequest request = new DeleteDomainRecordRequest();
//        设置域名解析记录Id
        request.setRecordId(record.getRecordId());

        try {
            DeleteDomainRecordResponse response = Strings.client.getAcsResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}
