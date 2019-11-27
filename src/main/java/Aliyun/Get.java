package Aliyun;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.alidns.model.v20150109.*;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainRecordsResponse.Record;

public class Get {
    public static Record getDomainRecord() {
        DescribeDomainRecordsRequest request = new DescribeDomainRecordsRequest();
//        request.setRegionId("cn-hangzhou");
        request.setDomainName(Strings.domainName);
        Record record = null;
        try {
            DescribeDomainRecordsResponse response = Strings.client.getAcsResponse(request);
//            获取记录值
            record = response.getDomainRecords().get(0);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }
        return record;
    }
}
