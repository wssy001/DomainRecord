package Aliyun;

import IP.GetPublicIP;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;

class Strings {
//   公网IP
    static String IP = GetPublicIP.getPublicIP();
//
    static String rR="yourRR";
    static String accessKeyId = "yourAccessKeyId"; //accessKeyId
    static String accessSecret = "yourAccessSecret"; //accessSecret
    static String domainName = "yourDomainName"; //你的域名
    static DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret);
    static IAcsClient client = new DefaultAcsClient(profile);
}
